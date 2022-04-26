package k_jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;

public class insert {

	public static void main(String[] args) {
		
		String url = "jdbc:oracle:thin:@localhost:1521:xe"; 
		String user = "KYH0418";									
		String password = "java";
		
		Connection con = null;
		PreparedStatement ps= null;
		ResultSet rs = null;
		
		try {
			con = DriverManager.getConnection(url,user,password);
			
			String sql = "insert into remain(lprod_id,lprod_gu,lprod_gu) values(10,p404,서적)";
			ps = con.prepareStatement(sql);
			
			int result =ps.executeUpdate();
				System.out.print(result);
			}
		
		catch (SQLException e) {
			e.printStackTrace();
		} finally{
			if(rs != null)try{ rs.close();} catch(Exception e){}	//객체가 들어있는 경우만 닫음
			if(ps != null)try{ ps.close();} catch(Exception e){}
			if(con != null)try{ con.close();} catch(Exception e){}
		}
		
		
	}

}
