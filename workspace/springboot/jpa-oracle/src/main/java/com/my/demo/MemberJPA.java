package com.my.demo;

import org.springframework.data.jpa.repository.JpaRepository;

public interface MemberJPA extends JpaRepository<Member, Integer> {

}
