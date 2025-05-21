class Obj08 {
	void Print99Dan() {
		for (int i = 0; i < 9; i++) {
			for (int j = 0; j < 9; j++)
				System.out.printf("%d*%d=%d\t", i, j, i*j);
			System.out.println();
		}
		System.out.println("\n =================");
	}
	int add(int a, int b) {
		return a+b;
	}
}
public class ObjectEx08 {   

	public static void main(String[] args) {

		Obj08 ob = new Obj08();
		ob.Print99Dan();
		System.out.println("10+10="+ob.add(10, 10));
	}

}
