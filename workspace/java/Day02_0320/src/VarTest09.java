/* 타입의 범위를 벗어났을때?
 */
public class VarTest09 {

	public static void main(String[] args) {
		
		short sMin = -32768;
		//int-int로 계산
		System.out.println("sMin-1="+(--sMin));
		//short의 최소값을 벗어날 때
		System.out.println("sMin-1="+(short)--sMin);
		
		//short의 최대값을 벗어날 때
		short sMax = 32767;
		System.out.println("sMax+1="+(short)++sMax);
		
		char cMin = 0;
		System.out.println("--cMin="+(int)--cMin);
	}

}
