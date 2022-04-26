package b_operator;

public class ArithmenticOperator {

	public static void main(String[] args) {
		/*
		 * 산술 연산자
		 * - 사칙연산자 : +.-,*,/,%(나머지) 2항 연산자 연산시 피연산자 2개가 잇어야함
		 * - 복합연산자 : +=,-=,*=,/=,%=
		 * - 증감연산자 : ++,-- 
		 */
		
		int result = 10 + 20 - 30 * 40 / 50 % 60 ;
		System.out.println("산술 연산자의 값: "+result);
		//나머지 연산
		result = 10 / 3 ;
		System.out.println("/의 결과 값: "+result);
		result = 10 % 3 ; 
		// %는 짝수/홀수가릴때 사용될수 있다. 0은 짝수 1은 홀수 ex) y = x % 2 == 0
		System.out.println("%의 결과: "+result);
		
		//5개의 산술연산자를 사용해 5개의 연산을 수행 후 출력해주세요.
		
//		result = 20 + 100 / 5 ;
//		System.out.println(result);
//		
//		result = 300 + 20 * 6 % 30 ;
//		System.out.println(result);
//		
//		result = 30 - 20 % 23 ;
//		System.out.println(result);
//		
//		result = 5 + 5;
//		System.out.println(result);
//		
//		result = 5000 + 3000 / 50;
//		System.out.println(result);
		
		
		//복합대입연산자			변수를 사용하여 연산함 (연산방향은 오른쪽에서 왼쪽)
		result = result + 3;		
		System.out.println("result + 3의값: "+result);   
		
		result += 3;
		System.out.println("result += 3의값: "+result); //둘다 같은 표현 (result에 다시 3을 더함)
		
		result -= 5;
		System.out.println("result -= 5의값: "+result); //result값에 5를 빼고 바로 답을 냄
		
		result *= 2;
		System.out.println("result *= 2의값: "+result); 
		
		//아래의 문장을 복합연산자를 사용한 문장으로 만들어주세요.
		//result = result + 10;
		
		//result = result % 5;
		
		//result = result -2 * 3;
		
		result += 10;
		System.out.println(result);
		result %= 5;
		System.out.println(result);
		result -= 2 * 3;
		System.out.println(result);
		
		
		//증감연산자
		//증강연산자 (++) : 변수의 값을 1 증가 시킨다.
		//감소연산자(--) : 변수의 값을 1 감소 시킨다.
		int i = 0 ;
		
		++i; //전위형 : 변수의 값을 읽어오기 전에 1 증가된다.
		i++; //후위형 : 변수의 값을 읽어온 후에 1 증가된다.
		
		i = 0 ;
		System.out.println("++i ="+ ++i);
		i = 0 ;
		System.out.println("i++ ="+ i++);
		System.out.println(i);
		
		//연산자의 사용시 주의 사항
		//피연산자의 타입이 서로 같아야만 연산이 가능하다.
		int _int = 10;
		double _double = 3.14;
		double result2 = _int + _double; // int는 double보다 작기에 자동으로 형변환을함
		System.out.println(result2);
		
		byte _byte = 5;
		short _short = 10;
		_int = _byte + _short ; //int보다 작은 타입은 int로 형변환된다.
		System.out.println(_int);
		
		char _char = 'a';
		char _char2 = 'b';
		_int = _char + _char2;
		System.out.println(_int); //a나 b는 유니코드로서 숫자로 지정된다.
		
		
		//오버플로우, 언더플로우
		//표현범위를 벗어나는 값을 표현할 때 발생하는 현상
		byte b = 127;
		b++;
		System.out.println(b);
		b--;
		System.out.println(b); //byte는 최대 +-127까지 표현하나 이이상증감이 되면 +-가 바뀜
		
		//다음을 한줄씩 계산해서 최종결과값을 출력해주세요.
		//1. 123456 + 654321
		//2. 1번의 결과값 * 123456
		//3. 2번의 결과값 / 123456
		//4. 3번의 결과값 -654321
		//5. 4번의 결과값 % 123456
		
		long res = 123456 + 654321 ;
		res*=123456;
		res/=123456;
		res-=654321;
		res%=123456;
		System.out.println(res);

		//3개의 int형 변수를 선언 및 초기화후 합계의 평균을 구해주세요.
		
		int var1 = 17;
		int var2 = 35;
		int var3 = 49;
		int sum = var1+var2+var3; //int sum = var1+var2+var3;
		double avg = sum/3.0;
		System.out.println("합계 : "+sum+"/ 평균: "+ avg); //double avg = sum/3.0; 소수점값을 구하기위해서 double을 사용하고 3이 아닌 3.0으로 나눈다.
		
		// 반올림 
		avg = Math.round(avg*10)/10.0; //소수점 첫째자리에서 반올림하려면 둘째자리는 100
		System.out.println(avg);
		
		//랜덤 
		//Math.random() - 0.0 ~0.1 미만의 수(0.9999...)를 랜덤으로 발생시킨다.
		int random = (int)(Math.random() * 100) + 1;
		System.out.println(random);
		
		
		} 
	
}
