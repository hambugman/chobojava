package f_game;

public class Monster {
	String name;	//이름
	int maxhp;		//최대체력
	int maxmp;		//최대마나
	int hp;			//체력
	int mp;			//마나
	int att;		//공격력
	int def;		//방어력
	Item[]items;  	//보유아이템
	
	

	Monster (String name, int hp, int mp, int att, int def, Item[]items){
		this.name = name;
		this.maxhp = hp;
		this.maxmp = mp;
		this.hp = maxhp;
		this.mp = maxmp;
		this.att = att;
		this.def = def;
		this.items = items;
		}
	
	void attack(Character c){				//몬스터 공격
		int damage = att - c.def;
		damage = damage <= 0? 1: damage;
		c.hp = c.hp < damage ?	c.hp - c.hp : c.hp-damage;	//아예 감소하지 않게 하거나 1만 감소하게 만들던가 증감연산자 사용	
			System.out.println(name+"가 공격으로"+c.name+"에게"+damage+"만큼 데미지를 주었습니다.");
			System.out.println(c.name+"현재의 HP: "+c.hp); 
		}
	
	Item itemdrop(){
		return items[(int)(Math.random()*items.length)];
	}
	
	
	
	
	
	
	
}
