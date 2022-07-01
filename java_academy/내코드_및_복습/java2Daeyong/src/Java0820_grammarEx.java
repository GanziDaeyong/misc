import java.util.Scanner;

public class Java0820_grammarEx {

	public static void main(String[] args) {
		// [예외처리]
		// 예외 == 문법적으로는 문제가 없으나, 실행중에 에러가 발생하는 코드.
		// ex1
		
		try {	// 예외가 발생해도, 프로그램은 진행시키고 싶을 때
		int a = 10, b = 0;
		System.out.println("야!");
		System.out.println(a/b);
		// 예외가 발생한다면 바로 [catch]로 이동한다.
		System.out.println("호");
		}
		// ex2
		catch(Exception e) {
			System.out.println("예외발생!");
		}
		int[] arr = {1,0};
		try {
			System.out.println(arr[0]/arr[1]);
			System.out.println(arr[2]); // 하나의 캐치문은 하나의 오류만 잡을 수 있다. 캐치문 여러개 쓸 수 있다.
		}
		catch(ArithmeticException e) { // 관용적으로 e를 쓴다. 그냥 e 써.
			System.out.println("나누기 1로 다시 진행하세요");
			System.out.println("예외발생1");
			System.out.println(e.getMessage());// 오류 내용을 알려준다.
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("예외발생2");
		} // 인터넷에 자바 예외클래스 치면 쫘라락 나온다. 두루뭉실하게 할지, 구체적으로 할지는 스스로 결정.
		catch(Exception e) {
			System.out.println("그외 예외발생"); // 보통은 이렇게 최상위클래스를 하나 둔다.##주의## 얘를 가장 마지막에 두어야 한다. 순차적으로 내려오거든.
			System.out.println(e.getMessage());
		}
		finally { // 예외가 발생해도, 발생하지 않아도 무조건 수행되는 구간이다.
			System.out.println("언제나 수행되는 구간.");
		}
		
//################################but, 실제로는 오류를 잡기 위해 하는 것이 아니라, 예외가 아닌 것을 예외처럼 처리하고 싶을 때 사용한다.#####################################
		Scanner sc = new Scanner (System.in);
		/*
		Exception ageEx = new Exception("나이는 1이상이어야 합니다.");
		try {
			System.out.println("나이입력");
			int age = sc.nextInt();
			if (age < 1) {
				throw ageEx;
			}
		}
		catch(Exception e) {
			System.out.println(e.getMessage());		
		}
		// 실무에서는 if 보다 정보가 많이 나온다. 로그를 사용하기 때문에..?
		
		*/
		
		// 학년입력
		
		Exception yearError = new Exception("학년은 1~6까지"); // 여기 입력하는게 get message인 샘이다.
		while (true) {
		try {
			System.out.println("학년입력");
			int year = sc.nextInt();
			if (year < 1 || year > 6) {
				throw yearError;
			}
			break; // 어차피 걸리면 바로 catch로 가니까.

		}
		catch (Exception e) { // 발생하는 오류를 e라는 변수로 두고, 그 e에 대해 getmessage.
			System.out.println(e.getMessage());
		}
		}
		//#########팁: 별로 중요치 않은, 메뉴 선택의 경우에도, if문으로 잡는것보다는 try catch가 낫다. 그게 컴퓨터가 스스로 기록하기 때문이다.
		
	}

}
