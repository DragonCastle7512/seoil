class Animal02 {
	String name;
	private int age;	
	public void setAge(int age) {
		this.age = age;
	}
	public int getAge() {
		return age;
	}
}

public class ObjectEx02 {

	public static void main(String[] args) {

		Animal02 a;
		a = new Animal02();
		a.name = "홍길동";
		a.setAge(25);
		System.out.println("이름: "+a.name+", 나이: "+a.getAge());
		
	}

}
