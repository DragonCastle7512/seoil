class Animal01 {
	String name;
	int age;
}
class Thing {
	int x;
}

public class ObjectEx01 {

	public static void main(String[] args) {

		Animal01 a;
		a = new Animal01();
		a.name = "홍길동";
		a.age = 26;
		System.out.println("이름: "+a.name+", 나이: "+a.age);
		
		Animal01 b = new Animal01();
		b.name = "펭귄";
		b.age = 12;
		System.out.println("이름: "+b.name+", 나이: "+b.age);
		
		Thing thing = new Thing();
		thing.x = 10;
		System.out.println(thing.x);
	}

}
