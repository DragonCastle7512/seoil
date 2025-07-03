package mybatis;

import org.springframework.stereotype.Component;

import lombok.Data;
import lombok.ToString;

@Component	//bean»ý¼º
@Data
@ToString
public class Member {
	private String id;
	private String password;
	private String name;
	private String address;
	private String hp;
	private String email;
}
