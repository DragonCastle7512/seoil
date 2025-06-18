package d0616_03;

public class ConsolePrint implements Print {

	PrintInfo info;
	public ConsolePrint(PrintInfo info) {
		this.info = info;
	}
	public void print() {
		System.out.println("�ֹε�Ϲ�ȣ: "+info.getId());
		System.out.println("�̸�: "+info.getName());
		System.out.println("����: "+info.getSungjuk().toString());
	}
	public void print(String id, String name, Sungjuk sung) {
		System.out.println("�ֹε�Ϲ�ȣ: "+id);
		System.out.println("�̸�: "+name);
		System.out.println("����: "+sung.toString());
	}
}
