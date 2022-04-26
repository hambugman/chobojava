package dao;


import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import service.UserService;
import util.JDBCUtil;

public class UserDao {
	//싱글톤패턴
	private UserDao(){}	//private으로 막아서 추가개체생성 가능성 제거
	private static UserDao instance;
	public static UserDao getInstance(){
		if(instance==null){
			instance = new UserDao();
		}
		 return instance;
	}
	
	private JDBCUtil jdbc = JDBCUtil.getInstance();
	
	public int insertUser(Map<String, Object>param){			//param안에 id 암호 이름이 들어있음
		String sql = "INSERT INTO TB_JDBC_USER VALUES(?,?,?)";
		
		List<Object> p = new ArrayList<>();
		p.add(param.get("USER_ID"));
		p.add(param.get("PASSWORD"));
		p.add(param.get("USER_NAME"));
		
		return jdbc.update(sql,p);		//몇개의 행이 영향을 받았는지 리턴함
		
	}
	public Map<String, Object> selectUser(String userId, String password){
		String sql = "SELECT USER_ID, PASSWORD, USER_NAME"
				+ "		FROM TO_JDBC_USER"
				+ "	   WHERE USER_ID = ?"
				+ " 	 AND PASSWORD = ?";
		List<Object>param = new ArrayList<>();
		param.add(userId);	
		param.add(password);
		
		return jdbc.selectOne(sql, param);
	}
	
}
