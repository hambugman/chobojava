package service;

public class ManagerService {
	
	// 싱글톤 패턴
	private ManagerService(){
		
	}
	
	private static ManagerService instance;
	
	public static ManagerService getInstance(){
		if(instance == null){
			instance = new ManagerService();
		}
		return instance;
	}

	// 게시판 관리
	public int manageBoard() {
		// TODO Auto-generated method stub
		return 0;
	}

}
