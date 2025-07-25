package register;

import lombok.Data;

@Data
public class Member {
	int id;
	String name;
	String username;
	String password;
	String email;
	String role;
}
