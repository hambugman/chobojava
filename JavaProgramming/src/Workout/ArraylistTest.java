package Workout;

import java.util.ArrayList;
import java.util.Scanner;

public class ArraylistTest {

	public static void main(String[] args) {
		
		ArrayList<Integer> list = new ArrayList<Integer>();
		//add의 여러방법
		list.add(1);		
		list.add(new Integer(2));
		System.out.println(list.add(3));	//입력시 true가 뜨면서 30이 같이 입력됨
		System.out.println(list);
		
		
		list.add(1,4);	//인덱스 1의 자리로 4가 들어가고 나머지는 밀림
		System.out.println(list);
		int bye = list.set(2,5);//인덱스 2의 자리를 5로 바꿈 전에잇던건 사라짐.
		System.out.println("bye: "+bye);		
		System.out.println("later: " +list);
		
		
		int get = list.get(3);
		System.out.println("get: "+get);
		
		
	//값을 제거할 때는 뒤에서부터 제거해야 한다.
		for(int i = list.size()-1 ; i>=0;i--){
			System.out.println(i+":"+list.remove(i));
		}System.out.println(list);
	
	//list에 1~100사이의 랜덤값을 10개 저장해주세요.
		for(int i = 0 ; i<10; i++){			//10개
			list.add((int)(Math.random()*100)+1);	//list.add(해당값을 추가)
		}System.out.println(list);
	
	//list에 저장된 값의 합계와 평균을 구해주세요.
		int sum = 0;
		double avg = 0.0;
		
		for(int i = 0 ; i<list.size() ; i++){
			 sum += list.get(i);	//list.get(i)해당값을 해당길이만큼 가져옴
		}avg = sum/list.size();
		System.out.println("합계: "+sum+"  평균: "+avg);

		
	//list에서 최소값과 최대값을 구해주세요.
		int max = list.get(0);
		int min = list.get(0);
		
		for(int i=0 ; i<list.size() ; i++){
			if(list.get(i)>max){
				max=list.get(i);
			}
			if(list.get(i)<min){
				min=list.get(i);
			}
		}
		System.out.println("최대값: "+max);
		System.out.println("최소값: "+min);
		
	
	//list를 오름차순으로 정렬해주세요.
		for(int i = 0 ; i<list.size();i++){
			min =1;
			}
		
	
	
	//2차원
	
	
	//3명 5과목 합계 평균
	//학생 3명의 5과목에 대한 0~100점의 랜덤한 점수를 2차원 ArrayList에 저장해주세요.
				
	}

}









