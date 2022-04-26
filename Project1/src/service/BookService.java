package service;

import java.util.Map;

import dao.BookDao;

public class BookService {
	
	private static BookService instance;

	public static BookService getInstance() {
		if (instance == null) {
			instance = new BookService();
		}
		return instance;
	}
	
	private BookDao bookDao = BookDao.getInstance();
	
	
	
	
	
	
	
	
	public int bookInfo(Map<String, Object>book){
		while(true){
			System.out.println("===================책정보=================");
			System.out.println("ISBN"+book.get("ISBN"));
			System.out.println("책이름"+book.get("BOOK_NAME"));
			System.out.println("입고일"+book.get("IMPORT_DATE"));
			System.out.println("출판사"+book.get("CORP"));
			System.out.println("저자"+book.get("BOOK_WRITER"));
		}
	}

}
