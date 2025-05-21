import java.util.function.*;

public class MethodReferenceExample {

	public static void main(String[] args) {
		
		IntBinaryOperator operator;
		operator = (left, right) -> Calculator.staticMethod(left, right);
		System.out.println(operator.applyAsInt(10, 20));
		operator = Calculator::staticMethod;
		System.out.println(operator.applyAsInt(10, 20));
		
		Calculator obj = new Calculator();
		operator = (x, y) -> obj.instanceMethod(x, y);
		System.out.println(operator.applyAsInt(10, 20));
		
		operator = obj::instanceMethod;
		System.out.println(operator.applyAsInt(10, 20));
	}

}
