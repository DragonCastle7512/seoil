package login;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.security.core.Authentication;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.web.authentication.AuthenticationSuccessHandler;

public class CustomerLoginSuccessHandler implements AuthenticationSuccessHandler {

	@Override
	public void onAuthenticationSuccess(HttpServletRequest request, HttpServletResponse response,
			Authentication authentication) throws IOException, ServletException {
		//성공시 authorities에 저장된 값을 확인한 후에 해당하는 페이지로 이동
		System.out.println("성공 시: "+authentication.getAuthorities());
//		List<String> roleNames = new ArrayList<String>();
//		authentication.getAuthorities().forEach(a-> {
//			roleNames.add(a.getAuthority());
//		});
		//포함여부만 판단하므로 Set이 더 빠름
		Set<String> roleNames = authentication.getAuthorities()
				.stream()
				.map(GrantedAuthority::getAuthority)
				.collect(Collectors.toSet());
//		Set<String> roleNames = new HashSet<String>();
//		authentication.getAuthorities().forEach(a -> {
//			roleNames.add(a.getAuthority());
//		});
		if(roleNames.contains("ROLE_ADMIN"))
			response.sendRedirect("/admin/index");
		else if(roleNames.contains("ROLE_USER"))
			response.sendRedirect("/user/index");
		else
			response.sendRedirect("/login/accessError");
	}

}
