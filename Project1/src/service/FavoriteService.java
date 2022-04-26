package service;

import java.text.SimpleDateFormat;
import java.util.Date;

import dao.NoticeDao;

public class FavoriteService {

	//싱글턴패턴
	private FavoriteService(){};
	private static FavoriteService instance;
	public static FavoriteService getInstance(){
		if(instance == null){
			instance= new FavoriteService();
		}
		return instance;
	}
	
	//private FavoriteDao favoriteDao = FavoriteDao.getInstance();
	SimpleDateFormat format = new SimpleDateFormat("yyyy/MM/dd");
	Date time = new Date();
	
	
	
	
}
