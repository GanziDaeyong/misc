import java.util.LinkedList;
import java.util.Queue;

public class Java0818_Queue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Queue<Integer> q = new LinkedList();
		// 연결리스트 기반의 [큐]!!! -> 꼭 이렇게 써주어야 한다. 
		
		q.offer(10);
		q.offer(20);
		System.out.println(q);
		q.poll(); // 스택의 pop과 같다. 
		
		////////////////////////방향 조심해라!! 스택과 반대다.
	}

}
