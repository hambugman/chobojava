package e_oop;

public class JVM {

	public static void main(String[] args) {
		/*
		 * JVM(Java Virtual Machine)
		 *  - 자바로 만들어진 프로그램이 실행되는 컴퓨터 안의 가상 컴퓨터
		 *  - 운영체제 -> JVM -> 자바 프로그램
		 *  - 장점: 운영체제에 상관없이 실행할 수 있다.
		 *  - 단점: 속도가 느리다.
		 *  
		 * JVM 메모리 구조
		 *  - Method Area(메서드 영역) : 클래스 멤버가 저장된다. Static이 붙은애는 여기에 저장됨. 아무리 많아도 프로그램 시작될때 한번만 저장된다.
		 *  - Heap : 객체가 저장된다.(static이 안붙은애들) 필요가 없어질때 garbage collector에 의해 삭제된다.
		 *  - Call Stack(호출 스택) : 현재 호출되어 있는 메서드가 저장된다. 프로그램이 실행되는 영역에서 호출됨. 실행이 끝나면 삭제가 된다.
		 */

		
		//프로그램이 실행되면서 겪는 메모리의 변화순서
		//1. 프로그램 실행시  static이 붙어있는 main(),classvar,classMethod()가 JVM의 메모리안에 있는 MethodArea에 저장됨
		//2. main()이 호출되어 callstack에 저장됨.
		
		System.out.println(classVar);
		//3. System클래스의 out이 MethodArea에 저장됨
		//4. println()이 호출되어 callstack에 저장
		//5. println()의 classVar를 출력후 callstack에서 삭제됨
		
		classMethod();
		//6.classMethod()가 호출되어 callstack에 저장되었다가 메서드가 종료되면 삭제됨
		
		JVM jvm = new JVM();
		//7.JVM객체가 heap에 저장됨. 지역변수는 callstack에서 만들어진다.
		//8.jvm변수가 callstack에 저장되고, JVM객체의 주소가 저장됨
		System.out.println(jvm.instanceVar);
		//9.println()이 호출되어 callstack에 저장되었다가 instanceVar를 출력후 삭제됨
		jvm.instanceMethod();
		//10.instanceMethod()가 호출되어 callstack에 저장되었다가 메서드가 종료되면 삭제됨
		jvm=null;
		//11. jvm이라는 변수에 null이 저장됨 
		//12. 어디에서도 참조하지 않는 JVM객체는 GarbageCollector에 의해 삭제됨
		
		//13. main()의 실행이 종료되며 callstack에서 삭제됨
		//14. 프로그램이 종료되고 MethodArea의 데이터가 삭제됨
	}
	int instanceVar;
	static int classVar;
	
	void instanceMethod(){
		System.out.println(instanceVar);
		System.out.println(classVar);
	}
	static void classMethod(){						//실행하면 메모리에 바로 올라옴.
//		System.out.println(instanceVar);			//변수가 아직 메모리에 올라와있지 않기때문에 컴파일 에러발생.
		System.out.println(classVar);				//스태틱 클래스에서 인스턴스
	}
	
	
}
