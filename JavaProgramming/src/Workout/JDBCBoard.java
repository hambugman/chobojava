package Workout;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import k_jdbc.JDBCUtil;
import e_oop.ScanUtil;


	public class JDBCBoard{
		public static void main(String[] args) {
		
		//--------------------초기화-----------------------------
		JDBCUtil.getInstance();
		String url = "jdbc:oracle:thin:@localhost:1521:xe"; 
		String user = "KYH0418";									
		String password = "java";
		
		Connection con = null;				//db연결
		PreparedStatement ps= null;			//connect를 이용해 sql명령실행
		ResultSet rs =null;					//sql실행후 select결과를 저장하는 객체
		
		
		String Title; 
		String Content;
		String User_id;
		
		//----------------------메뉴 영역--------------------------
		
		try {
			con = DriverManager.getConnection(url,user,password);
			
			String sql = "insert into TB_JDBC_BOARD(Board_no,Title,Content,User_id,Reg_date) values(max-1,?,?,?,sysdate)";
			//스트링안에서는 세미콜론 X
			ps = con.prepareStatement(sql);//sql실행준비 단계 - connection에서 명령을 실행을 해줄 statement
			
			rs = ps.executeUpdate(sql);
			}
		
			
		} catch (SQLException e) {
			e.printStackTrace();
			
			
		}
	}
}
