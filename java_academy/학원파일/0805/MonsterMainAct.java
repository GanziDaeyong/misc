
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
		System.out.println(this.name+"�� ü���� "+this.hp);
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
	// �������: �̸�,ü��,�ִ�ü��
	// ����Լ�: att()->-20 / heal()->+20 / show()->�������
	// ������-> ���ڰ� 2��¥��(�̸�,�ִ�ü��) / ���ڰ� 1��¥��(�̸�):100
	//  => ������ �����ε�
	
	// ��ü 2�� ����
}

public class MonsterMainAct {

	public static void main(String[] args) {
		Monster m1=new Monster("����1");
		Monster m2=new Monster("����2",30);
		m1.heal();
		m2.att();
		m2.att();
		
		m1.show();
		m2.show();
	}

}