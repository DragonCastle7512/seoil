class Car09 {
	String color;
	String gearType;
	int door;
	public Car09() {
		this("white", "auto", 4);
	}
	public Car09(String color, String gearType, int door) {
		this.color = color;
		this.gearType = gearType;
		this.door = door;
	}
	public void pr() {
		System.out.println(color+" "+gearType+" "+door);
	}
}
public class ConsEx09 {

	public static void main(String[] args) {

		Car09 c = new Car09();
		c.pr();
	}

}
