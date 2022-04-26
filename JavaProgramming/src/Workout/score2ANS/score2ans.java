package Workout.score2ANS;


public class score2ans {

	
	public static void main(String[] args) {
		//성적처리 프로그램 만들기
		//Student에 있는 메서드를 호출해서 사용
		
		String[] studentNames = {"강나영", "강동환", "강태영", "곽지훈", "김서윤", "김영훈", "김진석", "김충신", "박슬기", "박채린", "손영태", "손영흔",
	              "안정연", "이선우", "이수보", "이주홍", "이중호", "임현정", "장유진", "정신애", "조수경", "조하영", "조혜민", "허민정", "박지은"};
		
		Student2[] students = new Student2[studentNames.length];
		
		Student2 a = new Student2();
		
		for(int i = 0; i < students.length; i++){
			Student2 student = new Student2();
			student.score();
			student.name = studentNames[i];
			students[i] = student;
		}
		a.rank(students);
		a.rankcount(students);
		a.print(students);
		
	}

}

