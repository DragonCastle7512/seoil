class Father01 {
	int a = 10;
}
class Son01 extends Father01 {
	int a = 20;
	void pr() {
		System.out.println("a="+a);
		System.out.println("this.a="+this.a);
		System.out.println("super.a="+super.a);
	}
}

public class SuperEx01 {

	public static void main(String[] args) {
		
		Son01 s01 = new Son01();
		s01.pr();
	}

}
