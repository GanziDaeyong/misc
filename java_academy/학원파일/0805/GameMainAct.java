
class Game{
	String name;
	static int sum;
	void addNum(int num) {
		sum+=num;
		if(sum>=100) {
			System.out.println("��!");
			System.out.println(this.name+" �й�!");
		}
	}
}

public class GameMainAct {

	public static void main(String[] args) {

		Game p1=new Game();
		p1.name="ȫ�浿";
		p1.sum=0;
		p1.addNum(10);
		
		Game p2=new Game();
		p2.name="�Ӳ���";
		p2.addNum(80);
		
		p1.addNum(20);
		/*
		Game p3=new Game();
		p3.name="�ƹ���";
		p3.addNum(20);
		*/
	}

}





