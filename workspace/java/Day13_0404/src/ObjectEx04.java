class Tv04 {
	int channel = 0;
	boolean power;
	void power() {
		power = !power;
	}
	void channelUp() {
		++channel;
	}
	void channelDown() {
		--channel;
	}
}
public class ObjectEx04 {

	public static void main(String[] args) {

		Tv04 tv01 = new Tv04();
		Tv04 tv02 = new Tv04();
		System.out.println("tv01.channel: "+tv01.channel+", tv02.channel: "+tv02.channel);
		
		tv01.channel = 10;
		System.out.println("tv01.channel: "+tv01.channel+", tv02.channel: "+tv02.channel);
	}

}
