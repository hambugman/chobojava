package Mygame2;

import e_oop.ScanUtil;

public class Story3 {
	Story3 (){
		while(true){	
		System.out.println();
		System.out.println("");
		System.out.println("");
		System.out.println("");
		System.out.println("");
		System.out.println();
		System.out.println("1.");
		System.out.println();
		System.out.println("2.");
		System.out.println();
		System.out.println("3.");
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
		}//Story3
}
