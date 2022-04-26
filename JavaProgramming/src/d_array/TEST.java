package d_array;

public class TEST {

	public static void main(String[] args) {
			/*
			 * 우리반 모두의 국어, 영어, 수학, 사회, 과학, Oracle, Java 점수를
			 * 0 ~ 100까지 랜덤으로 생성해주시고, 아래와 같이 출력해주세요.
			 * 
			 * 			국어		영어		수학		사회		과학		Oracle	Java	합계		평균		석차
			 * 홍길동		90		90		90		90		90		90		90		630		90.00	1
			 * 홍길동		90		90		90		90		90		90		90		630		90.00	1
			 * 홍길동		90		90		90		90		90		90		90		630		90.00	1
			 * 홍길동		90		90		90		90		90		90		90		630		90.00	1
			 * 홍길동		90		90		90		90		90		90		90		630		90.00	1
			 * 과목합계	450		450		450		450		450		450		450
			 * 과목평균	90.00	90.00	90.00	90.00	90.00	90.00	90.00
			 */
			// names/ subjects/ score/ namesum/ nameavg/ subsum/ subavg
			
			String[] names = {"허지영", "김민지", "김동민", "배현태", "여인욱", "김동희", "김인혁", "이영섭", "정선영", "이지향", "김용진"};
			String[] subjects = {"국어", "영어", "수학", "사회", "과학", "Oracle", "Java"};
			int[][] score = new int[names.length][subjects.length];			//점수=학생수 과목수
			//랜덤 점수
			for(int i = 0; i < score.length; i++){										//랜덤 점수 출력
				for(int j = 0; j < score[i].length; j++){
					score[i][j] = (int)(Math.random() * 100);						//실수도 포함되기에 0.xx값이 안나오게 하기 위해 1과 100사이의 수를 얻기위해 101을 곱함.
				}
			}
//------------------------------------------------------------------------------------				
			//합계,평균
			int[] nameSum = new int[score.length];											//개인점수 합계
			double[] nameAvg = new double[score.length];
			for(int i = 0; i < score.length; i++){
				for(int j = 0; j < score[i].length; j++){
					nameSum[i] += score[i][j];			 //+=로 계속 더 한값에 더해서 총합을 낸다. score.length 점수배열끝까지
				}	//for문은 합계를 구한시점에서 역활 다함.
				nameAvg[i] = Math.round((double)nameSum[i] / subjects.length * 100) / 100.0;	//100.0을 넣으면 강제로 실수를 만든다.
			}				//math.round(타입)배열 *100/100 소수점 2자리까지 
//------------------------------------------------------------------------------------				
			//과목합계,평균
			int[] subSum = new int[subjects.length];										//과목합계
			double[] subAvg = new double[subjects.length];
			for(int i = 0; i < subjects.length; i++){
				for(int j = 0; j < score.length; j++){
					subSum[i] += score[j][i];
				}
				subAvg[i] = Math.round((double)subSum[i] / score.length * 100) / 100.0;
			}
//------------------------------------------------------------------------------------			
			//석차
			int[] rank = new int[score.length];													//석차
			for(int i = 0; i < score.length; i++){
				rank[i] = 1;
				for(int j = 0; j < score.length; j++){
					if(nameSum[i] < nameSum[j]){
						rank[i]++;
					}
				}
			}
//------------------------------------------------------------------------------------				
			//석차순으로 정렬(시험에서 출제되지 않음)
			for(int i = 0; i < nameSum.length - 1; i++){
				int min = i;
				for(int j = i + 1; j < nameSum.length; j++){
					if(nameSum[j] > nameSum[min]){
						min = j;
					}
				}
				int[] temp = score[i];
				score[i] = score[min];
				score[min] = temp;
				
				int temp2 = nameSum[i];
				nameSum[i] = nameSum[min];
				nameSum[min] = temp2;
				
				double temp3 = nameAvg[i];
				nameAvg[i] = nameAvg[min];
				nameAvg[min] = temp3;
				
				int temp4 = rank[i];
				rank[i] = rank[min];
				rank[min] = temp4;
				
				String temp5 = names[i];
				names[i] = names[min];
				names[min] = temp5;
			}
//------------------------------------------------------------------------------------				
			//출력
			System.out.print("이름");
			for(int i = 0; i < subjects.length; i++){			//과목 배열에 연결
				System.out.print("\t" + subjects[i]);
			}
			System.out.println("\t합계\t평균\t석차");
			for(int i = 0; i < score.length; i++){				//점수 배열에 연결됨
				System.out.print(names[i] + "\t");
				for(int j = 0; j < score[i].length; j++){
					System.out.print(score[i][j] + "\t");
				}
				System.out.println(nameSum[i] + "\t" + nameAvg[i] + "\t" + rank[i]);
			}
			
			System.out.print("과목합계\t");
			for(int i = 0; i < subSum.length; i++){
				System.out.print(subSum[i] + "\t");			//subsum 과목 합계 배열에 연결
			}
			System.out.println();
			
			System.out.print("과목평균\t");
			for(int i = 0; i < subAvg.length; i++){
				System.out.print(subAvg[i] + "\t");			//subavg 과목평균배열에 연결
			}
		}

	}
