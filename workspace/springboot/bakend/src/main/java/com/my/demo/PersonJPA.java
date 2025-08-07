package com.my.demo;

import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonJPA extends JpaRepository<Person, Integer> {

}
