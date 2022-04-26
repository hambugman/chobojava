package Test;

public class VariableInit {
	
	//명시적 초기화 (타입 변수 초기화순으로 기술)
		
		int var = 10;
		static int classVar = 20;
		
	//초기화 블럭 (중가로{}를 열고 그 안에서 초기화)
		{
			var = 30;	//인스턴스변수
		}
	
		static{
			classVar = 40; //정적변수
		}
		
		
		/*
		 * 생성자
		 * 
		 * - 클래스와 같은 이름의 메서드0
		 * - 인스턴스 변수를 초기화하기 위해 사용한다.
		 * - 클래스에 생성자는 반드시 하나 이상 존재해야함 
		 * - 직접 선언해주지 않으면 컴파일러가 기본 생성자를 만들어준다.
		 * - 생성자는 리턴타입이 없다
		 */
		VariableInit(){	//--->기본 생성자 (이름이 클래스와 같음)
			var=50;
		}//생성자 사용이유  1. 초기화에 여러줄의 코드가 필요할때
		//			   2. 외부에서 값을 끌어올때 사용. 초기화할때 파라미터가 필요할떄 사용
		
		public static void main(String[] args) {
			lnit i = new lnit();
			i.a = 10;
			i.b = 20;
			i.c = 30;
			
			lnit i2 = new lnit();
			i2.a = 40;
			i2.b = 50;
			i2.c = 60;
			
			lnit i3 =new lnit(70,80,90);
			
			System.out.println("i : "+ i);
			System.out.println("i2 : "+ i2);
			System.out.println("i3 : "+ i3);
			
			}
		}
	
		class lnit{
			int a; //전역(인스턴스)변수
			int b;
			int c;
			
			lnit(int a, int b, int c){//메서드는 이름같을수도 잇고, 무한 생성이 가능. 구분은 파라미터로
				this.a=a;	//지역(인스턴스)변수
				this.b=b;
				this.c=c;
				//this: 인스턴스와 지역의 변수이름이 같으면 둘을 구분하기 위해 사용함
			}
			lnit(){ //오버로딩 : 같은 이름의 메서드를 여러개 정의하는 것. 반드시 파라미터(타입/갯수)가 달라야한다 
				this(10,20,30);
			}
	
}
