class MyDate07 {
	private int year;
	private int month;
	private int day;
	public MyDate07() {
		this(2025, 4, 1);
	}
	public MyDate07(int year, int month, int day) {
		this.year = year;
		this.month = month;
		this.day = day;
	}
	public void print() {
		System.out.println(year+" 년 "+month+"월 "+day+"일");
	}
}
public class ConsEx07 {

	public static void main(String[] args) {

		MyDate07 md01 = new MyDate07();
		md01.print();
		MyDate07 md02 = new MyDate07(2025, 4, 8);
		md02.print();
	}

}
