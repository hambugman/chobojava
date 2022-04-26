package k_jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;

public class select {

	public static void main(String[] args) {
		
		
		String url = "jdbc:oracle:thin:@localhos:1521:xe";
		String user = "KYH0418";
		String password = "java";
		
		Connection con = null;
		PreparedStatement ps = null; //모든 sql구문을 실행, 구문은 이해못하고 전달만 함 		
		ResultSet rs = null;
		//모든 값 초기화
		try {
			con = DriverManager.getConnection(url,user,password); //컴파일 에러 발생시 컨1누르고 try catch
			
			String sql = "select * from lprod where lpro_gu = ?";
			ps = con.prepareStatement(sql);
			ps.setInt(1, 1);
			ps.setString(2, "p101");

			rs=ps.executeQuery();
			
			ResultSetMetaData metaData = rs.getMetaData();
			int count = metaData.getColumnCount();
			
			while(rs.next()){
				for(int i = 1 ; i<=count ; i++){
					Object value = rs.getObject(i);
					System.out.println(value+"\t");
				}
				System.out.println();
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			if(rs != null)try{rs.close();} catch(Exception e){}
			if(ps != null)try{ps.close();} catch(Exception e){}
			if(con != null)try{con.close();} catch(Exception e){}
		}
		
		
	}

}
