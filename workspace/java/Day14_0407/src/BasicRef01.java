class Board01 {
	String writer;
	String title;
	String cont;
}
public class BasicRef01 {

	public static void main(String[] args) {

		Board01 b;
		//System.out.println("글쓴이:"+b.writer+",제목:"+b.title+",내용:"+b.cont);
		
		b = new Board01();
		System.out.println("글쓴이:"+b.writer+",제목:"+b.title+",내용:"+b.cont);
	}

}
