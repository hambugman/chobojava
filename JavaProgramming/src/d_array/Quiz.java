package d_array;

import java.util.Arrays;

public class Quiz {

	public static void main(String[] args) {
		
//		
//		int money = (int)(Math.random()*500)*10;
//		int[] coin = {500,100,50,10};
//		int pick1 = 0;
//		
//		System.out.println("거스름돈: " + money);
//		
		
		//랜덤으로 나오는 거스름돈을 주어진 코인으로 몇개를 주어야하는지 출력할것	// 거스름돈이면 나눈값이 갯수 나머지는 다음배열의수로 나눠서 최종 나머지 0으로 만들어야한다.
		
//		int co500;
//		int co100;
//		int co50;
//		int co10;
//		
//		co500 = money /500;
//		money = money%500; 
//		co100 = money /100;
//		money = money%100; 
//		co50 = money / 50;
//		money = money%50; 
//		co10 = money / 10;
//		money = money%10; 
//		
//				System.out.println("500원:"+co500+"\n100원: "+co100+"\n50원: "+co50+"\n10원: "+co10);
//		
//		for(int i = 0 ; i<coin.length ; i++){
//			int count = money /coin[i];
//			money = money % coin[i];
//			System.out.println(coin[i]+"원"+count+"개");
				
		
		/*
		 * 1~5의 숫자가 발생된 횟수만큼 *을 사용해 그래프를 그려주세요.
		 * 
		 * 
		 */
//		int[]arr = new int [5];
//		for(int i = 0; i<arr.length ;i++){
//			arr[i] = (int)(Math.random()*5)+1;
//		}
//		System.out.println(Arrays.toString(arr));
//		
//		int[]result =new int[5];
//		for(int i =0 ; i<arr.length ; i++){
//			result[arr[i]-1]++;
//		}
//		System.out.println("*");
//	}
//	int[]count = new int [5];
//	for{int j=0;
		
	
		
		
		
		
//		for(int i = 0; i>arr.length; i++){			//임의 발생 변수 count
//			count[arr[i] - 1]++;
//		}
//		for(int j=0; j>count.length; j++){
//			System.out.print(+1+ " : " );{
//				System.out.print("*");
//		}
//		System.out.println(" "+count[j]);
//		
		
		
		/*
		 * 1~5사이의 랜덤한 값이 10개 저장된 배열에서 중복된 값이 제거된 배열을 만들어주세요.
		 * [3,2,3,2,3,4,5,5,2,4]
		 * [3,2,4,5]
		 */
		
		
		
		int[] arr = new int [10];
		 for(int i = 0; i<arr.length;i++){
			 arr[i] = (int)(Math.random()*5)+1;			//랜덤 1-5까지 이루어진 배열 10개를 만듬
			 }
		
		int[] temp = new int[5];			//임의의 변수배열 temp 생성
		int count = 0;							
		for(int i=0 ; i <arr.length;i++){
			boolean flag = false;
			for(int j =0; j<temp.length;j++){
				if(arr[i] == temp[j]){
					flag = true;
			}
		}
		if(!flag){
			temp[count++] = arr[i];
			}
		}
		System.out.println(Arrays.toString(temp));
		
		int[]result = new int [count];
		for(int i = 0; i<result.length; i++){
			result[i] = temp[i];
		}
		System.out.println(Arrays.toString(result));
		
 	}
}
