import java.util.Arrays;
import java.util.Scanner;
public class Java0803_2 {

// 함수 == 메서드
//		 함수를 구현하는 자리.
//		 사용자 정의 함수.
//		 static 결과값자료형 함수명 (입력값자료명 변수명)
	
	
//	static void function (int num) {
//		System.out.println(num);
//	}
//		// void : 아무것도 없다.우리가 main을 통해 뭘 결과값을 내려는게 아니잖아.
//		// static : 객체와 무관한다.  
//		
	
//	static double fnc(double x, double y) {
//		double rst = x/y; 
//		return rst;
//	}
	
	
//	static void 연습문제4(int a, int b) {
//		if (a < b) {
//			System.out.println(b);
//		}
//		else if (a < b) {
//			System.out.println(a);	
//		}
//		else {
//			System.out.println("두 정수가 같습니다.");
//		}
//		
//	}
	
	
//	static void 연습문제5_v1(int a) {
//		int cnt = 0;
//		for (int i=1 ; i<=a ; i++) {
//			if (a%i == 0) {
//				cnt ++;
//			}
//		}
//		if (cnt == 2) {
//			System.out.println("소수");
//		}
//		else {
//			System.out.println("소수 아님");
//		}
//		
//	}
//	
//	static int 연습문제5_v2(int a) {
//		int cnt = 0;
//		for (int i=1 ; i<=a ; i++) {
//			if (a%i == 0) {
//				cnt ++;
//			}
//
//		}
//		return cnt;
//	}
	
//	static void 연습문제6(int a) {
//		
//		for (int b = 1; b <= a ; b++) {
//			int cnt = 0; // cnt 초기화 주의!!!
//			for (int c = 1; c <= b ; c++) {
//				if (b%c == 0) {
//					cnt ++;
//				}
//			}
//			if (cnt == 2) {
//				System.out.println(b);
//			}
//		}
//	}

	static void 연습문제6_v2(int a) {
		int cnt = 0;
		int i;
		for (i = 1 ; i <= a ; i ++) {
			if (a%i == 0) {
				cnt ++;
			}
		}
		if (cnt == 2) {
			System.out.println(a + " ");
		}
	}

//	static void fnc (int[] data) {
//		for (int v: data) {
//			System.out.println(v);
//		}
//	}
	
//	static void 연습문제7 (int[] arr) {
//		int max = arr[0];
//		int max_index = 0;
//		for (int i=1 ; i<5 ; i++) {
//			if (max < arr[i]) {
//				max = arr[i];
//				max_index = i;
//			}
//		
//		}
//		System.out.println(max);
//		System.out.println(max_index);	
//	} // return 은 하나씩밖에 안된다.
	

// 자바만의 꿀팁!!!!!!!
//	static void add(int a, int b) {
//		System.out.println(a+b);
//		System.out.println("정수 add호출");
//	}
//	static void add(double a, double b) {
//		System.out.println(a+b);	
//		System.out.println("실수 add호출");
//	}
	// 이런거 헷갈리잖아.
	public static void main(String[] args) { 
// main(String[] args) 인 이유.		
//		run -> run configurations 에서 arguments에
//		variable 입력하면 그를 args라는 문자열 배열으로 인식해서 값을 활용할 수도 있다.
//		이는 보통 외부 값을 사용할 때. 평소에는 쓰지 않는 기능이다.
		Scanner sc = new Scanner (System.in);
		
//		int input = sc.nextInt();
//		function(input);
//		
//		double a = sc.nextDouble();
//		double b = sc.nextDouble();
//		double div = a/b ;
//		System.out.println(div);
//		System.out.println(fnc(a,b));

// 함수는 왜쓰는데?
//		 1. 코드의 재사용성이 증가하기 때문이다. 그냥 갖다 쓰면 되니 편리하다.
//		 2. 오류의 파급효과를 줄일 수 있다. 함수만 고치면 되니까.
//		 3. 이는 비용 절감으로 이어진다.
//		 4. 또한 코드가 간결화된다. -> 이해와 넘겨받아 작업 쉽다.
		
// 연습문제4 - 두 정수 입력 둘중에 더 큰거 출력하는 함수 작성하기.
//		int input1 = sc.nextInt();
//		int input2 = sc.nextInt();
//		연습문제4(input1, input2);
//		// 함수 내에서 출력할지, 리턴해서 후에 출력할지는 노상관. 후자가 더 좋은 습관이긴 하지.
		
// 연습문제5
//		int input = sc.nextInt();
//		연습문제5_v1(input);
//		//아래처럼 약수 개수만 리턴해서 따로 출력해줘도 됨. 함수가 어디까지 커버할지는 자유.
//		int 약수개수 = 연습문제5_v2(input);
//		if (약수개수 == 2) {
//			System.out.println("소수");
//		}
//		else {
//			System.out.println("소수 아님");
//		}
		
// 연습문제6 - 1부터 num까지 소수를 모두 출력해주세요. 함수를 여러번 반복해서 쓸 거다.
		int input = sc.nextInt();
		// [소수인지 아닌지 판별하는 함수]
		
		//연습문제6(input);
		for(int i = 1; i <= input ; i ++) {
			연습문제6_v2(i); // input 번 실행된다. for 문 안이니까.
		}
///////////////////////이거 디버그///////////////////////////////////////////////////		
///////////////////////////////////////////////////////////////////////////////////////
//		int [] arr = new int [3];
//		for (int i = 0 ; i < 3 ; i ++) {
//			arr[i] = sc.nextInt();
//		}
//		fnc(arr);
		
		
// 연습문제 7 - 5개의 요소 배열 main()에서 생성. 해당 배열을 함수에 보내면 최대값과 그 위치를 출력하는 함수.
		
//		int[] arr = new int [5];
//		for (int i = 0 ; i < 5 ; i ++) {
//			arr[i] = sc.nextInt();		
//		}
//		연습문제7(arr);

// 자바만의 꿀팁!! 비슷한 함수가 있을 때 뭐써야 할지 헷갈리면 어쩌나.
// 자바는 함수명 중복이 가능하다!!!! 다만 인자 수가 다르거나 인자 자료형이 달라야 한다.
// 함수명이 똑같을 때 인자 갯수나 자료형 다르면 허용해주는 걸 [오버로딩]이라 한다. // 중요
// 알고보니 println 도 오버로딩 이용하는 거였다.
//		double a, b;
//		a = 4.7;
//		b = 6.4;
//		add(a,b);
//		int c, d;
//		c = 3;
//		d = 5;
//		add(c,d); 
		
		
	}

}
