package board;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BoardService {
	
	@Autowired
	BoardDAO dao;
	public BoardService() {
		System.out.println("service");
	}
	public PageList pageList(int requestPage) {
		PageList pagelist = new PageList();
		
		try {
			pagelist.setTotalCount(dao.count());
			pagelist.setPagePerCount(10);
			pagelist.setTotalPage((pagelist.getTotalCount() <= 0) ? 0 : (pagelist.getTotalCount()-1)/pagelist.getPagePerCount()+1);
			pagelist.setCurrentPage(requestPage);
			pagelist.setPageCount(5);
			int startnum = (requestPage-1)*pagelist.getPagePerCount()+1;
			int endnum = requestPage*pagelist.getPagePerCount();
			
			pagelist.setStartPage((requestPage-1)/pagelist.getPageCount()*pagelist.getPageCount()+1);
			pagelist.setEndPage(pagelist.getStartPage()+(pagelist.getPageCount()-1));
			if(pagelist.getEndPage() > pagelist.getTotalPage())
				pagelist.setEndPage(pagelist.getTotalPage());
			
			pagelist.setPre((requestPage > pagelist.getPageCount()) ? true : false);
			pagelist.setNext((pagelist.getTotalPage() > pagelist.getEndPage()) ? true : false);
			List<Board> list = dao.findAll(startnum, endnum);
			List<BoardList> boardLists = new ArrayList<BoardList>();
			for (Board board : list) {
				BoardList boardlist = new BoardList(
						board.getId(),
						board.getTitle(),
						board.getAuthor(),
						board.getCreateDate(),
						board.getAttachment(),
						board.getViewcnt()
					);
				boardLists.add(boardlist);
			}
			pagelist.setList(boardLists);
			return pagelist;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
	public int save(BoardForm form) {
		Board b = new Board();
		b.setTitle(form.getTitle());
		b.setAuthor(form.getAuthor());
		b.setContent(form.getContent());
		b.setAttachment(form.getAttachment());
		return dao.save(b);
	}
}
