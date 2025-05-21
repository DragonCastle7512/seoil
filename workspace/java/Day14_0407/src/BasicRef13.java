class Data13 {
	int x;
}
public class BasicRef13 {

	public static void main(String[] args) {

		Data13 d = new Data13();
		d.x = 10;
		Data13 d2 = copy(d);
		System.out.println("d.x="+d.x+"d2.x"+d2.x);
	}
	static Data13 copy(Data13 d) {
		Data13 tmp = new Data13();
		//서로 다른 객체주소를 가지고, 값만 복사
		tmp.x = d.x;
		//객체주소 반환
		return tmp;
	}

}
