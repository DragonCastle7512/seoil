package mail;

import java.util.Properties;

import javax.mail.Authenticator;
import javax.mail.Message;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMessage.RecipientType;

public class MyEmail {

	private static MyEmail myObject;
	
	public static MyEmail getInstance() {
		try {
			if(myObject == null) myObject = new MyEmail();
		} catch (Exception e) {e.printStackTrace();}
		return myObject;
	}
	public boolean sendMail(MailData data) {
		//메일을 보낼 때 필요한 일반 사항(보내는 사람, 받는 주소, 메일내용)
				//정보를 한번에 저장하는 객체
				Properties props = System.getProperties();
				props.put("mail.smtp.host", "smtp.naver.com");
				props.put("mail.smtp.port", "465");
				props.put("defaultEncoding", "utf-8");
				props.put("mail.smtp.starttls.enable", "true");
				props.put("mail.smtp.auth", "true");
				
				String userid = "#";
				String userpw = "#";
				
				//위의 정보를 이용하여 서버연결
				Session session = Session.getInstance(props, new Authenticator() {
					@Override
					protected PasswordAuthentication getPasswordAuthentication() {
						return new PasswordAuthentication(userid, userpw);
					}
				});
				
				//메일 보내기(보내는 주소, 받는 주소, 메일내용)
				String sendmail = "#";
				String recvmail = data.getRecvemail();
				String subject = data.getSubject();
				String content = data.getContent();
				session.setDebug(false);
				
				Message msg = new MimeMessage(session);	//연결이 설정된 객체주입
				try {
					msg.setFrom(new InternetAddress(sendmail));
					//msg.setRecipient(RecipientType.TO, new InternetAddress(recvmail));
					InternetAddress[] recvs = new InternetAddress[1];
					recvs[0] = new InternetAddress(recvmail);
					msg.setRecipients(RecipientType.TO, recvs);
					msg.setSubject(subject);
					msg.setText(content);
					Transport.send(msg);
					return true;
				} catch (Exception e) {
					e.printStackTrace();
					return false;
				}
	}
}
