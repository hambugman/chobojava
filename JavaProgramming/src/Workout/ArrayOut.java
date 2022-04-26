package Workout;

import java.util.*;		//모든 유틸 import

public class ArrayOut {
	public static void main(String[] args) {

		
		ArrayList<Integer[]> list = new ArrayList<Integer[]>();   //Arreylist에 대한 출력 예시
		 
        list.add(new Integer[]{1,2,3});     //행                            
        list.add(new Integer[]{4,5,6});		//열                                      
 
        System.out.println(list.get(0)[2]); // ()과 []에 값을 넣어서 무엇이 출력되는지 확인가능
        
        
        //교과서 564페이지
        
        List<String>list1 = new ArrayList<String>();
        List<String>list2 = new ArrayList<String>();
        
        long startTime;
        long endTime;
        
        startTime = System.nanoTime();	//나노미터로 시간 기록
        for(int i=0 ; i<10000 ; i++){
        	list1.add(0,String.valueOf(i));	//
        }
        
        endTime = System.nanoTime()	;
        System.out.println();
                   
            
            
            
            
            
            
            
            
        
		
		}
	    	
}

