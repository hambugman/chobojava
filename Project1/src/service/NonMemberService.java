package service;

public class NonMemberService {
	
	// 싱글톤 패턴
	private NonMemberService(){
		
	}
	
	private static NonMemberService instance;
	
	public static NonMemberService getInstance(){
		if(instance == null){
			instance = new NonMemberService();
		}
		return instance;
	}

}
