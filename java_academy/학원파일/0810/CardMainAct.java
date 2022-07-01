
// ATM 인터페이스
//  : 인출() 입금()
interface ATM{
	void inputMoney(); // [강제성]
	void outputMoney();
}

// 카드사용 인터페이스
//  : 결제()
interface CU{
	void use();
}

// 카드 클래스 -> '카드'객체는 없음
//  : 사용자 이름
//  : 반드시 show()를 구현해야함
abstract class Card{
	String name;
	abstract void show();
}

// 체크카드 클래스 -> ATM,카드사용
//  : 잔액
class CheckCard extends Card implements ATM,CU{

	int bal;
	CheckCard(String name){
		this(name,0);
	}
	CheckCard(String name,int bal){
		this.name=name;
		this.bal=bal;
	}
	
	@Override
	public void inputMoney() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void outputMoney() {
		// TODO Auto-generated method stub
		
	}

	@Override
	void show() {
		System.out.println(this.name+"님의 잔액: "+this.bal);
	}

	@Override
	public void use() {
		// TODO Auto-generated method stub
		
	}
	
}

// 신용카드 클래스 -> 카드사용
//  : 한도
class Credit extends Card implements CU{

	int lim;
	
	@Override
	public void use() {
		// TODO Auto-generated method stub
		
	}

	@Override
	void show() {
		System.out.println(this.name+"님의 한도: "+this.lim);
	}
	
}


public class CardMainAct {

	public static void main(String[] args) {
		
	}

}
