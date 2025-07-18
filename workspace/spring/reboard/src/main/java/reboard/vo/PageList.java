package reboard.vo;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class PageList {
	private int currentPage;		//현재페이지
	private int totalCount;			//전체 글 수
	private int pagePerCount;		//페이지당 글의 수
	private int totalPage;			//전체 페이지
	private int pageCount;
	//private int startnum;			//글시작번호
	//private int endnum;			//글 끝번호
	private int startPage;			//네비게이트 시작번호
	private int endPage;			//네비게이트 끝번호
	private boolean isPre;			//네비게이트 이전표시여부
	private boolean isNext;			//네비게이트 다음표시여부
	private String attachment;
	private List<ReBoard> list;	//게시판 페이지 리스트
}
