class MyDate05 {
	int year = 2024;
	int month = 6;
	int day = 30;
}
class ReMethod {
	void changeDate(MyDate05 t) {
		t.year = 2025;
		t.month = 4;
		t.day = 7;
	}
}
public class BasicRef05 {

	public static void main(String[] args) {

		ReMethod rm = new ReMethod();
		MyDate05 d =  new MyDate05();
		
		System.out.println("메서드 호출 전:"+d.year+"년 "+d.month+"월 "+d.day+"일");
		rm.changeDate(d);
		System.out.println("메서드 호출 전:"+d.year+"년 "+d.month+"월 "+d.day+"일");
	}

}
