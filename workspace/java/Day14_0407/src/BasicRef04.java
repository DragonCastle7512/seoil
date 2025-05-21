class Vm04 {
	void changeNumber(int y) {
		y = 10;
	}
}
public class BasicRef04 {

	public static void main(String[] args) {

		Vm04 vm = new Vm04();
		int x = 7;
		System.out.println("매서드 호출 전 x="+x);
		vm.changeNumber(x);
		System.out.println("매서드 호출 후 x="+x);
	}

}
