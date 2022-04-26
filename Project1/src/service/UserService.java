package service;

import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import controller.Controller;
import util.ScanUtil;
import util.View;
import dao.UserDao;

public class UserService {

	// 싱글톤 패턴
	private UserService() {

	}

	private static UserService instance;

	public static UserService getInstance() {
		if (instance == null) {
			instance = new UserService();
		}
		return instance;
	}

	private UserDao userDao = UserDao.getInstance();

	// 회원가입
	public int join() { // int 타입 리턴은 다음 화면을 결정함

		String userId; // 아이디
		String password; // 패스워드
		String userName; // 이름
		String hp; // 연락처

		System.out.println("===== 회원가입 =====");

		// 아이디 유효성 검사
		while (true) {
			while (true) {
				System.out.println("소문자, 숫자, -, _ 포함 3글자 이상 16글자 이하로 입력하세요");
				System.out.print("아이디 > ");
				userId = ScanUtil.nextLine();

				// 아이디 정규표현식 : 소문자, 숫자, _- 포함 3글자 이상 16글자 이하
				String IdRegrex = "^[a-z0-9_-]{3,16}$";

				Matcher m1 = Pattern.compile(IdRegrex).matcher(userId);
				if (m1.matches() == false) {
					System.out.println("아이디 입력 형식이 맞지 않습니다.");
				} else {
					break;
				}
			}

			// 아이디 중복 체크
			Map<String, Object> check = userDao.checkId(userId);
			if (check != null) {
				System.out.println("아이디가 중복되었습니다.");
			} else {
				break;
			}
		}

		while (true) { // 비밀번호 유효성 검사
			System.out.println("소문자, 숫자, -, _ 포함 6글자 이상 18글자 이하로 입력하세요");
			System.out.print("비밀번호 > ");
			password = ScanUtil.nextLine();

			// 비밀번호 정규표현식 : 소문자, 숫자, _- 포함 6글자 이상 18글자 이하
			String passwordRegrex = "^[a-z0-9_-]{6,18}$";
			Matcher m2 = Pattern.compile(passwordRegrex).matcher(password);

			if (m2.matches() == false) {
				System.out.println("비밀번호 입력 형식이 맞지 않습니다.");
			} else {
				break;
			}
		}

		while (true) { // 이름 유효성 검사
			System.out.println("한글만 입력하세요");
			System.out.print("이름 > ");
			userName = ScanUtil.nextLine();

			// 이름 정규표현식 : 한글만
			String nameRegrex = "^[가-힣]*$";
			Matcher m3 = Pattern.compile(nameRegrex).matcher(userName);

			if (m3.matches() == false) {
				System.out.println("이름 입력 형식이 맞지 않습니다.");
			} else {
				break;
			}
		}

		while (true) { // 연락처 유효성 검사
			System.out.println("010-123 or 1234-5678의 형식으로 입력하세요");
			System.out.print("연락처 > ");
			hp = ScanUtil.nextLine();

			// 연락처 정규표현식 : 01로 시작하여 1, 6~9중 하나가 나오고 - 하나에 숫자 3~4개, - 하나에 숫자 4개
			String hpRegrex = "^01([0|1|6|7|8|9])-?([0-9]{3,4})-?([0-9]{4})$";
			Matcher m4 = Pattern.compile(hpRegrex).matcher(hp);

			if (m4.matches() == false) {
				System.out.println("연락처 형식이 맞지 않습니다.");
			} else {
				break;
			}
		}

		Map<String, Object> param = new HashMap<>();
		param.put("MEM_ID", userId);
		param.put("MEM_PASS", password);
		param.put("MEM_NAME", userName);
		param.put("MEM_HP", hp);

		int result = userDao.insertUser(param);

		if (result > 0) {
			System.out.println("===== 회원가입 성공 =====");
		} else {
			System.out.println("===== 회원가입 실패 =====");
		}

		return View.HOME;
	}

	// 로그인
	public int login() {
		System.out.println("===== 로그인 =====");
		System.out.print("아이디 > ");
		String userId = ScanUtil.nextLine();
		System.out.print("비밀번호 > ");
		String password = ScanUtil.nextLine();
		if (userId.equals("admin99")) {
			
			// 관리자 한 명을 해시맵에 저장한다.
			Map<String, Object> manager = userDao.manager();
			System.out.println("관리자 계정으로 로그인 하였습니다.");
			Controller.loginManager = manager;

			return View.MANAGER_HOME;
		} else { // 유저 한 명을 해시맵에 저장한다.
			Map<String, Object> user = userDao.selectUser(userId, password);
			if (user == null) {
				System.out.println("아이디 혹은 비밀번호를 잘못 입력하셨습니다.");
			} else {
				System.out.println("로그인 성공");
				Controller.loginUser = user;
				return View.BOARD_LIST; // 초기 화면으로 돌아감
			}
		}
		return View.LOGIN; // 실패시 다시 로그인
	}
}
