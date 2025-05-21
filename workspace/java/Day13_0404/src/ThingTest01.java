class Thing02 {
	private int x;
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
} 

public class ThingTest01 {

	public static void main(String[] args) {

		Thing02 thing; 
		thing = new Thing02(); 
		thing.setX(10);
		System.out.println(thing.getX());
	}

}
