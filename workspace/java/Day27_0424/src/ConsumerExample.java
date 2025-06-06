import java.util.function.*;

public class ConsumerExample {

	public static void main(String[] args) {

		Consumer<String> consumer = t -> System.out.println(t+"21");
		consumer.accept("Java");
		
		BiConsumer<String, String> biConsumer = (t, u) -> System.out.println(t+u);
		biConsumer.accept("Java", "8");
		   
		DoubleConsumer doubleConsumer = d -> System.out.println("Java"+d);
		doubleConsumer.accept(17.0);
		
		ObjIntConsumer<String> objIntConsumer = (t, value) -> System.out.println(t + value);
		objIntConsumer.accept("Java", 21);
	}

}
