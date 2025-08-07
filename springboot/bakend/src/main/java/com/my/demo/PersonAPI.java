package com.my.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestAttribute;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class PersonAPI {
	
	@Autowired
	PersonJPA personJPA;
	
	@GetMapping("persons")
	public List<Person> getPersons() {
		return personJPA.findAll();
	}
	
	//curl -v -X PUT http://localhost:8888/api/person -H "Content-Type:application/json" -d "{\"id\":\"20\",\"name\":\"user200\",\"email\":\"user200@gmail.com\"}"
	@PutMapping("person")
	public Person putPerson(@RequestBody Person person) {
		Person dbPerson = personJPA.findById(person.getId()).get();
		if(person.getName() != null) dbPerson.setName(person.getName());
		if(person.getEmail() != null) dbPerson.setEmail(person.getEmail());
		return personJPA.save(dbPerson);
	}
	
	@GetMapping("person/{id}")
	//@RequestParam -> /api/person?id=1
	//@RequestAttribute -> 클래스 함수의 파라미를 들고 옴
	//@PathVariable -> /api/person/1
	public Person getPerson(@PathVariable Integer id) {
		return personJPA.findById(id).get();
	}
	
	//curl or ajax로 확인
	//curl -v -X delete http://localhost:8888/api/person/14
	@DeleteMapping("person/{id}")
	public String deletePerson(@PathVariable Integer id) {
		personJPA.deleteById(id);
		return "삭제성공";
	}
	
	//curl -v -X POST http://localhost:8888/api/person -H "Content-Type:application/json" -d "{\"name\":\"user100\",\"email\":\"user100@gmail.com\"}"
	@PostMapping("person")
	public String postPerson(@RequestBody Person person) {
		personJPA.save(person);
		return "입력성공";
	}
	
//	@GetMapping("persons")
//	public ResponseEntity<List<Person>> getPersons() {
//		List<Person> persons = personJPA.findAll();
//		if(persons.isEmpty())
//			return ResponseEntity.noContent().build();
//		return ResponseEntity.ok(persons);
//	}
}
