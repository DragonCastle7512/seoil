class Product {
	private String name;
	private int price;
	public String getName() {
		return name;
	}
	public int getPrice() {
		return price;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	void stop() {
		for (int i = 1; i <= 10; i++) {
			if(i == 4) return;
			System.out.println("\t"+i);
		}
	}
}
public class Ex11_02 {

	public static void main(String[] args) {

		Product[] p = new Product[2];
		String[] names = {"커피", "비타500"};
		int[] prices = {150, 500};
		System.out.println("자판기 => 제품목록:");
		for (int i = 0; i < p.length; i++) {
			p[i] = new Product();
			p[i].setName(names[i]);
			p[i].setPrice(prices[i]);
			System.out.println(p[i].getName()+" "+p[i].getPrice()+"원");
 		}
		p[0].stop();
	}

}
