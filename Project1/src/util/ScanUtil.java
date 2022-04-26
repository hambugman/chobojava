package util;

import java.util.Scanner;

public class ScanUtil {

	// 객체 생성 없이 사용할 수 있는 Scanner
	private static Scanner s = new Scanner(System.in);

	public static String nextLine() {
		return s.nextLine();
	}

	public static int nextInt() {
		int input;
		try {
			input = Integer.parseInt(s.nextLine());
		} catch (Exception e) {
			System.out.println("잘못된 값을 입력하였습니다. 다시 입력하세요.");
			input = Integer.parseInt(s.nextLine());
		}
		return input;
	}

	public static long nextLong() {
		long input;
		try {
			input = Long.parseLong(s.nextLine());
		} catch (Exception e) {
			System.out.println("잘못된 값을 입력하였습니다. 다시 입력하세요.");
			input = Long.parseLong(s.nextLine());
		}
		return input;
	}

	public static float nextFloat() {
		float input;
		try {
			input = Float.parseFloat(s.nextLine());
		} catch (Exception e) {
			System.out.println("잘못된 값을 입력하였습니다. 다시 입력하세요.");
			input = Float.parseFloat(s.nextLine());
		}
		return input;
	}

	public static double nextDouble() {
		double input;
		try {
			input = Double.parseDouble(s.nextLine());
		} catch (Exception e) {
			System.out.println("잘못된 값을 입력하였습니다. 다시 입력하세요.");
			input = Double.parseDouble(s.nextLine());
		}
		return input;
	}

}
