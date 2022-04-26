package Workout;

import java.util.Scanner;

import e_oop.ScanUtil;

public class Workout2 {			//혼공자 202페이지 다시 할것 에러 마니 뜸

	public static void main(String[] args) {
		boolean run = true ;
		int studentnum = 0;
		int[]scores2 = null;
		Scanner scanner = new Scanner(System.in);
		
		
		
		while(run){
			System.out.println("-----------------------------------------------------------------");
			System.out.println("1. 학생 | 2. 점수입력 | 3. 점수리스트| 4.분석 | 5.종료");
			System.out.println("------------------------------------------------------------------");
			System.out.println("선택 > ");
			
			int selectNo = Integer.parseInt(scanner.nextLine());
			if(selectNo == 1){ 
				System.out.println("학생수");
				studentnum = ScanUtil.nextInt();
				scores2=new int[studentnum];
			}else if(selectNo==2){
				for(int i = 0 ; i <scores2.length ; i++){
				System.out.print("scores["+i+"]>");	
				scores2[i]=Integer.parseInt(scanner.nextLine());
				}
			}else if(selectNo==3){
				for(int i = 0 ; i<scores2.length; i++){
					System.out.println("scores["+i+"]: "+scores2[i]);
				}
			}else if(selectNo==4){
				int max =0;
				int sum =0;
			double avg = 0;
			for(int i = 0 ; i<scores2.length; i++){
				max = (max<scores2[i])?scores2[i]:max;
				sum += scores2[i];
			}
				avg = (Math.round(sum/studentnum)*100/100.0);
				System.out.println("최고:"+max);
				System.out.println("평균"+avg);
			}else if(selectNo==5){
				run = false;//종료문 true일때 돌고 false일땐 종료됨
			}
		}
		System.out.println("프로그램종료");
	}
}