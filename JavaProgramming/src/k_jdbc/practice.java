package k_jdbc;

import java.util.Map;

public class practice {
	
	private practice(){
		
		
	}
	private static practice instance;
	
	public static practice getinstance(){
		if (instance ==null){			//인스턴스값이 널일시
			instance = new practice();		//본클래스가 인스턴스의 값이 됨
		}
		return instance;
	}
	
	private String url = "jdbc:oracle:thin:@localhost:1521:xe";
	private String user = "KYH0418";
	private password  = "java";
	
	public Map<String, Object>selectOne(String sql){
		Map<String, Object> map = null;
		
	}
	
	
	
	
}
