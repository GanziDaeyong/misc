import java.util.HashSet;
import java.util.Iterator;

public class SetEx {

	public static void main(String[] args) {
		
		// 집합: [순서]가 없음
		HashSet s=new HashSet();
		s.add(10);
		// add()의 오버로딩된 함수가 없다.->[순서]가 없기때문
		s.add(20);
		s.add(1);
		s.add(2);
		s.add(3);
		s.add(100);
		s.add(200);
		System.out.println(s);
		System.out.println(s.size());
		s.add(1); // 중복 데이터 추가
		// 중복 데이터는 추가되지않는다.
		System.out.println(s);
		System.out.println(s.size());
		Iterator itr=s.iterator();
		while(itr.hasNext()) {
			System.out.print(itr.next()+" ");
		}
		
	}

}




