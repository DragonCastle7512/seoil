class Tv06 {
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
public class ObjectEx06 {

	public static void main(String[] args) {

		Tv06[] tvArr = new Tv06[3];
		for (int i = 0; i < tvArr.length; i++) {
			tvArr[i] = new Tv06();
			tvArr[i].channel = i+10;
		}
		for (int i = 0; i < tvArr.length; i++) {
			tvArr[i].channelUp();
			System.out.printf("tvArr[%d].channel: %d\n", i, tvArr[i].channel);
		}
	}

}
