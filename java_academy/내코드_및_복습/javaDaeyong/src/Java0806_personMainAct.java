class Person2 {
	String name;
	int num; // 971203
	Person2(String name, int num){
//		super();
		this.name = name;
		this.num = num;
		System.out.println("�̸�: " + this.name + "\n�ֹι�ȣ: " + this.num);
	}
	Person2(String name){
		this.name = name;
		this.num = 100000;
		// �⺻ num �� 100000
		System.out.println("�̸�: " + this.name + "\n�ֹι�ȣ: " + this.num);
	}
	void hello() {
		System.out.println("�ȳ��ϼ���. " + this.name + "�Դϴ�.");
	}
	
}

class Student2 extends Person2 {
	int mid_grade ; int final_grade ; double avg;
	
	Student2(String name, int mid_grade, int final_grade) {
		super(name);
		this.mid_grade = mid_grade;
		this.final_grade = final_grade;
		this.avg = (mid_grade + final_grade) / 2 ;
		System.out.println("�̸�: " + this.name + "\n�߰����: " + this.mid_grade + "\n�⸻���: " + this.final_grade);
		
	}
	Student2(String name, int num, int mid_grade, int final_grade) {
		super(name,num);
		this.mid_grade = mid_grade;
		this.final_grade = final_grade;
		this.avg = (mid_grade + final_grade) / 2 ;
		System.out.println("�̸�: " + this.name + "\n�ֹι�ȣ: " +this.num + "\n�߰����: " + this.mid_grade + "\n�⸻���: " + this.final_grade);
	}
	void hello() {
		System.out.println("�ȳ��ϼ���." + this.name + " �л� �Դϴ�.");
		// �������̵�
	}
	void show() {
		System.out.println("�̸�: " + this.name + "�������: " + this.avg);
		
		// ����
	}
}


///////////////////////�ڽ� ������ ��� ���� -> �θ𿡰� �⺻ �����ڸ� ���� ������ִ���(����) or �ʿ��� �κ��� super() �ϴ���.////////////////////////
///////////////////////�߿�. ������ �������̵� ���� �ʴ´�. ����� ���� (�������)�� ��� ������� �Ѵ�.///////////////////////////////////////////

public class Java0806_personMainAct {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person2 p1 = new Person2("�����", 971203);
		Person2 p2 = new Person2("�����");
		p2.hello();
		Student2 s1 = new Student2("�����", 971203, 100, 98);
		Student2 s2 = new Student2("�����", 100, 98);
		s2.hello();
		s2.show();
		
	}

}
