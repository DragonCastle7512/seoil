import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class MultiEchoServerEx {

	ServerSocket server;
	static final int PORT = 7000;
	Socket child;
	public MultiEchoServerEx() {
		try {
			server = new ServerSocket(PORT);
		} catch (Exception e) {
			e.printStackTrace();
			System.exit(0);
		}
		System.out.println("#####다중 사용자 접속을 기다리기 위한 멀티채팅 서버#####");
		while(true) {
			try {
				child = server.accept();
				
				EchoServerThread childThread = new EchoServerThread(child);
				Thread th = new Thread(childThread);
				th.start();
			} catch (Exception e) {
				e.printStackTrace();
				System.exit(0);
			}
		}
	}
	public static void main(String[] args) {
		new MultiEchoServerEx();
	}

}
class EchoServerThread implements Runnable {
	Socket child;
	InputStream is;
	ObjectInputStream ois;
	OutputStream os;
	ObjectOutputStream oos;
	
	String receiveData;
	public EchoServerThread(Socket child) {
		this.child = child;
		try {
			System.out.println("accept");
			
			is = child.getInputStream();
			ois = new ObjectInputStream(is);
			
			os = child.getOutputStream();
			oos = new ObjectOutputStream(os);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	@Override
	public void run() {
		try {
			while(true) {
				receiveData = (String)ois.readObject();
				System.out.println(child.getInetAddress()+"로 부터 받은메세지:"+receiveData);
				oos.writeObject(receiveData);
				oos.flush();
			}
		} catch (Exception e) {
			System.out.println("사용자 강제종료");
		}
		finally {
			try {
				if(oos != null) oos.close();
				if(os != null) os.close();
				if(ois != null) ois.close();
				if(is != null) is.close();
				if(child != null) child.close();
			} catch (IOException e) {e.printStackTrace();}
		}
	}
}