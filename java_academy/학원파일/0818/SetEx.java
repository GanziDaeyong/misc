import java.util.HashSet;
import java.util.Iterator;

public class SetEx {

	public static void main(String[] args) {
		
		// ����: [����]�� ����
		HashSet s=new HashSet();
		s.add(10);
		// add()�� �����ε��� �Լ��� ����.->[����]�� ���⶧��
		s.add(20);
		s.add(1);
		s.add(2);
		s.add(3);
		s.add(100);
		s.add(200);
		System.out.println(s);
		System.out.println(s.size());
		s.add(1); // �ߺ� ������ �߰�
		// �ߺ� �����ʹ� �߰������ʴ´�.
		System.out.println(s);
		System.out.println(s.size());
		Iterator itr=s.iterator();
		while(itr.hasNext()) {
			System.out.print(itr.next()+" ");
		}
		
	}

}




