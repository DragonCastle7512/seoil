import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.InetAddress;
import java.net.UnknownHostException;

public class NetworkEx01 {

	public static void main(String[] args) throws IOException {

		BufferedReader reader;
		String url = null;
		InetAddress addr = null;
		
		reader = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("사이트 주소 입력>> ");
		url = reader.readLine();
		try {
			addr = InetAddress.getByName(url);
		} catch (UnknownHostException e) {
			e.printStackTrace();
		}
		System.out.println("\n=======================");
		System.out.println(url+"에 대한 ip주소번호 = "+addr.getHostAddress());
	}

}
