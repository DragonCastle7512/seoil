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
public class Writing {
	int id;
	String title;
	String author;
	Date createDate;
	String content;
	String attachment;
	int viewcnt;
	String type;
}
