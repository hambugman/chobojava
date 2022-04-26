package e_oop;

import java.util.Arrays;

public class VariableInit {
	
	//명시적 초기화 (타입 변수 초기화순으로 씀)
	  int var = 10; 
	  static int classVar = 20;
	  
	//초기화 블럭 (블럭{}을 열고 그안에 초기화함)
	  {
		  var = 30;
	  }
	  
	  
	  
	  
	  static {
			classVar = 40;
	  }  
	  
	  
	  /*
	   * 생성자 
	   * - 클래스와 같은 이름의 메서드
	   * - 인스턴스 변수를 초기화하기 위해 사용한다.
	   * - 클래스에 생성자는 반드시 하나 이상 존재해야한다.**
	   * - 직접 선언해주지 않으면 컴파일러가 기본생성자를 만들어준다.
	   * - 생성자는 리턴타입이 없다
	   */
	VariableInit(){				//기본 생성자 (클래스와 같은 이름)
		var = 50;
		//생성자 사용 이유 
		//초기화에 여러줄의 코드가 필요할 때
		//주로 초기화에 파라미터가 필요할 때 사용한다. 외부에서 값을 끌어올때 사용함. 
	}
	  
	  
	  
	public static void main(String[] args){
		Init i = new Init();  //가로가 있으면 무조건 메서드
		i.a = 10;
		i.b = 20;
		i.c = 30;
		
		Init i2 = new Init();
		i2.a = 40;
		i2.b = 50;
		i2.c = 60;
		
		Init i3 = new Init(70,80,90);
		
		System.out.println(i.a+i.b+i.c);
		System.out.println("i2 : "+ i2);
		System.out.println("i3 : "+ i3);
				
		
	  }
	
}


class Init{
	int a;
	int b; 
	int c;
	
	Init(int a, int b, int c){//메서드는 이름이 같을수있고, 무한히 생성가능하다. 구분은 파라미터로 한다.
		this.a = a;
		this.b = b;
		this.c = c;
		//this : 인스턴스 변수와 지역변수의 이름이 같을 때 둘을 구분하기 위해 사용한다.
	}
	//오버로딩: 같은 이름의 메서드를 여러개 정의하는 것. 반드시 파라미터가 달라야한다. 타입이든 개수이든 무엇이든.
	Init(){
		this(10,20,30); // 생성자의 첫줄에서만 사용할 수 있다.
		//this() : 생성자에서 다른 생성자를 호출할 때 사용하는 예약어
	}
	
}


