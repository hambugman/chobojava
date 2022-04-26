package i_api;

import java.lang.Character.Subset;
import java.util.Arrays;

public class StringClass {

	public static void main(String[] args) {
		/*
		 * String
		 * - 여러개의 문자를 사용하기 쉽게 만들어 놓은 클래스
		 * 
		 * String의 주요 메서드
		 *  - equals() : 문자열의 내용이 같은지 반환한다.
		 *  - length() : 문자열의 길이를 반환한다.
		 *  - charAt() : 특정 인덱스에 위치한 문자를 반환한다.
		 *  - substring() : 문자열의 특정부분을 잘라서 반환한다.
		 *  - indexof() : 문자열 내의 특정문자의 인덱스를 반환한다.
		 *  - contains() : 문자열이 특정문자열을 포함하고 있는지 여부를 반환한다.
		 *  - split() : 문자열을 특정 문자를 기준으로 나누어 배열형태로 반환한다.
		 *  - trim() : 문자열 앞뒤의 공백을 제거해 반환한다.
		 *  - valueOf() : 다른 타입의 데이터를 문자열로 변환해 반환한다. 
		 */
		
		
		//equals
		System.out.println("문자열"+"추가");
		boolean equals = "문자열".equals("문자열");
		
		String str1 = "문자열";
		str1 += "추가";
		
		
		String str2 = null;
		System.out.println(str1.equals(str2));
	//	System.out.println(str2.equals(str1));//null값으로 인하여 예외발생
		
		//charAt
		String str = "12345";
		int length = str.length();
		for(int i=0; i<length ; i++){
			char charAt = str.charAt(i); //charAt문자를 반환해줌.
			System.out.println(charAt);
		}
		// 문자열 뒤집기
		String rev = "";
		for(int i=str.length()-1 ; 0<=i ; i--){
			rev += str.charAt(i);
		}
		System.out.println(rev);
		
		
		//substring
		str="0123456789";
		String sub1 = str.substring(3);
		System.out.println(sub1);
		String sub2 = str.substring(5,8);	//인덱스이기에 0부터 세기 시작한다. 5,6,7출력
		System.out.println(sub2);
		
		//indexOf
		str = "수박 오렌지 귤 블루베리";
		int index = str.indexOf("오렌지");
		System.out.println(index);
		
				
		String[]menu ={			//substring과 indexOf를 조합해서 문자열 자르기
				"수박 20000원",
				"오렌지 100000원",
				"귤 500원",
				"블루베리 3000원"
				};
				for(int i =0; i<menu.length;i++){
					String name = menu[i].substring(0,menu[i].indexOf(" "));
					System.out.println(name);
					int price = Integer.parseInt(
							menu[i].substring(menu[i].indexOf(" ")+1,menu[i].indexOf("원")));
					System.out.println(price);
				}
				
				//contains
				str = "abcd";
				boolean contains = str.contains("c");
				System.out.println(contains);				//abcd라는 문자열에서 c라는 문자열을 포함하고 있는지 boolean타입으로 묻는중 
															//출력값: true
				
				//오렌지가 메뉴의 몇번인덱스에 있는지 찾기 -- 메뉴라는 배열에서 몇번째 있는지 검색해서 찾아보기
				for(int i=0 ; i<menu.length ; i++){
					if(menu[i].contains("오렌지")){
						System.out.println("오렌지는 "+i+"번째 인덱스에 있습니다.");
					}
				}
				
				//split
				str = "a/b/c/";
				String[]split=str.split("/");				//split는 배열로 출력된다
				System.out.println(Arrays.toString(split));
				
				//메뉴명과 가격 나누기 
				for(int i = 0 ; i<menu.length ; i++){
					String[]menuarr=menu[i].split(" ");
					System.out.println("메뉴명: "+menuarr[0]+"\t가격 : "+menuarr[1]);
					
				}
				
				//TRIM
				str = "		문 자 열		";		//앞뒤 공백만 사라짐
				String trim = str.trim();
				System.out.println(trim);
				System.out.println("[" +str+ "]--->[" +trim+ "]");
				
				String id = "    myid";	//앞공백
				String password = "mypassword    ";//뒷공백
				System.out.println(id);
				System.out.println(password);
				System.out.println(id.trim());
				System.out.println(password.trim());
				
				//VALUE OF : String을 통해 사용됨
				int number = 10;
				str = number + ""; 		//자바에서는 문자열을 더하면 무조건 문자열이된다. " "도 문자열
				str = String.valueOf(number);
				System.out.println(number);
				
				
				
				
				
		
		}

}
