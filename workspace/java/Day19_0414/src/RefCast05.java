class HandPhone05 {
	protected String model;
	protected String number;
	public HandPhone05() {}
	public HandPhone05(String model, String number) {
		this.model = model;
		this.number = number;
	}
}
class DicaPhone05 extends HandPhone05 {
	protected String pixel;
	public DicaPhone05() {}
	public DicaPhone05(String model, String number, String pixel) {
		this.model = model;
		this.number = number;
		this.pixel = pixel;
	}
	public void pr() {
		System.out.println("model: "+model+", number: "+number+", pixel: "+pixel);
	}
}
public class RefCast05 {

	public static void main(String[] args) {

		DicaPhone05 dp = new DicaPhone05("갤럭시", "010-9999-7777", "1024");
		dp.pr();
		if(dp instanceof HandPhone05) {
			HandPhone05 hp = dp;
			System.out.println("업캐스팅 가능");
		}
		else {
			System.out.println("업캐스팅 불가능");
		}
		
		HandPhone05 hp5 = new HandPhone05();
		if(hp5 instanceof DicaPhone05) {
			DicaPhone05 dp5 = (DicaPhone05)hp5;
			System.out.println("업캐스팅 가능");
		}
		else {
			System.out.println("업캐스팅 불가능");
		}
	}

}
