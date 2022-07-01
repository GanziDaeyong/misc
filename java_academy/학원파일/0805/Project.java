
class Pocket{ // 부모클래스
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
			System.out.println("레벨업!");
			this.level++;
			this.exp-=100;
		}
	}
	void show() {
		System.out.println(this.name+": Lv."+this.level);
	}
}
class Pika extends Pocket{ // 자식클래스: 피카츄
	Pika(int level){
		super("피카츄",level);
	}
}
class Pa{ // 자식클래스: 파이리
	
}

public class Project {

	public static void main(String[] args) {
		 Pika p=new Pika(10);
		 p.levelUp(120);
		 p.show();
	}

}









