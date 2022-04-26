package i_api;

import java.util.Arrays;

import e_oop.ScanUtil;

public class SetComma {

	public static void main(String[] args) {
		//숫자를 입력받아 입력받은 숫자에 3자리마다 콤마(,)를 붙여 출력해주세요.
		//123,456,789
		//콤마는 앞에서 붙는게 아닌 뒷자리에서 붙고 3자리마다 콤마를 붙임
		//문자열이 첫자리부터 3씩 곱한 자리
		//인덱스에서 뽑는다면 1을 더하고 곱하기 3자리씩한 자리에 넣는다 인덱스의 시작은 0부터이기에 
		
		System.out.println("숫자입력>");
		 String number = ScanUtil.nextLine();	//3개를 넣을때마다 자동으로 ,입력
		 String number2="";	
		 	int count =0;
		 	for(int i = number.length()-1 ; i>=0 ;i--){
		 		//1234567
		 		//7654321
		 		number2 = number.charAt(i)+	number2;
		 		count++;
		 		if(count %3 ==0 && count != number.length()){
		 			number2 = "," + number2;
		 		}
		 		
		 	}
		  System.out.println(number2);
		}

	}	

		