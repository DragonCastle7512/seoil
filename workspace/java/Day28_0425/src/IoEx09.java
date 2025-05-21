import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;

public class IoEx09 {

	public static void main(String[] args) {

		String fileName;
		String buf;
		
		Reader myIn = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(myIn);
		try {
			System.out.print("파일명 입력(./src/IoEx09.java)>>");
			fileName = br.readLine();
			
			FileReader fr = new FileReader(fileName);
			BufferedReader fileBr = new BufferedReader(fr);
			while((buf = fileBr.readLine()) != null) {
				System.out.println(buf);
			}
			fileBr.close();
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
