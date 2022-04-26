package e_oop;

public class button {
	

	//에어컨을 대상으로 클래스로 작성해보기 -->
	//변수:속성 - 온도,바람세기,전원
	//메서드:동작 - 에어컨의 버튼들 온도를 낮게 높게 / 바람세기를 강하게 약하게/ 전원 끄기 켜기 / 버튼하나당 메서드하나
	//유의사항 : 온도와 바람세기는 에어컨이 켜있어야 동작 할수 있다. 온도와 바람세기는 제한을 두어야한다.
	
//	boolean airpower = true ;
	int temper=24;
	int wind=5;
	
	//전원
	void powerON(){									
		System.out.println("에어컨 전원 ON");
	}
	void powerOFF(){									
		System.out.println("에어컨 전원 OFF");
	}	
	
	//온도	(전원이 켜있는동안 작동이 되어야함/max.min제한두어야함)
	void temperUp(){
		 if(18<temper || temper<34){ 
		 ++temper;
		 System.out.println("온도가 올라갑니다"+" "+"현재온도"+temper+"입니다");
		 }
		 else if(temper==34){
			 temper--;
			 System.out.println("더이상은 올라가지 않습니다");
		 }
		}
		
	void temperDown(){
		if(18<temper || temper<34){ 
		--temper;
		System.out.println("온도가 내려갑니다"+" "+"현재온도"+temper+"온도입니다");
		}
		else if(temper==18){
			temper++;
			 System.out.println("더 이상 내려가지 않습니다 현재1단계");
		 }
	    } 
	
	//바람세기 (전원이 켜잇는동안 작동이 되게 해야함/max.min제한두어야함)
	void windUp(){
		if(1<wind || wind<10){
		++wind;
		 System.out.println("바람 1단계올라갑니다"+" "+"현재"+wind+"단계입니다");
		}
		else if(wind==10){
			wind--;
			 System.out.println("더이상은 올라가지 않습니다");
		 }
		}
	void windDown(){
		if(1<wind || wind<10){
		--wind;
		System.out.println("바람 1 단계내려갑니다"+" "+"현재단계"+wind+"단계입니다");
		}else if(wind==1){
			wind++;
			 System.out.println("더 이상 내려가지 않습니다 현재1단계");
		 }
	    } 
		
	
	
	
}
