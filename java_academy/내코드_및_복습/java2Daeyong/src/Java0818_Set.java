import java.util.HashSet;
import java.util.Iterator;

public class Java0818_Set {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet s = new HashSet();
		s.add(10); // set �� �ε��� ������ �ƴϴ�. ���⼺�� ����.
		s.add(20);
		s.add(1000);
		s.add(400);
		s.add(22);
		s.add(20224);
		System.out.println(s);
		System.out.println(s.size());
		s.add(10);
		System.out.println(s);
		// ���̽��� setó�� �ߺ��� ���ġ�ʴ´�. -> �ƹ��� add�ص� �ߺ��� X.
		
		Iterator itr = s.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}

}
