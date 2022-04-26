package e_oop;		//패키지이름

public class SampleClass {			//클래스=변수와 메서드로 구성
	
	public static void main(String[] args){			//
		int local = 10 ; //지역변수 : 매서드 안에서만 사용하는 변수
		
	}

	int field; //전역변수 : 클래스전체영역에서 사용하는 변수,초기화하지않아도 기본값으로 초기화되어있음
	
	/*
	 * - 메서드 : 변수를 가지고 할 일
	 * - 선언방법: 리턴타입 매서드명(파라미터){}
	 * - 파라미터(매개변수): 실행에 필요한 정보
	 * - 리턴타입(반환타입): 실행후 돌려줘야하는 결과물
	 */
	
	String method1(int parameter){
		return parameter + " 를 받아 명령을 수행하고 결과물을 리턴하는 메서드";
	}
	void method2(){		//void : 리턴이 없다는 의미,변수를 넣지 않아 아무값도 받지 못함.
		System.out.println("파라미터도 리턴타입도 없는 메서드");
	}
	
	
}
