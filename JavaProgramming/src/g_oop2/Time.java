package g_oop2;

public class Time {
	
	private int hour;
	private int minute;
	private int second;
	
	

	public int getHour() {				//getter 값을 얻음
		return hour;
	}

	public void setHour(int hour) {			//setter 값을 넣음
		if(hour<0){
			this.hour = 0; 
		}else if(23<hour){
//			this.hour = 24;
			this.hour = hour % 24;
		}else{
			this.hour = hour;
		}
		
		
	}


	public int getMinute() {
		return minute;
	}

	public void setMinute(int minute) {
		if(minute<0){
		 this.minute=0;
		}else if(minute>59){
//			this.minute = 59;
			this.minute = minute % 60;
			setHour(this.hour + (minute/60));
	 	}else{
	 		this.minute = minute;
	 	}
	if(minute==60){
		this.minute=0;
		++this.hour;
	}
	}


	public int getSecond() {
		return second;
	}

	public void setSecond(int second) {
	 if(second<0){
		 this.second =0;
	 	}else if(second>59){
//	 		this.second = 59;
	 		this.second = second % 60;
	 		setMinute(this.minute+(second/60));
	 	}else{
	 		this.second =second;
	 	}
	 if(second==60){
		 this.second=0;
		 ++this.minute;
		 
	 }
	 
	 
	 
	}
	
	
	void clock(){
		while(true){
			System.out.println(toString());
			stop();
			setSecond(second+1);
			
			
		}
	}
	
	
	
	private void stop(){
		try {
			Thread.sleep(50);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}			//프로그램을 잠시동안 멈추게 하는 메서드. 1000은 1초간 멈춤
	}
	
	
	
	
	@Override			//상속받은 메소드에 다시 덮어 씌움
	public String toString() {
		return hour + ":" + minute + ":" +second;
	}
	
	
	
	
	
	
	
	
	
}
