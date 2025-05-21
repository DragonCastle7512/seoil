import java.io.*;

public class IoEx06 {

	public static void main(String[] args) {

		int data;
		System.out.println("파일에 저장할 내용입력>>");
		try {
			File f = new File("./src/result.txt");
			FileOutputStream fos = new FileOutputStream(f);
			while((data = System.in.read()) != -1) {
				fos.write((char)data);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
