package c_statement;

import java.util.Scanner;

public class ConditionalStatement {

	public static void main(String[] args) {

		/*
		 * 조건문 - if문 - switch문
		 * 
		 * if문 - if(조건식){} : 조건식의 결과가 true이면 블럭인의 문장을 수행한다. - else if (조건식){} :
		 * 다수의 조건이 필요할때 if뒤에 추가한다. - else() : 조건식이외의 경우를 위해 추가한다.
		 */

		// int a = 5;
		//
		// if (a == 1) {
		// System.out.println("a = 1");
		// } else if (a == 2) {
		// System.out.println("a = 2"); // else if는 무제한으로 추가할수 있다.
		// } else if (a == 3) {
		// System.out.println("a = 3");
		// } else {
		// System.out.println("else"); // if와 else if가 값이 둘다 true면 맨위부터 실해된다.
		// }
		//
		// if (a < 10) {
		// System.out.println("a가 10보다 작다.");
		// } else if (a < 20) {
		// System.out.println("a가 20보다 작다."); // else if대신 if를 넣게되면 둘다 출력되어진다.
		// }
		//
		// // 정수가 60점 이상이면 합격 그렇지 않으면 불합격
		// int score = 59;
		//
		// if (score >= 60) {
		// System.out.println("합격");
		// } else if (score < 60) {
		// System.out.println("불합격");
		// }

		// if(score>=60){
		// System.out.println("합격");
		// }else{
		// System.out.println("불합격");
		// } else if는 조건절을 붙이나 else는 60점이상이 아니면 다 불합격으로 뜨기에 상관없음.

		// 점수에 등급을 부여하는 프로그램

		// score = 85;
		// String grade = null;
		// 기본값
		// boolean = false
		// 나머지 = 0

		// if (90 <= score && score <= 100) {
		// grade = "A";
		// } else if (80 <= score) { // 이미 위에서 고점은 정해지기에 &&이후의 제약을 안써도됨
		// grade = "B";
		// } else if (70 <= score) {
		// grade = "C";
		// } else if (60 <= score) {
		// grade = "D";
		// } else
		// grade = "F"; // 마지막은 else로 끊으면 된다.
		//
		// System.out.println(score + "점에 해당하는 등급은" + grade + "입니다.");
		//
		//
		//
		// //등급에 +와 -차별두기
		//
		// score = 95;
		// grade = null;
		//
		// if (90 <= score && score <= 100) {
		// grade = "A";
		// if (97 <= score) { // A라는 조건에 조건을 달려면 A밑에 다시 if를 달아서 조건절을 붙인다.
		// grade += "+"; // grade = grade + "+";
		//
		// } else if (score <= 93) {
		// grade += "-";
		// }
		// } else if (80 <= score) {
		// grade = "B";
		// if (87 <= score) {
		// grade += "+";
		// } else if (score <= 83) {
		// }
		// grade += "-";
		// } else if (70 <= score) {
		// grade = "C";
		// if (77 <= score) {
		// grade += "+";
		// } else if (score <= 73) {
		// }
		// grade += "-";
		// } else if (60 <= score) {
		// grade = "D";
		// {
		// if (67 <= score) {
		// grade += "+";
		// } else if (score <= 63) {
		// }
		// grade += "-";
		// }
		// } else {
		// grade += "F";
		//
		// System.out.println(score + "점에 해당하는 등급은" + grade + "입니다.");
		// }
		// 정렬은 Ctrl+Shift + f , 정렬이 안되는 경우는 컴파일 에러가 있는경우

		/*
		 * switch문 -switch(int/String)(case 1: break;) -조건식의 결과는 정수와 문자열은
		 * (JDK1.7부터 문자열 허용) 허용한다. -조건식과 일치하는 case문 이후의 문장을 수행한다. -추가 조건은 case를
		 * 더 넣으면 된다. -원하는 값을 찾고 빠져나올땐 break; 필히 넣을것
		 */

		// a = 10;
		// //
		// switch (a) {
		// case 10:
		// System.out.println("a==10");
		// break;
		// case 20:
		// System.out.println("a==20");
		// break;
		// default:
		// System.out.println("default"); //default는 case에 해당하지 않는 값에 대하여 답을 달때
		// 쓴다.
		// }
		//
		// 주어진 월에 해당하는 계절을 출력해봅시다.
		int month = 1;
		String season = null;

		switch (month) {
		case 3:
		case 4:
		case 5:
			season = "봄";
			break;
		case 6:
		case 7:
		case 8:
			season = "여름";
			break;
		case 9:
		case 10:
		case 11:
			season = "가을";
			break;
		case 12:
		case 1:
		case 2:
			season = "겨울";
		}
		System.out.println(month + "월은" + season + "입니다.");

		// score = 90;
		// grade = null;
		//
		// switch (score / 10) {
		// case 9:
		// grade = "A";
		// break;
		// case 8:
		// grade = "B";
		// break;
		// case 7:
		// grade = "C";
		// break;
		// case 6:
		// grade = "E";
		// break;
		// default:
		// grade = "F";
		// }
		// System.out.println(score + "점은" + grade + "등급입니다.");

		// 숫자를 입력받아 그 숫자가 0인지 0이 아닌지 출력해주세요.

		Scanner sc = new Scanner(System.in);
		// System.out.println("숫자입력");
		// int num = Integer.parseInt(sc.nextLine());
		// if (num==0){
		// System.out.println("0입니다.");
		// }else{System.out.println("0이 아닙니다.")
		// }

		// 숫자를 입력받아 그 숫자가 홀수인지 짝수인지 출력해주세요

		// System.out.println("숫자를 입력해주세요");
		// int num = Integer.parseInt(sc.nextLine());
		// if (num /2 == 0){
		// System.out.println("짝수입니다.");
		// }else{System.out.println("홀수입니다.");

		// 점수 3개를 입력받아 합계 , 평균, 등급을 출력해주세요
		// System.out.println("점수1");
		// int num = Integer.parseInt(sc.nextLine());
		// System.out.println("점수2");
		// int num2 = Integer.parseInt(sc.nextLine());
		// System.out.println("점수3");
		// int num3 = Integer.parseInt(sc.nextLine());
		//
		// int sum = num + num2 + num3;
		// double avg = Math.round(sum /3.0 * 10)/10.0;
		// String grade;
		//
		//
		// if (90 <= avg && avg <= 100) {
		// grade = "A";
		// } else if (80 <= avg) {
		// grade = "B";
		// } else if (70 <= avg) {
		// grade = "C";
		// } else if (60 <= avg) {
		// grade = "D";
		// } else {
		// grade = "F";
		// }
		// System.out.println("합계"+sum +""+"평균"+ avg+""+"등급"+grade); //grade값은
		// 어떻게 잡는가?

		// 1~100 사이의 랜덤한 수를 3개 발생시키고 오름차순으로 출력해주세요.

		int random1 = (int) (Math.random() * 100) + 1;
		int random2 = (int) (Math.random() * 100) + 1;
		int random3 = (int) (Math.random() * 100) + 1;
		int x;
		if (random1 > random2) {
			x = random1;
			random1 = random2;
			random2 = x;
		}
		if (random2 > random3) {
			x = random2;
			random2 = random3;
			random3 = x;
		}
		if (random1 > random2) {
			x = random3;
			random1 = random2;
			random2 = x;
		}
		System.out.println(random1 + " < " + random2 + " < " + random3);

	}

}
