package e_oop;


public class Aircon {

	public static void main(String[] args) {
		
		boolean power = true ;
		button B = new button();	//버튼클래스 가져옴 
		while(power){
		System.out.println("\t\t\t        ㅇㅇ 에어컨 ㅇㅇ");
		System.out.println("---------------------------------------------------------------------");
		System.out.println("1.파워ON | 2.온도UP | 3.온도DOWN | 4.바람세기UP | 5.바람세기DOWN | 6.파워OFF |");
		System.out.println("---------------------------------------------------------------------");				
		System.out.println("메뉴숫자를 선택하세요> ");
		
		
		int num = ScanUtil.nextInt();				//스캔유틸 가져옴
		System.out.println(num);
		
		
		switch(num){
		
		case 1:
			B.powerON();
			break;
		case 2:
			B.temperUp();
			break;
		case 3:
			B.temperDown();
			break;
		case 4:
			B.windUp();
			break;
		case 5:
			B.windDown();
			break;
		case 6:	
			B.powerOFF();
			power = false;					//false값으로 전원 off
			break;
			
			}
		}
		
   }

}
