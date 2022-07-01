/*
프로그램 == SW ---------------> 실행 (cpu에 할당) --------------> App == 프로세스

운영체제(OS)
CPU(메모리)  더블클릭을 하면 프로그램이 cpu에 할당되고, 그때부터 프로세스가 되는 것이다.   
 
프로세스에서 실질적으로 작업을 수행하는
스레드[Thread]


- 단일스레드 ex) sum = sum+a;
- 멀티스레드 == 멀티 프로세스 ex) sum += a;
-> 컴이 발달하며 멀티스레드. 일개미가 많아져서 한번에 다다다닥.

프로세스 실행순서
1. 선점형 방식 : 우선순위 순서로 실행한다. 문제 -> 기아. 우선순위 낮은 얘는 진짜 끝까지 실행이 안되어버리는거야...
2. 시간분할 방식 (시분할 방식) -> 이게 가장 최신. 가장 오늘날의 것이다. 기존의 것에 시간을 나누어 골고루 시행하게 된다.

스레드 생명주기 -> 일개미. 
: 생성 -> 대기 -> 수행 -> 데드
[생성] -> new 생성된 스레드는 곧바로 [대기]탄다.
[대기] -> .start() 누르면 [수행]상태에 돌입한다.
[수행] -> "블록" == cpu(메모리) 할당을 방해한다, 실행이 잠시 멈춘다. ==> run() 함수에서 구현한다. 
[데드] -> 할당받은 메모리 반납 후 소멸한다.

 */

class Th1 extends Thread{ 
	
	public void run() { // Thread 클래스에 이미 있던 run 함수이다. 공개범위가 최소 부모 이상이어야 하기 때문에 public이다.
		for(int i = 1 ; i <= 10 ; i ++) {
			System.out.println("클래스로 만든 스레드" +i);
		}
		
	}
}

class Th2 implements Runnable { // 인터페이스 implement하면 오버라이드 해야지~~~

	@Override
	public void run() {
		for(int i=1 ; i <= 10 ; i++) {
			System.out.println("인터페이스로 만든 스레드" + i);
			try {
				Thread.sleep(2000); // 1000 = 1초. (1ms)
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} 
		}

	}
	
}

public class Java0821_Thread {

	public static void main(String[] args) {
		Th1 t1 = new Th1(); // Thread 클래스를 상속받아만든 스레드
		
		
		Th2 t2 = new Th2(); // 엥 바로 t2.start를 하면 안되는건가? 아 t2는 아직 스레드가 아니잖아. 그냥 runnable 인터페이스를 받았을 뿐.
		Thread t3 = new Thread(t2);
		// 큰 차이 없더라도 인터페이스로 스레드 쓴다. 다중상속때문에.
		
		t1.start();
		t1.setPriority(10);
		
		
		t3.start();
		// 왜 뒤섞여서 되냐? 위에서 아래로 쏘는 건 맞아. t1이 쏘고있는 중간에  t3가 시작되는데, t3가 중간에 다 쏴버릴수도 있고.
		// 근데 스레드끼리 속도가 다른건가? 같으면 지그재그로 나와야 하잖아.
	}

}
