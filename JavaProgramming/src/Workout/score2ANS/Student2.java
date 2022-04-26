package Workout.score2ANS;


public class Student2 {
		
		
	int kor;				//필드 : 개념 다시 잡기 , 변수처럼 보이지만 아님.
	int eng;
	int math;
	int sum;
	double avg;
	int rank;
	String name;
	
	void score(){									//void(파라미터){리턴값이 없으면 출력이라도 함} 
		kor = (int)(Math.random()*101);
		eng = (int)(Math.random()*101);
		math = (int)(Math.random()*101);
		sum = kor + eng + math;
		avg = Math.round((double)sum/3 * 100)/100.0 ;
		rank = 1;
	}
	
	 void rank(Student2[] students){				//(파라미터안에 배열)석차
		 for(int i = 0; i < students.length; i++){
				for(int j = 0; j < students.length; j++){
				if(students[i].avg < students[j].avg){
					students[i].rank++;
				}
			  }
			}
	 }
	 void rankcount(Student2[] students){				//(석차정렬)
		 for(int i = 0; i < students.length-1; i++){
				int min = i;
				for(int j = i+1; j < students.length; j++){
					if(students[j].rank < students[min].rank){
						min = j;
					}
				}
				Student2 temp = students[i];
				students[i] = students[min];
				students[min] = temp;
			}
	 }
	void print(Student2[] students){
		int[]sumcount = new int[3];
		for(int i = 0; i < students.length; i++){
			sumcount[0] += students[i].kor;
			sumcount[1] += students[i].eng;
			sumcount[2] += students[i].math;
		}
		double[]avgcount = new double[3];			
		for(int i = 0; i < avgcount.length; i++){
			avgcount[i] = Math.round((double)sumcount[i]/students.length*100.0)/100;
		}
		
		System.out.println("이름\t국어\t영어\t수학\t합계\t평균\t석차");
		for(int i = 0; i < students.length; i++){
			System.out.println(students[i].name+"\t"+
								students[i].kor+"\t"+
								students[i].eng+"\t"+
								students[i].math+"\t"+
								students[i].sum+"\t"+
								students[i].avg+"\t"+
								students[i].rank+"\t");
		}
		
		System.out.print("과목합계\t");
		for(int i = 0; i < sumcount.length; i++){
			System.out.print(sumcount[i]+"\t");
		}
		System.out.print("\n과목평균\t");
		for(int i = 0; i < avgcount.length; i++){
			System.out.print(avgcount[i]+"\t");
		}
	
	}
		
}


