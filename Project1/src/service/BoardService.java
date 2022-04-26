package service;

import java.text.SimpleDateFormat;

import util.ScanUtil;
import util.View;

public class BoardService {

	// 싱글톤 패턴
	private BoardService() {

	}

	private static BoardService instance;

	public static BoardService getInstance() {
		if (instance == null) {
			instance = new BoardService();
		}
		return instance;
	}

	SimpleDateFormat format = new SimpleDateFormat("yy/MM/dd");
	public static int boardNo;

	// 게시판 목록 - 공지사항 / 자유게시판 / 희망사항 게시판
	public int boardList() {
		System.out.println("1.공지사항  2.자유게시판  3.희망도서 게시판  0.돌아가기");
		System.out.print("게시판 선택 > ");
		int input = ScanUtil.nextInt();

		switch (input) {
		case 1: // 공지사항
			return View.NOTICE_LIST;

		case 2: // 자유게시판
			return View.BOARD_FREE;

		case 3: // 희망도서 게시판
			return View.BOARD_REQUEST;

		case 0: // 목록으로 돌아감
			return View.BOARD_LIST;
			
		default:
			System.out.println("잘못 입력하였습니다.");
		}

		return View.BOARD_LIST;
	}

}
