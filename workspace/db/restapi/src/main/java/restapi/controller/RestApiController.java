package restapi.controller;

import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

//@Controller
@RestController
public class RestApiController {
	
	@GetMapping("/myjson")
	public String myjson() {
		return "{\"name\":\"kim\",\"age\":\"25\"}";
	}
	
	@GetMapping("/objectjson")
	public Person objectjson() {
		Person person = new Person();
		person.setName("hongkildong");
		person.setAge(30);
		return person;
	}
//	@GetMapping(value = "/person/xml", produces = {MediaType.APPLICATION_XML_VALUE})
//    public Person getPersonXml() {
//        return new Person("홍길동", 30);
//    }
	@GetMapping (value = "/person/xml", produces = "application/xml")
	public Person getPersonXml() {
		return new Person("홍길동", 30);
	}
	
	@GetMapping(value = "/person/json", produces = "application/json")
	public Person getPersonJson() {
		return new Person("홍길동", 30);
	}
}
