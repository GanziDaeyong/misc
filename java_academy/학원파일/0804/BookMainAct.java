
class Book{ // Ŭ����==�ؾƲ==�⺻����
	String name; // �������==�ʵ�==�Ӽ�
	String auth;
	Book(){
		
	}
	Book(String name,String auth){
		this.name=name;
		this.auth=auth;
	}
	void show() { // ����Լ�==�޼ҵ�==�޼���
		System.out.println(this.name+" : "+this.auth);
	}
}

public class BookMainAct {

	public static void main(String[] args) {
		Book b1=new Book(); // �⺻ ������==����Ʈ ������
		b1.name="�ظ�����";
		b1.auth="J";
		Book b2=new Book("������","���ڹ̻�"); // ������ �����ε�
		b1.show();
		b2.show();
	}

}