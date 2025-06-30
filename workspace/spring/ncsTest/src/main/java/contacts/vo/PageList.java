package contacts.vo;

import java.util.List;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class PageList {
	private int currentPage;
	private int totalCount;
	private int pagePerCount;
	private int totalPage;
	private int pageCount;
	private int startPage;
	private int endPage;
	private boolean isPre;
	private boolean isNext;
	private String attachment;
	private List<Contact> list;
}
