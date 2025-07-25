package restapi;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RestApiService {
	
	@Autowired
	ExternalMemberMapper dao;
	
	public List<ExternalMember> getMemberList() {
		return dao.findAll();
	}

	public void saveAll(ExternalMember[] externalMembers) {
		dao.deleteAll();
		for (ExternalMember member : externalMembers)
			dao.save(member);
	}
	public void deleteAll() {
		dao.deleteAll();
	}
}
