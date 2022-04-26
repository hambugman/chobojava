package Test;

public class JVM {

	public static void main(String[] args) {
		/*
		 * JVM (자바 가상 머신)
		 * - 자바로 만들어진 프로그램이 실행되는 컴퓨터안의 가상 컴퓨터
		 * - 운영체제 -> JVM -> 자바프로그램
		 * - 장점 : 운영체제에 상관없이 실행가능
		 * - 단점 : 속도가 느림
		 * 
		 * JVM 메모리 구조
		 * - Method Area (메서드 영역) : 클래스 멤버가 저장된다. static이 저장됨 . 프로그램시작시 한번만 저장
		 * - Heap : 인스턴스객체가 저장됨. 필요가 없어지면  garbage collector에 의해 삭제됨
		 * - Call Stack(호출스택) : 현재 호출된 메서드가 저장됨. 프로그램실행 영역에서 호출됨. 실행끝날시 삭제
		 */
		
		/*프로그램이 실행되면서 겪는 메모리의 변화 순서
		 * 1. 프로그램이 실행시 static이 붙은 main(), classvar, classMethod()가 
		 * 	  JVM의 메모리안에 있는 MethodArea에 저장됨
		 * 2. main()d이 호출되어 callstack에 저장됨.
		 * 
		 * 3. System클래스의 out이 MethodArea에 저장됨
		 * 
		 * 4. p
		 */
		
	}

}
