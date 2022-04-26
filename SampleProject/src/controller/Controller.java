package controller;

import java.util.Map;

import service.BoardService;
import service.UserService;
import util.ScanUtil;
import util.View;

public class Controller {
	
	public static void main(String[] args) {
		/*
		 * 발표순서 : 조 소개> 주제소개> 주제선정배경> 메뉴구조> 시연> 프로젝트 후기
		 * 발표인원 : 발표인원 1명, ppt및 시연 도우미 1명
		 * 
		 * 27일 오후수업부터 발표시작
		 * 15-20분정도 
		 * 
		 * Controller : 화면 이동(어느화면으로 이동할 것인가에 대한 내용)
		 * 				
		 * Service : 화면기능(화면에서 제공되는 기능:실제내용은 다 이곳에 들어감)
		 * 서비스와 Dao를 나눠서 작성하는 이유 : 서비스에서 전부작성하면 쿼리가 중복될수가 있기때문에
		 * 
		 * Dao(Data access object) : 쿼리 작성 (DB에 직접 접근하지않고 Dao를 거쳐서 데이트베이스를 사용함)
		 * 
		 */
		
		new Controller().start();
	}
	public static Map<String, Object> LoginUser = null;	//로그인유저
	
	private UserService userService = UserService.getInstance();
	private BoardService boardService = BoardService.getInstance();
	
	private void start(){									//화면의 이동에 따른 메서드를 호출.
		int view = View.HOME;								//메서드는 start()에서만 호출한다.
		
		while(true){
			switch(view){				
			case View.HOME:	view = home(); break;	//홈에서 받은 정보를 view에 저장한다.모든리턴타입은 정수값을 지니고 이는 다음 화면을 리턴받아서 뷰에 저장
			case View.LOGIN:view = userService.login(); break;
			case View.JOIN:	view = userService.join(); break;
			case View.BOARD_LIST: view = boardService.boardList(); break;
			case View.BOARD_INSERT: view = boardService.boardInsert(); break;
			case View.BOARD_DETAIL: view = boardService.boardDetail(); break;
			
			
			}
		}
	}
	
	
	
	
	private int home(){							//리턴타입->다음으로 이동할 화면을 리턴. 모든 경우의 수에 리턴이 있어야함
		System.out.println("1.로그인, 2.회원가입, 0.프로그램 종료>");	
		int input=ScanUtil.nextInt();
	
		switch(input){
		case 1:
			return View.LOGIN;			//메서드를 직접 호출하는게 아니라 리턴만 함
		case 2:
			return View.JOIN;			
		case 0:
			System.out.println("프로그램을 종료하겠습니다.");
			System.exit(0);
		}
		return View.HOME;//1,2,0번을 제외한 다른번호를 넣을시 리턴
	}
}
