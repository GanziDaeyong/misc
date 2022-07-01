class Person2 {
	String name;
	int num; // 971203
	Person2(String name, int num){
//		super();
		this.name = name;
		this.num = num;
		System.out.println("이름: " + this.name + "\n주민번호: " + this.num);
	}
	Person2(String name){
		this.name = name;
		this.num = 100000;
		// 기본 num 은 100000
		System.out.println("이름: " + this.name + "\n주민번호: " + this.num);
	}
	void hello() {
		System.out.println("안녕하세요. " + this.name + "입니다.");
	}
	
}

class Student2 extends Person2 {
	int mid_grade ; int final_grade ; double avg;
	
	Student2(String name, int mid_grade, int final_grade) {
		super(name);
		this.mid_grade = mid_grade;
		this.final_grade = final_grade;
		this.avg = (mid_grade + final_grade) / 2 ;
		System.out.println("이름: " + this.name + "\n중간고사: " + this.mid_grade + "\n기말고사: " + this.final_grade);
		
	}
	Student2(String name, int num, int mid_grade, int final_grade) {
		super(name,num);
		this.mid_grade = mid_grade;
		this.final_grade = final_grade;
		this.avg = (mid_grade + final_grade) / 2 ;
		System.out.println("이름: " + this.name + "\n주민번호: " +this.num + "\n중간고사: " + this.mid_grade + "\n기말고사: " + this.final_grade);
	}
	void hello() {
		System.out.println("안녕하세요." + this.name + " 학생 입니다.");
		// 오버라이딩
	}
	void show() {
		System.out.println("이름: " + this.name + "성적평균: " + this.avg);
		
		// 성적
	}
}


///////////////////////자식 생성자 상속 문제 -> 부모에게 기본 생성자를 새로 만들어주던지(비추) or 필요한 부분을 super() 하던지.////////////////////////
///////////////////////중요. 변수는 오버라이딩 되지 않는다. 공통된 변수 (멤버변수)는 모두 지워줘야 한다.///////////////////////////////////////////

public class Java0806_personMainAct {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person2 p1 = new Person2("정대용", 971203);
		Person2 p2 = new Person2("정대용");
		p2.hello();
		Student2 s1 = new Student2("정대용", 971203, 100, 98);
		Student2 s2 = new Student2("정대용", 100, 98);
		s2.hello();
		s2.show();
		
	}

}
