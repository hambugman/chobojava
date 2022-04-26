package Test;

public class AceessModifier {
	
	//접근제한자
	
	public String publicVar = "public : 접근 제한이 없음";
	
	protected String protectedVar 
		= "protected : 같은 패키지안에 있으며 상속받은 클래스에서만 접근 가능함";
	
	String defaultVar = "default : 같은  패키지 내에서만 접근이 가능함";
	
	private String privateVar = "private : 클래스내에서만 접근이 가능함";
	//이는 클래스뿐만 아니라 메소드도 동일하게 적용됨
	
}
