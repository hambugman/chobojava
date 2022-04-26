package a_variable;

import java.util.Scanner;

public class Join {

	public static void main(String[] args) {
		/*
		 *  다음과 같은 프로그램을 만들어주세요.
		 *  
		 *  ====================회원가입======================
		 *  아이디>admin
		 *  비밀번호(4자리숫자)>1234
		 *  이름>홍길동
		 *  나이>99
		 *  키>185.5cm
		 *  ================================================
		 *  회원가입 완료!!
		 *  =================== 내 정보 =======================
		 *  아이디 : admin
		 *  비밀번호 : 1234
		 *  이름 : 홍길동
		 *  나이 : 99세
		 *  키 : 185.5cm
		 *  ================================================
		 */
		Scanner sc = new Scanner(System.in);
		
		System.out.println("===========회원가입=============");
		System.out.println ("아이디>");
		String Id = sc.nextLine();
		System.out.println ("아이디 : " + Id);
		
		System.out.println ("비밀번호(4자리숫자)>");
		int Pw = Integer.parseInt(sc.nextLine());
		System.out.println ("비밀번호 : " + Pw);
		
		System.out.println ("이름> ");
		String Name = sc.nextLine();
		System.out.println ("이름 : " + Name);
	
		System.out.println ("나이>");
		int Age = Integer.parseInt(sc.nextLine());
		System.out.println ("나이 : " + Age);
		
		System.out.println ("키>");
		Double Tall = Double.parseDouble(sc.nextLine());
		System.out.println ("키 : " + Tall);
	
		System.out	.println("회원가입 완료!!");
		System.out.println("==============내정보==================");
		System.out.println ("아이디 : " + Id + "\n비밀번호 : " + Pw + "\n이름 : " + Name + "\n나이 : " + Age +"세" + "\n키 : " + Tall + "cm" );
		}

}
