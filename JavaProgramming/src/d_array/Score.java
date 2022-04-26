package d_array;

import java.util.Arrays;

public class Score {

	public static void main(String[] args) {
		/*
		 * 402호 모두의 국어, 영어, 수학, 사회, 과학, 오라클, Java점수룰
		 * 0~100의 랜덤으로 생성해주시고, 아래와 같이 출력해주세요.
	 * 				국어		영어		수학		사회		과학 	  Oracle   Java		합계		평균		 석차
		 * 홍길동		90		90		90		90		90		90		90		630		90.00	 1
		 * 홍길동		90		90		90		90		90		90		90		630		90.00	 1	
		 * 홍길동		90		90		90		90		90		90		90		630		90.00	 1
		 * 홍길동		90		90		90		90		90		90		90		630		90.00	 1
		 * 홍길동		90		90		90		90		90		90		90		630		90.00	 1
		 * 과목합계	450		450		450		450		450		450		450
		 * 과목평균	90.00	90.00	90.00	90.00	90.00	90.00	90.00	
		 */

		
			String[] name = {"홍길동","홍길동","홍길동","홍길동","홍길동","홍길동","홍길동","홍길동","홍길동","홍길동","홍길동","홍길동","홍길동","홍길동","홍길동","홍길동","홍길동","홍길동","홍길동","홍길동","홍길동","홍길동","홍길동","홍길동","홍길동"};	
			int [][] scores = new int [25][7];				//총 학생 25명에 7과목
			int [] sum = new int [scores.length];				//합계
			double[] avg = new double[scores.length];			//평균
			int [] rank = new int [scores.length];				//석차
			double[]subavg= new double[7];			//과목별평균
			int[]subsum= new int [7];				//과목별 합계
			
			
			for(int i=0 ; i<scores.length ; i++){			
				for(int j=0 ; j<scores[i].length;j++){
					scores[i][j] = (int)(Math.random()*101);	//랜덤 점수
					sum[i] += scores[i][j];						//합계
					rank[i] = 1;								//석차 초기화
					subsum[j] += scores[i][j];					//과목별합계
					avg[i] = sum[i]/scores[i].length; 			//평균
					}
				System.out.println("점수 합계: "+sum[i]+"/평균: "+avg[i]);
				}
			for(int i=0 ; i<sum.length ; i++){
				for(int j=0 ; j<sum.length ; j++){	
					if(sum[i]<sum[j]){							 
						rank[i]++;								//석차
						}
					}
				}
			
			for(int i=0 ; i<subavg.length; i++){
					subavg[i]= subsum[i]/(double)scores[i].length;
				}
			System.out.print("국어"+"영어"+"수학"+"사회"+"과학");
			System.out.println(Arrays.toString(sum));
			
				
			
					
			
	}

}
