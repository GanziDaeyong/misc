import java.util.LinkedList;
import java.util.Queue;

public class Java0818_Queue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Queue<Integer> q = new LinkedList();
		// ���Ḯ��Ʈ ����� [ť]!!! -> �� �̷��� ���־�� �Ѵ�. 
		
		q.offer(10);
		q.offer(20);
		System.out.println(q);
		q.poll(); // ������ pop�� ����. 
		
		////////////////////////���� �����ض�!! ���ð� �ݴ��.
	}

}
