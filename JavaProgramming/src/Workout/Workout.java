package Workout;

import java.util.Scanner;

import e_oop.ScanUtil;
import e_oop.score2.Score2;


public class Workout {

	public static void main(String[] args) {
	 
// char x ='e';
// char y ='f';
// 
// char res = (char) (x + y) ;
// System.out.println(res);
// 
//// Scanner sc = new Scanner (System.in);
//// System.out.println("문자를 입력하세요>");
//// String str = sc.nextLine() ;
//// System.out.println("숫자를 입력하세요>");
//// Double dou = Double.parseDouble(sc.nextLine());
//// System.out.println(str+dou);
// 
// int result = 10 + 20 + 30 ;
// 	 result += 3 ;
// System.out.println(result);
// 
//Scanner sc = new Scanner(System.in);
//	System.out.println("입력해주세요 문자");
//	String str = sc.next();
//	System.out.println("입력해주세요 정수");
//	int _long = Integer.parseInt(sc.next()); //next와 nextLine의 차이점.줄단위로 입력받음?
//	System.out.println("입력해주세요 실수");
//	Double _double = Double.parseDouble(sc.next());
//	
//	System.out.println(str+ _long+ _double); //출력창에 \t와 \n을 같이 쓰고 싶을땐 어떻게 해야하나
//
//	String str1 = "abc";
//	String str3 = new String ("abc");
//	
//	System.out.println(str1.equals(str3));

//	
//	byte n1 = 1;
//	byte n2 = 1;
//	
////	byte n3 = n1+n2 ; byte는 자동으로 int으로 변환되기에 int로 값을 뽑아야한다.
//	int n3 = n1+n2;
//	System.out.println(n3);
//	
//	int int1 = 10;
//	int int2 = 4;
//	int result2 =int1/int2;				//int는 정수이기때문에 실수값의
//	double result3 = int1/int2;			//

		int[] marks = {90, 25, 67, 45, 80};
		for(int i=0; i<marks.length; i++) {
		    if (marks[i] >= 60) {
		        System.out.println((i+1)+"번 학생은 합격입니다.");
		    }else {
		        System.out.println((i+1)+"번 학생은 불합격입니다.");
		    }
		}
		
		
		int[][]scores = {{95,80,70},{92,96,50}};
		int score = scores[0][2];		// 0번째 행의 2번째 열
		System.out.println(score);
		
		
		int[][]mathscores = new int [2][3];
		for(int i =0 ; i<mathscores.length; i++){
			for(int j=0 ; j<mathscores[i].length; j++){
				System.out.println("mathscores["+i+"]"+j+"]="
						+mathscores[i][j]);
			}
		}
		System.out.println();
		
		int[][]englishscores = new int[2][];
		englishscores[0]=new int[2];
		
		englishscores[1]=new int[3];
		for(int i =0 ; i<englishscores.length;i++){
			for(int j=0; j<englishscores[i].length;j++){
				System.out.println("englishscores["+i+"]["+j+"]="
						+englishscores[i][j]);
			}
		}
		System.out.println();
		
		int[][] javascores = {{95,80},{92,96,80}};
		for(int i = 0; i<javascores.length ; i++){
			for(int j = 0; j<javascores[i].length; j++){		//i가 0일때 j는 1부터 시작함
				System.out.println("javascores["+i+"]["+j+"]="
						+javascores[i][j]);
			}
		}
		int[]nums={95,71,84,93,87};
		int sum =0;
		for(int num:nums){			//nums에 있는 수를 num에 집어넣음 
			sum = sum+num;			//배열끝까지 도달시 멈춤
		}System.out.println(sum);	//nums배열 0-4까지 총합이 나옴
		
		
		
		int[][]arrays={{95,86},{83,92,96},{78,83,93,87,88}};
		int sum1 =0;
		double avg1 = 0.0;
		int count = 0;
		
		for(int i = 0 ; i<arrays.length;i++){
			for(int j =0; j<arrays[i].length; j++){
			sum1 += arrays[i][j];
			}
		}
		avg1=(Math.round(sum1/arrays.length*100)/100.0);
		
		System.out.println("sum: "+sum1+" avg: "+avg1);
		
		
		
		
				
			}
			
			
		}
		
		
		
		
		
		
		
	}

}
