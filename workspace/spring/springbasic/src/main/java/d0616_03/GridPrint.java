package d0616_03;

public class GridPrint implements Print {
	
	PrintInfo info;
	public GridPrint(PrintInfo info) {
		this.info = info;
	}
	public void print() {
		System.out.println("+---------------------------+");
		System.out.println("| 주민등록번호 | 이름 |    주소    |");
		System.out.println("+---------------------------+");
		System.out.println("|"+ info.getId() +"|"+ info.getName()+"|"+info.getSungjuk().toString()+"|");
		System.out.println("+---------------------------+");
	}
	public void print(String id, String name, Sungjuk sungjuk) {
		System.out.println("+---------------------------+");
		System.out.println("| 주민등록번호 | 이름 |    주소    |");
		System.out.println("+---------------------------+");
		System.out.println("|"+id+"|"+ name+"|"+sungjuk.toString()+"|");
		System.out.println("+---------------------------+");
	}
}
