import java.io.InputStream;
import java.io.OutputStream;

public class IoEx03 {

	public static void main(String[] args) {

		int data = 0;
		InputStream myIn = System.in;
		OutputStream myOut = System.out;
		
		System.out.print("문자 입력>>");
		try {
			while((data = myIn.read()) != -1) {
				if(data == 'x' || data == 'X') break;
				myOut.write((char)data);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
