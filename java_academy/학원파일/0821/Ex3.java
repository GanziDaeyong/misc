
// ATM���� 3���� ����� ���� �����ҿ���
// AccountŬ����->����:12000�� => 5000���� �����Ҷ�, ���̴»�����

class TSys implements Runnable{

	Ticketting t=new Ticketting();
	@Override
	public void run() {
		// TODO Auto-generated method stub
		t.res();
	}
	
}
class Ticketting{
	static int ticket=2; // Ŭ���� ����
	public synchronized void res() { // [����ȭ]
		if(ticket>0) {
			System.out.println(Thread.currentThread().getName()+"Ƽ�Ϲ߱޼���!");
			ticket--;
		}
		else {
			System.out.println(Thread.currentThread().getName()+"Ƽ���̾����ϴ٤Ф�");
		}
	}
}
public class Ex3 {

	public static void main(String[] args) {
		
		// [����ȭ]
		TSys tsys=new TSys();
		Thread t1=new Thread(tsys,"ȫ�浿");
		Thread t2=new Thread(tsys,"�Ӳ���");
		Thread t3=new Thread(tsys,"�ƹ���");
		t1.start();
		t2.start();
		t3.start();
		
	}

}
