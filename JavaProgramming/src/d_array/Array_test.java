package d_array;

import java.util.Arrays;

public class Array_test {

	public static void main(String[] args) {
		//배열의  인덱스[10]에 1-100사이의 랜덤한 값을 저장하라.
		//합계 평균
		//배열에 저장된 값들 중 최소값과 최대값을 구하라
		//배열의 값을 섞어주세요
		
		
		
		
		
		//1-10사이의 랜덤값을 500번 생성하고 각각 생성된 숫자를 기록하라.
		int[] counts = new int[10];
		
		for(int i=0;i<500;i++){
			int random = (int)(Math.random()*10)+1;
			
			//counts{random -1}++;
			if(random==1)counts[0]++;
			else if(random==2)counts[1]++;
			else if(random==3)counts[2]++;
			else if(random==4)counts[3]++;
			else if(random==5)counts[4]++;
			else if(random==6)counts[5]++;
			else if(random==7)counts[6]++;
			else if(random==8)counts[7]++;
			else if(random==9)counts[8]++;
			else if(random==10)counts[9]++;
			}
		 for(int i =0; i<counts.length;i++){
			System.out.println(i+1+"의 발생횟수: "+counts[i]); 
		 }
	}

}
