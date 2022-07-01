import java.util.LinkedList;

class Person{
	String name;
	Person(String name){
		this.name=name;
	}
	public String toString() {
		return this.name+"님";
	}
}
public class LinkedListEx {

	public static void main(String[] args) {
		
		// 배열
		// 배열리스트
		// 연결리스트 : 인덱싱방식xxx
		//  => a뒤에는 b, b뒤에는 c, c뒤에는 d, ...
		LinkedList l = new LinkedList();
		l.add(100);
		l.add(0, 200);
		System.out.println(l);
		l.addFirst(300);
		l.addLast(400);
		System.out.println(l);
		
		LinkedList<Person> lp=new LinkedList();
		lp.add(new Person("홍길동"));
		lp.add(new Person("임꺽정"));
		System.out.println(lp);
		
	}

}




