
class Pocket{ // �θ�Ŭ����
	String name;
	int level;
	int exp;
	Pocket(String name,int level){
		this.name=name;
		this.level=level;
		this.exp=0;
	}
	void levelUp(int exp) {
		this.exp+=exp;
		if(this.exp>=100) {
			System.out.println("������!");
			this.level++;
			this.exp-=100;
		}
	}
	void show() {
		System.out.println(this.name+": Lv."+this.level);
	}
}
class Pika extends Pocket{ // �ڽ�Ŭ����: ��ī��
	Pika(int level){
		super("��ī��",level);
	}
}
class Pa{ // �ڽ�Ŭ����: ���̸�
	
}

public class Project {

	public static void main(String[] args) {
		 Pika p=new Pika(10);
		 p.levelUp(120);
		 p.show();
	}

}









