package Workout;

import java.util.ArrayList;
import java.util.List;

public class practice3 {

	public static void main(String[] args) {

		ArrayList<Integer> arrayList = new ArrayList<>();
	
		
		arrayList.add(1);
		arrayList.add(2);
		arrayList.add(3);
		arrayList.add(4);
		arrayList.add(5);
		arrayList.add(6);
		
		System.out.println("변경전: "+arrayList);
		
		arrayList.remove(3);
		
		System.out.println("변경후: "+arrayList);
		
		
		
		
		
	//----------------------Sublist 부분 가져오기-----------------------
		ArrayList<Integer> arrayList2 = new ArrayList<>();
		 
        arrayList2.add(1);
        arrayList2.add(2);
        arrayList2.add(3);
        arrayList2.add(4);
        arrayList2.add(5);
 
        List<Integer> list = arrayList2.subList(1,3);
 
        for(int i : arrayList2)	//arrayList2 배열을 i값에 넣어서 하나씩 뽑음 ->향상된 for문
        {
            System.out.println("arrayList2 : " + i);
 
        }
 
        System.out.println("------------------------");
 
        for(int i : list)	//list배열을 뽑음 
        {
            System.out.println("subList 메소드로 가져온 List : " + i);
        }
		
	}

}
