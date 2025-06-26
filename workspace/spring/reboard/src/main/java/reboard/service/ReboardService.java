package reboard.service;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import reboard.repository.ReBoardDAO;
import reboard.vo.BoardForm;
import reboard.vo.BoardViewPage;
import reboard.vo.PageList;
import reboard.vo.ReBoard;
import reboard.vo.ReplyBoardForm;

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
						.attachment(board.getAttachment())
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

	public void write(BoardForm form, MultipartFile file) {
		String path = "C:/storage";
		String filename = file.getOriginalFilename();
		String fullName = path+filename;
		try {
			file.transferTo(new File(fullName));
		} catch (Exception e) {
			e.printStackTrace();
		}
		ReBoard board = ReBoard.builder()
				.title(form.getTitle())
				.content(form.getContent())
				.author(form.getAuthor())
				.attachment(filename)
				.build();
		dao.save(board);
	}

	public BoardViewPage getViewPage(int id) {
		dao.viewCountup(id);
		ReBoard board = dao.findById(id);
		BoardViewPage page = BoardViewPage.builder()
				.id(board.getId())
				.title(board.getTitle())
				.content(board.getContent())
				.author(board.getAuthor())
				.attachment(board.getAttachment())
				.viewcnt(board.getViewcnt())
				.tab(board.getTab())
				.build();
		page.setDate((board.getUpdatedate() == null) ? board.getCreateDate() : board.getUpdatedate());
		return page;
	}
	public int replySave(ReplyBoardForm form, MultipartFile file) {
		String path = "C:/storage";
		String filename = file.getOriginalFilename();
		String fullName = path+filename;
		try {
			file.transferTo(new File(fullName));
		} catch (Exception e) {
			e.printStackTrace();
		}
		ReBoard board = ReBoard.builder()
				.title(form.getTitle())
				.content(form.getContent())
				.author(form.getAuthor())
				.parentid(form.getParentid())
				.attachment(filename)
				.tab(dao.findById(form.getParentid()).getTab()+1)
				.build();
		return dao.replySave(board);
	}
	public int update(BoardForm form, MultipartFile file) {
		String path = "C:/storage";
		String filename = file.getOriginalFilename();
		String fullName = path+filename;
		try {
			file.transferTo(new File(fullName));
		} catch (Exception e) {
			e.printStackTrace();
		}
		ReBoard board = ReBoard.builder()
				.title(form.getTitle())
				.content(form.getContent())
				.author(form.getAuthor())
				.attachment(filename)
				.build();
		return dao.update(board);
	}
	public int delete(int id) {
		return dao.delete(id);
	}
}
