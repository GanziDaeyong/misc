import java.util.LinkedList;

class person4Linked {
	String name;
	person4Linked(String name) {
		this.name = name;
	}
public String toString() {
	return this.name;
}
}

public class Java0818_CollectionFrameWork3 {

	public static void main(String[] args) {
	// �迭 ����Ʈ�� �޸� ���� ����Ʈ�� �ε��̹���� �ƴϰ� �մ� ���̱� ������ �������� ū ��� ����Ѵ�.
		
		LinkedList l = new LinkedList();
		l.add(100);
		l.add(0, 2100);
		System.out.println(l);
		l.addFirst(300);
		l.addLast(400);
		System.out.println(l);

		LinkedList<person4Linked> lp = new LinkedList();
		lp.add(new person4Linked("����"));
		System.out.println(lp);
		
	}

}
