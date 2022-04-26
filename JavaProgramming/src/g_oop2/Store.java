package g_oop2;

public class Store {

	public static void main(String[] args) {
	
		Desktop d = new Desktop();
		Aircon ac = new Aircon();
		TV tv = new TV();
		
		Customer c = new Customer();
		
		c.buy(d);
		c.buy(ac);
		c.buy(tv);
		}
		
		
	}
	
	
	
	
	class Product{
		String name;	//이름	//모든 물건은 각각의 이름과 가격이 다르므로 초기화할값을 외부에서 받아야함.->생성자
		int price; 		//가격
		
		Product(String name, int price){	//생성자(파라미터)
			this.name=name;
			this.price=price;
		}
		String getInfo(){
			return name + "("+price+"원)";
		}
	}
	
	class Desktop extends Product {	//파라미터까진 상속이 힘들기에 직접 입력해야함
		
		Desktop(){
			super("삼성 컴퓨터", 1000000);
		}
		void programming(){
			System.out.println("프로그램을 만듭니다.");
		}
	}
	class Aircon extends Product {
		Aircon(){
			super("위니아 에어컨", 5000000);
		}
		void setTemperature(){
			System.out.println("온도를 설정합니다.");
		}
	}
	class TV extends Product {
		TV(){
			super("LG TV",3000000);
		}
		void setChannel(){
			System.out.println("채널을 변경합니다.");
		}
	}
	class Customer{
		int money = 1000222;
		
		Product[]item = new Product[10];
		
		void buy(Product p){
			if(money < p.price){
				System.out.println("잔돈이 부족합니다.");
				return;
			}
			money -= p.price;
			
			for(int i = 0; i < item.length; i++){
				if(item[i]==null){
					item[i]=p;
					break;
				}
			}
			System.out.println(p.getInfo()+"를 구매했습니다.");
		}
}



