
public class InterEx12 {

	public static void main(String[] args) {

		String cityName = "seoul";
		System.out.println("도시이름을 영문 대문자로"+cityName.toUpperCase());
		System.out.println("cityName: "+cityName);
		System.out.println("문자길이: "+cityName.length());
		System.out.println("\'seoul\'의 세번째 문자: "+cityName.charAt(2));
		System.out.println("\'seoul\'에서 u가 몇 번째 저장되었는가? "+(cityName.indexOf('u')+1));
		
		StringBuffer str01 = new StringBuffer();
		str01.append("Java");
		str01.append("Programming");
		System.out.println("추가된 문자: "+str01.toString());
		System.out.println(str01.substring(0, 4));
		
		str01.replace(0, 4, "Jsp");
	}

}
