package dao;

public class ManagerDao {

	// 싱글톤 패턴
	private ManagerDao() {

	}

	private static ManagerDao instance;

	public static ManagerDao getInstance() {
		if (instance == null) {
			instance = new ManagerDao();
		}
		return instance;
	}

}
