class Mother02 {
	public void m02() {
		System.out.println("부모");
	}
}
class Child02 extends Mother02 {
	public void ch02() {
		System.out.println("자식");
	}
}
public class RefCast02 {

	public static void main(String[] args) {

		Mother02 m02 = new Mother02();
		Child02 ch02 = new Child02();
		//명시적인 형변환 연산자를 사용하지 않아서 컴파일 에러
		//ch02 = m02;
		ch02.m02();
		ch02.ch02();
	}

}
