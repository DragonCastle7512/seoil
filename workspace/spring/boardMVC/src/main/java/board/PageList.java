package board;

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
	private int currentPage;		//����������
	private int totalCount;			//��ü �� ��
	private int pagePerCount;		//�������� ���� ��
	private int totalPage;			//��ü ������
	private int pageCount;
	//private int startnum;			//�۽��۹�ȣ
	//private int endnum;			//�� ����ȣ
	private int startPage;			//�׺����Ʈ ���۹�ȣ
	private int endPage;			//�׺����Ʈ ����ȣ
	private boolean isPre;			//�׺����Ʈ ����ǥ�ÿ���
	private boolean isNext;			//�׺����Ʈ ����ǥ�ÿ���
	private List<BoardList> list;	//�Խ��� ������ ����Ʈ
}
