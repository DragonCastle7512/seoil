class MyDate06 {
	private int year;
	private int month;
	private int day;
	public MyDate06() {}
	public MyDate06(int year, int month, int day) {
		this.year = year;
		this.month = month;
		this.day = day;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public void setMonth(int month) {
		this.month = month;
	}
	public void pr() {
		System.out.println(year+"년 "+month+"월 "+day+"일");
	}
}
public class ConsEx06 {

	public static void main(String[] args) {
		
		MyDate06 md = new MyDate06(2024, 7, 25);
		md.pr();
		md.setYear(2025);
		md.setMonth(4);
		md.pr();
	}

}
