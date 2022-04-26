package k_jdbc;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class JDBCTest {

	public static void main(String[] args) {
		JDBCUtil jdbc = JDBCUtil.getInstance();
		/*
		 * Map<String, Object> selectOne(String sql)
		 * Map<String, Object> selectOne(String sql, List<Object> param)
		 * List<Map<String, Object>> selectList(String sql)
		 * List<Map<String, Object>> selectList(String sql, List<Object> param)
		 * int update(String sql)
		 * int update(String sql, List<Object> param)
		 */
		
		
		
		
		
//		String sql = "insert into tb_jdbc_board values (, ?, ?, ?, sysdate)";
		
		
		
		
		
		
		
		
//		String sql = "update cart set cart_qty = cart_qty - 1";
//		int result = jdbc.update(sql);
//		System.out.println(result);
		
//		String sql = "insert into cart values(?, ?, ?, ?)";
//		ArrayList<Object> param = new ArrayList<>();
//		//a001	2005040100001	P101000001	5
//		param.add("a001");
//		param.add("2005040100001");
//		param.add("P101000002");
//		param.add(10);
//		
//		int result = jdbc.update(sql, param);
//		System.out.println(result);
		
//		String sql = "select * from cart where cart_member = ?";
//		ArrayList<Object> param = new ArrayList<>();
//		param.add("a001");
//		
//		List<Map<String, Object>> list = jdbc.selectList(sql, param);
//		for(Map<String, Object> map : list){
//			System.out.println(map);
//		}
		
		
//		String sql = "select * from cart"
//				+ " where cart_member = ?"
//				+ " and cart_qty > ?";
//		ArrayList<Object> param = new ArrayList<>();
//		param.add("a001");
//		param.add(5);
//		
//		List<Map<String, Object>> list = jdbc.selectList(sql, param);
//		for(Map<String, Object> map : list){
//			System.out.println(map);
//		}
	}

}





