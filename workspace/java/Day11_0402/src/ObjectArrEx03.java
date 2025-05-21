
public class ObjectArrEx03 {

	public static void main(String[] args) {

		String str = "Java";
		str += '1';
		System.out.printf("%s\n", str);
		
		String str01 = "ABCD";
		char ch = str01.charAt(3);
		System.out.println("구해진 단일문자 : \'"+ch+"\'");
		
		String str02 = "012345";
		String res = str02.substring(1, 4);
		System.out.println(res);
		
		String src = "ABCDE";
		System.out.println("src문자열 길이: "+src.length());
		
		for (int i = 0; i < src.length(); i++) {
			ch = src.charAt(i);
			System.out.println(ch);	
		}
		char[] chArr = src.toCharArray();
		System.out.println(chArr);
	}

}
