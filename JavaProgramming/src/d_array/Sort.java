package d_array;

import java.util.Arrays;

public class Sort {

	public static void main(String[] args) {
//		/*
//		 * -석차구하기 : 점수를 비교해 작은 정수의 등수를 증가시키는 방식
//		 * -선택정렬 : 가장 작은 숫자를 찾아서 앞으로 보내는 방식
//		 * -버블정렬 : 바로 뒤의 숫자와 비교해서 큰 수를 뒤로 보내는 방식
//		 * -삽입정렬 : 두번째 순서부터 앞의 숫자들과 비교해서 큰수는 뒤로 밀고 중간에 삽입하는 방식
//		 */
//		
//		int[]arr=new int [10];
//		for(int i=0; i<arr.length;i++){
//			arr[i]=(int)(Math.random()*100)+1;
//		} System.out.println(Arrays.toString(arr));			//10개의 랜덤수 뽑기
//		//석차구하기
//		
//		int[]rank=new int[arr.length];		//해당 배열 끝까지 배열잡음
//		for(int i=0; i<arr.length;i++){
//			rank[i]=1;
//		}
//		for(int i=0; i<arr.length; i++){		//i는 처음나가는 배열
//			for(int j=0; j<arr.length; j++){		//i와 j를 비교하여 등수를 바꿈
//				if(arr[i]<arr[j]){
//					rank[i]++;
//				}
//			}
//		}
//		for(int i=0;i<arr.length; i++){
//		System.out.println(arr[i]+" : "+ rank[i]+"등");
//		}
		
		
		//선택정렬	
		/*
		 * i,j
		 * 0,1  0,2  0,3  0.4  0.5  0.6  0.7  0.8  0.9
		 * 1.2  1.3  1.4  1.5  1.6  1.7  1.8  1.9  
		 * 2.3  2.4  2.5  2.6  2.7  2.8  2.9
		 * 3.4  3.5  3.6  3.7  3.8  3.9
		 * 4.5  4.6  4.7  4.8  4.9
		 * 5.6  5.7  5.8  5.9
		 * 6.7  6.8  6.9
		 * 7.8  7.9
		 * 8.9
		 */ //i인덱스는 0부터 j값은 1부터 시작 마지막에는 하나만 남는다.
//		int[]arr=new int [10];
//		for(int i=0; i<arr.length;i++){
//			arr[i]=(int)(Math.random()*100)+1;
//		} System.out.println(Arrays.toString(arr));	
//		
//		
//		for(int i=0; i<arr.length-1; i++){
//			int min = i;				//최소값이 담긴 위치i를 선언.
//			for(int j=i+1; j<arr.length; j++){
//				if(arr[j]<arr[min]){		//j가 arr[min]최소값이 담긴위치보다 작을시
//					min = j;						//j가 최소값이 된다.
//				}
//			}					//for문이 끝나고 나서 작성
//			int temp = arr[i];			//i가 맨앞이기 때문에 최소값과 위치를 바꿈
//			arr[i]=arr[min];
//			arr[min]=temp;
//		}
//		System.out.println(Arrays.toString(arr));
		
		
		//버블정렬	바로 뒤의 수를 비교해서 큰 수를 뒤로 보냄.
		/*
		 * 0,1	1,2	 2,3  3,4  4,5  5,6  6,7  7,8  8,9					
		 * 0,1	1,2	 2,3  3,4  4,5  5,6  6,7  7,8  
		 * 0,1	1,2	 2,3  3,4  4,5  5,6  6,7    
		 * 0,1	1,2	 2,3  3,4  4,5  5,6
		 * 0,1	1,2	 2,3  3,4  4,5 
		 * 0,1	1,2	 2,3  3,4  			// 비교회수가 점차 줄어들고있음.
		 * 0,1	1,2  2,3  
		 * 0,1	1,2  
		 * 0,1	
		 */
		
		int[]arr=new int [10];
		
		
		for(int i=0; i<arr.length;i++){
			arr[i]=(int)(Math.random()*100)+1;
		} System.out.println(Arrays.toString(arr));
		
		
		for(int i=0; i<arr.length-1; i++){
			boolean flag = false;
			for(int j=0; j<(arr.length)-1-i; j++){  //인덱스	아예 시작값이 0이 아니든가.
				if(arr[j]>arr[j+1]){				//
					int temp = arr[j];				//자리바꾸려면 temp를 쓴다.
					arr[j] = arr[j+1];			
					arr[j+1] = temp;
					flag = true;
				}
			}if(!flag){
		 System.out.println(Arrays.toString(arr));
			}
		}
	 }
}




