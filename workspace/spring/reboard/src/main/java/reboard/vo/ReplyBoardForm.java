package reboard.vo;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class ReplyBoardForm {
	private String title;
	private String content;
	private String author;
	private int parentid;
}
