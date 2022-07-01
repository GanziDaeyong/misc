
// ATM���� 3���� ����� ���� �����ҿ���
// AccountŬ����->����:12000�� => 5000���� �����Ҷ�, ���̴»�����

class ATM implements Runnable{

	Account a=new Account();
	@Override
	public void run() {
		a.outMoney();
	}
	
}
class Account{
	static int money=12000; // �����ڿ�
	public synchronized void outMoney() {
		if(money>=5000) {
			//System.out.println(Thread.currentThread().getName()+"�� ����");
			money-=5000;
		}
		else {
			System.out.println(Thread.currentThread().getName()+"�� �������!!!");
		}
	}
}
public class Ex4 {

	public static void main(String[] args) {
		ATM atm=new ATM();
		Thread t1=new Thread(atm,"��");
		Thread t2=new Thread(atm,"��");
		Thread t3=new Thread(atm,"��");
		t1.start();
		t2.start();
		t3.start();
		
	}

}
