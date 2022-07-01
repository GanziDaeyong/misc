class Book{
	String name;
	String auth;
	// this.name
	// this() -> 내 이름으로 된 함수. 생성자가 되는 것이다.
	
	Book(String name, String auth){
		this.name = name;
		this.auth = auth;
	}
	Book(String name) {
		this(name, "작자미상");
		//this.name = name;
		//this.auth = "작자미상" ;
	}
	Book() {
		this("무제","작자미상"); // -> 얘가 7번 라인의 생성자를 다시 호출하는 것이다. 인자를 그대로 넘겨주고.
		// 인자가 두개짜리인 생성자를 부른다!!
		//this.name = "무제";
		//this.auth = "작자미상";
	}
}


public class Java0805_this_vs_super {

	public static void main(String[] args) {
		Book b1 = new Book();
//		16번 라인을 고려했을 때, Book b1 = new Book("무제", "작자미상")을 준 것과 같다.
		System.out.println(b1.name + " " + b1.auth);
		Book b2 = new Book("책이름");
		System.out.println(b2.name + " " + b2.auth);
		Book b3 = new Book("해리포터", "J");
		System.out.println(b3.name + " " + b3.auth);
		
// 기본생성자에서 생성자 호출하는 것의 장점 [생성자 키워드]
// 1. 사용자로 하여금 선택지를 준다.
// 2. 안정성 - null 같은 거 안줄 수 있다.
// 3. 코드가 간결해진다. 
// 생성자 키워드는 생성자 내에서 가장 첫 줄에 작성해야한다.
// 가령, 사용자가 입력하지 않은 값을 미리 정해놓음으로써 예외처리 방법으로도 쓸 수 있겠다.

	}

}
