class Car10 {
	String color;
	String gearType;
	int door;
	Car10() {
		this("white", "auto", 4);
	}
	Car10(Car10 c) {
		color = c.color;
		gearType = c.gearType;
		door = c.door;
	}
	Car10(String color, String gearType, int door) {
		this.color = color;
		this.gearType = gearType;
		this.door = door;
	}
	public void print() {
		System.out.println(color+" "+gearType+" "+door);
	}
}
public class ConsEx10 {

	public static void main(String[] args) {

		Car10 c01 = new Car10();
		Car10 c02 = new Car10(c01);
		c01.print();
		c01.door = 6;
		c01.print();
		c02.print();
	}

}
