import java.util.LinkedList;

class Person{
	String name;
	Person(String name){
		this.name=name;
	}
	public String toString() {
		return this.name+"��";
	}
}
public class LinkedListEx {

	public static void main(String[] args) {
		
		// �迭
		// �迭����Ʈ
		// ���Ḯ��Ʈ : �ε��̹��xxx
		//  => a�ڿ��� b, b�ڿ��� c, c�ڿ��� d, ...
		LinkedList l = new LinkedList();
		l.add(100);
		l.add(0, 200);
		System.out.println(l);
		l.addFirst(300);
		l.addLast(400);
		System.out.println(l);
		
		LinkedList<Person> lp=new LinkedList();
		lp.add(new Person("ȫ�浿"));
		lp.add(new Person("�Ӳ���"));
		System.out.println(lp);
		
	}

}




