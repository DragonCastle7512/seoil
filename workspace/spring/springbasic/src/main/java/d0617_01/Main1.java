package d0617_01;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class Main1 {

	public static void main(String[] args) throws IOException {
		File file = new File("C:/work/workspace/STS-3.9/springbasic/src/main/java/d0617_01/config.properties");
		FileInputStream in = new FileInputStream(file);
		Properties prop = new Properties();
		prop.load(in);
		
		System.out.println(prop.getProperty("objectname1"));
		System.out.println(prop.getProperty("objectname2"));
		prop.setProperty("objectname2", "myprint");
		FileOutputStream out = new FileOutputStream(file);
		prop.save(out, "objectname2 value Change");
		
	}

}
