import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class IoEx11 {

	public static void main(String[] args) {

		try {
			FileInputStream fis = new FileInputStream("./src/output.txt");
			ObjectInputStream ois = new ObjectInputStream(fis);
			Customer cus = (Customer)ois.readObject();
			System.out.println(cus.toString());
			
			ois.close();
			fis.close();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		catch (IOException e) {
			e.printStackTrace();
		}
	}

}
