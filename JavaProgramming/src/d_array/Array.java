package d_array;

import java.util.Arrays;

public class Array {

	public static void main(String[] args) {
		/*
		 * 배열
		 * - 여러개의 값을 하나의 변수에 저장해서 사용하는것이다.
		 * - 참조형 타입입니다.
		 * - 인덱스로 값을 구분한다.
		 * - 길이를 변경할 수 없다.
		 */
		
		int []array; //배열의 주소를 저장할 공간이 만들어진다.
		array = new int[5]; //5라는 길이를 가진 배열 생성
		//=int5개를 저장할 공간이 만들어짐.
		//배열 초기화시 기본값이 저장된다.
		/*
		 * array(변수)=100번지(주소)
		 * 
		 * 100번지
		 * {0,0,0,0,0}
		 */
		
		array = new int[]{1,2,3,4,5}; //다른 초기화 하는 방법 내용까지 넣음.
		
//		array = {1,2,3,4,5};
//		선언과 초기화를 동시에 해야한다.
//		int[] array2 = {1,2,3,4,5};
		
		System.out.println(array[0]);		//[]를 index라고 부른다. 배열의 순서를 나타낸다. java에서 첫번재배열은 0번부터
		System.out.println(array[1]);
		System.out.println(array[2]);
		System.out.println(array[3]);
		System.out.println(array[4]);

		//한줄복사 : ctrl alt 방향키(위/아래), sysout치고 컨알치면 출력창 소환
		
		array[0] = 10; //array[0]은 10으로 저장된다. 초기화
		array[1] = 20;
		array[2] = 30;
		array[3] = 40;
		array[4] = 50;
		
		for(int i=0;i<array.length;i++){			//length 는 5로 지정된다.
			System.out.println(array[i]);			//array[0]부터 [5]까지 출력됨.
		}
		
		for(int i=0;i<array.length;i++){
			array[i]=(i+1)*10;
		}
		//10개의 정수를 저장할수있는 배열을 선언 및 초기화 해주세요. 
		
		int[]arr =new int[10];
		
//		for(int p=0;p<10;p++){
//			System.out.println(p);			//증가 연산자
//		}
//		
//		for(double t=0;t>-10;t--){
//			System.out.println(t);			//감소 연산자
//		}
		
		//배열의 모든 인덱스에 1~100사이의 랜덤한 값을 저장해주세요.
		
		arr[0]=(int)(Math.random()*100)+1;
		arr[1]=(int)(Math.random()*100)+1;
		arr[2]=(int)(Math.random()*100)+1;
		arr[3]=(int)(Math.random()*100)+1;
		arr[4]=(int)(Math.random()*100)+1;
		arr[5]=(int)(Math.random()*100)+1;
		arr[6]=(int)(Math.random()*100)+1;
		arr[7]=(int)(Math.random()*100)+1;
		arr[8]=(int)(Math.random()*100)+1;
		arr[9]=(int)(Math.random()*100)+1;
		
		for(int i=0;i<10;i++){
			arr[i]=(int)(Math.random()*100)+1;
		}
		System.out.println(Arrays.toString(arr));			//배열을 문자열로 만든다.둥근가로안에 들어가야하는것은 무조건 배열
		
		
		//배열에 저장된 모든값의 합계와 평균을 출력해주세요.
				
		
		int sum = 0;
		for(int i=0; i<arr.length; i++){			//arr.length는 배열의 길이를 가져옴 1부터 9까지 
			sum += arr[i];
		}
		double avg = (double)sum / arr.length;			//sum은 정수이기에 실수타입인 double으로 형변환
			System.out.println("합계" +sum+" / avg "+avg);
			
			
		//배열에 저장된 값들 중 최소값과 최대값을 출력해주세요.
		
			
		int min = arr[0];						//
		int max = arr[0];
		
		 for(int i=0; i<arr.length; i++){			
			 if(arr[i] > max){						//배열뽑아 전수가 후의 수보다 작으면 후의수가 변수가 된다.
				 max = arr[i];
			 }
			 if(arr[i]<min){						//최소치 전수가 후의수보다 크면 후의수가 변수가 된다.
				 min = arr[i];
			 	}
		 	 }System.out.println("최대치: "+max);
			 System.out.println("최소치: "+min);
		
		 //오름 차순 정렬 
		 for(int i = 0 ; i<arr.length -1; i++){
			 min = i;
			 for(int j= i+1; j<arr.length;j++){
				 if(arr[j]<arr[min]){
					 min = j;
				 }
			 }
			 int temp = arr[i];
			 arr[i]= arr[min];
			 arr[min]= temp;
		 }
		 System.out.println(Arrays.toString(arr));
		 
		 
		 
		//배열의 값을 섞어주세요. 
		 int[] shuffle = new int[10];					//shuffle이라는 이름의 배열 초기화 [10]자리의 인트값으로
		 for(int i = 0; i<shuffle.length; i++){			
			 shuffle[i]=i+1;
		 }
		 System.out.println("Before: "+Arrays.toString(shuffle));
		//---------------------------------------------------------- 
		 for(int i=0 ;i<shuffle.length*10; i++){					//조건값에 곱하기도 가능함.					
		 
		 int random = (int)(Math.random()*shuffle.length);			///랜덤숫자에 랭스를 곱해서 해당길이만큼
		 
		 int temp = shuffle[0];
		 shuffle[0]=shuffle[random];
		 shuffle[random]=temp;
		 }
		 System.out.println("After: "+Arrays.toString(shuffle));
		 
	}
}
