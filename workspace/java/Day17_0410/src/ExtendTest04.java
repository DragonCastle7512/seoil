class Parent04 {
	protected int a = 10;
	protected int b = 20;
}
class Child04 extends Parent04 {
	protected int a = 40;
	protected int b = 50;
	protected int c = 30;
	public void pr() {
		System.out.println("this: "+this.a+"\t"+this.b+"\t"+this.c);
		System.out.println("super: "+super.a+"\t"+super.b);
	}
}
public class ExtendTest04 {

	public static void main(String[] args) {

		Child04 ch04 = new Child04();
		ch04.pr();
	}

}
