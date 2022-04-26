package k_jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;

public class JDBC2 {

	public static void main(String[] args) {
		
		String url = "jdbc:oracle:thin:@localhost:1521:xe"; //@앞은 드라이버(상호작용/프로그램의 연결을 도움)의 정보
		String user = "KYH0418";									//@뒤는 접속할 호스트이름.포트.sid
		String password = "java";
		
		Connection con = null;
		PreparedStatement ps= null;
		ResultSet rs =null;
		
		try {	
			con = DriverManager.getConnection(url,user,password);
			
			String sql = "select * from cart where cart_member = ? and cart_qty > ?";
			ps = con.prepareStatement(sql);
			ps.setString(1, "a001");	//첫번째 ?에 문자열 a001입력 
			ps.setInt(2, 5);			//두번째 ?에 정수 5입력
			// ps.setObject(3, 10); object는 모든 타입을 받기에 헤깔리면 쓰자.
			
			rs=ps.executeQuery();
			
			ResultSetMetaData metaData = rs.getMetaData(); //메타데이터: 데이터에 대한 데이터
			int columnCount = metaData.getColumnCount(); //컬럼수를 알아내는법 : getColumnCount()
			
			while(rs.next()){ //안에 컬럼을 하나씩 넣어야한다. 하지만 for문을 사용하면 한번에 작성가능 컬럼의 개수를 알아야함
				for (int i = 1 ; i<= columnCount; i++){
					Object value = rs.getObject(i);
					System.out.print(value + "\t");
				}
				System.out.println();
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			if(rs != null)try{ rs.close();} catch(Exception e){}	//객체가 들어있는 경우만 닫음
			if(ps != null)try{ ps.close();} catch(Exception e){}
			if(con != null)try{ con.close();} catch(Exception e){}
		}
		
	}

}
