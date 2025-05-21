class Document {
	static int count = 0;
	String name;
	public Document() {
		this("제목없음" + ++count);
	}
	Document(String name) {
		this.name = name;
		System.out.println("문서 "+this.name+" 생성");
	}
}
public class StaticEx02 {

	public static void main(String[] args) {

		new Document();
		new Document("자바.txt");
		new Document();
	}

}
