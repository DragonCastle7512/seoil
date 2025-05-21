class Mt12 {
	//가변 인자 문법
	//형식: (자료형) ... (변수명)을 배열로 받음
	void prn(int ... arr) {
		for (int i = 0; i < arr.length; i++)
			System.out.print(arr[i]+" ");
	}
}
public class ObjectEx12 {

	public static void main(String[] args) {

		Mt12 mt12 = new Mt12();
		mt12.prn(1, 2, 3, 4, 5);
	}

}
