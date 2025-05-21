import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.Scanner;

public class EchoClientEx {

		Socket client = null;
		String ip = null;
		static final int PORT = 7000;
		
		Scanner sc = null;
		
		InputStream is;
		ObjectInputStream ois;
		
		OutputStream os;
		ObjectOutputStream oos;
		
		String sendData;
		String receiveData;
		
		public EchoClientEx(String ip) {
			this.ip = ip;
			try {
				System.out.println("#####클라이언트#####");
				client = new Socket(ip, PORT);
				sc = new Scanner(System.in);
				
				os = client.getOutputStream();
				oos = new ObjectOutputStream(os);
				
				is = client.getInputStream();
				ois = new ObjectInputStream(is);
				
				System.out.println("데이터 입력>> ");
				while((sendData = sc.nextLine()) != null) {
					oos.writeObject(sendData);
					oos.flush();
					if(sendData.equals("exit")) {
						break;
					}
					receiveData = (String)ois.readObject();
					System.out.println(client.getInetAddress()+"로 부터 전송받은 메세지: "+receiveData);
					System.out.print("입력 >>");
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
			finally {
				try {
					if(ois != null) ois.close();
					if(is != null) is.close();
					if(oos != null) oos.close();
					if(os != null) os.close();
					if(client != null) client.close();
				} catch (Exception e2) {
					e2.printStackTrace();
				}
			}
		}
		public static void main(String[] args) {
			new EchoClientEx("192.168.56.1");
		}
}
