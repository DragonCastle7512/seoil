package net.daum.controller;

import java.util.List;
import java.util.Scanner;

import net.daum.dao.BoardDAOImpl;
import net.daum.dto.BoardDTO;

public class BoardExample {

	private Scanner sc = new Scanner(System.in);
	public void list() {
		System.out.println();
		System.out.println("[게시판 목록]");
		System.out.println("----------------------------------------------------------------");
		System.out.printf("%-6s%-12s%-16s%-40s\n", "no", "writer", "date", "title");
		System.out.println("----------------------------------------------------------------");
		BoardDAOImpl bdao = new BoardDAOImpl();
		List<BoardDTO> blist = bdao.getBoardList();
		if(blist != null && blist.size() > 0) {
			for (BoardDTO b : blist) {
				System.out.printf("%-6s%-12s%-16s%-40s\n", b.getBno(), b.getBwriter(), b.getBtitle(), b.getBdate(), b.getBcontent());
			}
		}
		else System.out.println("게시판 목록이 없습니다.");
		mainMenu();
	}
	public void mainMenu() {
		System.out.println();
		System.out.println("----------------------------------------------------------------");
		System.out.println("메인 메뉴: 1. Create | 2. Read | 3. Clear | 4. Exit");
		System.out.println("----------------------------------------------------------------");
		System.out.print("메뉴 선택>> ");
		String menuNo = sc.nextLine();
		System.out.println();
		
		switch (menuNo) {
			case "1" : create(); break;
			case "2" : read(); break;
			case "3" : clear(); break;
			case "4" : exit(); break;
		}

	}
	private void create() {
		BoardDTO board = new BoardDTO();
		System.out.println("[새 게시물 입력]");
		System.out.print("글쓴이 입력>> ");
		board.setBwriter(sc.nextLine());
		System.out.print("제목 입력>> ");
		board.setBtitle(sc.nextLine());
		System.out.print("글 내용>> ");
		board.setBcontent(sc.nextLine());
		
		System.out.println("----------------------------------------------------------------");
		System.out.println("보조 메뉴: 1. OK | 2. Cancel");
		System.out.println("----------------------------------------------------------------");
		System.out.print("메뉴 선택>> ");
		String menuNo = sc.nextLine();
		if(menuNo.equals("1")) {
			BoardDAOImpl bdao = new BoardDAOImpl();
			bdao.insertBoard(board);
		}
		list();
	}
	public void read() {
		System.out.println("[게시물 읽기]");
		System.out.print("번호>>");
		int bno = Integer.parseInt(sc.nextLine());
		
		BoardDAOImpl bdao = new BoardDAOImpl();
		BoardDTO bc = bdao.getBoardDTO(bno);
		if(bc != null) {
			//BoardDTO bc = bdao.getBoardCount(bno);
			System.out.println("#########################");
			System.out.println("게시판 번호: "+bc.getBno());
			System.out.println("글쓴이: "+bc.getBwriter());
			System.out.println("글제목: "+bc.getBtitle());
			System.out.println("글내용: "+bc.getBcontent());
			System.out.println("등록날짜: "+bc.getBdate());
			
			System.out.println("----------------------------------------------------------------");
			System.out.println("보조 메뉴: 1. Update | 2. Delete | 3. List");
			System.out.println("----------------------------------------------------------------");
			System.out.print("메뉴 선택>> ");
			String menuNo = sc.nextLine();
			if(menuNo.equals("1")) {
				update(bc);
			}
			else if(menuNo.equals("2")) {
				delete(bc);
			}
			else list();
		}
		else {
			System.out.println("해당 게시물 내용이 없습니다.");
			list();
		}
	}
	private void delete(BoardDTO bc) {
		System.out.println("[ 게시물 삭제 ]");
		System.out.println("----------------------------------------------------------------");
		System.out.println("보조 메뉴: 1. OK | 2. Cancel");
		System.out.println("----------------------------------------------------------------");
		System.out.print("메뉴 선택>> ");
		String menuNo = sc.nextLine();
		if(menuNo.equals("1")) {
			BoardDAOImpl bdao = new BoardDAOImpl();
			bdao.deleteBoard(bc);
		}
		list();
	}
	private void update(BoardDTO bc) {
		System.out.println("[게시판 수정내용 입력]");
		System.out.print("수정 글쓴이>> ");
		bc.setBwriter(sc.nextLine());
		System.out.print("수정 제목>> ");
		bc.setBtitle(sc.nextLine());
		System.out.print("수정 내용>> ");
		bc.setBcontent(sc.nextLine());
		
		System.out.println("----------------------------------------------------------------");
		System.out.println("보조 메뉴: 1. OK | 2. Cancel");
		System.out.println("----------------------------------------------------------------");
		String menuNo = sc.nextLine();
		if(menuNo.equals("1")) {
			BoardDAOImpl bdao = new BoardDAOImpl();
			bdao.updateBoard(bc);
		}
		list();
	}
	private void clear() {
		System.out.println("[게시판 전체 삭제]");
		System.out.println("----------------------------------------------------------------");
		System.out.println("보조 메뉴: 1. OK | 2. Cancel");
		System.out.println("----------------------------------------------------------------");
		System.out.println("메뉴 선택>> ");
		String menuNo = sc.nextLine();
		if(menuNo.equals("1")) {
			BoardDAOImpl bdao = new BoardDAOImpl();
			bdao.deleteAllBoard();
		}
		list();
	}
	public void exit() {
		System.out.println("게시판 종료");
		System.exit(0);
	}
	public static void main(String[] args) {
		
		BoardExample boardExample = new BoardExample();
		boardExample.list();
	}

}
