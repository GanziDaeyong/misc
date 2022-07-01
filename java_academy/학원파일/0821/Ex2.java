
// ������


class Th1 extends Thread{
	public void run() {
		for(int i=1;i<=10;i++) {
			System.out.println("Ŭ������ ���� ������ "+i);
		}
	}
}
class Th2 implements Runnable{

	@Override
	public void run() {
		for(int i=1;i<=10;i++) {
			System.out.println("�������̽������� "+i);
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
}
public class Ex2 {

	public static void main(String[] args) {

		Th1 t1=new Th1(); // ThreadŬ������ ��ӹ޾Ƹ��� ������
		
		Th2 t2=new Th2();
		Thread t3=new Thread(t2);
		
		/*
		for(int i=1;i<=10;i++) {
			System.out.println("���ν�����: "+i);
		}
		*/
		
		t1.setPriority(1); // ����Ʈ 5
		t3.setPriority(10);
		t1.start(); // run()�Լ��� ���۽�ų�� start()�� ȣ��
		t3.start();
		
	}

}
/*
���α׷�==SW  --����-->  App==���μ���

�ü��(OS)
CPU(�޸�)

���μ������� ���������� �۾��� �����ϴ�
 ������[Thread]

-���� ������ ex) sum=sum+a;
-��Ƽ ������==��Ƽ ���μ��� ex) sum+=a;

���μ��� �������
1. ������ ���: �켱���� ������ ����(���)
2. �ð����� ���(�ú��� ���)

������ �����ֱ�
 : ����->���->����->����
[����]: new ������ ������ ��ٷ� [���]
[���]:  .start()   [����]�ȴ�.
[����]: "���"==cpu(�޸�)�Ҵ��� ����,������ ��� ����
             => run()�Լ����� ����
[����]: �Ҵ���� �޸� �ݳ��� �Ҹ�
*/