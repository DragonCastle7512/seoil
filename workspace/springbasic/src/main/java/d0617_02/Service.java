package d0617_02;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@AllArgsConstructor
@Setter
@Getter
@ToString
public class Service {
	private DAO dao;
	public Service() {
		System.out.println("Service������ ����!!");
	}
	public void exec() {
		System.out.println("service exec�Լ� ����");
		dao.exec();
	}
}
