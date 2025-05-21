class Tv03 {
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
public class ObjectEx03 {

	public static void main(String[] args) {

		Tv03 tv = new Tv03();
		tv.channel = 7;
		tv.channelDown();
		System.out.println("채널번호: "+tv.channel);
		tv.power();
		System.out.println("Tv on/off="+tv.power);
	}

}
