package c_statement;

import java.util.Scanner;

public class RepetitiveStatement {

	private static int sum;

	public static void main(String[] args) {
		/*
		 * 반복문
		 * - for문
		 * - while문
		 * - do-white문
		 * 
		 * for문
		 * - for(초기화; 조건식; 증감식){}
		 * - 포함하고 있는 문장들을 정해진 횟수만큼 반복하는 문장
		 */
//		for(int i = 1 ; i<=10; i++){	
//		System.out.println(i + "번째 반복");}
//		//초기화 : 조건식과 증감식에 사용할 변수 초기화
//		//조건식 : 연산결과가 true이면 블럭안의 내용을 수행
//		//증감식 : 변수를 증가/감소시켜 반복문을 제어
//		
//		sum= 0;
//		for(int i = 1; i <= 10; i++){ //i는 1로 시작하여 10까지 1씩 증가하면서 더함
//			sum += i ;
//		}
//		System.out.println(sum); //1부터 10까지 합
//		
//		
//		
//		sum=0;
//		for(int i = 10; i >=1; i--){ //i는 10으로 시작하여 1까지 1씩 적어지면서 더함
//			sum += i ;
//		}
//		System.out.println(sum); 
//		
//		//1부터 100까지 짝수의 합을 출력해주세요
//		sum = 0;
//		for(int i = 2 ; i <= 100; i +=2 ){
//			if(1 % 2 == 0){
//				sum += 1;
//			}
//		
			
//		sum = 0;
//		for(int i=1 ; i<=100 ; i+=2){
//			sum += i;
//		}System.out.println(sum);
//			
//		//구구단 출력 
//		/* 2 * 1 = 2
//		 * 2 * 2 = 4
//		 * 2 * 3 = 6
//		 * 2 * 4 = 8
//		 * ...
//		 */
//		
//		for(int i = 1; i <=9; i++){
//			System.out.println(2 + "*" + i + "=" + i*2);
//		}
//		
//		//구구단 9단을 출력해보세요
//		for(int i = 1; i<=9; i++){
//			System.out.println(9 + "*" + i + "=" + i*9);
//		}
//		
//		
//		//구구단 2단부터 9단까지
//		for(int i = 2; i <= 9; i++){
//			for(int j = 1 ; j <= 9 ; j++){
//				System.out.println(i+ "*" + j + "=" + i*j);
//			}
//			
//			}	
//		//구구단 2단부터 9단까지 가로 출력
//		for(int i = 1; i <= 9; i++){
//			for(int j = 2 ; j <= 9 ; j++){
//				System.out.print(j + " * " + i + " = " + (j * i) + "\t");   // print를 줄바꿈을 하지 않는다.  
//			}System.out.println(); //정수 j와 i는 문자열 \t과는 묶이지 말아야하기에 ""로 구분을 짓는다.
//			}
//	  	
//	/*
//	 * While문 
//	 *  - while(조건식){}
//	 *  - 포함하고 있는 문장들을 조건식이 만족하는 동안 반복하는 문장
//	 *  - 반복횟수가 정확하지 않은 경우에 주로 사용한다.
//	 */
//		int a = 1;
//		//a에 2씩 곱해서 1000이상이 되려면 몇번을 곱해야하는가?
//		int count = 0 ;
//		while(a < 1000){
//			a *= 2 ;
//			count++;
//			System.out.println(count + " " + a);
//		}
//		
	/*
	 * do-while문
	 *  - do{}while(조건식);
	 *  - 최소한 한번의 수행을 보장한다.
	 */
	//숫자맞추기 게임
		int answer = (int)(Math.random() * 100) +1 ;
		int input = 0;
		Scanner s = new Scanner(System.in);
		do{
			System.out.println("1 ~ 100사이의 수를 입력해주세요>");
			input = Integer.parseInt(s.nextLine());
			if( answer < input ){
				System.out.println(input+"보다 작습니다.");
				}else if( answer > input){
					System.out.println(input+"보다 큽니다");
				}else{
						System.out.println("정답입니다!!");
				}	
			}while(input != answer);

		//이름붙은 반복문
//		outer : for(int i = 2 ; i <= 9 ; i++){
//			for(int j = 1; j <=9; j++){
//				if(j==5){
//					break; //가장 가까운 반복문 하나를 빠져나간다.
//					break outer; //outer라는 이름의 반복문을 빠져나간다.
//					continue; //가장 가까운 반복문의 현재 회차를 빠져나간다.
//					continue outer; //outer라는 이름의 현재 반복회차를 빠져나간다.
//				}
//				System.out.println(i +" * "+ j +" = "+ i * j);
//			}
			
//			System.out.println("*****");
//			System.out.println("*****");
//			System.out.println("*****");
//			
//			for(int i = 1; i <= 3; i++){ 				//위의 별 다섯개를 for문으로
//				for(int j = 1; j <= 5; j++){
//				System.out.print("*");
//			}
//			System.out.println();
//			}
//			for(int i = 1; i <=5; i++ ){				// 별을 1부터 다섯개로 정렬
//				for(int j = 1; j <= i ; j++){
//					System.out.print("*");
//			}
//			System.out.println();
//		    }
//			
//			for(int i = 1; i <=5; i++ ){
//				for(int j = 5; j >= i ; j--){
//					System.out.print("*");
//			}
//			System.out.println();
//		    }
	}
}
