class Data09 {
	int x;
}
public class BasicRef09 {

	public static void main(String[] args) {

		Data09 d = new Data09();
		d.x = 10;
		System.out.println("main() d.x="+d.x);
		change(d);
		System.out.println("main() d.x="+d.x);
	}
	static void change(Data09 d) {
		d.x = 1000;
		System.out.println("change() d.x="+d.x);
	}

}
