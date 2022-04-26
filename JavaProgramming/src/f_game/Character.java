package f_game;

public class Character {

	String name;		//이름
	int maxhp;			//최대체력
	int maxmp;		 	//최대마나
	int hp;				//체력
	int mp;				//마나
	int att;			//공격력
	int def;			//방어력
	int level;			//레벨 
	int exp;			//경험치
	Item[]items;  		//보유아이템
	
	Character(String name, int hp, int mp, int att, int def){
		this.name = name;
		this.maxhp = hp;
		this.maxmp = mp;
		this.hp = maxhp;
		this.mp = maxmp;
		this.att = att;
		this.def = def;
		this.level = 1;
		this.exp = 0;
		this.items = new Item[10];
	}
	
	void showInfo(){
		System.out.println("========================================");
		System.out.println("================= 상   태  =================");
		System.out.println("이름 :  "+name);
		System.out.println("레벨 :  "+level+"("+exp+ "/100)");
		System.out.println("체력 :  "+hp+"/"+maxhp);
		System.out.println("마나 :  "+mp+"/"+maxmp);
		System.out.println("공격:  "+att);
		System.out.println("방어:  "+def);
		System.out.println("===============아  이  템 ==================");
		for(int i =0; i<items.length; i++){
			if(items[i] !=null){
				System.out.println(items[i]);
			}
		}
		
		System.out.println("========================================");
	 }

	void attack(Monster m){
		int damage = att - m.def;
		damage = damage <= 0? 1: damage;
		m.hp = m.hp < damage ?	m.hp - m.hp : m.hp-damage;	//아예 감소하지 않게 하거나 1만 감소하게 만들던가 증감연산자 사용	
			System.out.println(name+"가 공격으로"+m.name+"에게"+damage+"만큼 데미지를 주었습니다.");
			System.out.println(m.name+"현재의 HP: "+m.hp); 
	}
	
	void getExp(int exp){
		System.out.println(exp+ "의 경험치를 획득하였습니다.");
		this.exp += exp;
		while(100 <= this.exp){
			levelUp();
			this.exp -= 100;
		}
	}
	
	void levelUp(){
		level ++;
		maxhp +=10;
		maxmp +=10;
		att += 5;
		def += 5;
		hp = maxhp;
		mp = maxmp;
		System.out.println("레벨이 올랐습니다."+"현재레벨"+level);	//능력치도 같이 상승시켜야한다.
	}
	
	void getItem(Item item){
		System.out.println(item.name+"을 획득하였습니다.");
		for (int i = 0 ; i< items.length ; i++){
			if(items[i] == null){
				items[i] = item;
				break;
			}
		}
		maxhp += item.hp;
		maxmp += item.mp;
		att += item.att;
		def += item.def	;	
		
		
		
		
		
	}
	
	
	
}



 