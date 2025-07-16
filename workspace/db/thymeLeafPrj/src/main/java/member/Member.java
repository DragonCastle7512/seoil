package member;

import lombok.Data;

@Data
public class Member {
	String username;
	String password;
	String email;
	String role;
	java.sql.Date regdate;
}
