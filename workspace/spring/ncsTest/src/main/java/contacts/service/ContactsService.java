package contacts.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import contacts.repository.OracleContactsDAO;
import contacts.vo.Contact;
import contacts.vo.PageList;

@Service
public class ContactsService {
	
	@Autowired
	OracleContactsDAO dao;

	public PageList viewAll(int requestPage) {
		try {
			PageList pagelist = PageList.builder()
					.totalCount(dao.count())
					.pagePerCount(10)
					.currentPage(requestPage)
					.pageCount(5)
					.build();
			pagelist.setTotalPage((pagelist.getTotalCount() <= 0) ? 0 : (pagelist.getTotalCount()-1)/pagelist.getPagePerCount()+1);
			int startnum = (requestPage-1)*pagelist.getPagePerCount()+1;
			int endnum = requestPage*pagelist.getPagePerCount();
			
			pagelist.setStartPage((requestPage-1)/pagelist.getPageCount()*pagelist.getPageCount()+1);
			pagelist.setEndPage(pagelist.getStartPage()+(pagelist.getPageCount()-1));
			if(pagelist.getEndPage() > pagelist.getTotalPage())
				pagelist.setEndPage(pagelist.getTotalPage());
			
			pagelist.setPre((requestPage > pagelist.getPageCount()) ? true : false);
			pagelist.setNext((pagelist.getTotalPage() > pagelist.getEndPage()) ? true : false);
			pagelist.setList(dao.findAll(startnum, endnum));
			return pagelist;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
	public Contact view(int id) {
		return dao.findById(id);
	}
	public int save(Contact con) {
		return dao.save(con);
	}
	public int edit(Contact con) {
		return dao.update(con);
	}
	public int delete(int id) {
		return dao.delete(id);
	}
	
	
}
