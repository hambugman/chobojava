package h_exception;

import java.io.IOException;

public class ThrowsException {

	
	public static void main(String[] args) {
		try {
			method();
		} catch (IOException e) {
			e.printStackTrace();//에러메시지의 발생근원지를 따라 단계별로 에러를 출력함
		}
	}
	
	
	private static void method() throws IOException{
		throw new IOException();
	}
	
}
