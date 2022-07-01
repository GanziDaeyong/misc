
class Book{
	String name;
	String auth;
	// this()==생성자
	Book(String name,String auth){
		this.name=name;
		this.auth=auth;
	}
	Book(String name){
		this(name,"작자미상");
		// this(),super() => 가장 처음에 작성해야한다!
		//this.name=name;
		//this.auth="작자미상";
	}
	Book(){
		this("무제","작자미상");
		//this.name="무제";
		//this.auth="작자미상";
	}
}

public class ThisSuperMainAct {

	public static void main(String[] args) {
		Book b1=new Book();
		// ==Book b1=new Book("무제","작자미상");
		System.out.println(b1.name+" "+b1.auth);
		Book b2=new Book("책이름");
		System.out.println(b2.name+" "+b2.auth);
		Book b3=new Book("해리포터","J");
		System.out.println(b3.name+" "+b3.auth);
	}

}




