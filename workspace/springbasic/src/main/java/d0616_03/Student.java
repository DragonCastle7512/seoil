package d0616_03;
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
public class Student {
	PrintInfo printInfo;
	public Print print;
}
/*
 * ��ü�� �ܼ��� �����͸� �����ϴ� ��ü(VO)
 * ��� ��ü�� �߰��� ��� ������ ��ü�� ����
 * Print�� �������̽�, ���� �� �����͸� ������ ����
 */