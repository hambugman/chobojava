package Workout;

import java.util.Scanner;		

public class Arraylistbaseball {

	public static void main(String[] args) {
		
		
		int r1 = (int)(Math.random() * 9) + 1; 			//랜덤 1,2,3지정
		int r2 = (int)(Math.random() * 9) + 1;
		int r3 = (int)(Math.random() * 9) + 1;
		
		while(r1 == r2){			 		// 중복발생시 다시 랜덤값으로 돌림
				r2 = (int)(Math.random() * 9)+1;
			}
		while(r2 == r3){					
				r3 = (int)(Math.random() * 9)+1;
			}
		while(r3 == r1){
				r1 = (int)(Math.random() *9)+1;
			}
		
		System.out.println("<숫자야구게임>");  //제목 입력칸
		System.out.println();
		
						 
		int out = 0;
		int strike = 0;						////임의의 변수들 strike, ball, out
		int ball = 0;
		
		while(strike != 3){					//스트라이크가 3이 아닐시 계속 입력한다.
			
		Scanner s = new Scanner(System.in);  //스캐너 s 지정
		
		System.out.println("1-9 사이의 첫번째숫자를 입력해주세요>");			//10이상의 숫자를 입력시 다시 입력할때 if를 써야하는데 아직....
			int num1 = Integer.parseInt(s.nextLine());		//이게 입력이 되는가.? 10이상입력시 if(num1>=10){integer.parseInt(s.nextLine());
		System.out.println("첫번째를 제외한 두번째숫자를 입력해주세요>");		//
			int num2 = Integer.parseInt(s.nextLine());
		System.out.println("첫번째,두번째를 제외한 세번째숫자를 입력해주세요>");
			int num3 = Integer.parseInt(s.nextLine()); 		//입력1,2,3 지정
		
			strike = 0;						//초기화를 해야 다시 처음으로 돌아가 0,0값으로 시작함
			ball = 0;						
			
			
		if(num1==r1){     // 입력1=랜덤1 
			strike++;					
			}else if(num1==r2 ||num1==r3){
			ball++;
			}								
		if(num2==r2){ 	 
			strike++;
			}else if(num2==r1 ||num2==r3){
			ball++;
			}								
		if(num3==r3){
			strike++;
			}else if(num3==r1 ||num3==r2){
			ball++;
			}
		if(strike == 0 && ball ==0){
			out += 1; 				//스트값과 볼값이 없으면 아웃 1회 더함
			}
		
			System.out.println();
			System.out.println("랜덤숫자 테스트출력"+r1+" "+r2+" "+r3); //랜덤숫자화면출력
			System.out.println("입력숫자"+num1+" "+num2+" "+num3); //입력숫자화면출력
			System.out.println();
			System.out.println(" strike : "+strike+" "+"\n ball : "+ ball + "\n out : "+ out ); //결과값 출력
			System.out.println();
			}							// 31행의 while(스트값이 3이 아닐시 초기화 걸리는)에 걸린 메소드
		while(strike==3){					//3스트라이크면 break문으로 나감.
			break;
			}																		
			if( strike==3 ){System.out.println("정답입니다!");
			
			}
		}

}
