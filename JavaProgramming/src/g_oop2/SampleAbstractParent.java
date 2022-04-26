package g_oop2;

public abstract class SampleAbstractParent {		//추상메서드를 쓰려면 클래스도 abstract 붙여서 추상클래스로 만들어야함

	/*
	 * 추상메서드 : 메서드이지만 내용이 없는 메서드
	 * 예) 새,곤충,물고기 -> 동물 (추상메서드- 특징으로만 묶인 )
	 */
	
	void method(){
		System.out.println("내용");
	}
	
	//추상메서드 : 선언부만 있고 구현부가 없는 메서드 , 객체생성이 안됨 , 부모클래스로만 사용함, 자식과 구성은 같으나 내용이 다름.
	abstract void abstractMethod();
	
	
}

class SampleAbstractChild extends SampleAbstractParent{

	@Override
	void abstractMethod() {
		System.out.println("내용");
		
	}								
	
}