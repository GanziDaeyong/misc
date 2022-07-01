import java.util.Scanner;

class Student{
	String name;
	int[] score;
	Student(){
		this.score=new int[3];
	}
	Student(String name,int[] data){
		this.name=name;
		this.score=new int[3];
		for(int i=0;i<this.score.length;i++) {
			this.score[i]=data[i];
		}
	}
	void show() {
		System.out.print(this.name+"�л��� ");
		for(int v:this.score) {
			System.out.print(v+"�� ");
		}
		System.out.println("�Դϴ�.");
	}
	void check() {
		int sum=0;
		for(int v:this.score) {
			sum+=v;
		}
		System.out.println(this.name+"�л��� ������ "+sum+"��");
		System.out.println("����� "+sum*1.0/this.score.length+"��");
	}
}

public class StudentMainAct {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		Student s1=new Student();
		System.out.print("�̸��Է�: ");
		String name=sc.nextLine();
		s1.name=name;
		for(int i=0;i<3;i++) {
			System.out.print("�����Է�: ");
			int score=sc.nextInt();
			s1.score[i]=score;
		}
		sc.nextLine();
		System.out.print("�̸��Է�: ");
		name=sc.nextLine();
		int[] data=new int[3];
		for(int i=0;i<3;i++) {
			System.out.print("�����Է�: ");
			data[i]=sc.nextInt();
		}
		Student s2=new Student(name,data);
		
		s1.show();
		s2.show();
		s1.check();
		s2.check();
	}

}









