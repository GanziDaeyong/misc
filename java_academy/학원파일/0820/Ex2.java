
class MyException extends Exception{
	MyException(String message){
		super(message);
	}
}
public class Ex2 {

	static void fnc1() {
		int a=10,b=0;
		System.out.println(a/b);
	}
	static void fnc2() throws Exception{
		// 함수에서 예외가 발생하더라도,
		// 일단무시->main()에서 처리하겠다!
		Exception ageEx=new Exception("나이예외");
		throw ageEx;
	}
	static void fnc3() throws MyException{
		throw new MyException("내가만든예외");
	}

	public static void main(String[] args) {

		try {
			//fnc1();
			//fnc2();
			fnc3();
		}
		catch(Exception e){
			System.out.println(e.getMessage());
		}

	}

}
