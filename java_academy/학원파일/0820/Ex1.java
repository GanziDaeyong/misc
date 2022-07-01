import java.util.Scanner;

public class Ex1 {

	public static void main(String[] args) {
		/*
		// [예외처리]
		// 예외==문법적으로는 문제가 없으나, 실행중에 에러가 발생하는 코드

		try { // 예외가 발생해도, 프로그램은 진행시키고싶을때!
			int a=10,b=0;
			System.out.println("야");
			//System.out.println(a/b);
			// 예외가 발생한다면 [바로] catch문으로 이동
			System.out.println("호");
		}
		catch(Exception e) {
			System.out.println("예외발생!");
		}

		int[] arr= {1,0};
		try {
			System.out.println(arr[0]/arr[1]);
			System.out.println(arr[2]);
		}
		catch(ArithmeticException e) {
			System.out.println("예외발생1");
			System.out.println(e.getMessage());
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("예외발생2");
			System.out.println(e.getMessage());
		}
		catch(Exception e) {
			System.out.println("그외의 예외발생");
			System.out.println(e.getMessage());
		}
		finally {
			System.out.println("언제나수행되는구간");
		}

		// 실제로는 예외가 아닌것을 예외처럼 처리하고싶을때
		Scanner sc=new Scanner(System.in);
		Exception ageEx =new Exception("나이는 1이상 입력");
		try {
			System.out.print("나이입력: ");
			int age=sc.nextInt();
			if(age<1) {
				// 예외발생시켜야함
				throw ageEx;
			}
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
		 */
		// 학년입력: 1~6 => 다시 입력
		// "학년은 1~6까지 존재합니다."
		Scanner sc=new Scanner(System.in);
		Exception gradeEx =new Exception("학년은 1~6까지 존재합니다.");
		while(true) {
			try {
				System.out.print("학년입력: ");
				int grade=sc.nextInt();
				if(1>grade || grade>6) {
					throw gradeEx;
				}
				break;
			}
			catch(Exception e) {
				System.out.println(e.getMessage());
			}
		}
	}

}
