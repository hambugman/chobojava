package k_jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;

import e_oop.ScanUtil;

public class JDBCBoard {

	ArrayList<HashMap<String, Object>> boardTable = new ArrayList<>();
	SimpleDateFormat format = new SimpleDateFormat("yy-MM-dd");
	JDBCUtil j;
	
	String url = "jdbc:oracle:thin:@localhost:1521:xe"; 
	String user = "KYH0418";							
	String password = "java";
	
	Connection con = null;				//연결정보
	PreparedStatement ps= null;			//Statement상속받는 인터페이스 :sql구문 실행역활 스스로 sql이해 못함
	ResultSet rs =null;	
	
	public static void main(String[] args) {
		
		new JDBCBoard().start();
		
	}//main
//---------------------------메 뉴--------------------------------------------------
	private void start() {
		
		
			
		while(true){
			System.out.println("=================================");
			System.out.println("번호\t제목\t작성자\t작성일");
			System.out.println("---------------------------------");
			for(int i = boardTable.size() - 1; i >= 0 ; i--){
				HashMap<String, Object> board = boardTable.get(i);
				System.out.println(board.get("BOARD_NO")
						+ "\t" + board.get("TITLE")
						+ "\t" + board.get("USER_NAME")
						+ "\t" + format.format(board.get("REG_DATE")));
			}
			System.out.println("=================================");
			
			System.out.print("1.조회  2.등록  0.종료>");
			int input = ScanUtil.nextInt();
			
			switch (input) {
			case 1:
				read();
				break;
			case 2:
				insert();
				break;
			case 0:
				System.out.println("프로그램이 종료되었습니다.");
				System.exit(0);
				break;
				}
		 }
	}
//-------------------------조 회 ----------------------------------------------------
	private void read() {
		System.out.print("조회할 게시물 번호>");
		int boardNo = ScanUtil.nextInt();
		
		HashMap<String, Object> board = null;
		for(int i = 0; i < boardTable.size(); i++){
			if(boardNo == (int)boardTable.get(i).get("BOARD_NO")){
				board = boardTable.get(i);
			}
		}
		
		System.out.println("=======================");
		System.out.println("번호\t: " + board.get("BOARD_NO"));
		System.out.println("-----------------------");
		System.out.println("작성자\t: " + board.get("USER_NAME"));
		System.out.println("-----------------------");
		System.out.println("작성일\t: " + format.format(board.get("REG_DATE")));
		System.out.println("-----------------------");
		System.out.println("제목\t: " + board.get("TITLE"));
		System.out.println("-----------------------");
		System.out.println("내용\t: " + board.get("CONTENT"));
		System.out.println("=======================");
		
		System.out.print("1.수정  2.삭제  0.목록>");
		int input = ScanUtil.nextInt();
		
		switch (input) {
		case 1:
			update(board);
			break;
		case 2:
			delete(board);
			break;
		case 0:
			
			break;
		}
	}
//------------------------삭 제 ------------------------------------------------------
	private void delete(HashMap<String, Object> board) {
		
		try {
			String sql = "delete from JDBCBoard";			// 삭제sql
			con = DriverManager.getConnection(url, user, password);
			
			ArrayList<Object>param2=new ArrayList<>();		//param2 삭제배열
			
		}catch (SQLException e) {
			e.printStackTrace();
		}finally {
			if(rs != null) try { rs.close(); } catch(Exception e) {}
			if(ps != null) try { ps.close(); } catch(Exception e) {}
			if(con != null) try { con.close(); } catch(Exception e) {}
			}
		
		
	}
//-----------------------수 정 ---------------------------------------
	private void update(HashMap<String, Object> board) {
		try {
			//수정 sql 필요
			String sql = "Update JDBCBoard set (1,?,?,?,sysdate) where  ";//where절에 수정할 번호에 대한 절 ?
			con = DriverManager.getConnection(url, user, password);
			
			ps = con.prepareStatement(sql);
			
			rs = ps.executeQuery();
					
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			if(rs != null) try { rs.close(); } catch(Exception e) {}
			if(ps != null) try { ps.close(); } catch(Exception e) {}
			if(con != null) try { con.close(); } catch(Exception e) {}
			}
	}
//----------------------입 력 ----------------------------------------
	private void insert() {
		
		try {
			String sql = "insert into JDBCBoard values (max+1,?,?,?,sysdate)";	//sql 입력구문
			con = DriverManager.getConnection(url, user, password);
			
			ps = con.prepareStatement(sql);
			
			rs = ps.executeQuery();
			
			ArrayList<Object>param =new ArrayList<>();					//param 입력에 대한 배
			System.out.println("제목>");			
			param.add(ScanUtil.nextLine());		// void add(int index, Object obj) 배열에 객체저장
			System.out.println("내용>");
			param.add(ScanUtil.nextLine());
			System.out.println("작성자>");
			param.add(ScanUtil.nextLine());
			
			int result = j.update(sql, param);				//param 입력배열
		
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			if(rs != null) try { rs.close(); } catch(Exception e) {}
			if(ps != null) try { ps.close(); } catch(Exception e) {}
			if(con != null) try { con.close(); } catch(Exception e) {}
			}
			
		}
	

}





