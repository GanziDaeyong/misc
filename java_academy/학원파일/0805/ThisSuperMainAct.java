
class Book{
	String name;
	String auth;
	// this()==������
	Book(String name,String auth){
		this.name=name;
		this.auth=auth;
	}
	Book(String name){
		this(name,"���ڹ̻�");
		// this(),super() => ���� ó���� �ۼ��ؾ��Ѵ�!
		//this.name=name;
		//this.auth="���ڹ̻�";
	}
	Book(){
		this("����","���ڹ̻�");
		//this.name="����";
		//this.auth="���ڹ̻�";
	}
}

public class ThisSuperMainAct {

	public static void main(String[] args) {
		Book b1=new Book();
		// ==Book b1=new Book("����","���ڹ̻�");
		System.out.println(b1.name+" "+b1.auth);
		Book b2=new Book("å�̸�");
		System.out.println(b2.name+" "+b2.auth);
		Book b3=new Book("�ظ�����","J");
		System.out.println(b3.name+" "+b3.auth);
	}

}




