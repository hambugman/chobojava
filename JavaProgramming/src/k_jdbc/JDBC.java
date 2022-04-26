package k_jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class JDBC {

	public static void main(String[] args) {
		/*
		 * Java Database Connectivity = JDBC
		 * - 자바와 데이터베이스를 연결해주는 라이브러리
		 * - ojdbc : 오라클 JDBC
		 * 
		 * JDBC 작성단계
		 * 1. Connection 생성 (DB연결)
		 * 2. Statement 생성(쿼리 작성)
		 * 3. Query 실행
		 * 4. ResultSet에서 결과 추출 (select인 경우)
		 * 5. ResultSet, Statement, Connection 닫기
		 */
		
		
		//데이터베이스 접속 정보
		String url = "jdbc:oracle:thin:@localhost:1521:xe"; //@앞은 드라이버(상호작용/프로그램의 연결을 도움)의 정보
		String user = "KYH0418";									//@뒤는 접속할 호스트이름.포트.sid
		String password = "java";
		
		Connection con = null;
		PreparedStatement ps= null;
		ResultSet rs =null;
		
		try {			//예외처리
			con = DriverManager.getConnection(url,user,password);
			
			String sql = "select * from member";	//사용할 sql작성
			ps = con.prepareStatement(sql); //sql값을 자바값으로 리턴해줌
			
			//select 사용시	
			rs = ps.executeQuery();	//resultset을 리턴(검색결과값을 표시)
			
			while(rs.next()){	//rs.next 조회된 결과의 다음행이 있는지 한줄한줄 확인하며 바라봄. 
				String memId = rs.getString(1);	//컬럼순서
				String memPass = rs.getString("MEM_PASS");	//컬럼명 : 순서/명 둘중 하나만 넘기면됨
				
				System.out.println("MEM_ID : " + memId + "MEM_PASS : " + memPass);
				
			}
			//insert, update, delete 사용시 
//			int result = ps.executeUpdate();	//int를 리턴(영향받은 행의 갯수를 표시)
		} catch (SQLException e) {
			e.printStackTrace();	//에러메시지의 근원지를 찾아 단계별로 에러 출력
		} finally {
			if(rs != null)try{ rs.close();} catch(Exception e){}	//객체가 들어있는 경우만 닫음
			if(ps != null)try{ ps.close();} catch(Exception e){}
			if(con != null)try{ con.close();} catch(Exception e){}
		}
		
	}

}
