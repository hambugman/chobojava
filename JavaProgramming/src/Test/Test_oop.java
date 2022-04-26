package Test;

public class Test_oop {

	public static void main(String[] args) {
		/* 
		 * 객체지향 프로그래밍 (Object Orineted Programming)
		 *  - 프로그램을 단순히 코드의 연속으로 보는 것이 아니라 객체간의 상호작용으로 보는것
		 *  - 코드의 재사용성이 높고 유지보수가 용이하다. 모든 코드는 메서드안에서 사용되나 변수는 밖에서도 사용가능 
		 */
		
		SampleClass sc = new SampleClass();				//클래스 변수 선언- 변수 = new 클래스();
		
		System.out.println(sc.field);	
		
		String returnValue = sc.method1(10);		 
		System.out.println(returnValue);
		
		sc.method2();	//추상메소드2에 출력창이 연결됨
		
		
	}
	
	
	
}
