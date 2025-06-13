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
		//������ ���� �� �ʿ��� �Ϲ� ����(������ ���, �޴� �ּ�, ���ϳ���)
				//������ �ѹ��� �����ϴ� ��ü
				Properties props = System.getProperties();
				props.put("mail.smtp.host", "smtp.naver.com");
				props.put("mail.smtp.port", "465");
				props.put("defaultEncoding", "utf-8");
				props.put("mail.smtp.starttls.enable", "true");
				props.put("mail.smtp.auth", "true");
				
				String userid = "#";
				String userpw = "#";
				
				//���� ������ �̿��Ͽ� ��������
				Session session = Session.getInstance(props, new Authenticator() {
					@Override
					protected PasswordAuthentication getPasswordAuthentication() {
						return new PasswordAuthentication(userid, userpw);
					}
				});
				
				//���� ������(������ �ּ�, �޴� �ּ�, ���ϳ���)
				String sendmail = "#";
				String recvmail = data.getRecvemail();
				String subject = data.getSubject();
				String content = data.getContent();
				session.setDebug(false);
				
				Message msg = new MimeMessage(session);	//������ ������ ��ü����
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
