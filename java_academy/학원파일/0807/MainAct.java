
import java.util.Scanner; // ctrl+shift+O : 자동임포트

class Car{ // 클래스:기본단위,객체를 생성하는 틀
	 String name; // 멤버변수==필드==속성
	 int speed; // 인스턴스변수 <-> 클래스변수(공유)
	 int maxSpeed;
	 // static: "객체와 무관하게"
	 Car(){ // 생성자 오버로딩
		 this("이름입력안함",0);
	 }
	 Car(String name,int maxSpeed) {
		 // 생성자: 함수명==클래스명
		 this.name=name;
		 this.maxSpeed=maxSpeed;
		 this.speed=0;
	 }
	 void speedUp() { // 멤버함수==메서드==메소드
		 this.speed+=20;
		 if(this.speed>this.maxSpeed) {
			 System.out.println("과속!!!");
			 this.speed=this.maxSpeed;
		 }
	 }
	 void speedUp(int speed) { // 오버로딩
		 // -> 함수명같을때,
		 //    인자가다르면(자료형,개수) 선언허용
		 this.speed+=speed;
		 // this==자기자신객체
		 if(this.speed>this.maxSpeed) {
			 System.out.println("과속!!!");
			 this.speed=this.maxSpeed;
		 }
	 }
	 void speedDown() {
		 this.speed-=20;
		 if(this.speed<0) {
			 System.out.println("이미 멈춰있습니다...");
			 this.speed=0;
		 }
	 }
	 void show() {
		 System.out.println(this.name+"님의 차:["+this.speed+"/"+this.maxSpeed+"]");
	 }
}

public class MainAct {

	public static void main(String[] args) {
		// 객체지향언어의 4가지 특징
		// 1-추상화
		
		Scanner sc=new Scanner(System.in);
		Car c1=new Car(); // 디폴트생성자==기본생성자
		// => 생성자가 1개이상 만들어지면 더이상 기본제공xxx
		c1.name="홍길동";
		c1.maxSpeed=50;
		c1.show();
		c1.speedUp(100);
		c1.show();
		c1.speedDown();
		c1.speedDown();
		c1.speedDown();
		c1.show();
		
		Car c2=new Car("임꺽정",120);
	}

}
