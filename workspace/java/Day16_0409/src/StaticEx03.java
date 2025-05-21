class St03 {
	static int a = 10;
	int b = 20;
}
public class StaticEx03 {

	public static void main(String[] args) {

		System.out.println("St03.a = "+St03.a);
		
		St03 s01 = new St03();
		St03 s02 = new St03();
		
		System.out.println(s01.a+"\t"+s02.a);
		System.out.println(s01.b+"\t"+s02.b);
		
		s01.a = 1000;
		System.out.println(s01.a+"\t"+s02.a);
		s01.b = 200;
		System.out.println(s01.b+"\t"+s02.b);
	}

}
