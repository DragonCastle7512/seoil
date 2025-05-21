package 제3장문제풀이;

public class DataEx03 {

	public static void main(String[] args) {
		
		byte var1 = 127;
		short var2 = 128;
		int var3 = 128;
		long var4 = 128L;
		
		//암묵적인 자동 형변환
		var4 = var1;
		System.out.println(var1+", "+var2);
		
		//강제 형변환
		var1 = (byte)var3;
		System.out.println(var1+", "+var3);
		
		float var5 = 123456.789123f;
		double var6 = 123456.789123;
		System.out.println(var5);
		var5 = (float)var6;
		System.out.println(var5);
		System.out.println(var6);		
	}

}
