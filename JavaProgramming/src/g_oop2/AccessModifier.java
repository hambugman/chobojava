package g_oop2;

public class AccessModifier {

	public String publicVar = "public : 접근 제한이 없음";
	protected String protectedVar
		="protected : 같은 패키지 + 상속받은 클래스에서 접근가능";
	String defaultVar = "default :같은 패키지 안에서만 접근가능"	;
	private String privateVar  = "private : 클래스 내에서만 접근 가능"; //접근 제한자는 클래스뿐만 아니라 메소드도 동일하게 적용됨
	
	
	public void publicMethod(){
		System.out.println(publicVar);
	}
	protected void protectedMethod(){
		System.out.println(protectedVar);
	}
	void defaultMethod(){
		System.out.println(defaultVar);
	}
	private void privateMethod(){
		System.out.println(privateVar);
	}
	
	
	public static void main(String[] args) {
		AccessModifier am = new AccessModifier();
		
		System.out.println(am.publicVar);
		am.publicMethod();
		
		System.out.println(am.protectedVar);
		am.protectedMethod();
		
		System.out.println(am.defaultVar);
		am.defaultMethod();
		
		System.out.println(am.privateVar);
		am.privateMethod();
		
		
	
		/*
		 * 접근 제어자를 사용하는 이유
		 * - 데이터를 보호하기 위해
		 * - 사용하는데 불필요한 멤버를 숨기기 위해
		 */
		
		
		
		
		Time t = new Time();		//Time클래스의 toStirng에 의해 불러와지면서 시간처럼 나옴
//		t.hour = 14;
//		t.minute= 7;
//		t.second= -30;
		
		t.setHour(23);
		t.setMinute(59);
		t.setSecond(30);
		
		
		System.out.println(t);
		
		t.clock();
		//t.stop();
		
		
		
	}
	
	
}
