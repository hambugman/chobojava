package e_oop;

import java.util.Scanner;

public class ScanUtil {
	
	//객체 생성 없이 입력할 수 있는 스캐너 만들기
	
	
	private static Scanner s = new Scanner(System.in);
	
	public static String nextLine(){
		String input = null;
		try{
			input = s.nextLine();
		}catch(Exception e){
			System.out.println("잘못된 값을 입력하셨습니다. 다시 입력해주세요>");
			input = nextLine();
		}
		return input;
	}
	public static int nextInt(){
		int input = 0;
		try{
			input = Integer.parseInt(s.nextLine());
		}catch(Exception e){
			System.out.println("잘못된 값을 입력하셨습니다. 다시 입력해주세요>");
			input = nextInt();
			}
		return input;
		}
	public static double nextDouble(){
		double input = 0;
		try{
			input = Double.parseDouble(s.nextLine());
		}catch(Exception e){
			System.out.println("잘못된 값을 입력하셨습니다. 다시 입력해주세요>");
			}
		return input;
		}
	
	
	
}
