
class Person{
	String name;
	int num; // ex) 1234
	Person(String name){
		// 디폴트넘버==1000
		this(name,1000);
	}
	Person(String name,int num){
		this.name=name;
		this.num=num;
	}
	void hello() {
		System.out.println("안녕하세요!");
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
		// 오버라이딩==재정의
		System.out.println("ㅎㅇㅎㅇ");
	}
	void show() {
		// 성적(평균)을 공개
		System.out.println(this.name+"학생의 성적은 "+this.avg+"점입니다.");
	}
}

public class PersonMainAct {

	public static void main(String[] args) {
		Person p=new Person("부모클래스");
		p.hello();
		Student s=new Student("자식클래스",70,80);
		s.hello();
		s.show();
	}

}







