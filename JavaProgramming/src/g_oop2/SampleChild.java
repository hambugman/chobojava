package g_oop2;

public class SampleChild extends SampleParent{
	
	
	void childMethod(){
		System.out.println(var);		//상속받은 변수
		System.out.println(method(7,13));	//상속받은 메서드
	}
	
	//오버라이딩 상속받은 메서드를 변경하고자 덮어 씌우는것
	//super,super()
	//다형성-객체와 변수의 타입이 서로 다름

	
	//오버라이딩 : 상속받은 메서드의 내용을 재정의 하는것, 
	@Override //어노테이션 : 클래스, 변수, 메서드 등에 표시 해 놓는것
	int method(int x, int y){		//**리턴타입 메서드명 파라미터가 모두 같아야한다.** 
		return x * y;
	}
	
	//super,super()
	int var;			
	void test (double var){
		System.out.println(var);//지역변수
		System.out.println(this.var);	//인스턴스 변수
		System.out.println(super.var); 		//부모클래스의 인스턴스변수
		//super : 부모클래스의 멤버와 자식클래스의 멤버가 이름이 중복될 때 둘을 구분하기 위해 사용한다.
		System.out.println(this.method(10,20));			//this는 현클래스의 값을 적용하므로 곱하기  
		System.out.println(super.method(10,20));		//super는 상속한 클래스의 값을 적용함.
		
	}
	SampleChild(){
		super();	//생성자에서 부모클래스의 생성자 호출할떄 사용한다.
		//super()를 통해 클래스의 생성자를 호출하고 부모클래스의 인스턴스변수도 초기화한다.
		//super()가 없으면 컴파일러가 자동으로 super()를 넣어준다.
	}
	//다형성***-부모 타입 변수로 자식타입의 객체를 저장해서 사용하는것
	public static void main(String[] args) {
		SampleChild sc = new SampleChild();
		SampleParent sp = new SampleChild();		//타입(int=string)이 달라도 가능해짐 부모와 자식의 사이이기에 가능함. 다른 자식도 있다면 가능함.
		//SampleChild2
		//SampleChild3
		
		sc = (SampleChild)sp;	//멤버의 차이로 변환안됨 6개를 써야하는데 2개밖에 못써서 컴파일 에러 뜸 
		sp = sc;				//SampleParent:2개 (변수,메서드) SampleChild:6개
		
	}
	
	
	
	
}
