package dao;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import util.JDBCUtil;

public class NoticeDao {

	// 싱글톤 패턴
	private NoticeDao() {

	}

	private static NoticeDao instance;

	public static NoticeDao getInstance() {
		if (instance == null) {
			instance = new NoticeDao();
		}
		return instance;
	}
	
	JDBCUtil jdbc = JDBCUtil.getInstance();
	
	// 첫 화면 - 공지 내림차순으로 정리
	public List<Map<String, Object>> noticeList(){
		
		// 모든 공지를 내림차순(최신 글이 위로 오게)으로 조회
		String sql = "SELECT *"
				+ "     FROM NOTICE"
				+ "    ORDER BY NOTICE_NO DESC";
		
		return jdbc.selectList(sql);
	}

	// 공지 조회
	public Map<String, Object> selectBoard(int noticeNo) {
		
		// noticeNo와 일치하는 공지만 가져온다.
		String sql = "SELECT *"
				+ "     FROM NOTICE"
				+ "    WHERE NOTICE_NO = ?";
		
		ArrayList<Object> param = new ArrayList<>();
		param.add(noticeNo);
		
		return jdbc.selectOne(sql, param);
	}

	// 공지 등록
	public int insertNotice(String title, String content, String managerId) {
		
		// 공지번호(자동), 제목(?), 내용(?), 작성자(?), 작성날짜(SYSDATE)
		String sql = "INSERT INTO NOTICE"
				+ "   VALUES ("
				+ "    (SELECT NVL(MAX(NOTICE_NO), 0) + 1 FROM NOTICE"
				+ "          , ?, ? ,? , SYSDATE)";
		
		ArrayList<Object> param = new ArrayList<>();
		param.add(title);
		param.add(content);
		param.add(managerId);
				
		return jdbc.update(sql, param);
	}

	// 공지 수정
	public int updateNotice(String title, String content, int noticeNo) {
		
		// 제목, 내용, 공지번호가 일치하는 글을 찾아서 수정
		String sql = "UPDATE NOTICE"
				+ "      SET TITLE = ?"
				+ "        , CONTENT = ?"
				+ "    WHERE NOTICE_NO = ?";
		
		ArrayList<Object> param = new ArrayList<>();
		param.add(title);
		param.add(content);
		param.add(noticeNo);
		
		return jdbc.update(sql, param);
	}

	// 공지 삭제
	public int deleteNotice(int noticeNo) {
		
		// 공지번호가 일치하는 글을 찾아서 삭제
		String sql = "DELETE FROM NOTICE"
				+ "    WHERE NOTICE_NO = ?";
		ArrayList<Object> param = new ArrayList<>();
		param.add(noticeNo);
		
		return jdbc.update(sql, param);
	}

	public List<Map<String, Object>> readNotice(int readNum) {
		String sql = "select from notice "
					+ "where notice_no =?";
		ArrayList<Object> param = new ArrayList<>();
		return jdbc.selectList(sql,param);
	}

}
