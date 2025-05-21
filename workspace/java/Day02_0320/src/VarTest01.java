//class Var01 정의
class Var01 {
	/* 자바10 부터 var 키워드 사용가능
	 * 컴파일시 대입되는 값에 따라 데이터 타입을 결정
	 * ex) var name = "홍길동"; name은 문자 자료형
	 * 타입이 한 번 결정되면 변경 불가
	 */
	String name = "이순신";
	//맴버변수로는 선언불가
	//var name = "홍길동";
	public Var01() {
		//중괄호 내에서 사용가능한 지역 변수
		var addr = "서울시";
	}
}

public class VarTest01 {

	public static void main(String[] args) {
		
	}

}
