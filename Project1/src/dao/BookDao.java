package dao;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import util.JDBCUtil;

public class BookDao {
	
	// 싱글톤 패턴
	private BookDao(){
		
	}
	
	private static BookDao instance;
	
	public static BookDao getInstance(){
		if(instance == null){
			instance = new BookDao();
		}
		return instance;
	}
	
	public JDBCUtil jdbc = JDBCUtil.getInstance();
	
	
	
	public int insertBook(Map<String, Object> param){//책정보 입력
		String sql = "INSERT INTO BOOK(ISBN, BOOK_NAME, IMPORT_DATE, CORP, BOOK_WRITER)"
				+ "   VALUES (?, ?, ?, ?, ?)";
		
		List<Object> p = new ArrayList<>();
		p.add(param.get("ISBN"));
		p.add(param.get("BOOK_NAME"));
		p.add(param.get("IMPORT_DATE"));
		p.add(param.get("CORP"));
		p.add(param.get("BOOK_WRITER"));
		
		return jdbc.update(sql, p); // 몇 개의 행이 영향을 받았는지 리턴
	}
	

	//책정보수정
	public int updateBookInfo(String password,String userName,String hp){
		String sql ="UPDATE MEMBER"
				+ "		SET MEM_PASS='?',MEM_NAME='?',MEM_HP='?'"
				+ "	  WHERE MEM_CODE='?'";
		List<Object>param=new ArrayList<>();
		param.add(password);
		param.add(userName);
		param.add(hp);
				
		return jdbc.update(sql,param);
	}
	
}
