package j_collection;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListClass {

	public static void main(String[] args) {
		/*
		 * List, Map, Set
		 * 
		 * 
		 * 
		 * boolean add(Object obj) : 마지막 위치에 객체를 추가 후 성공여부를 반환한다.
		 * void add(int index, Object obj) : 지정된 위치에 객체를 추가한다.
		 * Object set(int index, Object obj) : 지정된 위치에 객체를 저장 후 기존 객체를 반환한다.
		 * Object get(int index) : 지정된 위치의 객체를 반환한다.
		 * int size() : 저장된 객체의 수를 반환한다.
		 * Object remove(int index) : 지정된 위치의 객체를 제거한다.
		 */
		
		ArrayList sample = new ArrayList();
		
		sample.add("abc");
		sample.add(100);
		sample.add(new Scanner(System.in));
		
		
		/*
		 * byte : Byte
		 * short : Short
		 * int : Integer
		 * long : Long
		 * float : Float
		 * double : Double
		 * char : Character
		 * boolean : Boolean
		 */
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		list.add(10);		//인덱스0에 10을 삽입함
//		list.add("abc");
		list.add(new Integer(20));	//= list.add(1,20) 인덱스 1의 자리에 20을 삽입
		System.out.println(list.add(30));
		System.out.println(list);
		
		list.add(1, 40);
		System.out.println(list);
		
		Integer before = list.set(2, 50);
		System.out.println(before);
		System.out.println(list);
		
		int get = list.get(2);
		System.out.println(get);
		
		
//		for(int i = 0; i < list.size(); i++){
//			System.out.println(i + " : " + list.get(i));
//			
//			list.remove(i);
//		}
		
		//값을 제거할 때는 뒤에서부터 제거해야 한다.
		for(int i = list.size() - 1; i >= 0; i--){
			System.out.println(i + " : " + list.remove(i));
		}
		System.out.println(list);
		
		
		
		
		//list에 1~100사이의 랜덤값을 10개 저장해주세요.
		for(int i = 0; i < 10; i++){
			list.add((int)(Math.random() * 100) + 1);
		}
		System.out.println(list);
		
		
		//list에 저장된 값의 합계와 평균을 구해주세요.
		int sum = 0;
		double avg = 0;
		
		for(int i = 0; i < list.size(); i++){
			sum += list.get(i);
		}
		avg = (double)sum / list.size();
		System.out.println("sum : " + sum + " / avg : " + avg);
		
		//list에서 최소값과 최대값을 구해주세요.
		int min = list.get(0);
		int max = list.get(0);
		
		for(int i = 0; i < list.size(); i++){
			if(list.get(i) < min){
				min = list.get(i);
			}
			if(max < list.get(i)){
				max = list.get(i);
			}
		}
		System.out.println("min : " + min + " / max : " + max);
		
		
		
		
		//list를 오름차순으로 정렬해주세요.
		for(int i = 0; i < list.size() - 1; i++){
			min = i;
			for(int j = i + 1; j < list.size(); j++){
				if(list.get(j) < list.get(min)){
					min = j;
				}
			}
			int temp = list.get(i);
			list.set(i, list.get(min));
			list.set(min, temp);
		}
		System.out.println(list);
		
		//배열값 섞기
		
		ArrayList<Integer>shuffle = new ArrayList<Integer>();
		for(int i = 0; i <10;i++){
			shuffle.add(i+3);	//1-10까지 숫자를 배열에 넣음
		}
		System.out.println();
		System.out.println("Before: "+shuffle);	//섞기전상태
		
	//----------------------------------------------------------------	
		for(int i=0;i<shuffle.size();i++){
			
			int random =(int)(Math.random()*shuffle.size());//수정필요
			
			//int temp = shuffle.get(0);
			list.set(0,shuffle.get(random));
			//list.set(random,temp);
		}
		System.out.println("After"+list);
		System.out.println();
		
		
		
		
		
		//2차원
		ArrayList<ArrayList<Integer>> list2 = new ArrayList<ArrayList<Integer>>();
		
		list = new ArrayList<Integer>();
		list.add(10);
		list.add(20);
		list.add(30);
		
		list2.add(list);
		System.out.println(list2);
		
		list = new ArrayList<Integer>();
		list.add(40);
		list.add(50);
		
		list2.add(list);
		System.out.println(list2);
		
		list.get(0);
		list2.get(0).get(0); //arr[0][0]
		
		for(int i = 0; i < list2.size(); i++){
			ArrayList<Integer> al = list2.get(i);
			for(int j = 0; j < al.size(); j++){
				System.out.println(al.get(j));
			}
		}
		
		
		//3명 5과목 합계 평균
		//학생 3명의 5과목에 대한 0~100점의 랜덤한 점수를 2차원 ArrayList에 저장해주세요.
		ArrayList<ArrayList<Integer>> scores = new ArrayList<>();		//학생
		for(int i = 0; i < 3; i++){
			ArrayList<Integer> score = new ArrayList<>();		//과목
			for(int j = 0; j < 5; j++){
				score.add((int)(Math.random() * 101));
			}
//			score.add((int)(Math.random() * 101));
//			score.add((int)(Math.random() * 101));
//			score.add((int)(Math.random() * 101));
//			score.add((int)(Math.random() * 101));
			scores.add(score);
		}
		System.out.println(scores);
		
		ArrayList<Integer> sums = new ArrayList<>();
		ArrayList<Double> avgs = new ArrayList<>();
		
		for(int i = 0; i < scores.size(); i++){
			ArrayList<Integer> score = scores.get(i);
			sum = 0;
			for(int j = 0; j < score.size(); j++){
				sum += score.get(i);
			}
			sums.add(sum);
			avgs.add((double)sum / score.size());
		}
		System.out.println(sums);
		System.out.println(avgs);
	}

}









