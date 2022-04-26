package g_oop2;

public interface SampleInterface {			//인터페이스 - 설계도 /틀만 존재함
											//인터페이스는 상수(=변하지 않는 값)와 추상메서드로만 구성됨
	
	//인터페이스의 모든 멤버변수는 public static final 제어자를 사용해야 한다.
	public static final int NUM1 = 1;		//static 메모리에 먼저올라감
										 	//final이붙으면 상수가 된다 = 값이 안변함 (이름을 대문자로 넣어야함)
	//모든 멤버변수의 제어자가 같기 때문에 생략이 가능하다.
	int NUM2 = 2; //public static final 생략됨
	
	//인터페이스의 모든 메서드는 public abstract 제어자를 사용해야한다.
	public abstract void method1();
	
	//모든 메서드의 제어자가 같기 때문에 생략이 가능하다.
	void method2();
	
	
}


class SampleImplment implements SampleInterface, SampleInterface2{
	//인터페이스의 상속은 extends가 아니라 implenments로 해야하며 다른 상속과 다르게 인터페이스는 상속을 다수 받을수있다.
	@Override
	public void method1() {
		
	}

	@Override
	public void method2() {
		
	}

	@Override
	public void method3() {
		
	}		
	
}



interface SampleInterface2{
	void method1();
	void method3();
}