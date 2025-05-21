import net.daum.dto.BoardDTO;

public class BoardMain {

	public static void main(String[] args) {

		BoardDTO board = new BoardDTO("홍길동", "게시판 글제목입니다.", "게시판 글내용입니다.");
		System.out.println(board.getWriter());
		System.out.println(board.getTitle());
		System.out.println(board.getContent());
	}

}
