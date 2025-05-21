import java.io.FileInputStream;
import java.io.IOException;

public class IoEx05 {

	public static void main(String[] args) {

		int data = 0;
		String path = "./src/IoEx05.java";
		try {
			FileInputStream fis = new FileInputStream(path);
			while((data = fis.read()) != -1) {
				System.out.write((char)data);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
