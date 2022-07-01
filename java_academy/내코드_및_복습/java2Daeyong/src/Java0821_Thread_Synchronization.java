// ����ȭ - ������ ����!
/*
class TSys implements Runnable {

	Ticketting t = new Ticketting();

	@Override
	public void run() {
		t.res();

	}
}

class Ticketting {
	//�������� - �����ϰ��� �ϴ� ����� ���Ƶ� Ƽ�� ���� �����̹Ƿ� static�̴�.
	static int ticket = 2;
// ����ȭ�� ����� �ѹ��� ��ٴ� ���� ���� �ȳ���.
// ����ȭ�ϸ� ������ ����� �ɾ �ùٸ��� ���´�.
	public synchronized void res() {
		if(ticket > 0) {
			System.out.println(Thread.currentThread().getName()+"Ƽ�� �߱� ����"); // ���� ������ �������� �̸��� �˷��ּ���.
			ticket--;
		}
		else {
			System.out.println(Thread.currentThread().getName() + "Ƽ�� ����");
		}

	}
}


public class Java0821_Thread_Synchronization {

	public static void main(String[] args) {
		TSys tsys = new TSys();
		Thread t1 = new Thread(tsys,"ȫ�浿"); // �̷��� �̸����� (String) ������ �̸��� ������ �� �ִ�.
		Thread t2 = new Thread(tsys,"�Ӳ���");
		Thread t3 = new Thread(tsys,"�ƹ���");
		Thread t4 = new Thread(tsys,"��ö��");
		t1.start();
		t2.start();
		t3.start();
		t4.start();

	}

}
 */

//////////////////////////////////////������û���� �����غ���//////////////////////////////////////////////////

//ATM���� 3���� ������� ���� ������ �����̴�.
//Account Ŭ���� -> ����: 12000�� -> 5000���� ������ ��, ���̴� ����� ����ض�.


class TSys implements Runnable {

	Atm2 t = new Atm2();

	@Override
	public void run() {
		t.res();

	}
}

class Atm2 {
	//�������� - �����ϰ��� �ϴ� ����� ���Ƶ� Ƽ�� ���� �����̹Ƿ� static�̴�.
	static int m = 12000;
	// ����ȭ�� ����� �ѹ��� ��ٴ� ���� ���� �ȳ���.
	// ����ȭ�ϸ� ������ ����� �ɾ �ùٸ��� ���´�.
	public synchronized void res() {
		if(m >= 5000) {
			System.out.println(Thread.currentThread().getName()+"���� ����"); // ���� ������ �������� �̸��� �˷��ּ���.
			m -= 5000;
		}
		else {

			System.out.println(Thread.currentThread().getName() + "�ܾ� ����");
		}

	}
}


public class Java0821_Thread_Synchronization {

	public static void main(String[] args) {
		TSys tsys = new TSys();
		
		Thread t1 = new Thread(tsys,"ȫ�浿"); // �̷��� �̸����� (String) ������ �̸��� ������ �� �ִ�.
		Thread t2 = new Thread(tsys,"�Ӳ���"); // ����. ���� ���ڰ� ������ getName()���� ���� �� ���� ����.
		Thread t3 = new Thread(tsys,"�ƹ���");
		t1.start();
		t2.start();
		t3.start();

	}

}

