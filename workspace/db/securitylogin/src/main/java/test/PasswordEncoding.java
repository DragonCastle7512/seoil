package test;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

public class PasswordEncoding {

	public static void main(String[] args) {
		PasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
		String password = "123";
		
		String encodedPassword = passwordEncoder.encode(password);
		System.out.println("Encoded password: "+encodedPassword);
		
		boolean isMatch = passwordEncoder.matches("1234", encodedPassword);
		System.out.println("isMatch: "+isMatch);
	}

}
