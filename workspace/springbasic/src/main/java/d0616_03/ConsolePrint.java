package d0616_03;

public class ConsolePrint implements Print {

	PrintInfo info;
	public ConsolePrint(PrintInfo info) {
		this.info = info;
	}
	public void print() {
		System.out.println("주민등록번호: "+info.getId());
		System.out.println("이름: "+info.getName());
		System.out.println("성적: "+info.getSungjuk().toString());
	}
	public void print(String id, String name, Sungjuk sung) {
		System.out.println("주민등록번호: "+id);
		System.out.println("이름: "+name);
		System.out.println("성적: "+sung.toString());
	}
}
