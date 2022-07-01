
class Monster{
	String name;
	int hp;
	int maxhp;
	void att() {
		this.hp-=20;
		if(this.hp<0) {
			this.hp=0;
		}
	}
	void heal() {
		this.hp+=20;
		if(this.hp>this.maxhp) {
			this.hp=this.maxhp;
		}
	}
	void show() {
		System.out.println(this.name+"의 체력은 "+this.hp);
	}
	Monster(String name){
		this.name=name;
		this.maxhp=100;
		this.hp=100;
	}
	Monster(String name,int maxhp){
		this.name=name;
		this.maxhp=maxhp;
		this.hp=maxhp;
	}
	// 멤버변수: 이름,체력,최대체력
	// 멤버함수: att()->-20 / heal()->+20 / show()->상태출력
	// 생성자-> 인자가 2개짜리(이름,최대체력) / 인자가 1개짜리(이름):100
	//  => 생성자 오버로딩
	
	// 객체 2개 생성
}

public class MonsterMainAct {

	public static void main(String[] args) {
		Monster m1=new Monster("몬스터1");
		Monster m2=new Monster("몬스터2",30);
		m1.heal();
		m2.att();
		m2.att();
		
		m1.show();
		m2.show();
	}

}