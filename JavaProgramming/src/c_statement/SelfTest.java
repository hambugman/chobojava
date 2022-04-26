package c_statement;

import java.util.Scanner;

public class Selftest {

	public static void main(String[] args) { //MAIN메소드만 제일먼저 실행되고 나머진 동시에 실행됨.

		Scanner sc = new Scanner(System.in);
		String str;
		int score = 0;
		System.out.println("탄수화물 중독 자가 테스트 "+"(해당사항이시면 y를 눌러주세요)");
		System.out.println("\n아침을 배불리 먹은 후, 점심시간 전에 배가 고프다. : ");
		str = sc.nextLine();
		if (str.equals("y")) {
			++score;
		}
		System.out.println("밥,빵,과자등 음식을 먹기 시작하면 끝이 없다. : ");
		str = sc.nextLine();
		if (str.equals("y")) {
			++score;
		}
		System.out.println("음식을 금방 먹은 후에는 만족스럽지 못하고 더먹는다. : ");
		str = sc.nextLine();
		if (str.equals("y")) {
			++score;
		}
		System.out.println("정말 배고프지 않더라도 먹을때가 있다. : ");
		str = sc.nextLine();
		if (str.equals("y")) {
			++score;
		}
		System.out.println("저녁을 먹고 간식을 먹지 않으면 잠이 오지 않는다. : ");
		str = sc.nextLine();
		if (str.equals("y")) {
			++score;
		}
		System.out.println("스트레스를 받으면 자꾸 먹고 싶어진다. : ");
		str = sc.nextLine();
		if (str.equals("y")) {
			++score;
		}
		System.out.println("책상이나 식탁위에 항상 과자 초콜렛등이 놓여있다. : ");
		str = sc.nextLine();
		if (str.equals("y")) {
			++score;
		}
		System.out.println("오후 5시가 되면 피곤함이나 배고픔을 느끼고 일이 손에 안잡힌다. :");
		str = sc.nextLine();
		if (str.equals("y")) {
			++score;
		}
		System.out.println("과자, 초콜릿등 단음식은 상상만해도 먹고싶어진다. :");
		str = sc.nextLine();
		if (str.equals("y")) {
			++score;
		}
		System.out.println("다이어트을 위해 식이조절을 하는데 3일도 못간다. :");
		str = sc.nextLine();
		if (str.equals("y")) {
			++score;
		}

		if (7 <= score && score <= 10) {
			System.out.println("중독!"+"위험한 수준은 아니지만 관리가 필요");
		} else if (4 <= score && score < 6) {
			System.out.println("위험!"+"탄수화물 섭취 줄이기 위한 식습관 개선이 필요");
		} else {
			System.out.println("주의!"+"전문의 상담이 필요함");
		}
			
	}

}
