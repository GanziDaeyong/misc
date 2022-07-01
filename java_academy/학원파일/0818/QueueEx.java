import java.util.LinkedList;
import java.util.Queue;

public class QueueEx {

	public static void main(String[] args) {
		
		Queue<Integer> q=new LinkedList();
		// [연결리스트] 기반의 [큐]!!!
		q.offer(10); // '스택'의 push()에 해당
		q.offer(20);
		System.out.println(q);
		q.poll(); // '스택'의 pop()에 해당
		System.out.println(q);
		
	}

}




