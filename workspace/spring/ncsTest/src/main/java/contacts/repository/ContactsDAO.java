package contacts.repository;

import java.util.List;

import contacts.vo.Contact;

public interface ContactsDAO {
	public List<Contact> findAll(int start, int end);
	public int save(Contact contact);
	public Contact findById(int id); 
	public int update(Contact contact);
	public int delete(int id);
	public int count();
}
