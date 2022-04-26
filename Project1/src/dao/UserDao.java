package dao;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import util.JDBCUtil;

public class UserDao {
	
	// 싱글톤 패턴
	private UserDao(){
		
	}
	
	private static UserDao instance;
	
	public static UserDao getInstance(){
		if(instance == null){
			instance = new UserDao();
		}
		return instance;
	}
	
	public JDBCUtil jdbc = JDBCUtil.getInstance();
	
	public int insertUser(Map<String, Object> param){
		String sql = "INSERT INTO MEMBER(MEM_CODE, MEM_ID, MEM_PASS, MEM_NAME, MEM_HP)"
				+ "   VALUES ((SELECT NVL(MAX(MEM_CODE), 0) + 1 FROM MEMBER)"
				+ "          , ?, ?, ?, ?)";
		// 회원번호(자동), 아이디, 비밀번호, 이름, 연락처
		
		List<Object> p = new ArrayList<>();
		p.add(param.get("MEM_ID"));
		p.add(param.get("MEM_PASS"));
		p.add(param.get("MEM_NAME"));
		p.add(param.get("MEM_HP"));
		
		return jdbc.update(sql, p); // 몇 개의 행이 영향을 받았는지 리턴
	}
	
	// 로그인
	public Map<String, Object> selectUser(String userId, String password){
		String sql = "SELECT MEM_ID, MEM_PASS, MEM_NAME"
				+ "     FROM MEMBER"
				+ "    WHERE MEM_ID = ?"
				+ "      AND MEM_PASS = ?";
		
		List<Object> param = new ArrayList<>();
		param.add(userId);
		param.add(password);
		
		// sql, List를 받아서 해당하는 Map(유저 1명의 정보)을 돌려준다.
		// sql = 조건 쿼리
		// List = 쿼리의 ?에 들어갈 값을 추가한다.
		return jdbc.selectOne(sql, param);
	}
	
	// 아이디 중복 검사용
	public Map<String, Object> selectUser2(String userId){
		String sql = "SELECT MEM_ID, MEM_PASS, MEM_NAME"
				+ "     FROM MEMBER"
				+ "    WHERE MEM_ID = ?";
		
		List<Object> param = new ArrayList<>();
		param.add(userId);
		
		return jdbc.selectOne(sql, param);
	}
	
	// 아이디 중복 검사용
	public Map<String, Object> checkId(String userId){
		String sql = "SELECT MEM_ID"
				+ "     FROM MEMBER"
				+ "    WHERE MEM_ID = ?";
		
		List<Object> param = new ArrayList<>();
		param.add(userId);
		
		return jdbc.selectOne(sql, param);
	}

	// 관리자 화면
	public Map<String, Object> manager() {
		String sql = "SELECT *"
				+ "     FROM MANAGER";
		
		return jdbc.selectOne(sql);
	}

}
