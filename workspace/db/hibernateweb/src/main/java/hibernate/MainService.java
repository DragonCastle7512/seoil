package hibernate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MainService {

	@Autowired
	MainDao dao;

	public int insert(Student student) {
		return dao.insert(student);
	}
}
