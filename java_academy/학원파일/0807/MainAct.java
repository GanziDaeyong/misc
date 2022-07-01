
import java.util.Scanner; // ctrl+shift+O : �ڵ�����Ʈ

class Car{ // Ŭ����:�⺻����,��ü�� �����ϴ� Ʋ
	 String name; // �������==�ʵ�==�Ӽ�
	 int speed; // �ν��Ͻ����� <-> Ŭ��������(����)
	 int maxSpeed;
	 // static: "��ü�� �����ϰ�"
	 Car(){ // ������ �����ε�
		 this("�̸��Է¾���",0);
	 }
	 Car(String name,int maxSpeed) {
		 // ������: �Լ���==Ŭ������
		 this.name=name;
		 this.maxSpeed=maxSpeed;
		 this.speed=0;
	 }
	 void speedUp() { // ����Լ�==�޼���==�޼ҵ�
		 this.speed+=20;
		 if(this.speed>this.maxSpeed) {
			 System.out.println("����!!!");
			 this.speed=this.maxSpeed;
		 }
	 }
	 void speedUp(int speed) { // �����ε�
		 // -> �Լ�������,
		 //    ���ڰ��ٸ���(�ڷ���,����) �������
		 this.speed+=speed;
		 // this==�ڱ��ڽŰ�ü
		 if(this.speed>this.maxSpeed) {
			 System.out.println("����!!!");
			 this.speed=this.maxSpeed;
		 }
	 }
	 void speedDown() {
		 this.speed-=20;
		 if(this.speed<0) {
			 System.out.println("�̹� �����ֽ��ϴ�...");
			 this.speed=0;
		 }
	 }
	 void show() {
		 System.out.println(this.name+"���� ��:["+this.speed+"/"+this.maxSpeed+"]");
	 }
}

public class MainAct {

	public static void main(String[] args) {
		// ��ü�������� 4���� Ư¡
		// 1-�߻�ȭ
		
		Scanner sc=new Scanner(System.in);
		Car c1=new Car(); // ����Ʈ������==�⺻������
		// => �����ڰ� 1���̻� ��������� ���̻� �⺻����xxx
		c1.name="ȫ�浿";
		c1.maxSpeed=50;
		c1.show();
		c1.speedUp(100);
		c1.show();
		c1.speedDown();
		c1.speedDown();
		c1.speedDown();
		c1.show();
		
		Car c2=new Car("�Ӳ���",120);
	}

}
