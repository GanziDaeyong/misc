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
	// 배열 리스트와 달리 연결 리스트는 인덱싱방식이 아니고 잇는 것이기 때문에 유동성이 큰 경우 사용한다.
		
		LinkedList l = new LinkedList();
		l.add(100);
		l.add(0, 2100);
		System.out.println(l);
		l.addFirst(300);
		l.addLast(400);
		System.out.println(l);

		LinkedList<person4Linked> lp = new LinkedList();
		lp.add(new person4Linked("감자"));
		System.out.println(lp);
		
	}

}
