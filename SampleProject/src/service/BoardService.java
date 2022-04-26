package service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;




import controller.Controller;
import dao.BoardDao;
import util.JDBCUtil;
import util.ScanUtil;
import util.View;


public class BoardService {
	//싱글톤패턴
	private BoardService(){}	
	private static BoardService instance;
	public static BoardService getInstance(){
		if(instance==null){
			instance = new BoardService();
		}
		 return instance;
	}
	
	private BoardDao boardDao = BoardDao.getInstance();
	private JDBCUtil jdbc = JDBCUtil.getInstance();
	
	
	//게시판목록
	public int boardList(){//dao를 거쳐야함
		List<Map<String, Object>> boardList = boardDao.selectBoardList();
		System.out.println("=============================================");
		System.out.println("번호\t제목\t작성자\t작성일");
		for(Map<String, Object>board :boardList){
			System.out.println("-------------------------------------------");
			System.out.println(board.get("BOARD_NO")
				+"\t"+board.get("TITLE")
				+"\t"+board.get("USER_NAME")
				+"\t"+board.get("REG_DATE"));
		}
	System.out.println("=============================================");	
	
	System.out.println("1.조회 2.등록 0.로그아웃");
	int input = ScanUtil.nextInt();
	
	switch (input){
	case 1://조회
		
		break;
	case 2://등록
		
		break;
	case 0:
		Controller.LoginUser =null;		//로그아웃은 저장했던 정보를 없애는 것이기때문에 null로 띄움
		return View.HOME;
	
		}
	return View.BOARD_LIST;
	}
	
	//------------------------------게시판 조회----------------------------------
	
	public int boardDetail(){
		System.out.println("조회할 게시물 번호> ");
		int boardNo = ScanUtil.nextInt();
		
		String sql = "SELECT A.BOARD_NO"
				+ "			,A.TITLE"
				+ "			,A.CONTENT"
				+ "			,B.MEM_NAME AS USER_NAME"
				+ "			,TO_CHAR(A.REG_DATE, 'MM/DD) AS REG_DATE"
				+ "	   FROM TB_JDBC_BOARD A"
				+ "	   LEFT OUTER JOIN MEMBER B ON A.USER_ID=B.MEM_ID"
				+ "   WHERE A.BOARD_NO=?"; 
		ArrayList<Object> param = new ArrayList<>();
		Map<String, Object>board = jdbc.selectOne(sql,param);
		System.out.println("===============================");
		System.out.println("번호\t: " + board.get("BOARD_NO"));
		System.out.println("-------------------------------");
		System.out.println("작성자\t: " + board.get("USER_NAME"));
		System.out.println("-------------------------------");
		System.out.println("작성일\t: " + board.get("REG_DATE"));
		System.out.println("-------------------------------");
		System.out.println("제목\t: " + board.get("TITLE"));
		System.out.println("-------------------------------");
		System.out.println("내용\t: " + board.get("CONTENT"));
		System.out.println("===============================");
		
		System.out.print("1.수정  2.삭제  0.목록>");
		int input = ScanUtil.nextInt();
		switch (input) {
		case 1:
			update(boardNo);
			break;
		case 2:
			delete(boardNo);
			break;
		case 0:
			return View.BOARD_LIST;
		}
		return input;
	}
	
	//---------------------------수 정------------------------------------
	public int update(int boardNo){
		System.out.println("제목>");
		String title = ScanUtil.nextLine();
		System.out.println("내용>");
		String content = ScanUtil.nextLine();
		String sql = "UPDATE TB_JDBC_BOARD"
				+ "		 SET TITLE = ?"
				+ "		   , CONTENT = ?"
				+ "    WHERE BOARD_NO = ?";
		ArrayList<Object> param =new ArrayList<>();
		param.add(title);
		param.add(content);
		param.add(boardNo);
		
		return View.BOARD_LIST;
	}
	
	//---------------------------삭 제--------------------------------------
	public int delete(int boardNo){
		return View.BOARD_LIST;
	}
	
	
	
	
	
	
	//----------------------------등 록-------------------------------------
	
	public int boardInsert(){
		System.out.println("제목>");			
		String title = ScanUtil.nextLine();
		System.out.println("내용>");
		String content = ScanUtil.nextLine();
		//회원이어야 게시판으로 들어와 글을 작성하기때문에 작성자는 로그인한 아이디로 등록되어야한다.
		//String userId = 로그인한 아이디에 관한 쿼리를 작성해야하는지
		//아니면 그냥 안써도되는지.
		String userId = (String) Controller.LoginUser.get("USER_ID");
		
		int result = boardDao.insertBoard(title, content, userId);
		
		if(0<result){
			System.out.println("게시글이 등록되었습니다.");
		}else{
			System.out.println("게시글 등록에 실패하였습니다.");
		}
		return View.BOARD_LIST;
	}
	
	
	
	
}
