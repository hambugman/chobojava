package b_operator;

import java.util.Scanner;

public class Etc {
		
	public static void main(String[] args) {
		
		/*
		 * 비트 연산자
		 * - |,&,^,~,<<,>>
		 * - 비트 단위로 연산한다. 1byte:01010101 총 8비트 
		 *	실제로는 잘 사용하진 않는다.
		 * 
		 * 
		 * 기타 연산자 
		 * - . (참조연산자) : 특정범위내에 속해있는 멤버를 지칭할때 사용한다.
		 * - ?:(삼항연산자) : 조건식 ? 조건식이 참일 경우 수행할 문장 : 조건식이 거짓일 경우 수행할 문장
		 * 
		 */
		System.out.println(10 | 15);
		//10 : 00001010
		//15 : 00001111
		//     00001111
		
		int x = 10 ;
		int y = 20 ;
		int result = x < y ? x : y; //x가 10이기에 더작고  true이기에 앞에 있는 x가 나타남
		System.out.println(result);
		
		//주민등록번호 뒷자리의 첫번째 숫자가 1이면 남자, 2면 여자
		int regNo = 1;
		String gender = regNo == 1 ? "남자" : "여자" ;
		System.out.println("당신의 성별은 "+gender+"입니다.");
		
		gender = regNo == 2 ? "남자" : (regNo == 2 ? "여자" : "확인불가");
		System.out.println("당신의 성별은"+gender+"입니다.");
		
		//2 개의 숫자를 입력하고 둘 중 더 큰 숫자를 출력해주세요.
		
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자입력");
		int num1 = Integer.parseInt(sc.nextLine());
		System.out.println("숫자입력");
		int num2 = Integer.parseInt(sc.nextLine());
		
		System.out.println(num1<num2 ? num2 : num1); //num2가 크다면 num2를 출력,작다면 num1을 출력
		
		//숫자를 입력받고, 그 숫자가 1이나 3이면 남자를 2나 4면 여자를 출력해주세요
		//그외는 입력하면 확인불가를 출력해주세요
		
		System.out.println("숫자 입력>");
		int num = Integer.parseInt(sc.nextLine());
		
		gender = num == 1 || num == 3 ? "남자"
				: num == 2 || num == 4 ? "여자" : "확인불가";
					
		
	}

}
