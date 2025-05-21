class Mt10 {
	public void pr(int a, int b, String c) {
		System.out.println(a+"\t"+b+"\t"+c);
	}
	public void pr(String c, int a, int b) {
		System.out.println(c+"\t"+a+"\t"+b);
	}
}
public class ObjectEx10 {

	public static void main(String[] args) {

		Mt10 mt10 = new Mt10();
		mt10.pr(10, 20, "Java");
		mt10.pr("Oracle", 100, 100);
	}

}
