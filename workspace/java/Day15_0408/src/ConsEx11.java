
public class ConsEx11 {

	//한 번만 실행됨
	static {
		System.out.println("static{} 클래스 초기화 블록");
	}
	{
		System.out.println("{} 인스턴스 초기화 블록");
	}
	public ConsEx11() {
		System.out.println("기본 생성자");
	}
	public static void main(String[] args) {
		
		new ConsEx11();
		new ConsEx11();
	}

}
