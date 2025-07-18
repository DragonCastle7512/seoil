package jspwebsocket;

import java.util.HashSet;
import java.util.Set;

import javax.websocket.OnClose;
import javax.websocket.OnError;
import javax.websocket.OnMessage;
import javax.websocket.OnOpen;
import javax.websocket.Session;
import javax.websocket.server.ServerEndpoint;

@ServerEndpoint("/websocket")
public class MyWebSoket {
	
	static Set<Session> sessions = new HashSet<Session>();
	@OnOpen
	public void open(Session session) {
		System.out.println("소켓 open!");
		System.out.println(session);
		sessions.add(session);
		System.out.println("현재 접속자 수: "+sessions.size());
	}
	@OnMessage
	public void message(String message, Session session) {
		System.out.println("소켓 메세지 수신!");
		System.out.println(message);
		try {
			for(Session s : sessions) {
				if(s.isOpen() && session != s) s.getBasicRemote().sendText(message);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		//System.out.println(session.getBasicRemote());
	}
	@OnError
	public void error(Throwable throwable) {
		System.out.println("소켓 에러!");
	} 
	@OnClose
	public void close(Session session) {
		System.out.println("소켓 close!");
		sessions.remove(session);
	}
}
