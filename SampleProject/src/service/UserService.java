package service;

import java.util.HashMap;
import java.util.Map;

import controller.Controller;
import dao.UserDao;
import util.ScanUtil;
import util.View;

public class UserService {
	
	//싱글톤 패턴:개체를 하나만 만들어서 다같이 공유
	private UserService(){}	//private으로 막아서 추가개체생성 가능성 제거
	private static UserService instance;
	public static UserService getInstance(){
		if(instance==null){
			instance = new UserService();
		}
		 return instance;	
	}
	
	private UserDao userDao = UserDao.getInstance();
		
	public int join(){				//int는 다른화면으로 이동하기위해, public은 controller에서 받아오기위해 
		System.out.println("=======================회원 가입====================");		
		System.out.println("아이디>");
		String userId = ScanUtil.nextLine();
		System.out.println("비밀번호>");
		String password = ScanUtil.nextLine();
		System.out.println("이름>");
		String userName = ScanUtil.nextLine();
		//아이디 중복 확인 생략
		//비밀번호 확인 생략
		//유효성 검사(정규표현식)생략
		
		Map<String,Object>param = new HashMap<>();
		param.put("USER_ID", userId);
		param.put("PASSWORD", password);
		param.put("USER_NAME", userName);
		
		
		int result = userDao.insertUser(param);
		
		if(0<result){
			System.out.println("회원 가입에 성공");
		}else{
			System.out.println("회원 가입에 실패");
		}
		return View.HOME;
	}
	
	//-----------------------------------로그인-----------------------------------
	public int login(){					
		System.out.println("=======================로 그 인======================");
		System.out.println("아이디>");
		String userId = ScanUtil.nextLine();
		System.out.println("비밀번호>");
		String password = ScanUtil.nextLine();
		
		Map<String, Object> user = userDao.selectUser(userId,password);
		
		if(user == null){
			System.out.println("아이디 혹은 비밀번호를 잘못 입력하셨습니다.");
		}else{
			System.out.println("로그인 성공");
			Controller.LoginUser = user;
			return View.BOARD_LIST;				//로그인성공시 게시판리스트로 감
		}
		
		return View.LOGIN;
	}
	
	
}
