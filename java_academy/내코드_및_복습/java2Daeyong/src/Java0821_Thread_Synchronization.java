// 동기화 - 스레드 연습!
/*
class TSys implements Runnable {

	Ticketting t = new Ticketting();

	@Override
	public void run() {
		t.res();

	}
}

class Ticketting {
	//예약진행 - 예약하고자 하는 사람은 많아도 티켓 수는 고정이므로 static이다.
	static int ticket = 2;
// 동기화를 해줘야 한번에 우다닥 들어가서 오류 안난다.
// 동기화하면 잠시잠시 블록을 걸어서 올바르게 나온다.
	public synchronized void res() {
		if(ticket > 0) {
			System.out.println(Thread.currentThread().getName()+"티켓 발급 성공"); // 현재 접근한 쓰레드의 이름을 알려주세요.
			ticket--;
		}
		else {
			System.out.println(Thread.currentThread().getName() + "티겟 없음");
		}

	}
}


public class Java0821_Thread_Synchronization {

	public static void main(String[] args) {
		TSys tsys = new TSys();
		Thread t1 = new Thread(tsys,"홍길동"); // 이렇게 이름으로 (String) 스레드 이름을 구현할 수 있다.
		Thread t2 = new Thread(tsys,"임꺽정");
		Thread t3 = new Thread(tsys,"아무무");
		Thread t4 = new Thread(tsys,"김철수");
		t1.start();
		t2.start();
		t3.start();
		t4.start();

	}

}
 */

//////////////////////////////////////수강신청으로 연습해보기//////////////////////////////////////////////////

//ATM으로 3명의 사람들이 돈을 인출할 예정이다.
//Account 클래스 -> 계좌: 12000원 -> 5000원씩 인출할 때, 못뽑는 사람을 출력해라.


class TSys implements Runnable {

	Atm2 t = new Atm2();

	@Override
	public void run() {
		t.res();

	}
}

class Atm2 {
	//예약진행 - 예약하고자 하는 사람은 많아도 티켓 수는 고정이므로 static이다.
	static int m = 12000;
	// 동기화를 해줘야 한번에 우다닥 들어가서 오류 안난다.
	// 동기화하면 잠시잠시 블록을 걸어서 올바르게 나온다.
	public synchronized void res() {
		if(m >= 5000) {
			System.out.println(Thread.currentThread().getName()+"인출 성공"); // 현재 접근한 쓰레드의 이름을 알려주세요.
			m -= 5000;
		}
		else {

			System.out.println(Thread.currentThread().getName() + "잔액 없음");
		}

	}
}


public class Java0821_Thread_Synchronization {

	public static void main(String[] args) {
		TSys tsys = new TSys();
		
		Thread t1 = new Thread(tsys,"홍길동"); // 이렇게 이름으로 (String) 스레드 이름을 구현할 수 있다.
		Thread t2 = new Thread(tsys,"임꺽정"); // 질문. 여기 인자가 저절로 getName()으로 들어가는 건 어케 알지.
		Thread t3 = new Thread(tsys,"아무무");
		t1.start();
		t2.start();
		t3.start();

	}

}

