package Workout;

public class question01 {

	public static void main(String[] args) {

		int num = 0;
		
		System.out.println(num>0?"양수":(num<0)?"음수":"0");//다음의 값이 양수라는 글자가 나오도록 해라
		
		
		int num1 =5236;
		System.out.println(num1/100*100);			//456을 100으로 나누고 나머지값이 없는 4에 100을 곱해서 강제로 400을 만듬
		
		
		
		//아래는 변수 num의 값 중에서 일의 자리를 1로 바꾸는 코드이다. 만일 변수 num의
		//값이 333이라면 331이 되고, 777이라면 771이 된다. (1)에 알맞은 코드를 넣으시오.
		int num2 = 555;
		System.out.println(num2/10*10+1 );		//10을 나누어 무조건 0으로끝나게 만들고 10을 다시곱해서 백자리로 복구 거기에 1을더하면된다.
		
		
		
//		아래는 변수 num의 값보다 크면서도 가장 가까운 10의 배수에서 변수 num의 값을
//		뺀 나머지를 구하는 코드이다. 예를 들어, 24의 크면서도 가장 가까운 10의 배수는 30이
//		다. 19의 경우 20이고, 81의 경우 90이 된다. 30에서 24를 뺀 나머지는 6이기 때문에 변
//		수 num의 값이 24라면 6을 결과로 얻어야 한다. (1)에 알맞은 코드를 넣으시오.
		int num3 = 24;			//24일시 24보다 큰 10배수는 30 24를 뺀 나머지 
		System.out.println(10 - num3%10);			// 10을 나누고 남은 나머지를 10에 뺀다.
		
		
		
		
		
	}

}
