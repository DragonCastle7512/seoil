package d0616_02;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class ConsolePrint implements Print {

	PersonInfo info;
	public void print() {
		System.out.println("�ֹε�Ϲ�ȣ: "+info.getId());
		System.out.println("�̸�: "+info.getName());
		System.out.println("�ּ�: "+info.getAddress());
	}
}
