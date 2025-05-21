/* Java 7 버전에서 AutoClose 인터페이스가 추가됨
 * 이 인터페이스를 상속받은 자손 API는 try문의 finally 문에서 close()로 닫지 않아도 자동으로 닫힌다.
 */

import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

public class TryCatch14 {

	public static void main(String[] args) throws Exception {
		
		List<String> list = new ArrayList<>();
		list.add("hong gil dong");
		list.add("lee sun shin");
		list.add("kang kam chan");
		//STS나 이클립스에서 기본경로는 프로젝트 경로(Day23_0418)
		try(PrintWriter out = new PrintWriter("./src/result.txt")) {
			//PrintWriter는 AutoCloseable 인터페이스를 상속받은 자손 API
			for (String name : list) {
				out.println(name.toUpperCase());
			}
		}
	}

}
