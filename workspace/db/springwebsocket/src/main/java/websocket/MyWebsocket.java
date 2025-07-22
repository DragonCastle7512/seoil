package websocket;

import java.net.InetSocketAddress;
import java.util.HashSet;
import java.util.Set;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.web.socket.CloseStatus;
import org.springframework.web.socket.TextMessage;
import org.springframework.web.socket.WebSocketSession;
import org.springframework.web.socket.handler.TextWebSocketHandler;

public class MyWebsocket extends TextWebSocketHandler implements InitializingBean {
	
	static Set<WebSocketSession> sessions = new HashSet<WebSocketSession>();
	String msg;
	//open
	@Override
	public void afterConnectionEstablished(WebSocketSession session) throws Exception {
		System.out.println("open!");
		super.afterConnectionEstablished(session);
		
		InetSocketAddress ipaddress = session.getRemoteAddress();
		System.out.println(ipaddress);
		System.out.println(ipaddress.getAddress().getHostAddress());
		sessions.add(session);
	}

	//message
//	@Override
//	public void handleMessage(WebSocketSession session, WebSocketMessage<?> message) throws Exception {
//		System.out.println("message!");
//		super.handleMessage(session, message);
//		msg = (String)message.getPayload();
//		session.sendMessage(new TextMessage(msg));
//		if(message instanceof TextMessage) {
//			this.msg = ((TextMessage)message).getPayload();
//		}
//	}
	
	@Override
	protected void handleTextMessage(WebSocketSession session, TextMessage message) throws Exception {
		System.out.println("spring socket message");
		this.msg = message.getPayload();
	}
	
	private void sendMessage(String msg) {
		try {
			for(WebSocketSession s : sessions) {
				if(s.isOpen())s.sendMessage(new TextMessage(msg));
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	//error
	@Override
	public void handleTransportError(WebSocketSession session, Throwable exception) throws Exception {
		System.out.println("error!");
		super.handleTransportError(session, exception);
	}
	
	//close
	@Override
	public void afterConnectionClosed(WebSocketSession session, CloseStatus status) throws Exception {
		System.out.println("close!");
		super.afterConnectionClosed(session, status);
		sessions.remove(session);
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("쓰레드 처리");
		Thread thread = new Thread(() -> {
			while(true) {
				if(msg != null && !msg.trim().isEmpty())
					sendMessage(msg);
				try {Thread.sleep(5000);}
				catch (InterruptedException e) {
					Thread.currentThread().interrupt();
					break;
				}
			}
		});
		thread.setDaemon(true);
		thread.start();
	}
	
	@Override
	public boolean supportsPartialMessages() {
		System.out.println("부분 메세지 처리");
		return super.supportsPartialMessages();
	}

}
