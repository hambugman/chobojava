package e_oop.restaurant;

public class Alba {

	
	//메서드 : 알바가 할 일 (보스가 알바에게 시킨 일)
	//파라미터 : 일을 하기 위해 필요한 것(보스가 알바에게 주는 것)
	//리턴타입 : 일을 하고 난 후 돌려주는 것(알바가 보스에게 주는 것)
	
	//주문을 받기 위해 필요한 것? 없음 (파라미터없음)
		
	//주문받은후 보스에게 줄 것? 주문서(리턴)->베스트는 주문서 클래스를 만들어서 타입으로 지정
		String[] order(){
			System.out.println("주문 하시겠습니까?");
			return new String[]{"짜장면","탕수육"};
		}
	//서빙하기위해 필요한것? 음식(파라미터)
		
	//서빙 후 보스에게 줄 것?없음(리턴)->베스트는 음식클래스 만들어서 타입으로 지정
		void serve(String[]foods){
			System.out.println("맛있게 드세요.");
		}
		
	//계산을 하기 위해 필요한 것? 주문서
		
		
	//계산 후 보스에게 줄것? 없음
		void pay(String[]order){
			System.out.println("2만원입니다. 안녕히가세요.");
		}
}
