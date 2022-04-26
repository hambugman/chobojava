package Mygame2;

import e_oop.ScanUtil;

public class Story2 {

	Story2 (){
		while(true){	
		System.out.println();
		System.out.println("산을 지나가던 도중 동굴에서 작은 소리가 들려온다.");
		System.out.println("'살려주세요....제발 살려주세요...'");
		System.out.println("입구에서 안을 살펴보지만 보이지는 않고 소리만 들려온다");
		System.out.println(" 동굴에 무엇이 있는지 모르지만 들어가야할까?");
		System.out.println();
		System.out.println("1.분명 사람이 있었다. 구하러들어간다.");
		System.out.println();
		System.out.println("2.아니 잘못 들었겠지. 가던길이나 마저 걷자");
		System.out.println();
		System.out.println("3.다른 누군가를 기다려서 같이 들어가자.");
		System.out.println();
		System.out.println();//상태창은 항시 띄울수 있게 해야함
		int input = 0;	
		input = ScanUtil.nextInt();
		switch (input){
		case 1:
			System.out.println("");
			System.out.println("");
			new Story3();
			break;
		case 2:
			System.out.println("");
			new Story3();
			break;
		case 3:
			System.out.println("");
			System.out.println("");
			new Story3();
			break;
		case 4:
					}
		      }//while
		}//Story2
}
