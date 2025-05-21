class Product02 {
	String name;
	int price;
	public Product02() {}
	Product02(String name) {
		this.name = name;
	}
	Product02(int price) {
		this.price = price;
	}
	Product02(String name, int price) {
		this.name = name;
		this.price = price;
	}
	public void pr() {
		System.out.println(name+" "+price);
	}
}
public class Ex13_02 {

	public static void main(String[] args) {

		Product02 p01 = new Product02();
		Product02 p02 = new Product02("커피");
		Product02 p03 = new Product02(500);
		Product02 p04 = new Product02("웰치스", 700);
		
		p01.pr();
		p02.pr();
		p03.pr();
		p04.pr();
	}

}
