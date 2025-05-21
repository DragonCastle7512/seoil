import java.util.function.*;
/* Supplier - 매개값은 없고, 리턴값이 있다.*/

public class SupplierExample {

	public static void main(String[] args) {

		IntSupplier intSupplier = () -> {
			return (int)(Math.random()*6)+1;
		};
		int resultNumber = intSupplier.getAsInt();
		System.out.println("주사위 눈의 수 = "+resultNumber);
	}

}
