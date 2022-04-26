package e_oop;

public class ClassMaker {

	int land=10; //전역변수 하나를 선언 및 초기화 해주세요. 전역변수는 초기화 기본으로 되어있음
	
	
	void method1(){//리턴타입과 파라미터가 없는 메서드하나를 만들어라
		System.out.println(land);//메서드안에서 전역변수를 출력해라.
		};
	
	int method2(){
		return land;
		}	
		//전역변수와 동일한 타입의 리턴타입이 있고 파라미터는 없는 메서드 하나를 만들어라.
		//메서드안에서 전역변수를 리턴하라.
	
	
	void method3(int land){							// void가 잇으면 리턴이 없다는뜻
		System.out.println(land);
		return;			//여기선 값을 반환하는게 아닌 메소드를 종료시키겠다는 이야기
	}
		//리턴타입은 없고 파라미터가 있는 메서드 하나를 만들어라
		//메서드안에서 파라미터를 출력해라
	
	
	int method4(int x, int y){
		return x*y;						//return이 실행되면 메소드가 끝난다는 이야기
	}
	
		//int타입의 리턴타입과 int타입의 파라미터 2개가 있는 메서드 하나를 만들어주세요.
		//메서드 안에서 두 파라미터를 곱한 결과를 리턴해주세요. 여러개일시 ,로 구분하여 넣는다

	
}
