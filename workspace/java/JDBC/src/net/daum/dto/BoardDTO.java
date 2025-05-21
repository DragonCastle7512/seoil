package net.daum.dto;

import java.util.Date;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class BoardDTO {
	private int bno;
	private String bwriter;
	private String btitle;
	private String bcontent;
	private Date bdate;
}
