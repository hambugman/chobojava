package util;

public interface View {		//화면을 쉽게 구분하기 위해서 인터페이스 작성
							//모든 설정은 뷰에서 등록
							//진행할수록 Switch Case문은 증가할것
	int HOME = 0;	//홈화면
	int LOGIN = 1;	//로그인
	int JOIN = 2;	//가입
	int BOARD_LIST =3;	//게시판
	int BOARD_INSERT =4;
	int BOARD_DETAIL =5;	//조회
	
	
	int UPDATE =6;	//수정	
	int DELETE =7;	//삭제
	
	
	/*  프로젝트 때 만들 뷰들
	 * 
	 *  
		SERACH		//검색
		BORROW		//대여
		RETURN		//반납
		QUIT 		//탈퇴
		
		
		*/
}
