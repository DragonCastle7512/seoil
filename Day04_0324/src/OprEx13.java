
public class OprEx13 {

	public static void main(String[] args) {
		
		double pi = 3.141592;
		//소수점 네째자리에서 반올림
		double shortPi = (int)(pi*1000+0.5)/1000.0;
		System.out.println(shortPi);
		
		//자바의 내장 API로 반올림
		System.out.println(Math.round(pi*1000)/1000.0);
	}

}
