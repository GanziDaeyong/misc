/*
객체지향언어의 특징
1. [추상화]  클래스 -> 인스턴스화 이런게 추상화 과정인듯.


오버로딩의 대표적인 사례 -> println.

클래스 : 객체를 생성하기 위한 툴이다.
(클래스)---------->(인스턴스화==객체화)--------->(인스턴스==객체)
			 	       생성자 -> 함수
*/

import java.util.Scanner; // Ctrl + shift + o  -> 자동임포트

class Car{ // 클래스: 기본단위, 객체생성 틀
	String name; // 멤버변수 == 필드 == 속성
	int speed; // 얘네는 전부 인스턴스 변수이다. == 객체변수. 객체마다 개별적인 값을 갖기 때문이다. <-> 클래스 변수. 클래스 변수는 모든 인스턴스가 그 값을 공유한다.
	int maxspeed;
	//static int maxSpeed; 클래스변수 : "객체와 무관하게"
	
	Car() { // 생성자 오버로딩
		//this.speed = 0;
		this("이름입력안함", 0, 0);
	}
	
	Car(String name, int speed, int maxspeed) { // 생성자 오버로딩
		this.name = name;
		this.speed = speed;
		this.maxspeed= maxspeed;
	}
	
	
	void speedUp() { // 멤버함수 == 메서드
		this.speed += 20;
		if (this.speed >= this.maxspeed) {
			System.out.println("과속");
			this.speed = this.maxspeed;
		}
	}
	void speedUp(int speed) { // 오버로딩 -> 함수명이 같고 인자가 다르면 (자료형, 개수) 선언 허용
		this.speed += speed;
		if (this.speed >= this.maxspeed) {
			System.out.println("과속");
			this.speed = this.maxspeed;
		}
	}
	void speedDown() {
		this.speed -= 20;
		if (this.speed <= 0) {
			System.out.println("정차합니다.");
			this.speed = 0;
		}
	}
	void show() {
		System.out.println(this.speed +"\t"+ this.name);
		
	}

}


public class Java0807 {
	// 객체지향 언어의 4가지 특징
	// 추상화

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		Car c1 = new Car("대용",0,0); // 디폴트생성자 == 기본생성자
		// 디폴트생성자 특: 생성자 하나라도 만들면 삐져서 사라져버림.
//		c1.name = "대용";
//		c1.speed = 0;
//		c1.maxspeed = 50;
		c1.show();
//		c1.speedUp();
		c1.speedUp(50);
		c1.speedDown();
		c1.show();
	}

}
