
class Person{
	String name;
	int num; // ex) 1234
	Person(String name){
		// ����Ʈ�ѹ�==1000
		this(name,1000);
	}
	Person(String name,int num){
		this.name=name;
		this.num=num;
	}
	void hello() {
		System.out.println("�ȳ��ϼ���!");
	}
}
class Student extends Person{
	int score1;
	int score2;
	double avg;
	Student(String name,int score1,int score2){
		super(name,1000);
		this.score1=score1;
		this.score2=score2;
		this.avg=(score1+score2)/2.0;
	}
	Student(String name,int num,int score1,int score2){
		super(name,num);
		this.score1=score1;
		this.score2=score2;
		this.avg=(score1+score2)/2.0;
	}
	void hello() {
		// �������̵�==������
		System.out.println("��������");
	}
	void show() {
		// ����(���)�� ����
		System.out.println(this.name+"�л��� ������ "+this.avg+"���Դϴ�.");
	}
}

public class PersonMainAct {

	public static void main(String[] args) {
		Person p=new Person("�θ�Ŭ����");
		p.hello();
		Student s=new Student("�ڽ�Ŭ����",70,80);
		s.hello();
		s.show();
	}

}







