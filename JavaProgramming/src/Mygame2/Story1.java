package Mygame2;

import e_oop.ScanUtil;

public class Story1 {
	
	Character c ;
	
	
	Story1 (){
		while(true){	
		System.out.println();
		System.out.println("당신은 길을 걸어가던 도중 거지를 만났습니다.");
		System.out.println("'저희 가족들이 굶고 있습니다.모험자님'");
		System.out.println("'적어도 좋으니 한푼만 주신다면 감사합니다'");
		System.out.println(" 돈을 주시겠습니까? ");
		System.out.println();
		System.out.println("1. '이 돈으로 되겠습니까? 더 가져가십시오.'(돈-100)");
		System.out.println("2. '여기 있습니다.' (돈-50)");
		System.out.println("3. '원 시작부터 재수가 없으려니...' 거지에게 침뱉고 간다 .");
		int input = 0;	
		input = ScanUtil.nextInt();
		switch (input){
		case 1:
			System.out.println("이 돈으로 되겠습니까? 더 가져가십시오. (돈-100)");
			System.out.println("'감사합니다. 가진건 없지만 이거라도 받아주십시오.(get 누더기옷)");
			new Story2();
			break;
		case 2:
			System.out.println("'여기있습니다' (돈-50)");
			new Story2();
			break;
		case 3:
			System.out.println("'원 시작부터 재수가 없으려니...'거지에게 침뱉고 간다 .");
			System.out.println("뒤를 보인 순간 거지가 뒷통수를 때리고 도망갔다 (체력 -20)");
			new Story2();
			break;
					}
				}//while
			}//Story1
			
	
	
	
}
