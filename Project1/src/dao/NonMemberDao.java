package dao;

public class NonMemberDao {

	// 싱글톤 패턴
	private NonMemberDao() {

	}

	private static NonMemberDao instance;

	public static NonMemberDao getInstance() {
		if (instance == null) {
			instance = new NonMemberDao();
		}
		return instance;
	}

}
