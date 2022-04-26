package Test;

import e_oop.ScanUtil;

public class Static {
	/*
	 * Static(정적멤버)
	 *  - static을 붙이면 프로그램 실행시 메모리에 올ㄹ간다.
	 *  - 객체마다 가지고 있을 필요가 없는 공용데이터면 이를 사용하는게 좋다
	 *  - 객체생성을 안해도 사용가능
	 *  - static이 붙은 멤버의 명칭 : 클래스 변수, 클래스 메서드
	 *  - static이 붙지 않은 멤버의 명칭 : 인스턴스 변수, 인스턴스 메서드
	 *  - 변수에 static을 붙이는건 공유하기 위해서
	 */
	
	static int var; //정적멤버 +전역변수
	
	public static void main(String[] args) {
		saram s1 = new saram();
		saram s2 = new saram();
		
		s1.name = "철수";
		s2.name = "영희";
		s1.savemoney(100000);	// 출력 100000	인스턴스변수라서 초기화됨.
		s2.savemoney(200000);	// 출력 200000
		s1.saveDateMoney(300000);	//출력 300000 
		s2.saveDateMoney(300000);	//출력 600000  정적변수는 30만이기 그대로 초기화되는게 아니라 남아있기에 쌓임
		
		}
	}
	class saram{
		String name;
		int account; 		
		
		void savemoney(int money){
			account += money;
			System.out.println(name+"의 통장잔고 : "+ account);
		}
		
		static int dateAccount;			
		void saveDateMoney (int money){
			dateAccount += money;
			System.out.println(name+"의 데이트 통장 잔고 : "+dateAccount);
		}
		
	

}
