class Product {
	static int count = 0;
	int serialNo;
	{
		++count;
		serialNo = count;
	}
	public Product() {}
}
public class StaticEx01 {

	public static void main(String[] args) {

		Product p01 = new Product();
		Product p02 = new Product();
		Product p03 = new Product();
		
		System.out.println("p01 제품번호(시리얼 번호) : "+p01.serialNo);
		System.out.println("p02 제품번호(시리얼 번호) : "+p02.serialNo);
		System.out.println("p03 제품번호(시리얼 번호) : "+p03.serialNo);
		System.out.println("총 생산대수 : "+Product.count);
	}

}
