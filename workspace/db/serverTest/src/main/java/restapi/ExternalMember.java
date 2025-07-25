package restapi;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.Data;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class ExternalMember {
	int id;
	String name;
	String username;
	String email;
	String phone;
}