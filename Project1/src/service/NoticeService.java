package service;

import java.text.SimpleDateFormat;
import java.util.List;
import java.util.Map;

import util.ScanUtil;
import util.View;
import controller.Controller;
import dao.NoticeDao;

public class NoticeService {

	// 싱글톤 패턴
	private NoticeService() {

	}

	private static NoticeService instance;

	public static NoticeService getInstance() {
		if (instance == null) {
			instance = new NoticeService();
		}
		return instance;
	}

	private NoticeDao noticeDao = NoticeDao.getInstance();
	SimpleDateFormat format = new SimpleDateFormat("yy/MM/dd");
	public static int noticeNo;

	// (관리자)공지 목록
	public int noticeList() {
		List<Map<String, Object>> noticeList = noticeDao.noticeList();
		System.out.println("============================");
		System.out.println("번호\t제목\t내용\t작성자\t작성일");
		
		for(Map<String, Object> board : noticeList){
			System.out.println(board.get("NOTICE_NO") +
						"\t" + board.get("NOTICE_TITLE") +
						"\t" + board.get("NOTICE_CONTENT") +
						"\t" + board.get("NOTICE_USER") + 
						"\t" + format.format(board.get("NOTICE_DATE")));
		}
		System.out.println("============================");

		// 관리자
		if (Controller.loginManager != null) {
			System.out.println("1.조회  2.등록  0.돌아가기");
			int input = ScanUtil.nextInt();

			switch (input) {
			case 1: // 공지 조회
				return View.NOTICE_READ;

			case 2: // 공지 등록
				return View.NOTICE_INSERT;

			case 0: // 홈으로 돌아가기
				return View.HOME;

			default:
				System.out.println("잘못 입력하였습니다.");
			}
		} else { // 일반, 비회원
			System.out.println("1.조회  0.돌아가기");
			int input = ScanUtil.nextInt();
			switch (input) {
			case 1:
				return View.NOTICE_READ;

			case 0:
				return View.HOME;

			default:
				System.out.println("잘못 입력하였습니다.");
			}
		}
		return View.HOME;
	}

	// 공지 조회
	public int noticeRead() {
		System.out.print("공지 번호 > ");
		noticeNo = ScanUtil.nextInt();

		Map<String, Object> board = noticeDao.selectBoard(noticeNo);

		System.out.println("=====================================");
		System.out.println("공지번호\t: " + board.get("NOTICE_NO"));
		System.out.println("제목\t: " + board.get("NOTICE_TITLE"));
		System.out.println("내용\t: " + board.get("NOTICE_CONTENT"));
		System.out.println("작성자\t: " + board.get("NOTICE_USER"));
		System.out.println("작성일\t: " + format.format(board.get("NOTICE_DATE")));
		System.out.println("=====================================");

		System.out.print("1.수정  2.삭제  0.목록 > ");
		int input = ScanUtil.nextInt();
		switch (input) {
		case 1: // 공지 수정
			return View.NOTICE_UPDATE;

		case 2: // 공지 삭제
			return View.NOTICE_DELETE;

		case 0: // 공지 목록
			return View.NOTICE_LIST;

		default:
			System.out.println("잘못 입력하였습니다.");
		}
		return View.NOTICE_LIST;
	}

	// 공지 등록
	public int noticeInsert() {
		System.out.print("제목 > ");
		String title = ScanUtil.nextLine();
		System.out.print("내용 > ");
		String content = ScanUtil.nextLine();
		String managerId = (String) Controller.loginManager.get("NOTICE_USER");

		int result = noticeDao.insertNotice(title, content, managerId);

		if (result > 0) {
			System.out.println("공지가 등록되었습니다.");
		} else {
			System.out.println("공지 등록에 실패하였습니다.");
		}
		return View.NOTICE_LIST;
	}

	// 공지 수정
	public int noticeUpdate() {
		System.out.print("제목 > ");
		String title = ScanUtil.nextLine();
		System.out.print("내용 > ");
		String content = ScanUtil.nextLine();

		int result = noticeDao.updateNotice(title, content, noticeNo);

		if (result > 0) {
			System.out.println("게시물이 수정되었습니다.");
		} else {
			System.out.println("게시물 수정에 실패하였습니다.");
		}
		return View.BOARD_LIST;
	}

	// 공지 삭제
	public int noticeDelete() {
		System.out.print("정말 삭제하시겠습니까(y/n) > ");

		if (ScanUtil.nextLine().equals("y")) {
			int result = noticeDao.deleteNotice(noticeNo);

			if (result > 0) {
				System.out.println("게시글이 삭제되었습니다.");
			} else {
				System.out.println("게시글 삭제에 실패하였습니다.");
			}
		}
		return View.BOARD_LIST;
	}

}
