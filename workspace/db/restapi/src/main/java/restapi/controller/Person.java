package restapi.controller;

import javax.xml.bind.annotation.XmlRootElement;

import org.springframework.stereotype.Service;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@XmlRootElement		//xml 설정 시 선언
public class Person {
	String name;
	int age;
}