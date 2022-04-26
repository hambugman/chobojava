package b_operator;

public class LogicalOperator {

	public static void main(String[] args) {
		/* 
		 * 논리 연산자
		 * - &&(AND), ||(OR), ! (NOT)  우선순위는 AND다음에 OR
		 * - 피연산자로 boolean만 허용한다. 
		 */
		
		int x = 10;
		int y = 20;
		boolean b = 0 < x && x < 10 || x < y ;
		
		b = !(x < y) ; //가로안에 !를 안넣으면 x에 !가 붙는다.
		
		//효율적 연산
		b = true && true ; //true
		b = true && false ; //false
		b = false && true ; //false
		b = false && false ; //false
		
		b = true || true ; //true
		b = true || false ; //true
		b = false || true ; //true
		b = false || false ; //false
		//왼쪽의 피연산자에서 결과가 정해지면 오른쪽은 수행하지 않는다.
		 
		
		int a = 10;
		b = a < 5 && 0 < a++ ;
		System.out.println(a);
		
		//다음의 문장들을 코드로 작성해주세요.
		//1. x가 y보다 크고 x가 10보다 작다.
		b = x > y && x < 10 ;
		//2. x가 짝수이고y보다 작거나 같다.
		b = x % 2 == 0 && x <= y ; 
		//3. x가 3의 배수이거나 5의 배수이다. 해당수로 나누면 0이 나오면 배수값을 구할수있다.
		b = x % 3==0 || x % 5  == 0;
	}

}
