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
public class MemberAPI {
	
	@Autowired
	MemberJPA memberJPA;
	
	@GetMapping("members")
	public List<Member> getMembers() {
		return memberJPA.findAll();
	}

	@PutMapping("member")
	public Member putMember(@RequestBody Member member) {
		Member dbPerson = memberJPA.findById(member.getId()).get();
		if(member.getUsername() != null) dbPerson.setUsername(member.getUsername());
		if(member.getPassword() != null) dbPerson.setPassword(member.getPassword());
		if(member.getEmail() != null) dbPerson.setEmail(member.getEmail());
		if(member.getRole() != null) dbPerson.setRole(member.getRole());
		return memberJPA.save(dbPerson);
	}
	
	@GetMapping("member/{id}")
	public Member getMember(@PathVariable Integer id) {
		return memberJPA.findById(id).get();
	}
	
	@DeleteMapping("member/{id}")
	public String deleteMember(@PathVariable Integer id) {
		memberJPA.deleteById(id);
		return "삭제성공";
	}
	
	@PostMapping("member")
	public String postMember(@RequestBody Member member) {
		memberJPA.save(member);
		return "입력성공";
	}

}
