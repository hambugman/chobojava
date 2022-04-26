package util;

public interface View {
	int HOME = 0; // 홈 화면
	int JOIN = 1; // 회원가입
	int LOGIN = 2; // 로그인
	int MANAGER_HOME = 3; // 관리자 홈 화면
	int USER_HOME = 4; // 회원 홈 화면
	
	int MANAGE_BOARD = 10; // 게시판 관리
	int MANAGE_MEMBER = 11; // 회원 관리
	int MANAGE_BOOK = 12; // 도서 관리
	
	int BOARD_LIST = 20; // 게시판 목록
	int BOARD_NOTICE = 21; // 공지사항 
	int BOARD_FREE = 22; // 자유게시판
	int BOARD_REQUEST = 23; // 희망도서 게시판
	
	int NOTICE_LIST = 30; // 공지 목록
	int NOTICE_READ = 31; // 공지 - 조회
	int NOTICE_INSERT = 32; // 공지 - 작성
	int NOTICE_UPDATE = 33; // 공지 - 수정
	int NOTICE_DELETE = 34; // 공지 - 삭제
	
	int BOARD_INSERT = 4; // 등록
	int BOARD_DETAIL = 5; // 조회
	int BOARD_UPDATE = 6; // 조회 - 수정
	int BOARD_DELETE = 7; // 조회 - 삭제
}
