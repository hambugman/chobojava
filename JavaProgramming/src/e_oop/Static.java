package e_oop;

public class Static {

	/*	Static (정적 멤버)
	 *  - static을 붙이면 프로그램 실행시 메모리에 올라간다
	 *  - 객체생성을 하지 않아도 사용할 수있다.
	 *  - static을 붙인 변수는 객체간에 변수의 값을 공유한다. ex) 점수가 다른 학생들의 반에 static을 붙이면 다 같아진다. 
	 *  - static이 붙은 멤버의 명칭 : 클래스 변수, 클래스 메서드
	 *  - static이 붙지 않은 멤버의 명치 : 인스턴스 변수, 인스턴스 메서드
	 */
	//변수에 static을 붙이는 이유는 값을 공유하기 위해서이다.
	static int var; 
	
	public static void main(String[] args) {
		Saram s1 = new Saram();
		Saram s2 = new Saram();
		
		s1.name = "철수";
		s2.name = "영희";
		s1.savemoney(100000);
		s2.savemoney(200000);
		
		s1.saveDateMoney(300000);
		s2.saveDateMoney(300000);
		
		
		
		
		System.out.println("문자열 엽력>");				//스캐너 대신 사용하기!
		String str = ScanUtil.nextLine();
		System.out.println(str);
		
		System.out.println("정수 입력> ");
		int num = ScanUtil.nextInt();
		System.out.println(num);
		
		System.out.println("실수 입력> ");
		double num1 = ScanUtil.nextDouble();
		System.out.println(num1);
		
	}

}


class Saram{
	String name;
	int account;
	
	void savemoney (int money){
		account += money;
		System.out.println(name+"의 통장잔고: "+account);
	}
	
	static int dateAccount;
	void saveDateMoney(int money){
		dateAccount += money;
		System.out.println(name+"의 데이트 통장 잔고: " + dateAccount);
	}
	
}