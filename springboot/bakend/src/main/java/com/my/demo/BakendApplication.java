package com.my.demo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BakendApplication implements CommandLineRunner {

    private final PersonAPI personAPI;

	@Autowired
	PersonJPA jpa;

    BakendApplication(PersonAPI personAPI) {
        this.personAPI = personAPI;
    }
	
	public static void main(String[] args) {
		SpringApplication.run(BakendApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		//findAll
//		System.out.println(jpa.findAll());
		
		//save
//		Person p = new Person();
//		//p.setId(100);
//		p.setName("sangsu");
//		p.setEmail("sangsu@gmail.com");
//		jpa.save(p);
		//System.out.println(jpa.findAll());
		
		//delete
		//jpa.deleteAllById(null);
		//List<Integer> ids = Arrays.asList(1, 2);
		//jpa.deleteAllById(ids);
		
		//update
		/* 모든 값을 지정하지 않으면 에러
		Person p2 = new Person();
		p.setId(1);
		p.setName("hongkildong");
		p.setEmail("hong@gmail.com");
		jpa.save(p2);
		*/
		
//		Optional<Person> p3 = jpa.findById(4);
//		if(!p3.isEmpty()) {
//			Person person3 = p3.get();
//			person3.setName("hongkildong2");
//			jpa.save(person3);
//		}
		
		//saveAll
//		List<Person> list = new ArrayList<>();
//		for (int i = 0; i < 10; i++) {
//			list.add(
//				Person.builder()
//					.name("홍길동"+i)
//					.email("hong"+i+"@gmail.com")
//					.build());
//		}
//		jpa.saveAll(list);
//		System.out.println(list);
		
	}

}
