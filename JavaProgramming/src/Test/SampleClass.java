package Test;

public class SampleClass {
		
	public static void main(String[] args) {
		
		int local = 10;
		//지역변수 : 메서드안에서만 사용하는 변수
	}
	
	int field; //전역변수: 클래스 전체영역에서 사용하는 변수,초기화하지않아도 기본값으로 초기화되어있음.타입선언시 사용
	
	/*
	 * - 메서드 : 변수를 가지고 하는 일 (클래스안에서 동작을 의미하며 필드는 클래스의 성격/속성을 나타낸다)
	 * - 선언 : 타입 메서드명(파라미터){}
	 * - 파라미터 (매개 변수) : 실행에 필요한 정보 
	 * - 리턴타입 (반환타입) : 실행후에는 돌려줘야하는 결과물
	 */
	
	String method1(int parameter){		//타입은 문자열 
		return parameter +"를 받아 명령을 수행하고 결과물을 리턴하는 메서드";
	}
	void method2(){						//추상 메서드 void
		System.out.println("파라미터는 리턴타입도 없는 메서드");
	}
}
