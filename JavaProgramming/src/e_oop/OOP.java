package e_oop;

public class OOP {

	public static void main(String[] args) {
		/*
		 * 객체지향 프로그래밍(Object Oriented Programming)
		 *  - 프로그램을 단순히 코드의 연속으로 보는 것이 아니라 객체간의 상호작용으로 보는것
		 *  - 코드의 재사용성이 높고 유지보수가 용이하다. 모든 코드는 메서드 안에서 변수는 밖에서도 가능
		 */
		
		SampleClass sc = new SampleClass(); //SampleClass의 변수가 sc가 됨
		
		System.out.println(sc.field); 
		
		String returnValue = sc.method1(10);
		System.out.println(returnValue);
		
		sc.method2();
		
//	 다음을 한줄씩 계산해서 최종 결과값을 출력해주세요.
		Calculator c = new Calculator();
//	1. 123456+654321	
		double a = c.plus(123456,654321);
		System.out.println(a);
//	2. 1번의 결과값 * 123456
		 a = c.times(a,123456);
		System.out.println(a);
//	3. 2번의 결과값 / 123456
		 a = c.divide(a,123456);
		System.out.println(a);
//	3. 3번의 결과값 - 123456
		 a = c.minus(a,654321);
		System.out.println(a);
//	3. 4번의 결과값 % 123456
		 a = c.percent(a,123456);
		System.out.println(a);	

	}
	

	
}
