package Workout;

public class practice2 {

	public static void main(String[] args) {
		//자바 배열의 순서바꾸기 
		int [] arr = {55,44,10,5,30,22};
		System.out.println("원데이터 출력");
			for(int i =0 ; i < arr.length; i++){
				System.out.print(" "+arr[i]+" ");
			}
			System.out.println();
			System.out.println("데이터 거꾸로 출력");
			for(int i =0 ; i < arr.length/2; i++){
				int temp = arr[i];
				arr[i]=arr[arr.length-1-i];
				arr[arr.length-1-i]=temp;
			}
			for(int i =0 ; i < arr.length; i++){
				System.out.print(" "+arr[i]+" ");
			}
			System.out.println();
			System.out.println("데이터 오름차순");
			for(int i=0 ; i<arr.length; i++){
				for(int j=0; j<arr.length; j++){
					if(arr[i]>arr[j]){
						int temp = arr[i];
						arr[i]=arr[j];
						arr[j]=temp;
					}
				}
			}
			for(int i=0; i<arr.length; i++){
				System.out.print(" "+arr[i]+" ");
			}
			System.out.println();
			System.out.println("데이터 내림차순");
			for(int i=0 ; i<arr.length; i++){
				for(int j=0 ; j<arr.length; j++){
					if(arr[i]<arr[j]){
						int temp = arr[j];
						arr[j] = arr[i];
						arr[i] = temp;
					}
				}
			}
			for(int i=0; i<arr.length; i++){
				System.out.print(" "+arr[i]+" ");
			}
      }
}
