package net.daum.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

/* 기본생성자, canEqual(), equals(), 
 * getter(), setter(), hashCode(), 
 * toString() 자동으로 추가
 */
@Data 
//기본생성자 대신 맴버변수 개수를 매개변수로 하는 생성자 생성
@AllArgsConstructor
public class BoardDTO {

	private String writer;
	private String title;
	private String content;
}
