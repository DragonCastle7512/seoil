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
		System.out.println("Service积己磊 积己!!");
	}
	public void exec() {
		System.out.println("service exec窃荐 角青");
		dao.exec();
	}
}
