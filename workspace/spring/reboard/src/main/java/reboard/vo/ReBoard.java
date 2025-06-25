package reboard.vo;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@ToString
@Builder
public class ReBoard {
	private int id;
	private String title;
	private String author;
	private Date createDate;
	private String content;
	private String attachment;
	private int viewcnt;
	private String type;
	private int isdel;
	private Date updatedate;
	private int parentid;
	private int tab;
}

