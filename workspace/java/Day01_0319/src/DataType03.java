/* 자바의 기본타입에서 크기 범위가 큰 타입 -> 작은 타입으로 형변환을 하려면 
 * 반드시 명시적인 캐스팅(형변환) 연산자를 사용해야함
 */
public class DataType03 {
	public static void main(String[] args) {
		/* 정수형 자료 종류
		 * byte(1바이트) -> short(2바이트) - char(2바이트) -> int(4바이트) -> long(8바이트)
		 */
		byte a = 1;
		short b = 128;
		int c = 32768;
		//자동 형변환(자료 손실 위험X)
		b = a;
		System.out.println(b);
		//명시적 캐스팅(자료 손실 위험이 있기 때문에)
		//short타입 최댓값을 넘어가면 최솟값 출력(tv 채널 원리와 동일)
		b = (short)c; 
		System.out.println("b="+b);
		
	}
}
