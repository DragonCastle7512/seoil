import java.util.LinkedList;

public class ListEx07 {

	public static void main(String[] args) {

		LinkedList myQue = new LinkedList<>();
		myQue.offer("1-java");
		myQue.offer("2-Oracle");
		myQue.offer("3-jsp");
		while (myQue.peek() != null)
			System.out.println(myQue.poll());
	}

}
