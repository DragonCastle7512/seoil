package com.my.demo;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "NEW_MEMBER")
public class Member {
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "member_seq_gen")
	@SequenceGenerator(name = "member_seq_gen", sequenceName = "member_seq", allocationSize = 1)
	private int id;
	private String username;
	private String password;
	private String email;
	private String role;
}
