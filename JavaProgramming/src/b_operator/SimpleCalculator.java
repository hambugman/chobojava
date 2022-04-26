package b_operator;

import java.util.Scanner;


public class SimpleCalculator {

	public static void main(String[] args) {
		//두개의 숫자와 연산자를 입력받아 연산결과를 알려주는 프로그램을 만들어라.
		Scanner sc = new Scanner(System.in);
		
		System.out.println("숫자입력: ");
		Double x = Double.parseDouble(sc.nextLine());
		System.out.println("연산자입력: ");
		String z = (sc.nextLine());
		System.out.println("숫자입력: ");
		Double y = Double.parseDouble(sc.nextLine());
		
		
		Double a= x + y ;
		Double b= x - y ;
		Double c= x * y ;
		Double d= x / y ;
		Double e= x % y ;
		
		
		Double result = z.equals("+") ? a : z.equals("-") ? b : z.equals("*")
					? c : z.equals("")? d : e ;
		System.out.println("연산결과: "+result);
		
		

	
		
		
		
		
		
		
		
		
		
		
		
		
	
		
	}

}
