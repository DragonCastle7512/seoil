package mybatis;

import java.util.List;

import org.apache.ibatis.annotations.Param;

public interface MemberMapper {
	 public int save(@Param("id") String id,@Param("password") String password);
	 //@param�� ���� ��� ���� �߻� ����
	 //xml���� sql���� id=�� - �����, values(��, ��..) - �ʼ�
//	 public int save(String id,String password);
	 public Member findById(String id);
	 public List<Member> findAll();
	 public int update(Member member);
	 public int delete(String id);
}
