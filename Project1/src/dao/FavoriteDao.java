package dao;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import util.JDBCUtil;

public class FavoriteDao {

	private FavoriteDao(){};
	private static FavoriteDao instance;
	public static FavoriteDao getInstance(){
		if (instance == null) {
			instance = new FavoriteDao();
		}
		return instance;
	}

	JDBCUtil jdbc = JDBCUtil.getInstance();
	
	// 모든 요청사항 조회
	public List<Map<String, Object>> selectFavorite() {
		String sql = "SELECT NOTICE_NO, NOTICE_TITLE, NOTICE_CONTENT"
				+ " FROM NOTICE"
				+ " WHERE SYSDATE >= NOTICE_LAST_DATE "
				+ " ORDER BY NOTICE_BOARD_NO DESC";
		
		return jdbc.selectList(sql);
	}

	public List<Map<String, Object>> readFavorite(int readNum) {
		String sql = "SELECT *"
				+ " FROM NOTICE "
				+ " WHERE NOTICE_NO = ? ";
		List<Object> param = new ArrayList<>();
		param.add(readNum);
		
		return jdbc.selectList(sql, param);		
	}
	
	// 게시글 등록
	public int insertFavorite(String title, String content) {
		String sql = "INSERT INTO NOTICE "
				+ " VALUES (P1_NOTICE_SEQ.NEXTVAL,?,?,SYSDATE,SYSDATE+?)";
		List<Object> param = new ArrayList<>();
		param.add(title);
		param.add(content);
		int result = jdbc.update(sql, param);
		return result; 
	}
	
	// 공지사항 수정
	public int updateFavorite(String retitle, String recontent, int readNum) {
		String sql = "UPDATE P1_NOTICE "
				+ " SET NOTICE_TITLE = ?, NOTICE_CONTENT = ? "
				+ " WHERE NOTICE_BOARD_NO = ? ";
		List<Object> param = new ArrayList<>();
		param.add(retitle);
		param.add(recontent);
		param.add(readNum);
		
		int result = jdbc.update(sql, param);
		return result; 
	}
	
	// 공지사항 삭제
	public int deleteFavorite(int readNum) {
		String sql = "DELETE P1_NOTICE "
				+ " WHERE NOTICE_BOARD_NO = ? ";
		List<Object> param = new ArrayList<>();
		param.add(readNum);
		
		int result = jdbc.update(sql, param);
		return result;
	}
	
	
}















