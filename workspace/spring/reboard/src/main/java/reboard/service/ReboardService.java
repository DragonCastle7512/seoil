package reboard.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import reboard.repository.ReBoardDAO;
import reboard.vo.PageList;
import reboard.vo.ReBoard;

@Service
public class ReboardService {
	
	@Autowired
	//여러개의 빈이 존재하는 경우 선택 가능
	//첫 글자는 소문자
	@Qualifier("oracleReBoardDAO")
	ReBoardDAO dao;		//유연한 결합을 위해 인터페이스에 주입

	public PageList getPageList(int requestPage) {
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
			List<ReBoard> list = dao.findAll(startnum, endnum);
			List<ReBoard> boardLists = new ArrayList<ReBoard>();
			for (ReBoard board : list) {
				ReBoard boardlist = ReBoard.builder()
						.id(board.getId())
						.title(board.getTitle())
						.author(board.getAuthor())
						.createDate(board.getCreateDate())
						.attachment(board.getAttachment())
						.viewcnt(board.getViewcnt())
						.parentid(board.getParentid())
						.tab(board.getTab())
						.build();
				boardLists.add(boardlist);
			}
			pagelist.setList(boardLists);
			return pagelist;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
}
