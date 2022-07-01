
// 스레드


class Th1 extends Thread{
	public void run() {
		for(int i=1;i<=10;i++) {
			System.out.println("클래스로 만든 스레드 "+i);
		}
	}
}
class Th2 implements Runnable{

	@Override
	public void run() {
		for(int i=1;i<=10;i++) {
			System.out.println("인터페이스스레드 "+i);
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

		Th1 t1=new Th1(); // Thread클래스를 상속받아만든 스레드
		
		Th2 t2=new Th2();
		Thread t3=new Thread(t2);
		
		/*
		for(int i=1;i<=10;i++) {
			System.out.println("메인스레드: "+i);
		}
		*/
		
		t1.setPriority(1); // 디폴트 5
		t3.setPriority(10);
		t1.start(); // run()함수를 동작시킬때 start()로 호출
		t3.start();
		
	}

}
/*
프로그램==SW  --실행-->  App==프로세스

운영체제(OS)
CPU(메모리)

프로세스에서 실질적으로 작업을 수행하는
 스레드[Thread]

-단일 스레드 ex) sum=sum+a;
-멀티 스레드==멀티 프로세스 ex) sum+=a;

프로세스 실행순서
1. 선점형 방식: 우선순위 순서로 실행(기아)
2. 시간분할 방식(시분할 방식)

스레드 생명주기
 : 생성->대기->수행->데드
[생성]: new 생성된 스레드 곧바로 [대기]
[대기]:  .start()   [수행]된다.
[수행]: "블록"==cpu(메모리)할당을 방해,실행이 잠시 멈춤
             => run()함수에서 구현
[데드]: 할당받은 메모리 반납후 소멸
*/