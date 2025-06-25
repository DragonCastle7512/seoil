package board;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@ToString
public class Board {
	private int id;
	private String title;
	private String author;
	private Date createDate;
	private String content;
	private String attachment;
	private int viewcnt;
	private String type;
}
