import java.io.File;

public class IoEx12 {

	public static void main(String[] args) {

		String path = "./src";
		File dir = new File(path);
		String[] fileNames = dir.list();
		for (String name : fileNames) {
			File f = new File(path+"/"+name);
			System.out.println("\n====================");
			System.out.println("파일 경로: "+f.getName());
			System.out.println("경로: "+f.getPath());
			System.out.println("절대 경로: "+f.getAbsolutePath());
			System.out.println("디렉터리 여부: "+f.isDirectory());
			System.out.println("파일 여부: "+f.isFile());
			System.out.println("=====================");
		}
	}

}
