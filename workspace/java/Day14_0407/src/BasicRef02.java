class MyDate02 {
	int year = 2024;
	int month = 12;
	int day = 20;
}
public class BasicRef02 {

	public static void main(String[] args) {

		int x = 7;
		int y = x;
		
		MyDate02 d = new MyDate02();
		MyDate02 t = d;
		
		System.out.println("x=>"+x+"y=>"+y);
		System.out.println(d.year+"년"+d.month+"월"+d.day+"일");
		System.out.println(t.year+"년"+t.month+"월"+t.day+"일");
		
		//서로 다른 주소
		y = 10;
		//같은 주소값 사용
		t.year = 2025; t.month = 4; t.day = 7;
		System.out.println("x=>"+x+", y=>"+y);
		System.out.println(d.year+"년"+d.month+"월"+d.day+"일");
		System.out.println(t.year+"년"+t.month+"월"+t.day+"일");
	}

}
