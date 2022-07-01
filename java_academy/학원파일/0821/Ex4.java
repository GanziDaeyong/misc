
// ATM으로 3명의 사람이 돈을 인출할예정
// Account클래스->계좌:12000원 => 5000원씩 인출할때, 못뽑는사람출력

class ATM implements Runnable{

	Account a=new Account();
	@Override
	public void run() {
		a.outMoney();
	}
	
}
class Account{
	static int money=12000; // 공유자원
	public synchronized void outMoney() {
		if(money>=5000) {
			//System.out.println(Thread.currentThread().getName()+"님 인출");
			money-=5000;
		}
		else {
			System.out.println(Thread.currentThread().getName()+"님 인출실패!!!");
		}
	}
}
public class Ex4 {

	public static void main(String[] args) {
		ATM atm=new ATM();
		Thread t1=new Thread(atm,"김");
		Thread t2=new Thread(atm,"이");
		Thread t3=new Thread(atm,"박");
		t1.start();
		t2.start();
		t3.start();
		
	}

}
