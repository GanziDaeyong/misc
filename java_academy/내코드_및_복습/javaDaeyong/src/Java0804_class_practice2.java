import java.util.Scanner;
import java.util.Arrays;
//class Book {
//	String name; // ������� == �ʵ� == �Ӽ�
//	String auth; // �������
//	Book(){ // �⺻������
//		
//	}
//	Book (String name, String auth){//�����ڸ��� Ŭ������� ���ƾ��Ѵ�. 
//		this.name = name; // ������ �����ε�
//		this.auth = auth;
//	}
//	void show() { // ����Լ� == �޼ҵ� == �޼���
//		System.out.println(this.name + "/" + this.auth);
//	}
//}

//class student {
//	String name;
//	String grade;
//	student() {
//	}
//	student (String n) {
//		n = name; // �� �ȵǳ�? ���Կ����� ���⶧�� �׷���. 
//		//���� name = n;���� �־��ָ� s2�� this�� ����Ǽ� �Ʒ� show()���� �۵��Ѵ�.
//	}
//	student(String name, String grade) {
//		this.name = name;
//		this.grade = grade;
//	}
//	void show() {
//		System.out.println("�̸�: " + this.name + "\t" + "����: " + this.grade);
//	} //this�� ���� ������ ��ü�����ڵ�. ��ü���� �ٸ� ���̱⿡..
//}

//class student2 {
//	String name;
//	int [] score; // 3���� ���� �Է�
//	
//	student2(String name, int Kor, int Eng, int Cal) {
//		this.name = name;
//		this.score = new int [3]; // �迭 �Ҵ��� �����ڿ���.
//		this.score[0] = Kor; 
//		this.score[1] = Eng; 
//		this.score[2] = Cal; // ���Կ����� ���� ����!!
//		
//	}
//	void check() {
//		System.out.println(Arrays.toString(score));
//		double avg = (score[0] + score[1] + score[2]) / 3.0 ; 
//		System.out.println("����� " + avg + "�� �Դϴ�");
//	} //this�� ���� ������ ��ü�����ڵ�. ��ü���� �ٸ� ���̱⿡..
//}

class vehicle {
	String ownername;
	String carname;
	double max_speed;
	double cur_speed;
	vehicle(String ownername, String carname, double max_speed) {
		this.ownername = ownername;
		this.carname = carname;
		this.max_speed = max_speed;
		this.cur_speed = 0;		
	}
	void show() {
		String msg = "����" + this.ownername + "����" + this.carname + "�ӵ���" + this.cur_speed + "�Դϴ�." ;
		System.out.println(msg);
	}
	void speedup() {
		this.cur_speed += 20;
		System.out.println("�ӵ��� 20km/h �����մϴ�.");
		
		if (this.cur_speed >= this.max_speed) {
			this.cur_speed = this.max_speed;
			System.out.println("�ְ�ӵ��Դϴ�.");
		}
	}
	void speeddown() {
		this.cur_speed -= 20;
		System.out.println("�ӵ��� 20km/h �����մϴ�.");
		if (this.cur_speed <= 0) {
			this.cur_speed = 0 ;
			System.out.println("�����߽��ϴ�.");
		}
	}
	
}


public class Java0804_class_practice2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
//		Book b1 = new Book(); // �� Book�� Ŭ����, Book()�� ������.
//		b1.name = "Harry Potter";
//		b1.auth = "J.K.Rolling";
//		Book b2 = new Book("���� �εη� ���� ��", "Jeorge Orwell");
//		b1.show();
//		b2.show(); // �������� �����̴�. �� �̰� �����ϳ�? �Լ��� ��ü�� ����� �����̴�.

// ��������
//		student s1 = new student();
//		s1.name = "�����";
//		s1.grade = "A-";
//		student s2 = new student("������"); 
//		s2.grade = "A0";
//		student s3 = new student("������", "A+");
//		s1.show();
//		s2.show();
//		s3.show();
		
		// �Է¹޴� �ڵ嵵 �߰��ϱ� -> to blog. int -> line�� ����ִ�
		// sc.nextLine(); �߰��ϴ� �� ����!
		// �ܼ� -> ���� -> �޸� �� ������������� ���캸�� �ȴ�.
		
// �������� 2
		
//		System.out.println("�̸��� �Է��ϼ���");
//		String name = sc.nextLine();
//		System.out.println("���� ������ �Է��ϼ���");
//		int Kor = sc.nextInt();
//		System.out.println("���� ������ �Է��ϼ���");
//		int Eng = sc.nextInt();
//		System.out.println("���� ������ �Է��ϼ���");
//		int Cal = sc.nextInt();
//		// �������� �迭�� �ְ� Ŭ�������� �迭 ��� �ϳ��� score [i] �� �����൵ �ȴ�.
//		
////		s4.score[0] = 100; ������ ���ڷ� ���� �ʰ� �̷������� �൵ �ȴ�.
////		
//		student2 s4 = new student2(name, Kor, Eng, Cal);
//		s4.check();
	
// �������� 3
		// �ڵ��� - ����ӵ�, �ְ�ӵ�, ����, ���ǵ��() -> �ӵ� 20���� , ���ǵ�ٿ�() -> �ӵ� 20����, ������º����ִ� show() -> ���� 00���� ���� �ӵ��� __�Դϴ�.
		// �ְ�ӵ����� ���� �� ����, 0���� ���� �� ����.
		// ��ü car �ϳ� ����.
		

		String ownername = sc.nextLine();
		String carname = sc.nextLine();
		double max_speed = sc.nextDouble();
		
		vehicle car = new vehicle (ownername, carname, max_speed);		
		car.show();
		car.speedup();
		car.speedup();
		car.speedup();
		car.speedup();
		car.speedup();
		car.speedup();
	//car.speeddown();
		
		// for blog
		// Ŭ�������� ���ڸ� �����̸�, ���̸�, �ְ�ӵ��� ����. �� �ӵ��� ���� ���� �׳� 0���� ����. Ŭ���� ������ cur_speed = 0����.
		// �׷� ���� ���� speedup �� down ���� ���� �ӵ��� ��������.
		// -> �̰� �� �� ���ǿ� ����� �ڵ��̴ϱ� �̷� ������ �⸣�°� �߿��ϴ�.
	}
	

}
