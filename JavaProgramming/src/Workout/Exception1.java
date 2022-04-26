
package Workout;

public class Exception1 {
	public static void main(String[] args) {
		
		try {
			//메시지발생
			throw new Exception("에러내용입니다.");
		} catch (Exception e) {
			System.out.println("e.getMessage()="+e.getMessage());
			System.out.println("e.toString()="+e.toString());
			//System.out.println("e.printStackTrace()="+e.printStackTrace());
			e.printStackTrace();
			return;
			}
      }
}
