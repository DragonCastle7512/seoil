package 제3장문제풀이;

public class DataEx05 {

	public static void main(String[] args) {
		
		float f1 = 1F;
		/*float는 4byte double은 8byte이기 때문에 자료 손실 발생
		float f2 = 1.0; */
		float f3 = '1';
		/* String은 레퍼런스 타입 float는 기본 타입이라서 형변환이 불가능
		float f4 = "1"; */
		/* float에 double 자료형을 대입함
		float f5 = 1.0d; */
	}

}
