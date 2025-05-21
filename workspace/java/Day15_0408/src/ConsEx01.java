class MyDate21 {
	private int year;
	private int month;
	private int day;
	public MyDate21() {
		year = 2025;
		month = 4;
		day = 7;
		System.out.println("기본 생성자 호출");
	}
	public void pr() {
		System.out.println(year+"년 "+month+"월 "+day+"일");
	}
}
public class ConsEx01 {

	public static void main(String[] args) {

		MyDate21 d = new MyDate21();
		d.pr();
	}

}
