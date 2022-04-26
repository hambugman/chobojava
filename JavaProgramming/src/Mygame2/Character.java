package Mygame2;

public class Character {	//추상메서드			

	 protected String name;		//이름
	 protected int hp;				//체력
	 protected int mp;				//정신력
	 protected int money;			//돈 
	//public Item []	items; 		//아이템/저주
	
	
	public Character(String name, int hp, int mp,int money){
		this.name = name;
		this.hp = hp;
		this.mp = mp;
		this.money = money;
		//this.items[]= new Item[10];
	}
	
	public void showInfo(){		//상태창
		System.out.println("========================================");
		System.out.println("================= 상   태  =================");
		System.out.println("========================================");
		System.out.println("이름 : "+name);
		System.out.println("체력 :  "+hp);
		System.out.println("정신력 :  "+mp);
		System.out.println("돈 :  "+money);
		}
}