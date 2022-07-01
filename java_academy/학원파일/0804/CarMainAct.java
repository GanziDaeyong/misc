
class Car{
	int speed;
	int maxSpeed;
	String name;
	Car(String name,int maxSpeed){
		this.name=name;
		this.maxSpeed=maxSpeed;
		this.speed=0; // �ڵ��� ���Ž�, �����ִ�.
	}
	void speedUp() {
		this.speed+=20;
		if(this.speed>this.maxSpeed) {
			System.out.println("���Ӱ��!");
			this.speed=this.maxSpeed;
		}
	}
	void speedDown() {
		this.speed-=20;
		if(this.speed<0) {
			System.out.println("�̹� �����߽��ϴ�.");
			this.speed=0;
		}
	}
	void show() {
		System.out.println(this.name+"���� �����ӵ��� "+this.speed);
	}
}

public class CarMainAct {

	public static void main(String[] args) {
		
		Car car=new Car("ȫ�浿",30);
		car.show();
		
		car.speedUp();
		car.show();
		
		car.speedUp();
		car.show();
		
		car.speedDown();
		car.show();
		
		car.speedDown();
		car.show();
	}

}
