import java.util.ArrayList;
import java.util.Iterator;

public class Ex1 {

	public static void main(String[] args) {
		
		// 배열: 정적,삽입및삭제() 불리,탐색및검색() 유리_인덱싱방식
		
		// 컬렉션 프레임워크 == 자료구조
		// 리스트 :  배열리스트 / 연결리스트
		// 배열리스트: 삽입,삭제,탐색 등의 메서드를 미리 구현해놓은 JAVA식 배열
		// 연결리스트: 삽입및삭제() 유리,인덱싱방식xxx->탐색및검색() 불리
		
		int[] a1=new int[3];
		ArrayList a2=new ArrayList(3);
		a1[0]=10;
		a1[1]=20;
		a1[2]=30;
		//a1[3]=40; xxx int[] 정적이다.
		//System.out.println(a1);
		a2.add(100);
		a2.add(0, 200);
		a2.add(300);
		a2.add(400); // 동적이다.
		a2.add("ABC");
		System.out.println(a2);
		///
		for(int v:a1) {
			System.out.print(++v+" ");
		}
		System.out.println();
		for(int i=0;i<a1.length;i++) {
			System.out.print(a1[i]+" ");
		}
		System.out.println();
		///
		for(int i=0;i<a2.size();i++) {
			// 길이==크기
			System.out.print(a2.get(i)+" ");
		}
		System.out.println();
		// ☆★이터레이터(Iterator)☆★
		// 반복자
		Iterator itr=a2.iterator();
		while(itr.hasNext()) {
			System.out.print(itr.next()+" ");
		}
		System.out.println();
		
		// 제네릭(generic)
		// : 자료구조가 저장할수있는 데이터의 타입을 일반화
		ArrayList<Integer> a3=new ArrayList();
		a3.add(100);
		//a3.add("ABC");
		// -> 제네릭이 붙은 컬렉션프레임워크는 자료형을 맞춰야한다!
		System.out.println(a3);
		
	}

}









