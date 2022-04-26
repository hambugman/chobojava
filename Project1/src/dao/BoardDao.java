package dao;

import java.util.List;
import java.util.Map;

import util.JDBCUtil;

public class BoardDao {

	// 싱글톤 패턴
	private BoardDao() {

	}

	private static BoardDao instance;

	public static BoardDao getInstance() {
		if (instance == null) {
			instance = new BoardDao();
		}
		return instance;
	}

	JDBCUtil jdbc = JDBCUtil.getInstance();

	// 첫 화면 - 공지 내림차순으로 정리
	public List<Map<String, Object>> noticeList() {

		// 모든 공지를 내림차순(최신 글이 위로 오게)으로 조회
		String sql = "SELECT *"
				+ "     FROM NOTICE"
				+ "    ORDER BY NOTICE_NO DESC";

		return jdbc.selectList(sql);
	}

}
