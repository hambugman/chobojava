package Workout;

public class Aircon {
	

	//에어컨을 대상으로 클래스로 작성해보기 -->
	//변수:속성 - 온도,바람세기,전원
	//메서드:동작 - 에어컨의 버튼들 온도를 낮게 높게 / 바람세기를 강하게 약하게/ 전원 끄기 켜기 / 버튼하나당 메서드하나
	//유의사항 : 온도와 바람세기는 에어컨이 켜있어야 동작 할수 있다. 온도와 바람세기는 제한을 두어야한다.
	
	boolean power;
	int temper=5;
	int wind=5;
	
	//전원
	void power(){									
		this.power = !power;			
		if(power){
			System.out.println("에어컨 전원 ON");
		}else{
			System.out.println("에어컨 전원 OFF");
		}
		return;   //메서드가 리턴을 만나서 바로 종료시키게 만듬.
	}
	
	
	//온도	(전원이 켜있는동안 작동이 되어야함/max.min제한두어야함)
	void temperUp(){
		if(temper<10){
			temper -= 1;
		}else{
			temper += 1;
		}
		}
	void temperDown(){
		if(temper<1){
			temper += 1;
		}else{
			temper -= 1;
		}
		}
	//바람세기 (전원이 켜잇는동안 작동이 되게 해야함/max.min제한두어야함)
	void windUp(){
		if(wind<10){
			wind -= 1;
		}else{
			wind += 1;
		}
		}	
	void windDown(){
		if(wind<1){
			wind += 1;
		}else{
			wind -= 1;
		}
		
	}
	
	
}
