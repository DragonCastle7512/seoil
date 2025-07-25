package restapi;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import groovyjarjarpicocli.CommandLine.Model;


@RestController
public class RestApiController {
	
	@Autowired
	RestApiService service;
	
	@GetMapping("list")
	public List<ExternalMember> findAll(Model model) {
		return service.getMemberList();
	}
}
