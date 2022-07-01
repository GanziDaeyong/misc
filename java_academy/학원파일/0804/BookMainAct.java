
class Book{ // 클래스==붕어빵틀==기본단위
	String name; // 멤버변수==필드==속성
	String auth;
	Book(){
		
	}
	Book(String name,String auth){
		this.name=name;
		this.auth=auth;
	}
	void show() { // 멤버함수==메소드==메서드
		System.out.println(this.name+" : "+this.auth);
	}
}

public class BookMainAct {

	public static void main(String[] args) {
		Book b1=new Book(); // 기본 생성자==디폴트 생성자
		b1.name="해리포터";
		b1.auth="J";
		Book b2=new Book("춘향전","작자미상"); // 생성자 오버로딩
		b1.show();
		b2.show();
	}

}