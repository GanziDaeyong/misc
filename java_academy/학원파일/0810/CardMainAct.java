
// ATM �������̽�
//  : ����() �Ա�()
interface ATM{
	void inputMoney(); // [������]
	void outputMoney();
}

// ī���� �������̽�
//  : ����()
interface CU{
	void use();
}

// ī�� Ŭ���� -> 'ī��'��ü�� ����
//  : ����� �̸�
//  : �ݵ�� show()�� �����ؾ���
abstract class Card{
	String name;
	abstract void show();
}

// üũī�� Ŭ���� -> ATM,ī����
//  : �ܾ�
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
		System.out.println(this.name+"���� �ܾ�: "+this.bal);
	}

	@Override
	public void use() {
		// TODO Auto-generated method stub
		
	}
	
}

// �ſ�ī�� Ŭ���� -> ī����
//  : �ѵ�
class Credit extends Card implements CU{

	int lim;
	
	@Override
	public void use() {
		// TODO Auto-generated method stub
		
	}

	@Override
	void show() {
		System.out.println(this.name+"���� �ѵ�: "+this.lim);
	}
	
}


public class CardMainAct {

	public static void main(String[] args) {
		
	}

}
