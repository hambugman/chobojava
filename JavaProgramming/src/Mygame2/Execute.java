package Mygame2;

import e_oop.ScanUtil;


public class Execute {
	
	Character c = null;					//주인공 선택하기 전 스탯창 초기화
										//엔딩 메서드
//--------------------------------------실행----------------------------------------------- 
	
	public static void main(String[] args){
		new Execute().start();
		}//main
		
//--------------------------------------첫화면------------------------------------------------		
	void start(){
				System.out.println();
				System.out.println("                                          r.rQ.                      ");
				System.out.println("                                          .BBBB                      ");
				System.out.println("                                           B5B:                      ");
				System.out.println("                 ......   .   ... .....     .BuQ            j:       ");
				System.out.println("    ..:ii77u1UU5riirJu1jYvJUvY1suY7vvvYB5BRirQSbBKPBgPBEBSBPPBr      ");
				System.out.println(" .BBBQQDXjs7ri:i:.:i:ii7Y7ris17rv777YjvQDQBSvKsBBEgQQKBgBjBvRB7      ");
				System.out.println("       .:r7Y7L7L77ir7Yr7r7777svrrrrv7YuKrY1r:BPB         ..7R7       ");
				System.out.println("                                           iZB:                      ");
				System.out.println("                                          QBqQ7                      ");
				System.out.println("                                          u::M5                      ");
				System.out.println("");
				System.out.println("");
		while(true){
				System.out.println("==================== 선택의 모험가 ========================");
				System.out.println();	
				System.out.println("========이 게임은 오로지 당신이 선택한 숫자으로만 진행됩니다. ========");
				System.out.println("=====주인공의 직업은  각각 체력과 정신력 돈이 다르게 분배되어있습니다 ====");
				System.out.println("======== 3가지 요소중 하나라도 0이되면 게임오버됩니다.=============");//증가와 감소폭은 10/30/50/100으로 넣는다.
				System.out.println();
				System.out.println("==최대한 옳은 선택을 통해 생존을 하며 당신의 미래를 쟁취하시길 바랍니다.==");
				System.out.println();
				System.out.println("=============   1.케릭터선택      2.종료      ==================");
				System.out.println("=======================================================");
				
				int input = 0 ;
				input = ScanUtil.nextInt();
				switch (input){
				case 1:
					select();
					break;
				case 2:
					System.out.println("종료되었습니다.");
					System.out.println(2);
					break;
					}
				}
			}//start

		
		//-----------------------------------케릭터 선택--------------------------------
		void select(){
			int input =0;
			System.out.println("<<<< 당신의 직업은 .... >>>>");
			System.out.println();
			System.out.println("현자-체력|100,정신력|200,돈|300");
			System.out.println("상인-체력|100,정신력|100,돈|500");
			System.out.println("전사-체력|200,정신력|100,돈|300");
			System.out.println("1.현자\t2.부자\t3.전사\t4.돌아감");
			input = ScanUtil.nextInt();
			switch (input){
			case 1:
				System.out.println("현자를 선택하셨습니다.");
				System.out.println("초기 체력:100 | 정신력:200  | 돈 :300 ");
				c = new Character (		//name,hp,mp,money
						"현자",
						100,
						200,
						300
						);
			    Story1();
				break;
			case 2:	
				System.out.println("상인을 선택하셨습니다.");
				System.out.println("체력:100 | 정신력:100  | 돈 :500 ");
				c = new Character(
						"상인",
						100,
						100,
						500
						);
				Story1();
				break;
			case 3:
				System.out.println("전사를 선택하셨습니다.");
				System.out.println("체력:200  | 정신력:100  | 돈 :300 ");
				c = new Character(
						"전사",
						200,
						100,
						300
						);
				Story1();
				break;
			case 4:
				System.out.println("메뉴로 돌아갑니다.");
				}
			}//select 
	
		
		//-----------------------스토리----------------------------------------------------
		void Story1(){			//스토리1
			while(true){	
				System.out.println("=====================================================");
				System.out.println();
				System.out.println();
				try{
					Thread.sleep(1000);					//출력문 시간조절 가능하게함 예외처리
				}catch (InterruptedException e){
					e.printStackTrace();
				}
				System.out.println("당신은 시작의 마을에서 길을 나선다. 그리고 ");
				try{
					Thread.sleep(1000);
				}catch (InterruptedException e){
					e.printStackTrace();
				}
				System.out.println("얼마가지 않아 길을 가던 도중 남루한 복장의 사람이 당신에게 다가옵니다.");
				try{
					Thread.sleep(1000);
				}catch (InterruptedException e){
					e.printStackTrace();
				}
				System.out.println("'저희 가족들이 굶고 있습니다.모험자님'");
				try{
					Thread.sleep(1000);
				}catch (InterruptedException e){
					e.printStackTrace();
				}
				System.out.println("'제발 한푼이라도 주신다면 감사합니다'");
				try{						
					Thread.sleep(1000);
				}catch (InterruptedException e){
					e.printStackTrace();
				}
				System.out.println(" 거지인것같아 보이는 그에게 당신은? ");
				try{
					Thread.sleep(1000);
				}catch (InterruptedException e){
					e.printStackTrace();
				}
				System.out.println();
				System.out.println("1. '이 돈으로 되겠습니까? 더 받으십시오.'");
				System.out.println("2. '적지만 받으십시오.'");
				System.out.println("3. '원 시작부터 재수가 없으려니...' 거지에게 침뱉고 간다 .");
				System.out.println();
				System.out.println("=============== 현 재 상 태 =================");
				System.out.println("|직업:"+c.name+"|체력:"+c.hp+"|정신력:"+c.mp+"|돈:"+c.money);
				System.out.println("=========================================");
				int input = 0;	
				input = ScanUtil.nextInt();
				switch (input){
				case 1:
					System.out.println("이 돈으로 되겠습니까? 더 받으십시오. (돈-70)");
					try{								
						Thread.sleep(1000);
					}catch (InterruptedException e){
						e.printStackTrace();
					}
					System.out.println("'감사합니다. 가진거라곤 저희집 가보뿐인 이 구슬이라도 받아주십시오.(get 신비한구슬(정신력+100)");
					try{
						Thread.sleep(1000);
					}catch (InterruptedException e){
						e.printStackTrace();
					}
					System.out.println("구슬을 건내준 그는 어딘가로 유유히 사라졌다.");
					try{
						Thread.sleep(1000);
					}catch (InterruptedException e){
						e.printStackTrace();
					}
					c.money-=70;
					c.mp+=100;
					Story2();
					break;
				case 2:
					System.out.println("'적지만 받으십시오.' (돈-30)");
					try{
						Thread.sleep(1000);
					}catch (InterruptedException e){
						e.printStackTrace();
					}
					System.out.println("돈을 받은 거지는 감사합니다를 연신외치며 유유히 사라져갔다.");
					try{
						Thread.sleep(1000);
					}catch (InterruptedException e){
						e.printStackTrace();
					}
					c.money-=30;
					Story2();
					break;
				case 3:
					System.out.println("'원 시작부터 재수가 없으려니...'거지에게 침뱉고 간다 .");
					try{
						Thread.sleep(1000);
					}catch (InterruptedException e){
						e.printStackTrace();
					}
					System.out.println("지나가는 순간 갑자기 뒷통수의 통증이 느껴지고 눈이 감긴다 ");
					try{
						Thread.sleep(1000);
					}catch (InterruptedException e){
						e.printStackTrace();
					}
					System.out.println("....잠시후");
					try{
						Thread.sleep(1000);
					}catch (InterruptedException e){
						e.printStackTrace();
					}
					System.out.println("눈을 뜬 순간 그는 내 짐 일부를 들고 사라졌다.");
					try{
						Thread.sleep(1000);
					}catch (InterruptedException e){
						e.printStackTrace();
					}
					System.out.println("(체력 -30,돈-50)");
					try{
						Thread.sleep(1000);
					}catch (InterruptedException e){
						e.printStackTrace();
					}
					c.hp-=30;
					c.money-=50;
					Story2();
					break;
							}//Story1.switch(input)
					   }//while
			     }//Story1
			
		void Story2 (){
			if(c.hp<=0){badend1();start();}			//수치가 0이 될시 배드엔딩후 스타트 장면으로 넘어감
			else if(c.mp<=0){badend2();start();}
			else if(c.money<=0){badend3();start();
			}else{
			while(true){	
			System.out.println("=====================================================");
			try{
				Thread.sleep(500);
			}catch (InterruptedException e){
				e.printStackTrace();
			}
			System.out.println("언덕을 지나가던 도중 동굴에서 작은 소리가 들려온다.");
			try{
				Thread.sleep(500);
			}catch (InterruptedException e){
				e.printStackTrace();
			}
			System.out.println("'살려주세요....제발 살려주세요...'");
			try{
				Thread.sleep(500);
			}catch (InterruptedException e){
				e.printStackTrace();
			}
			System.out.println("입구에서 안을 살펴보지만 보이지는 않고 소리만 들려온다");
			try{
				Thread.sleep(500);
			}catch (InterruptedException e){
				e.printStackTrace();
			}
			System.out.println(" 동굴에 무엇이 있는지 모르지만 들어가야할까?");
			try{
				Thread.sleep(500);
			}catch (InterruptedException e){
				e.printStackTrace();
			}
			System.out.println();
			System.out.println("1.구조 소리를 듣고 그냥 갈순 없다! 그대로 돌격한다.");
			try{
				Thread.sleep(500);
			}catch (InterruptedException e){
				e.printStackTrace();
			}
			System.out.println();
			System.out.println("2.무작정 들어가기에는 위험하다. 벽을 잡고 천천히 살피며 들어가자.");
			try{
				Thread.sleep(500);
			}catch (InterruptedException e){
				e.printStackTrace();
			}
			System.out.println();
			System.out.println("3.함정일지도 모른다. 그냥 지나친다.");
			try{
				Thread.sleep(500);
			}catch (InterruptedException e){
				e.printStackTrace();
			}
			System.out.println();
			System.out.println("=============== 현 재 상 태 =================");
			System.out.println("|직업:"+c.name+"|체력:"+c.hp+"|정신력:"+c.mp+"|돈:"+c.money);
			System.out.println("=========================================");
			int input = 0;	
			input = ScanUtil.nextInt();
			switch (input){
			case 1:
				System.out.println("구조 소리를 듣고 그냥 갈순 없다! 그대로 돌격한다.");
				System.out.println("동굴로 뛰어가던 당신, 어둠속에 있던 돌뿌리를 발견하지 못하는 바람에");
				System.out.println("그대로 넘어져 동굴속으로 굴러 들어가버렸다.");
				System.out.println("(체력-10,동굴로 입장)");
				c.hp -= 10;
				Story3_1();
				break;
			case 2:
				System.out.println("무작정 들어가기에는 위험하다. 벽을 잡고 천천히 살피며 들어가자.");
				System.out.println("한발 한발 내걷자 그 안에 있던 반딧불을 발견하게 되었고 그것들을 잡아");
				System.out.println("동굴을 밝히며 천천히 들어갔다.");
				System.out.println("반딧불획득(체력+30,정신력+50) ");
				c.hp += 30;
				c.mp += 50;
				Story3_1();
				break;
			case 3:
				System.out.println("함정일지도 모른다. 그냥 지나친다.");
				System.out.println("그렇게 동굴을 지나치자 그 앞에는 높은 산이 있었고,");
				System.out.println("다른 길이 없던 당신은 그 길을 따라올라갔다.");
				System.out.println("(체력-30)");
				c.hp-=30;
				Story3_2();
				break;
			case 4:
						}
			      }//while
			}//Story3
		}
		void Story3_1 (){//Story3_1동굴을 들어갈시
				if(c.hp<=0){badend1();start();}
				else if(c.mp<=0){badend2();start();}
				else if(c.money<=0){badend3();start();
				}else{
			while(true){	
			System.out.println("=====================================================");
			System.out.println();
			System.out.println("어찌저찌하야 동굴에 들어오게된 당신");
			System.out.println("얼마나 들어가 걸었을까...3시간? 5시간?");
			System.out.println("그렇게 어둠속을 걷던 도중 빛이 보여 뛰어 들어갔고,");
			System.out.println("빛나는 수정앞에 두개의 입구가 나뉜것을 이윽고 확인하게되었다.");
			System.out.println("각각의 입구에는 B와 D처럼 생긴 글자의 조각이 각각 위에 새겨져 있었다.");
			System.out.println("수정옆에는 낡은 팻말이 써있고, 먼지를 치우고 글을 보았다.");
			System.out.println();
			System.out.println("'인생은 B와D사이의 C이다. 가거라 당신이 선택한 곳으로'");
			System.out.println("1.B를 향해 들어간다.");
			System.out.println();
			System.out.println("2.D를 향해 들어간다.");
			System.out.println();
			System.out.println("=============== 현 재 상 태 =================");
			System.out.println("|직업:"+c.name+"|체력:"+c.hp+"|정신력:"+c.mp+"|돈:"+c.money);
			System.out.println("=========================================");
			int input = 0;	
			input = ScanUtil.nextInt();
			switch (input){
			case 1:
				System.out.println("B를 향해 들어간 당신, 앞이 막힌 곳에 다다르자,");
				System.out.println("'Birth라. 당신에게 축복을 내려주지'");
				System.out.println("소리와 함께 들어온 입구는 닫히고 천장에서 빛이 내려와 ");
				System.out.println("당신을 데리고 함께 그곳에서 사라집니다.");
				System.out.println("어느신의 축복(모든능력치+50)");
				c.hp+=50;
				c.mp+=50;
				c.money+=50;
				Story4();
				break;
			case 2:
				System.out.println("D를 향해 들어간 당신, 앞에 막힌 곳에 다다르자,");
				System.out.println("'DEATH. 죽음을 선택하다니 이상한 사림이군.'");
				System.out.println("어딘가에 들려온 소리와 함께 들어온 입구가 닫힌다.");
				System.out.println("이윽고 위에서 가시천장이 떨어지고 죽기살기로 출구를 찾던 당신은");
				System.out.println("어둠속에서 간신히 작은 구멍을 찾아서 그곳을 벗어납니다.");
				System.out.println("체력-50,정신력-30");
				c.hp-=50;
				c.mp-=50;
				Story4();
				break;
						}
			        }
				}
			}
		void Story3_2 (){
				if(c.hp<=0){badend1();start();}
				else if(c.mp<=0){badend2();start();}
				else if(c.money<=0){badend3();start();
				}else{//story3_2동굴을 들어가지 않았을시
			while(true){	
			System.out.println("=====================================================");
			System.out.println();
			System.out.println("계속 해서 산을 타고 계속 올라가다보니");
			System.out.println("한 무리의 산적이 나타났다.");
			System.out.println("'이봐 가진 것을 내놓는다면 살려주지. 어설픈반항은 하지말라고...'");
			System.out.println("두목으로 보이는 한명이 그리 이야기하며 투항을 요구한다");
			System.out.println("이 상황을 어찌 벗어나야할까.");
			System.out.println();
			System.out.println("1.'미쳤냐? 내가 투항을 하게?'바로 두목으로 보이는 이에게 돌격한다.");
			System.out.println();
			System.out.println("2.'가진게 이 70골드가 다요. 가져가시오.'");
			System.out.println();
			System.out.println("3.뒤도 돌아보지 않고 뛴다.");
			System.out.println();
			System.out.println("=============== 현 재 상 태 =================");
			System.out.println("|직업:"+c.name+"|체력:"+c.hp+"|정신력:"+c.mp+"|돈:"+c.money);
			System.out.println("=========================================");
			int input = 0;	
			input = ScanUtil.nextInt();
			switch (input){
			case 1:
				System.out.println("1.'미쳤냐? 내가 투항을 하게?'바로 두목으로 보이는 이에게 돌격한다.");
				System.out.println("산적두목을 바로 제압후 인질로 삼아 산을 내려왔고");
				System.out.println("두목을 그 자리서 죽인후 도망가다 숨어있던 산적의 일원에게 화살을 맞았다.");
				System.out.println("체력-100");
				c.hp-=100;
				Story4();
				break;
			case 2:
				System.out.println("'가진게 이 70골드가 다요. 가져가시오.'");
				System.out.println("산적은 내민 돈을 세더니 이윽고 무리를 이끌고 숲속으로 들어갔다");
				System.out.println("그렇게 한숨 돌린 와중에 한 산적이 몰래 와 한대때린후, 말한다.");
				System.out.println("'돈 더 갖고 있는데 거짓말을 하네?");
				System.out.println("결국 몰래 숨긴 돈도 가져가버렸다.");
				System.out.println("돈-200");
				c.money -= 200;
				Story4();
				break;
			case 3:
				System.out.println("뒤도 돌아보지 않고 뛴다.");
				System.out.println("뒤쫒아오는 산적들을 피해서 정신없이 왔던길을 되돌아서 내려갔다");
				System.out.println("결국 다시 동굴입구까지 돌아갔다.");
				System.out.println("동굴입구로 되돌아감.정신력 -50");
				c.mp -= 50;
				Story2();
				break;
					}
				}
			}
		}
		void Story4(){
			if(c.hp<=0){badend1();start();}
			else if(c.mp<=0){badend2();start();}
			else if(c.money<=0){badend3();start();
			}else{
			while(true){	
			System.out.println("=====================================================");
			System.out.println();
			System.out.println("산을 내려온 후, 커다란 가방을 들고 있던 사람이 있어 다가가보니");
			System.out.println("'아 저는 이 근처를 돌며 물건을 파는 행상인입니다.");
			System.out.println("'아마 산을 지나셨다면 제 특제 약이 피로를 씻어주는데 도움이 될겁니다.'");
			System.out.println("'무언가 필요하신게 있으신지?'");
			System.out.println("행상인 가방을 들고 있던 가방을 내려놓으면 물건을 소개시켜주었다.");
			System.out.println("무언가 필요한게 있을까?");
			System.out.println();
			System.out.println("1.특제 딸기 물약(체력+100,금-100");
			System.out.println();
			System.out.println("2.특제 사과 물약(정신력+100,금-100");
			System.out.println();
			System.out.println("3.그냥 지나친다.");
			System.out.println();
			System.out.println("=============== 현 재 상 태 =================");
			System.out.println("|직업:"+c.name+"|체력:"+c.hp+"|정신력:"+c.mp+"|돈:"+c.money);
			int input = 0;	
			input = ScanUtil.nextInt();
			switch (input){
			case 1:
				System.out.println("특제 딸기 물약을 구매하였다.금-100");
				System.out.println();
				c.money-=100;
				c.hp+=100;
				Story5();
				break;
			case 2:
				System.out.println("특제 사과 물약을 구매하였다.금-100");
				System.out.println();
				c.money-=100;
				c.mp+=100;
				Story5();
				break;
			case 3:
				System.out.println("그냥 지나친다.");
				System.out.println();
				Story5();
				break;
			case 4:
					}
				}
			}
		}
		void Story5(){
			if(c.hp<=0){badend1();start();}
			else if(c.mp<=0){badend2();start();}
			else if(c.money<=0){badend3();start();
			}else{
			while(true){	
			System.out.println("=====================================================");
			System.out.println();
			System.out.println("왕국에 들어가 일을 찾기 위해 길드를 살펴들어갔다.");
			System.out.println("늘 평온함을 유지하던 길드 사무관들이 바빠보여 좌초지종을 물었다.");
			System.out.println("현재 왕에 대규모의 마수가 ");
			System.out.println("");
			System.out.println();
			System.out.println("1.");
			System.out.println();
			System.out.println("2.");
			System.out.println();
			System.out.println("3.");
			System.out.println();
			System.out.println("=============== 현 재 상 태 =================");
			System.out.println("|직업:"+c.name+"|체력:"+c.hp+"|정신력:"+c.mp+"|돈:"+c.money);
			System.out.println("=========================================");
			int input = 0;	
			input = ScanUtil.nextInt();
			switch (input){
			case 1:
				System.out.println("");
				System.out.println("");
				Story6();
				break;
			case 2:
				System.out.println("");
				Story6();
				break;
			case 3:
				System.out.println("");
				System.out.println("");
				Story6();
				break;
			case 4:
						}
					}
				}
			}
		
		void Story6(){
			if(c.hp<=0){badend1();start();}
			else if(c.mp<=0){badend2();start();}
			else if(c.money<=0){badend3();start();
			}else{
			while(true){	
			System.out.println("=====================================================");
			System.out.println();
			System.out.println("왕국에 들어가");
			System.out.println("");
			System.out.println("");
			System.out.println("");
			System.out.println();
			System.out.println("1.");
			System.out.println();
			System.out.println("2.");
			System.out.println();
			System.out.println("3.");
			System.out.println();
			System.out.println("=============== 현 재 상 태 =================");
			System.out.println("|직업:"+c.name+"|체력:"+c.hp+"|정신력:"+c.mp+"|돈:"+c.money);
			System.out.println("=========================================");
			int input = 0;	
			input = ScanUtil.nextInt();
			switch (input){
			case 1:
				System.out.println("");
				System.out.println("");
				Story6();
				break;
			case 2:
				System.out.println("");
				Story6();
				break;
			case 3:
				System.out.println("");
				System.out.println("");
				Story6();
				break;
						}
					}
				}
			}
		//-----------------------------------엔딩------------------------------------------
		void badend1(){
			System.out.println("힘이 다한 당신은 아무도 모르는 이 곳에서 쓰러져 재가 되어갑니다.");
			System.out.println("Bad Ending - The place Nobody know");
			System.out.println("Game over");
			}
		
		void badend2(){
			System.out.println("정신이 미쳐버린 당신은 그 곳에서 알아듣기 힘든 소리를 지르며 ");
			System.out.println("그 후 그 모습이 홀연히 사라졌다고 한다.");
			System.out.println("Bad ending - Crazy");
			System.out.println("Game over");
			}
		
		void badend3(){
			System.out.println("돈이 다 떨어진 당신은 지나가는 사람들에게 구걸을 하며");
			System.out.println("지난날 자신의 과거를 후회하며 이 곳을 배회합니다.");
			System.out.println("Bad ending - Bagger");
			System.out.println("Game over");
		 	}
		
			
		

}//전체 메서드