class Mt09 {
	int abs(int data) {
		return (data < 0) ? -data : data;
	}
	double abs(double data) {
		return (data < 0) ? -data : data;
	}
	void p(int a) {
		System.out.println(a);
	}
	void p(int a, int b) {
		System.out.println(a+"\t"+b);
	}
}
public class ObjectEx09 {

	public static void main(String[] args) {

		Mt09 mt = new Mt09();
		System.out.println(mt.abs(-100));
		System.out.println(mt.abs(-100.0));
		mt.p(10);
		mt.p(10, 20);
	}

}
