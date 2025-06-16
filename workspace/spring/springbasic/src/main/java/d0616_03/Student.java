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
 * 객체는 단순히 데이터를 전달하는 객체(VO)
 * 기능 객체가 추가될 경우 별도의 객체로 생각
 * Print는 인터페이스, 연결 시 데이터를 별도로 전달
 */