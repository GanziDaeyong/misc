class Book{
	String name;
	String auth;
	// this.name
	// this() -> �� �̸����� �� �Լ�. �����ڰ� �Ǵ� ���̴�.
	
	Book(String name, String auth){
		this.name = name;
		this.auth = auth;
	}
	Book(String name) {
		this(name, "���ڹ̻�");
		//this.name = name;
		//this.auth = "���ڹ̻�" ;
	}
	Book() {
		this("����","���ڹ̻�"); // -> �갡 7�� ������ �����ڸ� �ٽ� ȣ���ϴ� ���̴�. ���ڸ� �״�� �Ѱ��ְ�.
		// ���ڰ� �ΰ�¥���� �����ڸ� �θ���!!
		//this.name = "����";
		//this.auth = "���ڹ̻�";
	}
}


public class Java0805_this_vs_super {

	public static void main(String[] args) {
		Book b1 = new Book();
//		16�� ������ ������� ��, Book b1 = new Book("����", "���ڹ̻�")�� �� �Ͱ� ����.
		System.out.println(b1.name + " " + b1.auth);
		Book b2 = new Book("å�̸�");
		System.out.println(b2.name + " " + b2.auth);
		Book b3 = new Book("�ظ�����", "J");
		System.out.println(b3.name + " " + b3.auth);
		
// �⺻�����ڿ��� ������ ȣ���ϴ� ���� ���� [������ Ű����]
// 1. ����ڷ� �Ͽ��� �������� �ش�.
// 2. ������ - null ���� �� ���� �� �ִ�.
// 3. �ڵ尡 ����������. 
// ������ Ű����� ������ ������ ���� ù �ٿ� �ۼ��ؾ��Ѵ�.
// ����, ����ڰ� �Է����� ���� ���� �̸� ���س������ν� ����ó�� ������ε� �� �� �ְڴ�.

	}

}
