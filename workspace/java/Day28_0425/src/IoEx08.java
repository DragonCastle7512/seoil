import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class IoEx08 {

	public static void main(String[] args) {

		String fileName;
		InputStreamReader myIn = new InputStreamReader(System.in);
		BufferedReader br  = new BufferedReader(myIn);
		try {
			System.out.print("파일 이름 입력>>");
			fileName = br.readLine();
			System.out.println(fileName);
		} catch (IOException e) {
			e.printStackTrace();
		}
		finally {
			try {
				if(br != null) br.close();
				if(myIn != null) myIn.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
	}

}
