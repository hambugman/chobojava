package a_variable;  //클래스의 위치

import java.util.Scanner;
//Ctrl + Shift + O  (스캐너 단축키)

public class Variable { //클래스 : 데이터와 기능

	public static void main(String[] args) { //메서드 : 명령문의 집합
		//main메서드 : 프로그램의 시작과 끝
		//주석 : 프로그램 코드로 인식하지 않는 문장 (주로 코드를 설명하는데 사용)
		
        //한줄 주석 : Ctrl + Shift + c
		
		/*범위 주석 : Ctrl + Shift + /(해제 : \)*/
		
		//프로그래밍 : 컴퓨터에게 일을 시키기 위해 일하는 과정을 만드는 것
		//재료 : 데이터와 조작
		
		/*
		 *  데이터
		 *  	 
		 * 1. 기본형
		 *  -숫자
		 *  -문자
		 *  -논리
		 *  
		 * 2. 참조형 (데이터가 위치한 주소를 저장)
		 *  - 배열(형태가 같은 여러개의 데이터를 묶어서 사용)
		 *  - 클래스(형태가 다른 여러개의 데이터의 기능을 묶어서 사용)
		*/ 
		
		//데이터 타입 + 이름 = 변수
		
		/* 변수의 타입 
		 * 
		 * 기본형 타입 (암기할것)
		 * - 정수 : byte(1), short(2), *int(4/약20억), long(8)
		 * - 실수 : float(4/7자리), *double(8/15자리)
		 * - 문자 : char(2)
		 * - 논리 : boolean(1) - true/false
		 * 
		 * 참조형 타입
		 * - 문자열 : String(4) 
		 * 
		 * 명명규칙
		 * - 영문자 대소문자, 한글, 숫자, 특수문자('_','$')를 사용할 수 있다.
		 * - 숫자로 시작할 수 없다.
		 * - 예약어는 사용할 수 없다. (자바에서 사용되는 굵은색의 언어)
		 * - [낙타식 표기법을 사용한다.(mySampleVariable)] (단어가바뀔때마다 대문자로)
		 * - [클래스명의 첫글자는 대문자로 한다.(MySampleClass)]
		 */
		
		//변수 선언(값을 저장할 공간을 만드는 것)
		int x; //;(세미콜론) : 문장의 마침표
		long y;
		float z;
		char abc;
		boolean boolean$;
		String name123; // 중복되지 않게 이름을 지어준다.
		
		
		//9가지 타입을 모두 사용해 9개의 변수를 선언해주세요.
//		int t;
//		short h;
//		char c;
//		byte a;
//		long x;
//		String KYH;
//		double oh;
//		boolean oh$;
//		float name;
		
		//초기화(변수에 처음으로 값을 저장하는 것)
		//=(대입연산자) : 오른쪽의 값을 왼쪽의 변수에 저장한다.
		//변수를 선언한 이후에는 변수의 이름만 가지고 변수를 사용한다.
		x = 10; //타입에 맞는 값을 저장해야 한다.
		y = 20L; //접미사 L을 붙여야 long타입이 된다. long num1 = 300L ;
		z = 3.14f; //접미사 f를 붙여야 float타입이 된다.
		abc = '가'; //따옴표안에 반드시 한글자를 넣어야 한다.
		boolean$ = true; //true,false 둘 중하나만 넣을수 있다.
		name123 = "가나다라 abcd 1234"; //쌍따옴표안에 문자열을 표현한다.
		//위에서 선안한 9개의 변수들을 초기화 해주세요
//		value = 10;
//		dfs = 20;
//		dfd = '나';
//		ab = 30;
//		xy = 40L;
//		KYH = "zxcv";
//		uh = 50;
//		boolean angel = false;
//		karma = 3.2f;
		
		//일반적으로 선언과 초기화를 한문장으로 한다.
		int t = 10;
		//다른 값 저장 (기존의 10이 날아가고 20으로 초기화됨)
		t = 20;
		
		//형변환(데이터의 타입을 다른 타입으로 변경하는 것)
		int _int = 10;
		long _long = 20L;
		
		_int =(int)_long; //큰타입에서 작은 타입으로의 변환은 가로를 사용한다. byte<short,char<int<long<float<double
		_long=_int; //표현범위가 작은 타입에서 큰 타입으로의 형변환은 생략할 수 있다. 
		//큰타입에서 작은 타입으로 변환시 데이터의 손실을 불러일으키기 때문에
		
		//변수 3개를 선언해 변수의 타입과 다른 타입의 값으로 초기화해주세요.
		
		double _double = 2.5;
		float _float = 15f;
		_double=_float ;
		
		char _char1 = 'm';
		int _int1= 2;
		_int1 = (int)_char1 ;
		
		float _float1 = 1f;
		long _long1= 22L;
		_float1=_long1;
		
		
		
		char ch = 'a';
		short sh = 10;
		ch = (char)sh;
		sh = (short)ch;
		//다른타입끼리 형변환은 안된다. 	
		
		//출력(콘솔)
		System.out.print("출력");
		System.out.println("출력 후 줄바꿈");
		System.out.printf("출력 포맷 지정");
		//실행 단축키 : Ctrl + F11
		
		//탈출 문자(Escape 문자)
		System.out.println();
		System.out.println("탭은\t4칸에 맞춰 띄워줍시다.");//t는 tap
		System.out.println("줄바꿈을 \n해줍니다."); //n은 nextline 
		System.out.println("\"쌍따옴표를 넣어줍니다.\"");
		System.out.println("\\역슬레시를 넣어줍니다");
		
		//입력
		Scanner sc = new Scanner(System.in); //입력받기 위한 클래스
		
//		System.out.println("아무거나 입력해주세요>");
//		String str = sc.nextLine();
//		System.out.println("입력받은 내용 : " + str);
//		
		System.out.println("숫자를 입력해주세요>");
		int num = sc.nextInt();
		System.out.println("입력받은 숫자 : " + num);
		System.out.println("문자열을 입력해주세요>");
		String str = sc.nextLine();
		System.out.println("입력받은 문자열 : " + str);
		System.out.println("입력 끝!!!!");
		System.out.println("숫자를 입력해주세요>");
		int num1 = Integer.parseInt(sc.nextLine()); 
		//Str타입을 Int타입으로 형변
		System.out.println("입력받은 숫자 : " + num1);
		
		//자신의 이름을 저장할 변수를 선언하고 Scanner를 사용해 이름을 저장해주세요.
		System.out.println("이름을 입력해주세요> ");
		String myName = sc.nextLine();
		
	
//		//자신의 나이를 저장할 변수를 선언하고 Scanner를 사용해 나이를 저장해주세요.
		System.out.println("나이를 입력해주세요> ");
		int myAge = Integer.parseInt(sc.nextLine());
//		
		//이름과 나이를 출력해주세요
		System.out.println("이름 : " + myName + " / 나이 : " + myAge);
		}
	
	
}