package i_api;

public class StringSpeedTest {

	public static void main(String[] args) {
//		System.currentTimeMillis();
//		String str = "a";
//		
//		long start = System.currentTimeMillis();
//		for(int i = 0 ; i<200000 ; i++){					//String 200000만까지 가는데 10초
//			str += "a";
//		}
//		long end = System.currentTimeMillis();
//		System.out.println(end-start+"ms");
		
		StringBuffer sb = new StringBuffer("a");			//StringBuffer 대용량의 자료처리에 빠르다.
		long start = System.currentTimeMillis()	;			//StringBuffer 20만까지 가는데 0.01초
		for(int i = 0 ; i<200000; i++){
			sb.append("a");
		}
		long end = System.currentTimeMillis();
		System.out.println(end - start +"ms");
		
	}

}
