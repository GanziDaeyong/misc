import java.util.LinkedList;
import java.util.Queue;

public class QueueEx {

	public static void main(String[] args) {
		
		Queue<Integer> q=new LinkedList();
		// [���Ḯ��Ʈ] ����� [ť]!!!
		q.offer(10); // '����'�� push()�� �ش�
		q.offer(20);
		System.out.println(q);
		q.poll(); // '����'�� pop()�� �ش�
		System.out.println(q);
		
	}

}




