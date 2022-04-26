package d_array;

import java.util.Scanner;

public class RandomStudentsme {

	public static void main(String[] args) {
		//402호 전체학생 들중 사용자가 입력한 숫자만큼 랜덤으로 학생을 뽑는 프로그램을 만들어주세요.
		//사용자가 5라고 쓰면 랜덤5명뽑되 중복되면 안된다.
		
	String[] students ={"강나영","강동환","강태영","곽지훈","김서윤",				//학생리스트
			       		"김영훈","김진석","김충신","박슬기","박채린",
			       		"손영태","손영흔","안정연","이선우","이수보",
			       		"이주홍","이충호","임현정","장유진","정신애",
			       		"조수경","조하영","조혜민","허민정","박지은"};				
	
	//25개의 단어를 섞고 5개 뽑기로 해보자
	Scanner s = new Scanner(System.in);
	System.out.println("25까지 원하는 숫자를 적어주세요.:");
	int input = Integer.parseInt(s.nextLine());					//입력값인데 이걸 입력하면 원하는수만큼 띄우기
	
	String[] pick = new String[input];
	int pickcount = 0;
	int random = (int)(Math.random()*students.length);
	 for(int i = 0; i<pick.length;i++){
		 if(students[random]==pick[i]){
			 
		 }
	 }
	
	

	}

}





