package i_api;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularExpression {
	
	public static void main(String[] args) {
		/*
		 * 정규표현식: 문자열의 패턴을 검사하는 표현식
		 * 
		 * 
		 * ^	뒷문자로 시작
		 * $	앞문자로 종료
		 * .	임의의 문자 (줄바꿈 제외)
		 * *	앞문자가 0개 이상
		 * +	앞문자가 1개 이상
		 * ?	앞문자가 없거나 1개
		 * []	문자의 집합이나 범위([a-z]:a부터 z까지, [^a-z]:a부터 z가 아닌것)
		 * {}	앞 문자의 갯수({2}:2개, {2,4}:2개 이상 4개이하)
		 * ()	그룹화 (1개의 문자처럼 인식)
		 * |	OR연산
		 * \s	공백, 탭, 줄바꿈
		 * \S	공백, 탭, 줄바꿈이 아닌 문자
		 * \w	알파벳이나 숫자
		 * \W	알파벳이나 숫자가 아닌 문자
		 * \d	숫자
		 * \D	숫자가 아닌 문자
		 * (?i) 뒷 문자의 대소문자 구분 안함
		 * \	정규 표현식에서 사용되는 특수문자 표현
		 */
		
		String str = "abc123";
//		String regex = "[a-z]{3}[0-9]{1,3}";		//정규표현식에는 공백이 들어가선안된다.공백도 문자열이기때문
//		String regex = "[a-z0-9]+";		//대괄호안에 범위를 붙여서 조정할수잇다.
		String regex = "\\w*";		// \는 탈출문자이기때문에 2개 넣었음
		
		Pattern p = Pattern.compile(regex);
		Matcher m =p.matcher(str);
		System.out.println(m.matches());
		
		//아이디, 전화번화, 이메일 주소의 유효성을 검사하는 정규 표현식을 만들어주세요.
		
		//아이디-
		String regexId = "[a-z0-9_-]{5,20}";//5~20 영문 숫자 특수기호(_)(-)만 사용가능, 공백/탭/줄바꿈 아닌 문자
		
		Pattern p1 = Pattern.compile(regexId);
		Matcher m2 = p1.matcher(regexId);
		System.out.println(m2.matches());
		
		//전화번호
		String regexnum = "^0\\d{1,3}-\\d{3,4}-\\d{4}";	//알파뱃,숫자,공백/탭/줄바꿈 X
		//이메일주소의 유효성
		String regexEmail ="[a-z0-9_-]{5,20}@[a-zA-Z]+\\.(?i)(com|net|org|([a-z]{2}\\.kr))$";	//영문대소문자,숫자,@들어가야함,공백/탭/줄바꿈 X		
				
		
		
		
		
		
		
	}
	
}
