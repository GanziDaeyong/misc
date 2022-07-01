import java.util.HashSet;
import java.util.Iterator;

public class Java0818_Set {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet s = new HashSet();
		s.add(10); // set 은 인덱스 구조가 아니다. 방향성이 없다.
		s.add(20);
		s.add(1000);
		s.add(400);
		s.add(22);
		s.add(20224);
		System.out.println(s);
		System.out.println(s.size());
		s.add(10);
		System.out.println(s);
		// 파이썬의 set처럼 중복을 허용치않는다. -> 아무리 add해도 중복은 X.
		
		Iterator itr = s.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}

}
