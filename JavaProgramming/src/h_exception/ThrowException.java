
package h_exception;

import java.io.IOException;

public class ThrowException {

	public static void main(String[] args) {
		try {
			throw new IOException();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
//		NullPointerException : 변수에 null이 들어 있어서 발생한다.
		
		String str = null ; 
		System.out.println(str.equals(""));
		
//		IndesOutofBoundsException : 배열의 인덱스를 벗어나서 발생된다
		int[] a = new int[10];
		
		for(int i = 0 ; i <= a.length; i++){
			System.out.println(a[i]);
		}
		
	}
		
	//파일 이름으로 파일 찾기 : Ctrl + Shift + R
	//줄이동 Alt키 위아래 
	//줄복사 Ctrl + Alt 아래
	//한줄 삭제 Ctrl+D
	
}
		
		
		
		

