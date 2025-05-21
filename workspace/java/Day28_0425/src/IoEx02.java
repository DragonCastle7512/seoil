import java.io.IOException;
import java.io.OutputStream;

public class IoEx02 {

	public static void main(String[] args) throws IOException {

		int data = 0;
		System.out.print("이름 입력>>");
		OutputStream myout = System.out;
		while((data = System.in.read()) != -1) {
			myout.write((char)data);
		}
	}

}
