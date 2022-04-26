package e_oop.score2;

public class Student2 {
						
	int kor;						//메소드는 하나당 한가지일만 하게 만드는게 좋다.
	int eng;	
	int math;
	int sum;
	double avg;
	String name;
	int rank;
	
	void createRandomScore(){
		kor = (int)(Math.random() * 101);
		eng = (int)(Math.random() * 101);
		math = (int)(Math.random() * 101);
	}
	
	int getSum(){
		return sum = kor + eng + math;
	}
	
	double getAverage(){
		return avg = Math.round(getSum() / 3.0 * 100) / 100.0;
	}
	
	int getRank(Student2[] students){
		rank = 1;
		for(int i = 0; i < students.length; i++){
			if(getSum() < students[i].getSum()){
				rank++;
			}
		}
		return rank;
	}
	
	String getInfo(){
		return name + "\t" + kor + "\t" + eng + "\t" + math + "\t" + sum + "\t" + avg + "\t" + rank;
	}
	
}

