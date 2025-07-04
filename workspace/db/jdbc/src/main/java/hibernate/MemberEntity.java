package hibernate;

import javax.persistence.Entity;

import lombok.Data;

@Entity
@Data
public class MemberEntity {
	private String id;
	private String password;
}
