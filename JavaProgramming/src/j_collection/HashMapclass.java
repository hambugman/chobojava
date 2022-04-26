package j_collection;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Set;

public class HashMapclass {

	public static void main(String[] args) {
		/*
		 * Object put (Object key, Object value): 지정된 키와 값을 저장한다.
		 * Object remove(Object key) : 지정된 키로 저장된 값과 키를 제거한다.
		 * Object get(Object key) : 지정된 키의 값(없으면 null)을 반환한다.
		 * Set keyset() : 저장된 모든 키를 Set으로 반환한다.
		 */
		
		
		HashMap<String, Object> map = new HashMap<String,Object>();//제네릭도 키와 값을 써야하기에 2개를 써야한다.
		//String 문자열 Object 모든 타입의 데이터를 받을수있음
		map.put("age", 10);//ArrayList는 add인 반면에 put을 사용
		map.put("name", "홍길동");
		map.put("date",new Date());//new date - 현재 시간을 표시하기 위한 클래스
		System.out.println(map);
		
		map.put("name","이순신");//Hashmap을 수정할땐 다른데이터로 다시 저장하면 덮어 쓰게됨
		System.out.println(map);
		
		map.remove("age");	//age삭제
		System.out.println(map);
		
		Object value = map.get("name");	//object타입의 value라는 키에 name을 넣음
		System.out.println(value);		//object로 이동시 String의 값을 쓸수없다.
		
//		System.out.println(value.substring(0,1)); value가 object이기에 String의 기술을 쓸수없다.
		System.out.println(((String)value).substring(0,1));//형변환을 통해서 value를 String으로 만듬.
		
		String str = (String)map.get("name");//애초에 미리 형변환을 하는것도 방법
		
		Set<String> keys = map.keySet(); //모든키가 keys에 담아넣음
		
		for(String key : keys){	//향상된 for문: 콜론뒤keys에서 값을 꺼내 앞에 있는 key에 저장하고 {}에 있는 문장을 실행함. 
			System.out.println(key+" : "+map.get(key));
		}
		//테이블의 구조를 표현할때 Hashmap을 주로 사용한다.
		//ArrayList로 전체를 저장하고 Hashmap으로 한줄씩 지정하면 테이블구조를 표현할수 있음.
		
		
		
		
		
		//JOBS 테이블
		HashMap<String, Object> job = new HashMap<String, Object>();
		job.put("JOB_ID","AD_PRES");
		job.put("JOB_TITLE","President");
		job.put("MIN_SALARY",20080);
		job.put("MAX_SALARY",40000);
		
		ArrayList<HashMap<String, Object>> jobs = new ArrayList<HashMap<String,Object>>();
		jobs.add(job);
		
		job = new HashMap<>();
		job.put("JOB_ID", "AD_VP");
		job.put("JOB_TITLE", "Administration Vice President");
		job.put("MIN_SALARY", 15000);
		job.put("MAX_SALARY", 30000);
		
		jobs.add(job);				
		System.out.println(jobs);
		
		
		HashMap<String, Object> lprod = new HashMap<String,Object>();
		ArrayList<HashMap<String, Object>> lprods = new ArrayList<HashMap<String,Object>>();
		lprod.put("LPROD_ID", 1);
		lprod.put("LPROD_GU", "p101");
		lprod.put("LPROD_NM", "컴퓨터제품");
		lprods.add(lprod);				//lprods라는 ArrayList를 생성하고 
	     					//lprods.add(lprod) : lprod를 lprods라는 ArrayList에 입력
		lprod = new HashMap<>();		// 매번 초기화를 해서 공란을 만들어 입력시킨다.
		lprod.put("LPROD_ID", 2);
		lprod.put("LPROD_GU", "p102");
		lprod.put("LPROD_NM", "전자제품");
		lprods.add(lprod);
		
		lprod = new HashMap<>();
		lprod.put("LPROD_ID", 3);
		lprod.put("LPROD_GU", "p201");
		lprod.put("LPROD_NM", "여성캐주얼");
		lprods.add(lprod);
		
		lprod = new HashMap<>();
		lprod.put("LPROD_ID", 4);
		lprod.put("LPROD_GU", "p202");
		lprod.put("LPROD_NM", "남성캐주얼");
		lprods.add(lprod);
		
		lprod = new HashMap<>();
		lprod.put("LPROD_ID", 5);
		lprod.put("LPROD_GU", "p301");
		lprod.put("LPROD_NM", "피혁잡화");
		lprods.add(lprod);
		
		lprod = new HashMap<>();
		lprod.put("LPROD_ID", 6);
		lprod.put("LPROD_GU", "p302");
		lprod.put("LPROD_NM", "화장품");
		lprods.add(lprod);
		
		lprod = new HashMap<>();
		lprod.put("LPROD_ID", 7);
		lprod.put("LPROD_GU", "p401");
		lprod.put("LPROD_NM", "음반/CD");
		lprods.add(lprod);
		
		lprod = new HashMap<>();
		lprod.put("LPROD_ID", 8);
		lprod.put("LPROD_GU", "p402");
		lprod.put("LPROD_NM", "도서");
		lprods.add(lprod);
		
		lprod = new HashMap<>();
		lprod.put("LPROD_ID", 9);
		lprod.put("LPROD_GU", "p403");
		lprod.put("LPROD_NM", "문구류");
		lprods.add(lprod);
		
		System.out.println("LPROD_ID\tLPROD_GU\tLPROD_NM");
		for(int i = 0; i < lprods.size(); i++){
			System.out.print(lprods.get(i).get("LPROD_ID"));
			System.out.print("\t"+lprods.get(i).get("LPROD_GU"));
			System.out.print("\t"+lprods.get(i).get("LPROD_NM"));
			System.out.println();
			}
		
		
		
		
		
		
	}

}
