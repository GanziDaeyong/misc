import java.util.Scanner;
// Ctrl + shift + o -> 자동 임포트 단축키.

public class Java0728{

	public static void main(String[] args) {
//주석 
		// 주석 - 코더끼리 소통용
		/*
		 *  슬래시 별이 시작지점, 별 슬래시가 끝지점. 여러줄 주석.
		 */
		
		
// 기본 출력법
		System.out.print("안녕~");
		System.out.println("안녕하세요~");
		// print 함수는 줄 바꿈을 제공하지 않는데, ln은 기본 제공된다. 
		// sysou + CTRL + Space + Enter 가 println 단축키
		
		
// 변수 -> 정보 저장 시 자료형 명시해야한다. 
		int i = 10; // 정수
		double d = 3.14 ; // 실수
		char c = 'a' ; // 문자 -> 작은 따옴표 이용한다.
		String s = "abc" ; // 문자열
		Boolean b = true ; // 진위형
		//	자료형 변수명 = 값; 이 형식을 지켜야 한다.
		//	변수명 규칙 - 숫자를 쓸 순 있지만 숫자로 시작해서는 안된다.
		//	- 띄어쓰기 안된다. 대신 underbar. 언더바와 달러표시 외 특수문자는 안된다.
		//	대소문자를 구분한다.
		//	이미 있는 문자는 안된다. (파이썬과 달리 갱신 안되는듯.)
		//	식별자와 키워드(예약어)로 구성된다.
		
		
// 기본 덧셈 해보기
		int x = 10 ;
		int y = 20 ;
		int sum = x + y ; 
		System.out.println(sum);
		//	코드가 쉬울수록 정확히 알아라.
		//	한 라인에 연산자가 두 개 존재한다. +와 = 중 =(대입 연산자) 우선순위가 낮다. 그래서 + 한 후 = 이 들어가는 것이다.
	
		
// 입출력
		//	Scanner 클래스에서 sc를 생성한다.
		//	자바에서 입력을 받고싶다면, scanner을 먼저 만들어주어야 한다. ctrl shift o 이용해서 자동임포트 해주자.
		//	scanner도 클래스이다. 차이는 우리가 만든 건 mainact고 얘는 자바 자체제공인거고.
		//Scanner sc = new Scanner(System.in);
		//int num1 = sc.nextInt();
		//double num2 = sc.nextDouble();
		//System.out.println(num1);
		//System.out.println(num2);
		//	console의 빨간네모 -> 진행중인데, 뭔가를 기다리고 있는 것이다. 우리가 직접 num1 과 num2에 들어갈 내용을 콘솔 창에 쳐주면 마무리된다.
		//	스캐너를 하나만 만들어놔도 밑에서 여러번 이용가능하다.
		
		
//	상수 -> 변하지 않는 수
		//	함수(), 변수
		//	앞에 final을 붙여주면 상수로 선언한다. 이는 앞으로 바꿀 수 없다.
		final double rate = 0.3 ;
		final double PI = 3.141592 ;
	
		
// 대입연산자
		int a = 1 ;
		System.out.println(a);
		a = 11;
		//	대입연산자: = 오른쪽의 값을 = 기준 왼쪽의 변수에 대입하는 연산자이다. 변수 = 값 11 -> 11=a; 안된다.
		//	= 방향을 가진 연산자이다.
		System.out.println(a) ;
		
//	형 변환
		int number = (int)10.123 ;
		//	형을 명시했다고 해서 명시적 형 변환이라 한다. 주로 큰 데이터를 작은 데 넣을 때.
		System.out.println(number);
		// 자동 형변환. 주로 작은 데이터를 큰 데 넣을 때.
		double number2 = 3 ;
		System.out.println(number2);
		// 데이터를 다룰 때에는 반드시 자료형을 맞춰서 작성해야 한다. 형변환 믿고 까불지 마.
		// 실무에서 유지 보수 정도, 공인 시험에서나 쓰이지 형변환 거의 안쓴다.
		
// 연습문제 실수 2개 입력 - 합 출력하기!
		//Scanner sc = new Scanner(System.in); //참고로 여기서 Scanner는 마치 int처럼. "형"이다.
		//System.out.print("첫 번째 실수를 입력하세요 :");
		//double n1 = sc.nextDouble();
		//System.out.print("두 번째 실수를 입력하세요 :");
		//double n2 = sc.nextDouble();
		//double rst = n1 + n2 ;
		//System.out.println("두 실수를 더한 값은 :" + (float)rst);
		// double은 가끔 부동소숫점 에러 날 수 있다. 이럴땐 float으로 바꿔주면 된다.double을 전부 float으로.
		
// 연산
		int a1 = 10;
		int b1 = 2;
		int c1 = 3;
		System.out.println(a1/b1); // 몫  
		System.out.println(a1%c1); // 나머지 -> MOD
		System.out.println(a1*1.0/c1); 
		// 같은 자료형끼리 연산시, 답도 같은 자료형으로 리턴된다.
		// 답을 다른 자료형으로 보고싶으면, 해당 자료형을 연산중에 추가해야한다.
		b1 = b1 + c1 ;
		System.out.println(b1);
		System.out.println(c1);
		b1 += c1;

		
// 증감연산자
		b1++; 
		++b1;
		b1--;
		--b1;
		// 다 같은 말이다.
		int num3 = 10;
		int num4 = num3 ++ ;
		System.out.println(num3 + "/" + num4);
		// 후위 증감연산자는 세상에서 제일 낮다. 따라서 대입연산자부터 들어가고, 그 후에 증감연산자가 된다.
		// 따라서 num3 는 11이 되지만, num4 는 이전의 num3인 10이 유지되는 것이다.
		
		int num5 = 10;
		int num6 = ++num5;
		System.out.println(num5 + " " + num6);
		// 전위 증감연산자는 세상에서 제일 빠르다. 먼저 증감되고, 그 후 대입된다.

	
	}

}