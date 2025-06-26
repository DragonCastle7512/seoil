package reboard.vo;

import java.util.Date;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class BoardViewPage {
	private int id;
	private String title;
	private String author;
	//null인 경우 createdate 아닌 경우 updatedate
	private Date date;
	private int viewcnt;
	private String content;
	private String attachment;
//	private int parentid;
	private int tab;
}
