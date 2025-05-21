class Tv05 {
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
public class ObjectEx05 {

	public static void main(String[] args) {

		Tv05 tv01 = new Tv05();
		Tv05 tv02 = new Tv05();
		
		//tv01의 gc에 의해 소멸됨 또한 같은 객체 주소를 가리킴
		tv02 = tv01;
		tv01.channel = 7;
		
		System.out.println("tv01 채널번호="+tv01.channel+", tv02 채널번호="+tv02.channel);
	}

}
