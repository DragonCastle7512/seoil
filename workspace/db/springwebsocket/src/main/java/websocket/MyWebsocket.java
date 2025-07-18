package websocket;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.web.socket.CloseStatus;
import org.springframework.web.socket.WebSocketMessage;
import org.springframework.web.socket.WebSocketSession;
import org.springframework.web.socket.handler.TextWebSocketHandler;

public class MyWebsocket extends TextWebSocketHandler implements InitializingBean {
	
	//open
	@Override
	public void afterConnectionEstablished(WebSocketSession session) throws Exception {
		System.out.println("open!");
		super.afterConnectionEstablished(session);
	}

	//message
	@Override
	public void handleMessage(WebSocketSession session, WebSocketMessage<?> message) throws Exception {
		System.out.println("message!");
		super.handleMessage(session, message);
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
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		// TODO Auto-generated method stub
		
	}

}
