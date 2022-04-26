package e_oop.score;

public class Student {

	int kor;
	int eng;
	int math;
	int sum;
	double avg;
	String name;
	int rank;
	
	
	
	
	
	
	
	//내용 분리해서 메소드를 student에 넣고 프로그램 다시 만들기 학생이 하는 일 관련해서 클래스에 넣기
	double plus(double x,double y){		//앞이 double이면 안에 파라미터도 같은걸로
		return x + y;
	}
	
}
