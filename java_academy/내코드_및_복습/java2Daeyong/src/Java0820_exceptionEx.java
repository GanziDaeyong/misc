//###############함수의 오류를 main에서 처리하기 / class를 사용하여 직접 오류 설정하기##############

class myException extends Exception {
	myException (String message) {
		super(message); // 이미 부모(Exception)에 있기 때문에 전달해주는 것. super로.
	}
}


public class Java0820_exceptionEx {
	
	static void fnc1() {
		int a = 10, b= 0;
		System.out.println(a/b);
	}
	static void fnc2() throws Exception { // 함수에서 예외가 발생하더라도, 일단 무시할거야. main()에서 처리할게. 이게 throws이다.
		Exception ageEx = new Exception("나이예외");
		throw ageEx;
		
	}
	static void fnc3() throws myException {
		throw new myException("내가만든예외");
		
	}
	

	public static void main(String[] args) {
		

		
		try {
			//fnc1();
			//fnc2();
			fnc3(); // 객체나 클래스함수 아니라 그냥 함수.
			
			
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}

	}

}
