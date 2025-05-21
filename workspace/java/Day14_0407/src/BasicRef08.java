class Data08 {
	int x;
}
public class BasicRef08 {

	static void change(int x) {
		x = 10000;
		System.out.println("change() x="+x);
	}
	public static void main(String[] args) {

		Data08 d = new Data08();
		d.x = 10;
		System.out.println("main() x="+d.x);
		change(d.x);
		System.out.println("main() x="+d.x);
	}

}
