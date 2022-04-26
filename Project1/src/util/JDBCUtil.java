package util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class JDBCUtil {

	// 싱글톤 패턴 : 인스턴스의 생성을 제한하여 하나의 인스턴스만 사용하는 디자인 패턴

	private JDBCUtil() { // 다른 클래스에서 생성자를 호출하지 못하게 한다.

	}

	private static JDBCUtil instance; // 객체를 보관할 변수

	public static JDBCUtil getInstance() {
		if (instance == null) { // 처음(null)일때만 객체를 생성한다.
			instance = new JDBCUtil();
		}
		return instance;
	}

	// 데이터베이스 접속 정보
	// jdbc:oracle:thin - 오라클에 접속하기 위해 필요한 드라이버
	private String url = "jdbc:oracle:thin:@localhost:1521:xe";
	private String user = "project1";
	private String password = "java";

	private Connection con = null; // 데이터베이스와 연결하는 객체
	private PreparedStatement ps = null; // SQL 구문을 실행시키는 객체
	private ResultSet rs = null; // select의 결과값을 저장하는 객체

	// Map<String, Object> selectOne(String sql) - 조회 결과가 한 줄, ? 없음
	// Map<String, Object> selectOne(String sql, List<Object> param) - 조회 결과가 한 줄, ? 있음
	// List<Map<String, Object>> selectList(String sql) - 조회 결과가 여러 줄, ? 없음
	// List<Map<String, Object>> selectList(String sql, List<Object> param) - 조회 결과가 여러 줄, ? 있음
	// int update(String sql) - 영향을 받은 행 수를 int 타입으로 리턴, ? 없음
	// int update(String sql, List<Object> param - 영향을 받은 행 수를 int 타입으로 리턴, ? 있음
	
	// 조회 결과가 한 줄, ? 없음
	public Map<String, Object> selectOne(String sql) {

		Map<String, Object> map = null;

		try {
			// 입력한 정보로 데이터베이스에 연결
			con = DriverManager.getConnection(url, user, password);

			// 입력 받은 SQL 구문을 실행
			ps = con.prepareStatement(sql);

			// select : ResultSet을 리턴
			rs = ps.executeQuery();

			ResultSetMetaData metaData = rs.getMetaData(); // 메타데이터 : 데이터에 대한 데이터
			int columnCount = metaData.getColumnCount(); // 컬럼 수

			// 모든 데이터를 한 번에 가져올 수 없기 때문에 한 행씩 가져온다.
			// next()가 호출되면 첫 번째 행을 바라보게 되고 값을 추출할 수 있게 된다.
			// next()가 호출될 때마다 다음 행을 바라보게 된다.
			// 다음 행이 있으면 true, 없으면 false를 리턴한다.
			if (rs.next()) {
				map = new HashMap<>();
				for (int i = 1; i <= columnCount; i++) {
					map.put(metaData.getColumnName(i), rs.getObject(i));
					// 키, 값을 맵에 저장(인덱스가 1부터 시작한다.)
				}
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			// ResultSet, Statement, Connection 닫기
			// 반드시 닫아줘야 하므로 finally에서 실행한다.(객체가 없을 때만 닫는다.)
			if (rs != null) try { rs.close(); } catch (Exception e) {}
			if (ps != null) try { ps.close(); } catch (Exception e) {}
			if (con != null) try { con.close(); } catch (Exception e) {}
		}
		return map;
	}

	// 조회 결과가 한 줄, ? 있음
	public Map<String, Object> selectOne(String sql, List<Object> param) {

		Map<String, Object> map = null;

		try {
			// 입력한 정보로 데이터베이스에 연결
			con = DriverManager.getConnection(url, user, password);

			// 입력 받은 SQL 구문을 실행
			ps = con.prepareStatement(sql);
			for (int i = 0; i < param.size(); i++) { // param은 인덱스가 0부터 시작함(ArrayList)
				ps.setObject(i + 1, param.get(i)); // ?는 인덱스가 1부터 시작함
			}

			// select : ResultSet을 리턴
			rs = ps.executeQuery();

			ResultSetMetaData metaData = rs.getMetaData(); // 메타디에터 : 데이터에 대한 데이터
			int columnCount = metaData.getColumnCount(); // 컬럼 수

			// 모든 데이터를 한 번에 가져올 수 없기 때문에 한 행씩 가져온다.
			// next()가 호출되면 첫 번째 행을 바라보게 되고 값을 추출할 수 있게 된다.
			// next()가 호출될 때마다 다음 행을 바라보게 된다.
			// 다음 행이 있으면 true, 없으면 false를 리턴한다.
			if (rs.next()) {
				map = new HashMap<>();
				for (int i = 1; i <= columnCount; i++) {
					map.put(metaData.getColumnName(i), rs.getObject(i));
					// 키, 값을 맵에 저장
				}
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			// ResultSet, Statement, Connection 닫기
			// 반드시 닫아줘야 하므로 finally에서 실행한다.(객체가 없을 때만 닫는다.)
			if (rs != null) try { rs.close(); } catch (Exception e) {}
			if (ps != null) try { ps.close(); } catch (Exception e) {}
			if (con != null) try { con.close(); } catch (Exception e) {}
		}
		return map;
	}

	// 조회 결과 여러 줄, ? 없음
	public List<Map<String, Object>> selectList(String sql) {

		List<Map<String, Object>> list = new ArrayList<>();

		try {
			// 입력한 정보로 데이터베이스 접속
			con = DriverManager.getConnection(url, user, password);

			// 입력 받은 SQL 구문을 실행
			ps = con.prepareStatement(sql);

			// select : ResultSet을 리턴
			rs = ps.executeQuery();

			ResultSetMetaData metaData = rs.getMetaData(); // 메타데이터 : 데이터에 대한 데이터
			int columnCount = metaData.getColumnCount(); // 컬럼 수

			while (rs.next()) {
				HashMap<String, Object> map = new HashMap<>();
				for (int i = 1; i <= columnCount; i++) {
					map.put(metaData.getColumnName(i), rs.getObject(i));
					// 키, 값을 맵에 저장(인덱스가 1부터 시작한다.)
				}
				list.add(map);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally { // 반드시 닫아줘야 하므로 finally에서 실행한다.
			if (rs != null) try { rs.close(); } catch (Exception e) {}
			if (ps != null) try { ps.close(); } catch (Exception e) {}
			if (con != null) try { con.close(); } catch (Exception e) {}
		}
		return list;
	}

	// 조회 결과 여러 줄, ? 있음
	public List<Map<String, Object>> selectList(String sql, List<Object> param) {

		List<Map<String, Object>> list = new ArrayList<>();

		try {
			con = DriverManager.getConnection(url, user, password);

			ps = con.prepareStatement(sql); // 쿼리 만드는 부분
			for (int i = 0; i < param.size(); i++) { // param은 인덱스가 0부터 시작함(ArrayList)
				ps.setObject(i + 1, param.get(i)); // ?는 인덱스가 1부터 시작함
			}

			rs = ps.executeQuery();

			ResultSetMetaData metaData = rs.getMetaData();
			int columnCount = metaData.getColumnCount();

			while (rs.next()) {
				HashMap<String, Object> map = new HashMap<>();
				for (int i = 1; i <= columnCount; i++) {
					map.put(metaData.getColumnName(i), rs.getObject(i));
					// 키, 값을 맵에 저장
				}
				list.add(map); // 한 줄을 ArrayList에 저장
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally { // 반드시 닫아줘야 하므로 finally에서 실행한다.
			if (rs != null) try { rs.close(); } catch (Exception e) {}
			if (ps != null) try { ps.close(); } catch (Exception e) {}
			if (con != null) try { con.close(); } catch (Exception e) {}
		}
		return list; // 모든 데이터가 들어간 ArrayList를 리턴
	}

	// 영향 받은 행 수를 int 타입으로 리턴, ? 없음
	public int update(String sql) {

		int result = 0;

		try {
			con = DriverManager.getConnection(url, user, password);

			ps = con.prepareStatement(sql);

			result = ps.executeUpdate();

		} catch (SQLException e) {
			e.printStackTrace();
		} finally { // 반드시 닫아줘야 하므로 finally에서 실행한다.
			if (rs != null) try { rs.close(); } catch (Exception e) {}
			if (ps != null) try { ps.close(); } catch (Exception e) {}
			if (con != null) try { con.close(); } catch (Exception e) {}
		}
		return result;
	}

	// 영향 받은 행 수를 int 타입으로 리턴, ? 있음
	public int update(String sql, List<Object> param) {

		int result = 0;

		try {
			con = DriverManager.getConnection(url, user, password);

			ps = con.prepareStatement(sql);
			for (int i = 0; i < param.size(); i++) { // param은 인덱스가 0부터 시작함(ArrayList)
				ps.setObject(i + 1, param.get(i)); // ?는 인덱스가 1부터 시작함
			}

			result = ps.executeUpdate();

		} catch (SQLException e) {
			e.printStackTrace();
		} finally { // 반드시 닫아줘야 하므로 finally에서 실행한다.
			if (rs != null) try { rs.close(); } catch (Exception e) {}
			if (ps != null) try { ps.close(); } catch (Exception e) {}
			if (con != null) try { con.close(); } catch (Exception e) {}
		}
		return result;
	}

}
