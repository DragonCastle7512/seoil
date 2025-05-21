class Board04 {
	private String title;
	private String content;
	public Board04(String new_title, String new_content) {
		title = new_title;
		content = new_content;
	}
	public void print() {
		System.out.println(title+" "+content);
	}
}
public class ConsEx04 {

	public static void main(String[] args) {
		
		//Board04 b = new Board04();
		//b.print();
		
		Board04 b = new Board04("제목", "내용");
		b.print();
	}

}
