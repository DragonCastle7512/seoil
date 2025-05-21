class Animal {
	String kind;
	int leg;
	public Animal(){}
	public Animal(String kind, int leg) {
		this.kind = kind;
		this.leg = leg;
	}
	public void getKind() {
		System.out.println(kind+"입니다.");
	}
	public void walk() {
		System.out.println(leg+"발로 걷습니다.");
	}
}
class Dog extends Animal{
	public Dog() {}
	public Dog(String kind, int leg) {
		super(kind, leg);
	}
}
class Human extends Animal {
	public Human() {}
	public Human(String kind, int leg) {
		super(kind, leg);
	}
}
public class Ex16_03 {

	public static void main(String[] args) {

		Human h = new Human("소녀", 2);
		Dog d = new Dog("강아지", 4);
		h.walk();
		h.getKind();
		d.walk();
		d.getKind();
		
	}

}
