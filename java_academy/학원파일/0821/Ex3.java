
// ATM으로 3명의 사람이 돈을 인출할예정
// Account클래스->계좌:12000원 => 5000원씩 인출할때, 못뽑는사람출력

class TSys implements Runnable{

	Ticketting t=new Ticketting();
	@Override
	public void run() {
		// TODO Auto-generated method stub
		t.res();
	}
	
}
class Ticketting{
	static int ticket=2; // 클래스 변수
	public synchronized void res() { // [동기화]
		if(ticket>0) {
			System.out.println(Thread.currentThread().getName()+"티켓발급성공!");
			ticket--;
		}
		else {
			System.out.println(Thread.currentThread().getName()+"티켓이없습니다ㅠㅠ");
		}
	}
}
public class Ex3 {

	public static void main(String[] args) {
		
		// [동기화]
		TSys tsys=new TSys();
		Thread t1=new Thread(tsys,"홍길동");
		Thread t2=new Thread(tsys,"임꺽정");
		Thread t3=new Thread(tsys,"아무무");
		t1.start();
		t2.start();
		t3.start();
		
	}

}
