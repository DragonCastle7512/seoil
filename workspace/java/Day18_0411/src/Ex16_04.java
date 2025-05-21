class HandPhone {
	String model;
	String number;
	public HandPhone() {}
	public HandPhone(String model, String number) {
		this.model = model;
		this.number = number;
	}
	public String getModel() {
		return model;
	}
	public String getNumber() {
		return number;
	}
}
class DicaPhone extends HandPhone {
	String pixel;
	public DicaPhone() {}
	public DicaPhone(String model, String number, String pixel) {
		super(model, number);
		this.pixel = pixel;
	}
	public void prnDicaPhone() {
		System.out.println("모델명:"+this.model+" 번호: "+this.number+" 화소수: "+this.pixel);
	}
}
public class Ex16_04 {

	public static void main(String[] args) {

		DicaPhone dp = new DicaPhone("갤럭시", "010", "1024");
		dp.prnDicaPhone();
	}

}
