
class Car{
	int speed;
	int maxSpeed;
	String name;
	Car(String name,int maxSpeed){
		this.name=name;
		this.maxSpeed=maxSpeed;
		this.speed=0; // 자동차 구매시, 멈춰있다.
	}
	void speedUp() {
		this.speed+=20;
		if(this.speed>this.maxSpeed) {
			System.out.println("과속경고!");
			this.speed=this.maxSpeed;
		}
	}
	void speedDown() {
		this.speed-=20;
		if(this.speed<0) {
			System.out.println("이미 정지했습니다.");
			this.speed=0;
		}
	}
	void show() {
		System.out.println(this.name+"님의 차량속도는 "+this.speed);
	}
}

public class CarMainAct {

	public static void main(String[] args) {
		
		Car car=new Car("홍길동",30);
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
