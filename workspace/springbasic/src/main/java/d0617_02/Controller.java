package d0617_02;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

//Controller - Service - DAO
@AllArgsConstructor
@Setter
@Getter
@ToString
public class Controller {
	private Service service;
	public Controller() {
		System.out.println("Controller������ ����!!");
	}
	public void exec() {
		System.out.println("controller exec�Լ� ����");
		service.exec();
	}
 }
