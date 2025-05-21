class MyDate05 {
	private int year;
	private int month;
	private int day;
	public MyDate05() {}
	public MyDate05(int new_year, int new_month, int new_day) {
		year = new_year;
		month = new_month;
		day = new_day;
	}
	public void setYear(int year) {
		//맵버변수와 매개변수의 이름이 같아서 구분 불가
		year = year;
	}
	public void setMonth(int new_month) {
		month = new_month;
	}
	public void pr() {
		System.out.println(year+"년 "+month+"월 "+day+"일");
	}
}
public class ConsEx05 {

	public static void main(String[] args) {
		
		MyDate05 md = new MyDate05(2024, 7, 1);
		md.pr();
		md.setYear(2025);
		md.pr();
		md.setMonth(4);
		md.pr();
	}

}
