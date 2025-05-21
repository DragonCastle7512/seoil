import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class IoEx10 {

	public static void main(String[] args) {

		Customer cus = new Customer(7, "홍길동", 25, 177.7);
		try {
			System.out.println(cus.toString());
			FileOutputStream fos = new FileOutputStream("./src/output.txt");
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			oos.writeObject(cus);
			
			oos.close();
			fos.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
