package controller;

import java.util.Map;

import service.BoardService;
import service.ManagerService;
import service.NoticeService;
import service.UserService;
import util.ScanUtil;
import util.View;

public class Controller {

	public static void main(String[] args) {
		
		new Controller().start();
	}
	
	// 유저 정보를 해시맵에 저장한다(관리자/회원)
	public static Map<String, Object> loginManager;
	public static Map<String, Object> loginUser;
	
	// Service의 객체를 받아 온다.(싱글톤)
	private UserService userService = UserService.getInstance();
	private BoardService boardService = BoardService.getInstance();
	private NoticeService noticeService = NoticeService.getInstance();
	private ManagerService managerService = ManagerService.getInstance();
	
	

	private void start() {
		
		int view = View.HOME;
		
		while(true){
			switch(view){
			case View.HOME: // 홈
				view = home();
				break;
				
			case View.JOIN: // 회원가입
				view = userService.join();
				break;
				
			case View.LOGIN: // 로그인
				view = userService.login();
				break;
				
			case View.MANAGER_HOME: // (관리자)홈 화면
				view = managerHome();
				break;
				
			case View.MANAGE_BOARD: // (관리자)게시판 관리
				view = managerService.manageBoard();
				break;
				
			case View.BOARD_LIST: // (관리자)게시판 목록
				view = boardService.boardList();
				break;
				
			case View.NOTICE_LIST: // (관리자)게시판 - 공지
				view = noticeService.noticeList();
				break;
				
			case View.NOTICE_READ: // (관리자)공지 조회
				view = noticeService.noticeRead();
				break;
				
			case View.NOTICE_INSERT: // (관리자)공지 작성
				view = noticeService.noticeInsert();
				break;
				
			case View.NOTICE_UPDATE: // (관리자)공지 수정
				view = noticeService.noticeUpdate();
				break;
				
			case View.NOTICE_DELETE: // (관리자)공지 삭제
				view = noticeService.noticeDelete();
				break;
				
			case View.USER_HOME: // (회원)홈 화면
				view = userHome();
				break;
			}
		}
	}

	// 회원 홈 화면
	private int userHome() {
		System.out.println("1.도서조회  2.게시판  3.내정보 0.로그아웃");
		int input = ScanUtil.nextInt();
		
		switch(input){
		case 1: // 도서조회
//			return 도서
			
		case 2: // 게시판
//			return 게시판
			
		case 3: // 내정보
//			return 내정보
			
		case 0: // 로그아웃
			System.out.println("로그아웃 되었습니다.");
			return View.HOME;
			
		default:
			System.out.println("잘못 입력하였습니다.");
		}		
		return View.USER_HOME;
	}

	// 관리자 홈 화면
	private int managerHome() {
		System.out.println("1.게시판관리  2.회원관리  3.도서관리  0.종료");
		int input = ScanUtil.nextInt();
		
		switch(input){
		case 1: // 게시판 관리
			return View.MANAGE_BOARD;
			
		case 2: // 회원 관리
			return View.MANAGE_MEMBER;
			
		case 3: // 도서 관리
			return View.MANAGE_BOOK;
			
		case 0: // 로그아웃
			System.out.println("로그아웃 되었습니다.");
			return View.HOME;
			
		default:
			System.out.println("잚못 입력하였습니다.");
		}		
		return View.MANAGER_HOME;
	}

	// 기본 홈 화면
	// 리턴 : 다음으로 이동할 화면
	private int home() {
		System.out.println("1.회원가입  2.로그인  3.게시판  0.종료");
		int input = ScanUtil.nextInt();
		
		switch(input){
		case 1: // 회원가입
			return View.JOIN; // int 타입으로 리턴만 한다.
			
		case 2: // 로그인
			return View.LOGIN;
			
		case 3: // 게시판
			return View.BOARD_LIST;
			
		case 0: // 종료
			System.out.println("프로그램을 종료합니다.");
			System.exit(0);
			
		default:
			System.out.println("잘못 입력하였습니다.");
		}
		return View.HOME; // 잘못 입력했을 경우 첫 화면으로 돌아감
	}

}
