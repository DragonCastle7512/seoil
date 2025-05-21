import java.io.IOException;
import java.io.InputStream;

public class IoEx01 {

	public static void main(String[] args) {

		int data = 0;
		System.out.print("문자 입력>>");
		try {
			InputStream myIn = System.in;
			while((data = myIn.read()) != -1) {
				System.out.write((char)data);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
