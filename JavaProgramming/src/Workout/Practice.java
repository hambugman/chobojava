package Workout;

import java.util.Arrays;
import java.util.Scanner;

public class Practice {

	public static void main(String[] args) {

		boolean run = true ; 
		int studentNum = 0;
		int [ ]scores = null;					//처음 점수의 배열 값 = null; 없음
		Scanner sc = new Scanner(System.in);
		
		while(run){
			System.out.println("1.학생수 :    2.점수입력        3.점수리스트        4.분석        5.초기화  	0.종료");
			System.out.print("선택>");
			
			int key = Integer.parseInt(sc.nextLine());
			switch (key) {
			case 1:
				System.out.println("학생수를 입력하세요");
				studentNum = Integer.parseInt(sc.nextLine());
				System.out.println("학생수: "+studentNum);			
					scores=new int [studentNum];				//학생수  = 점수입력의 갯수
				break;
			case 2:
				System.out.println("점수입력");
				for(int i=0 ; i<scores.length; i++){
					scores[i]=Integer.parseInt(sc.nextLine());
				}
				System.out.println("점수:");
				break;
			case 3:
				System.out.println("점수리스트");
				System.out.println(Arrays.toString(scores));
				break;
			case 4:
				System.out.println("분석완료");
				int max=0;
				int sum=0;
				for(int i=0; i<scores.length; i++){
					max = (max<scores[i])?scores[i]:max;
					sum += scores[i];
				}
				double avg = (Math.round(sum/scores.length)*100)/100.0;
				System.out.println("합계: "+sum+"평균: "+avg);
				break;
			case 5:
				System.out.println("값을 초기화합니다.");
				studentNum = 0;
				scores=null;
				break;
			case 0:
				System.out.println("종료되었습니다.");
				run=false;
				
			}
			
			
		}
		
		
	}

}
