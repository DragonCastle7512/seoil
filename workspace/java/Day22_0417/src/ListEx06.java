import java.util.Stack;

public class ListEx06 {

	public static void main(String[] args) {

		Stack stack = new Stack<>();
		stack.push("1-java");
		stack.push("2-Oracle");
		stack.push("3-html");
		while (!stack.isEmpty())
			System.out.println(stack.pop());
	}

}
