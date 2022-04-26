package j_collection;


import java.util.*;

import d_array.Array;

public class Score {

	public static void main(String[] args) {

		/*
		 * 402호 모두의 국어, 영어, 수학, 사회, 과학, 오라클, Java점수룰
		 * 0~100의 랜덤으로 생성해주시고, 아래와 같이 출력해주세요.
		 * 	    	국어		영어		수학		사회		과학 	  Oracle   Java		합계		평균		 석차
		 * 홍길동		90		90		90		90		90		90		90		630		90.00	 1
		 * 홍길동		90		90		90		90		90		90		90		630		90.00	 1	
		 * 홍길동		90		90		90		90		90		90		90		630		90.00	 1
		 * 홍길동		90		90		90		90		90		90		90		630		90.00	 1
		 * 홍길동		90		90		90		90		90		90		90		630		90.00	 1
		 * 과목합계	450		450		450		450		450		450		450
		 * 과목평균	90.00	90.00	90.00	90.00	90.00	90.00	90.00	
		 */
		String[] names = {"강나영","강동환","강태영","곽지훈","김서윤","김영훈","김진석","김충신","박슬기","박지은","박채린","손영태","손영흔","안정연","이선우","이수보","이주홍","이충호","임현정","장유진","정신애","조수경","조하영","조혜민","허민정"};
		String[] subjects = {"국어", "영어", "수학", "사회", "과학", "Oracle", "Java"};
		
		
//		----------------------------------학생/과목 출력----------------------------------
		/*
		ArrayList<String[]>names = new ArrayList<String[]>();
		names.add(new String[]{" ","강나영","강동환","강태영","곽지훈","김서윤","김영훈","김진석","김충신","박슬기","박지은","박채린","손영태","손영흔","안정연","이선우","이수보","이주홍","이충호","임현정","장유진","정신애","조수경","조하영","조혜민","허민정"});
		ArrayList<String[]>subjects = new ArrayList<String[]>();
		subjects.add(new String[]{" ","국어","영어","수학","사회","과학","Oracle","Java"});
		*/
		ArrayList<String> name = new ArrayList<>();		//names라는 Arraylist생성
		for(int i=0; i<names.length; i++){					//nemess라는 문자열배열을 
			name.add(names[i]);							//names.add(namess[i]) names라는 배열에 namess값을 입력
		}
		ArrayList<String> subject = new ArrayList<>();		//subjects 생성
		for(int i=0; i<subjects.length; i++){				//subjectss 문자열 배열에 
			subject.add(subjects[i]);						//subjects.add(subjectss[i]) 위와 마찬가지로 배열에 입력함.
		}
		System.out.println(name);
		System.out.println(subject);
		
		//--------------------------------과목/학생-------------------------------------
		ArrayList<ArrayList<Integer>> scores = new ArrayList<>();	//2차원배열 : 학생25명*과목7개
		for(int i = 0 ; i < 25 ; i++){
			ArrayList<Integer>score=new ArrayList<>();	//1차원 배열: 학생 25명
			for(int j = 0 ; j < 7 ; j++){
				score.add((int)(Math.random()*101));	//성적 랜덤 배열
			}
			scores.add(score);
		}
		System.out.println(scores);
		//-------------------------------개인합계/평균---------------------------------
		ArrayList<Integer> nameSum = new ArrayList<>();
		ArrayList<Double> nameAvg = new ArrayList<>();
		
		for(int i = 0; i<scores.size(); i++){
			ArrayList<Integer> score = scores.get(i);
			int sum = 0;
			for(int j=0 ; j<score.size(); j++){
				sum += score.get(j);
			}
			nameSum.add(sum);
			nameAvg.add((double)sum/scores.size());
		}
		
		
		//-------------------------------과목합계/평균---------------------------------
		ArrayList<Integer> subSum = new ArrayList<>();
		ArrayList<Double> subAvg = new ArrayList<>();
		for(int i=0; i< 7; i++){
			int sum = 0;
			for(int j=0; j< 25; j++){
				sum += scores.get(j).get(i);
			}
			subSum.add(sum);
			subAvg.add(Math.round((double)sum / scores.size() * 100) / 100.0);
		}
		System.out.println(subSum);
		System.out.println(subAvg);
		
		//-------------------------------석	 차---------------------------------------
		
		ArrayList<Integer>rank=new ArrayList<>();
		for(int i = 0; i<scores.size() ;i++){
//			rank.get(i)=1;
//			for(int j=0; j<scores.size();i++){
//				if(namesum)
			}
		}
//		int[] rank = new int[score.length];												
//		for(int i = 0; i < score.length; i++){
//			rank[i] = 1;
//			for(int j = 0; j < score.length; j++){
//				if(nameSum[i] < nameSum[j]){
//					rank[i]++;
		
		
		//----------------------------석차순으로 정렬------------------------------------
		
		
		
		
		
//		for(int i = 0; i < nameSum.length - 1; i++){
//			int min = i;
//			for(int j = i + 1; j < nameSum.length; j++){
//				if(nameSum[j] > nameSum[min]){
//					min = j;
//				}
//			}
//			int[] temp = score[i];
//			score[i] = score[min];
//			score[min] = temp;
//			
//			int temp2 = nameSum[i];
//			nameSum[i] = nameSum[min];
//			nameSum[min] = temp2;
//			
//			double temp3 = nameAvg[i];
//			nameAvg[i] = nameAvg[min];
//			nameAvg[min] = temp3;
//			
//			int temp4 = rank[i];
//			rank[i] = rank[min];
//			rank[min] = temp4;
//			
//			String temp5 = names[i];
//			names[i] = names[min];
//			names[min] = temp5;
		
		//-----------------------------출		력---------------------------------
//		System.out.println("");
//		for(int i = 0; i<scores.size();i++){
//			System.out.println();
//		}
					
					
					
	
		
}



