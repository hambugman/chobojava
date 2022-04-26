package d_array;

import java.util.Arrays;

public class ARRAY_HOMEWORK {

	public static void main(String[] args) {
		
		//배열의 모든 인덱스에 1-100사이의 랜덤한 값을 저장하라.
		
		int[]arr = new int[10];
		for(int i=0 ; i<10 ; i++){
			arr[i]=(int)(Math.random()*100)+1; //랜덤값 (int)(math.random()*지정수)
		}
		System.out.println(Arrays.toString(arr));
		
		//합계 평균
		
		int sum = 0 ;
		for(int i=0; i<arr.length; i++){ //arr.length 길이를 가져옴.
			sum += arr[i];
		}
		double avg = (double)sum / arr.length;		// 총합/길이(총길이수)
			System.out.println("합계 "+sum+"/ avg"+avg);
			
			
		//배열에 저장된 값들 중 최소값과 최대값을 구하라
			
		int min = arr[0];
		int max = arr[0];
		
		for(int i=0; i<arr.length; i++){
			if(arr[i]>max){
				max = arr[i];
			}
			if(arr[i]<min){
				min = arr[i];
			}
			System.out.println("최대치"+max);
			System.out.println("최소치"+min);
		}
		
		//배열의 값을 섞어주세요
		int[] shuffle = new int [10];
		for(int i = 0; i<shuffle.length; i++){
			shuffle[i]=i+1;
		}
		System.out.println(Arrays.toString(shuffle));
		
		for(int i =0; i<shuffle.length*10;i++){
			int random = (int)(Math.random()*shuffle.length);
		
			int temp = shuffle[0];
			shuffle[0]=shuffle[random];
			shuffle[random]=temp;
		}
		System.out.println(Arrays.toString(shuffle));
		
		//1-10사이의 랜덤값을 500번 생성하고 각각 생성된 숫자를 기록하라.
		
		
		
		

	}
	

}
