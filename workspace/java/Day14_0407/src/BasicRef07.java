class MyDate07 {
	int year = 2025;
	int month = 4;
	int day = 7;
}
public class BasicRef07 {

	public static void main(String[] args) {

		MyDate07 d = null;
		//NullPointException 오류 발생
		System.out.println(d.year+"년,"+d.month+"월,"+d.day+"일");
	}

}
