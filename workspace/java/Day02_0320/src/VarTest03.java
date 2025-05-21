//문자열은 자바의 기본타입X 레퍼런스 타입O
public class VarTest03 {

	public static void main(String[] args) {
		
		String subject = "자바책";
		System.out.println(subject);
		
		String cityName = "서울시";
		System.out.println("도시이름:"+cityName);
		
		cityName = "부산시";
		System.out.println("변경된 도시이름:"+cityName);
		
		String address;
		address = "서울시 중랑구 면목동";
		System.out.printf("%s\n", address);
	}

}
