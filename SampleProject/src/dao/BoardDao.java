package dao;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import util.JDBCUtil;

public class BoardDao {				
	//싱글톤패턴
	private BoardDao(){}	
	private static BoardDao instance;
	public static BoardDao getInstance(){
		if(instance==null){
			instance = new BoardDao();
		}
		 return instance;
	}
	
	private JDBCUtil jdbc = JDBCUtil.getInstance();
	
	public List<Map<String, Object>> selectBoardList(){
		String sql = "SELECT A.BOARD_NO,A.TITLE,A.CONTENT,B.USER_NAME,A.REG_DATE"
				+ "		FROM TB_JDBC_BOARD A"
				+ "		LEFT OUTER JOIN TB_JDBC_USER B ON A.USER_ID = B.USER_ID"
				+ "		ORDER BY A.BOARD_NO DESC";
		
		return jdbc.selectList(sql);
	}

	public int insertBoard(String title, String content, Object userId) {
		String sql = "INSERT INTO TB_JDBC_BOARD VALUES ("
				+ "(SELECT NVL(MAX(BOARD_NO),0)+1 FORM TB_JDBC_BOARD)"
				+ ",?"
				+ ",?"
				+ ",?"
				+ ",SYSDATE)";
		ArrayList<Object> param = new ArrayList<>();
		param.add(title);
		param.add(content);
		param.add(userId);
		return jdbc.update(sql,param);
	}
	
	
	public Map<String, Object> selectBoard(int boardNo){
		String sql = "SELECT A.BOARD_NO, A.TITLE, A.CONTENT, A.REG_DATE"
				+ "		FROM TB_JDBC_BOARD A"
				+ "		LEFT OUTER JOINT TB_JDBC_USER B ON A.USER_ID = B.USER_ID"
				+ "	   WHERE A.BOARD_NO =?";
		ArrayList<Object> param = new ArrayList<>();
		param.add(boardNo);
		return jdbc.selectOne(sql,param);
	}
	
}
