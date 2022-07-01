
class Game{
	String name;
	static int sum;
	void addNum(int num) {
		sum+=num;
		if(sum>=100) {
			System.out.println("Æã!");
			System.out.println(this.name+" ÆÐ¹è!");
		}
	}
}

public class GameMainAct {

	public static void main(String[] args) {

		Game p1=new Game();
		p1.name="È«±æµ¿";
		p1.sum=0;
		p1.addNum(10);
		
		Game p2=new Game();
		p2.name="ÀÓ²©Á¤";
		p2.addNum(80);
		
		p1.addNum(20);
		/*
		Game p3=new Game();
		p3.name="¾Æ¹«¹«";
		p3.addNum(20);
		*/
	}

}





