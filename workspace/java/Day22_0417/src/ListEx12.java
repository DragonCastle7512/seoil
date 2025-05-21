class GenericClass<T> {
	private T num;
	public void setNum(T num) {
		this.num = num;
	}
	public T getT() {
		return num;
	}
}
public class ListEx12 {

	public static void main(String[] args) {

		GenericClass<Double> obj01 = new GenericClass();
		obj01.setNum(7.7);
		System.out.println(obj01.getT());
		
		GenericClass<Integer> obj02 = new GenericClass();
		obj02.setNum(100);
		System.out.println(obj02.getT());
		
		GenericClass<String> obj03 = new GenericClass();
		obj03.setNum("홍길동");
		System.out.println(obj03.getT());
	}

}
