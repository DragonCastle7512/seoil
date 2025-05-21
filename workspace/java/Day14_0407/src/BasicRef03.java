class MyDate03 {
	int year = 2023;
	int month = 10;
	int day = 31;
}
public class BasicRef03 {

	public static void main(String[] args) {

		MyDate03 d = new MyDate03();
		//같은 객체 주소
		MyDate03 t = d;
		System.out.println(d.year+"년"+d.month+"월"+d.day+"일");
		System.out.println(t.year+"년"+t.month+"월"+t.day+"일");
		
		//다른 객체 주소
		t = new MyDate03();
		t.year = 2024; t.month = 11; t.day = 10;
		System.out.println(d.year+"년"+d.month+"월"+d.day+"일");
		System.out.println(t.year+"년"+t.month+"월"+t.day+"일");
		
		String s = "abc";
		String b = s;
		b = "twet";
		System.out.println(b+" "+s);
	}

}
