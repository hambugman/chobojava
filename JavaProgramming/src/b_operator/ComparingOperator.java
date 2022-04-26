package b_operator;

public class ComparingOperator {

	public static void main(String[] args) {
		/*
		 * 비교연산자
		 * - <,>,<=,>=,==,!=
		 * - 문자열 비교: equals()
		 * 	boolean 을 사용한다.  문자열사용시에는 사용안함
		 */
		
		int x = 10;
		int y = 20;
		boolean b = (x < y);
		System.out.println(b);
		
		b=x <= y-15; //비교연산과 산술연산이 같이 있을시 산술연산이 우선시
		System.out.println(b);
		
		String str1 = "abc";//String 참조형타입 : 변수에 담긴 주소만 비교함 소문자와 대문자 주소가 다름
		String str2 = "ABC";
		b = str1 != str2;
		System.out.println(b);
		
		b= !str1.equals(str2); //문자의 내용이 다름 equals는 문자열 비교
		System.out.println(b);
		
		//다음의 문장들을 코드로 작성해주세요.
		//x는 y보다 작거나 같다.
		b = x <=y;
		//x+5와 y는 같다.
		b= x + 5 == y;
		//y는 홀수이다. 나머지가 0이면 짝수 1이면 홀수
		b= y % 2 ==1 ;
		//"기본형"과 "참조형"은 다르다.
		b =! "기본형".equals("참조형");			//기본형이라는 문자열과 참조형이라는 문자열은 다르기에 
		System.out.println(b);
					
	}

}
