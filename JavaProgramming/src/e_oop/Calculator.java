package e_oop;

public class Calculator {

		
	//피연산자가 기본적으로 2개이므로 파라미터 2개 결과값은 하나이므로 리턴값은 1개
	//메소드는 5개 값으로 나눈다. 
	
	double plus(double x,double y){		//앞이 double이면 안에 파라미터도 같은걸로
		return x + y;
	}
	double minus(double x,double y){
		return x - y;
	}	
	double times(double x,double y){
		return x * y;
	}	
	double divide(double x,double y){
		return x / y;
	}	
	double percent(double x,double y){
		return x % y;
	}
}
