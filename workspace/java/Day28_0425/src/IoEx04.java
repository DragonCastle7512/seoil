import java.io.File;

public class IoEx04 {

	public static void main(String[] args) {

		File dirFile = new File("./src");
		String[] fileList = dirFile.list();
		for (int i = 0; i < fileList.length; i++)
			System.out.println(fileList[i]);
		System.out.println("\n================");
		for (String i : fileList)
			System.out.println(i);
		System.out.println("\n================");
	}

}
