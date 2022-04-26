package e_oop;

public class Aircon2 {

	boolean power;			
	int temperature =24;
	int windPower = 2;
	
	void power(){
//		if(power==true){
//			power = false;
//		}else if(power == false){
//			power = true;
//		}
		power = !power; 	//기본 불린값은 false값으로 지정됨 고로 !power는 true값으로 떨어짐
		System.out.println(power ?"에어컨이 켜졌습니다.": "에어컨이 꺼졌습니다.");
	}
	
	void temperatureUp(){
		if(power){
			if(temperature<30){
				temperature++;
			}
			System.out.println("현재온도는 "+ temperature + " 도 입니다.");
		}
	}
	void temperatureDown(){
		if(power){
			if(temperature>18){
				temperature--;
			}
			System.out.println("현재온도는 "+ temperature + " 도 입니다.");
		}
	}
	void changeWindpower(){
		if(power){
			if(windPower>3){
				windPower = 1;
			}
			System.out.println("현재 바람세기는 "+windPower+"단 입니다.");
		}
	}
	
	
	public static void main(String[] args) {
		Aircon2 ac = new Aircon2();
		
		while(true){
			System.out.println("1.전원\t 2.온도+\t 3.온도-\t 4.바람세기\t 0.종료\t");
			int input = ScanUtil.nextInt();
			switch(input){
			case 1:	ac.power();break;
			case 2: ac.temperatureUp();break;
			case 3: ac.temperatureDown();break;
			case 4: ac.changeWindpower();break;
			case 0: System.out.println("에어컨 전원을 끕니다.");
			 		System.exit(0);
			
			}
		}
	}
}





