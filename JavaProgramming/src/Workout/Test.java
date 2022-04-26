package Workout;

public class Test {
	
	
	//변수에 관하여
	
	
	int a=1; //멤버변수-인스턴스변수
	int b; //멤버변수-인스턴스변수
	static String st="I'm a static variable"; //멤버변수-클래스 변수
}
class prog {
	static int b=3; //prog의 클래스변수 b 
	public static void main(String[] args) {
	 System.out.println(Test.st); //클래스 변수는 객체 생성 없이 사용가능
	 String st="new variable"; //지역변수 st(메서드 안에 위치하고 있다)
	 System.out.println(st); 
//	 System.out.println(Test.a); //인스턴스변수는 객체 생성없이 사용할 수 없다 (change 'a' to 'static')
	 Test exercise = new Test(); //객체 생성
	 System.out.println("인스턴스 a값은 "+exercise.a); //객체의 a값을 가져온다.
	 exercise.a=2; //a값을 바꾸면
	 System.out.println("새로운 a값은 "+exercise.a); //a=2가 된다
	 System.out.println("b값은 "+b+" >>클래스변수를 가져옵니다"); //b만 쓸경우 prog의 클래스변수를 가져온다
	 System.out.println("인스턴스 b값은 "+exercise.b); //exercise.b 라고 표시를 해주면 exercise에서 인스턴스변수를 가져온다
	 int c=4;	//지역변수 c(메서드 안에 위치하고 있다)
	 System.out.println("지역변수 c값은 "+c);
	}
}
