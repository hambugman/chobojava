package e_oop.score;

public class Scorepractice {

	public static void main(String[] args) {
		String[] studentNames =
			{ "강나영", "강동환", "강태영", "곽지훈", "김서윤"
			, "김영훈", "김진석", "김충신", "박슬기", "박채린"
			, "손영태", "손영흔", "안정연", "이선우", "이수보"
			, "이주홍", "이중호", "임현정", "장유진", "정신애"
			, "조수경", "조하영", "조혜민", "허민정", "박지은"};
		Student[]students = new Student[studentNames.length];
		//new는 객체 생성시 사용
		for(int i =0 ; i<25; i++){
			Student student = new Student(); 
			//Student클래스로 student
			student.kor = (int)(Math.random()*101);
			student.eng = (int)(Math.random()*101);
			student.math = (int)(Math.random()*101);
			student.name = studentNames[i];
			student.rank = 1;
			
			students[i]=student;	//students배열 초기화
		}
		
		//합계,평균
		for(int i=0; i < students.length; i++){
			students[i].sum=students[i].kor + students[i].eng + students[i].math;
			students[i].avg=Math.round(students[i].sum/3.0*100)/100.0;			
		}
		//석차
		for(int i=0; i<students.length; i++){
			for(int j=0; j<students.length; j++){
				if(students[i].avg<students[j].avg){
					students[i].rank++;
				}
			}
		}
		//석차순 정렬 왜 -1이 들어간건지 min이 뭔지 모르겟음.
		for(int i = 0; i<students.length-1;i++){
			int min = i;
			for(int j = i+1; j<students.length; j++){
				if(students[j].rank<students[min].rank){
					min = j;
				}
			}
			Student temp = students[i];
			students[i]= students[min];
			
		}
		
		
	}

}
