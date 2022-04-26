package e_oop.score2;


public class Score2 {
	
	public static void main(String[] args) {
		
			String[] studentNames =
				{ "강나영", "강동환", "강태영", "곽지훈", "김서윤"
				, "김영훈", "김진석", "김충신", "박슬기", "박채린"
				, "손영태", "손영흔", "안정연", "이선우", "이수보"
				, "이주홍", "이중호", "임현정", "장유진", "정신애"
				, "조수경", "조하영", "조혜민", "허민정", "박지은"};
			
			Student2[] students = new Student2[studentNames.length];
			
			for(int i = 0; i < students.length; i++){
				students[i] = new Student2();
				students[i].name = studentNames[i];
				students[i].createRandomScore();
				students[i].getSum();
				students[i].getAverage();
			}
//			Student s = new Student();			위와 같은뜻이다. 위는 배열이고 아래는 변수로 지정
//			s.createRandomScore();
//			s.getSum;
//			s.getAvg;
			
			for(int i = 0; i < students.length; i++){
				students[i].getRank(students);
			}
			
			//석차순 정렬
			for(int i = 0; i < students.length - 1; i++){
				int min = i;
				for(int j = i + 1; j < students.length; j++){
					if(students[j].rank < students[min].rank){
						min = j;
					}
				}
				Student2 temp = students[i];
				students[i] = students[min];
				students[min] = temp;
			}
			
			//과목별 합계, 평균
			int[] sums = new int[3];
			for(int i = 0; i < students.length; i++){
				sums[0] += students[i].kor;
				sums[1] += students[i].eng;
				sums[2] += students[i].math;
			}
			double[] avgs = new double[3];
			for(int i = 0; i < avgs.length; i++){
				avgs[i] = Math.round((double)sums[i] / students.length * 100) / 100.0;
			}
			
			//출력
			System.out.println("이름\t국어\t영어\t수학\t합계\t평균\t석차");
			for(int i = 0; i < students.length; i++){
				System.out.println(students[i].getInfo());
			}
			System.out.print("과목합계");
			for(int i = 0; i < sums.length; i++){
				System.out.print("\t" + sums[i]);
			}
			System.out.print("\n과목평균");
			for(int i = 0; i < avgs.length; i++){
				System.out.print("\t" + avgs[i]);
			}
		}
	}



