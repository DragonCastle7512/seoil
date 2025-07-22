package restapi.controller;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class MemeberApiController {
	
	List<Member> members = new ArrayList<>(Arrays.asList(
			new Member("user1", "1234", "user1@naver.com"),
			new Member("user2", "1234", "user2@naver.com"),
			new Member("user3", "1234", "user3@naver.com"),
			new Member("user4", "1234", "user4@naver.com"),
			new Member("user5", "1234", "user5@naver.com")
		));
	
	@PostMapping("member")
	public ResponseEntity<String> Insert(@RequestBody Member member) {
		members.add(member);
	    return ResponseEntity.ok("insert ok");
	}
	
	@GetMapping(value = "member/{type}")
	public ResponseEntity<Member> typeSelectById(@PathVariable String type, @RequestParam String username) {
//		Optional<Member> member = members.stream()
//			    .filter(m -> m.getUsername().equals(username))
//			    .findFirst();
//		member.ifPresent(System.out::println);
		Map<String, Member> memberMap = members.stream()
				.collect(Collectors.toMap(Member::getUsername, m -> m));
		Member member = memberMap.get(username);
		if(type.equals("json")) {
			return ResponseEntity.ok()
					.contentType(MediaType.APPLICATION_JSON)
					.body(member);
		}
		else if(type.equals("xml")) {
			return ResponseEntity.ok()
					.contentType(MediaType.APPLICATION_XML)
					.body(member);
		}
		else {
			return (ResponseEntity<Member>)ResponseEntity.status(HttpStatus.BAD_REQUEST);
		}
	}
	@GetMapping("members")
	public List<Member> selectAll() {
		return members;
	}
	//curl -X PUT http://localhost:8888/api/member -H "Content-Type: application/json" -d "{\"username\":\"user1\",\"password\":\"newPass123\",\"email\":\"user1@example.com\"}"
	@PutMapping("member")
	public ResponseEntity<Member> update(@RequestBody Member member) {
		Map<String, Member> memberMap = members.stream()
				.collect(Collectors.toMap(Member::getUsername, m -> m));
		Member existingMember = memberMap.get(member.getUsername());
//		System.out.println(members.get(0).hashCode());
//		System.out.println(existingMember.hashCode());
		
		if(existingMember == null) {
			return ResponseEntity.status(HttpStatus.NOT_FOUND).body(null);
		}
		else {
			existingMember.setPassword(member.getPassword());
			existingMember.setEmail(member.getEmail());
			return ResponseEntity.ok(existingMember);
		}
	}
	//curl -X DELETE "http://localhost:8888/api/member?username=user1"
	@DeleteMapping("member")
	public ResponseEntity<Member> delete(String username) {
		Member member = members.stream()
		        .filter(m -> m.getUsername().equals(username))
		        .findFirst()
		        .orElse(null);
		if(member == null) return ResponseEntity.status(HttpStatus.NOT_FOUND).body(null);
		else {
			members.remove(member);
			return ResponseEntity.ok(member);
		}
	}
}
