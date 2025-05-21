import java.io.*;
import java.util.Scanner;

public class IoEx07 {

	public static void main(String[] args) throws IOException {

		Scanner sc = new Scanner(System.in);
		System.out.print("원본이미지 파일명(./src/images/flower.jpg)>>");
		String inputFileName = sc.nextLine();
		
		System.out.print("복사되어질 이미지 파일명(./src/images/flower_copy.jpg)>>");
		String outputFileName = sc.nextLine();
		
		try(InputStream inputStream = new FileInputStream(inputFileName);
				OutputStream outputStream = new FileOutputStream(outputFileName)) {
			int c;
			while((c = inputStream.read()) != -1) {
				outputStream.write(c);
			}
		}
		System.out.println(inputFileName+"을 "+outputFileName+"으로 복사했습니다.");
	}

}
