package g_oop2;

import g_oop2.AccessModifier;

public class AccessTest extends AccessModifier {

	
	public static void main(String[] args) {
		AccessModifier am = new AccessModifier();
		
		System.out.println(am.publicVar);
		am.publicMethod();
		
//		System.out.println(am.protectedVar);
//		am.protectedMethod();
//		
//		System.out.println(am.defaultVar);
//		am.defaultMethod();
		
//		System.out.println(am.privateVar);		//같은 클래스내에서만 쓸수 있기에 사용불가능
//		am.privateMethod();
		
		
		AccessTest at = new AccessTest();
		System.out.println(at.protectedVar);
		at.protectedMethod();
		
		
//		System.out.println(at.defaultVar);
//		System.out.println(at.privateVar);
		
		
	}
	
	
}
