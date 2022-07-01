import java.util.Scanner;

public class Java0729 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
//	연습문제1		
		//정수 2개 입력
		//첫 정수 - 둘째 정수
//		System.out.print("첫 번째 정수를 입력하세요: ");
//		int num1 = sc.nextInt();
//		System.out.print("두 번째 정수를 입력하세요: ");
//		int num2 = sc.nextInt();
//		int rst = num1 - num2;
//		System.out.println("두 정수를 뺀 결과는: " + rst + "입니다!");
		
//	string은?
//		sc.nextLine();//-> 잘못들어간 엔터를 한번 제거해주면 된다. int의 경우 띄어쓰기를 무시하는 기능이 있기 때문에 노상관이다. 
//		String str = sc.nextLine();
//		System.out.println(str); //이러면 받지 않고 그냥 종료된다. -> 자바 프로그램상 위에서 입력한 enter 값을 받아버린다. 
		// int와 line 사이에는 무조건 sc.nextLine() 써준다고 생각하면 된다. 버퍼 제거하기 위해서이다. ( =엔터 제거한다.)
		
		
//	비교연산자 < > <= >= == != 총 6가지.
//		int a = 10;
//		int b = 20;
//		System.out.println(a >= b);
//		System.out.println(a == b);
//		System.out.println(a != b);
//		// =이 하나 있으면 대입연산자, 두개 있으면 비교 연산자이다.
		
//	논리연산자 -> 집합
//		// AND && 교집합 그리고, ~이고
//		// OR || 합집합 또는, ~거나
//		System.out.println(1<2 && 2<3);
//		System.out.println(1<2 || 2>3);
		
//	연습문제2
		//정수 3개 입력 총합 구하여 출력/ 총합에서 -1 하고 10보다 크면 true 아니면 false
//		System.out.print("첫 번째 정수를 입력하세요: ");
//		int x = sc.nextInt();
//		System.out.print("두 번째 정수를 입력하세요: ");
//		int y = sc.nextInt();
//		System.out.print("세 번째 정수를 입력하세요: ");
//		int z = sc.nextInt();
//		int rst = x+y+z;
//		System.out.println("세 정수의 합은: " + rst);
//		int rst2 = rst - 1;
//		System.out.print("세 정수의 합 -1 이 10보다 큰가? ");
//		System.out.println(rst2 > 10);
		
		// 다른방식 (대입연산자 / 증감연산자 써서 한번 연습해보자!)
//		int sum = 0;
//		sum += x; // sum = sum + a
//		sum += y;
//		sum += z;
//		sum --;
//		System.out.println(sum>10);
		
		
//	연습문제 3
		// 정수 3개 입력 / 평균 출력 -> 소수점까지 출력
//		int x,y,z;
//		System.out.print("첫 번째 정수를 입력하세요: ");
//		x = sc.nextInt();
//		System.out.print("두 번째 정수를 입력하세요: ");
//		y = sc.nextInt();
//		System.out.print("세 번째 정수를 입력하세요: ");
//		z = sc.nextInt();
//		double rst = (x+y+z)/3.0; //3.0을 안해주면 만들어놔도 어차피 로스된다. int와 int니까
//		System.out.println("세 정수의 평균은: " + rst);
		
		
//	아스키코드 (아스키코드표 참고)
//		char c = 'a'; // 아스키로 97
//		c++; // 97 + 1 = 98 = 아스키로 b
//		System.out.println(c);
		
		
//	제어문
		// 제어문 : 조건문  vs 반복문
		// 조건문 - 분기점 / 양자택일 
		// 반복문 - 특정 기능이나 행동을 여러번 수행할 때
		
//		int d;
//		d = sc.nextInt();
//		if (d%2 == 0) {
//			System.out.println("even");
//		}
//		else {
//			System.out.println("odd");
// 		양자택일에서는 else로 가자! 여러번 돌릴수록 확인치 않고 바로 else로 가니까 효율이 배로 좋아진다.
//		}
		
		
//	연습문제 4
//		int input2;
//		System.out.print("정수 하나를 입력하세요: ");
//		input2 = sc.nextInt();
//		if (input2 == 0) {
//			System.out.println("이건 0이야!");
//		}
//		else if (input2 > 0) {
//			if (input2 > 300) {
//				System.out.println("매우 큰 양수!!");
//			}
//			else {
//				System.out.println("이 수는 적절히 큰 양수");
//			
//		}
//		else {
//			System.out.println("이 수는 바로! 음수");
//		} 
		// 파이썬 elif == else if.
		
		
//	연습문제 5
//		int input1, input2, input3;
//		input1 = sc.nextInt();
//		input2 = sc.nextInt();
//		input3 = sc.nextInt();
//		if (input1>input2 && input1>input3) {
//			System.out.println("input1이 제일 크다!!");
//		}
//		else if (input2>input1 && input2>input3) {
//			System.out.println("input2가 제일 크다!!");
//		}
//		else if (input3>input1 && input3>input2) {
//			System.out.println("input3가 제일 크다!!");
//		} // 분기점을 a>b 로 두고 if 내에 또 if else 써서 할 수 있다.
		
		
//	연습문제 6 // 다시해보기!!
		//정수 2개 입력 / 5 50 -> 5시 50분. 1시간 20분 전 시간을 출력해라.
		//0~59분. 1~12시
		
//		int min, hour;
//		hour = sc.nextInt();
//		min = sc.nextInt();
//		
//		if (min-20 < 0) {
//			int new_min = 60-(20-min);
//			if (hour - 2 < 0) {
//				int new_hour = 12-(12-hour);
//			}
//			System.out.println(new_hour + "시" + new_min + "분");
//		}
//		else {
//			int new_min = 60-min;
//			int new_hour = hour - 1;
//			System.out.println(new_hour + "시" + new_min + "분");
//		}
//		
		
//	연습문제 6 선생님 풀이		
//		int h,m;
//		h = sc.nextInt();
//		m = sc.nextInt();
//		h--;
//		m-=20;
//		if (m<0) {
//			m += 60;
//			h --;
//		}
//		if (h<0) {
//			h+=24;
//		}
//		System.out.println(h+":"+m);
		
		
//// switch
//		int num = sc.nextInt();
//		switch(num) {
//		case 1:
//			System.out.println("일");
//			break;
//		case 2:
//			System.out.println("이");
//			break;
//		case 3:
//			System.out.println("삼");
//			break;
//		case 6:
//		case 7:
//		case 8:
//			System.out.println("육칠팔");
//			break;
//		default:
//			System.out.println("해당없음!");
//			break;
//		// break 안써주면 안걸리고 끝까지 실행된다. case 실행되고 꼭 닫아주자. 
			
			
//	연습문제 7
//		int sco = sc.nextInt();
//		sco /= 10;
//		switch(sco) {
//		case 10:
//		case 9:
//			System.out.println("A등급");
//			break;
//		case 8:
//			System.out.println("B등급");
//			break;
//		case 7:
//			System.out.println("C등급");
//			break;
//		default :
//			System.out.println("F등급");
//			break;
//
//		}
		
		
//// 자판기 만들기
//		System.out.println("치킨 번호를 골라주세요~! 1.네네스노윙치즈  2.BHC뿌링클  3.처갓집슈퍼슈프림  4.교촌허니콤보");
//		
//		int button;
//		button = sc.nextInt();
////		1 - 900 2- 1200 3- 800 4- 800
//		
//		if (button == 1) {
//			int price = 15000;
//			System.out.println("네네 스노윙치즈 를 선택하셨습니다");
//			int money;
//			money = sc.nextInt();
//			if (money - price >= 0) {
//				int change = money - price ;
//				System.out.println("음료를 받으세요 \n 잔돈은 " + change + "입니다");
//			}
//			else {
//				System.out.println("금액이 부족합니다");
//			}
//		}
//		
//		else if (button == 2) {
//			int price = 17000;
//			System.out.println("BHC 뿌링클 를 선택하셨습니다");
//			int money;
//			money = sc.nextInt();
//			if (money - price >= 0) {
//				int change = money - price ;
//				System.out.println("음료를 받으세요 \n 잔돈은 " + change + "입니다");
//			}
//			else {
//				System.out.println("금액이 부족합니다");
//			}
//		}
//		
//		else if (button == 3) {
//			int price = 18000;
//			System.out.println("처갓집 슈퍼슈프림를 선택하셨습니다");
//			int money;
//			money = sc.nextInt();
//			if (money - price >= 0) {
//				int change = money - price ;
//				System.out.println("음료를 받으세요 \n 잔돈은 " + change + "입니다");
//			}
//			else {
//				System.out.println("금액이 부족합니다");
//			}
//		}
//		
//		else if (button == 4) {
//			int price = 20000;
//			System.out.println("교촌 허니콤보를 선택하셨습니다");
//			int money;
//			money = sc.nextInt();
//			if (money - price >= 0) {
//				int change = money - price ;
//				System.out.println("음료를 받으세요 \n 잔돈은 " + change + "입니다");
//			}
//			else {
//				System.out.println("금액이 부족합니다");
//			}
//		} 
//		
////	선생님 답안
//		int b2 = sc.nextInt();
//		String m1 = "이프로";
//		String m2 = "미닛메이드";
//		String m3 = "top";
//		String m4 = "우유";
//		
//		int p1 = 900;
//		int p2 = 1200;
//		int p3 = 800;
//		int p4 = 800;
//		
//		String menu = m1;
//		int price = p1;
//		
//		switch(b2) {
//		
//		case 2 : 
//			menu= m2 ;
//			price = p2 ;
//			break;
//		case 3 : 
//			menu= m3 ;
//			price = p3 ;
//			break;
//		case 4 : 
//			menu= m4 ;
//			price = p4 ;
//			break;
//			
//		// 마저 해보기!!!
//		}
//		
		
//	반복문
		// 기능을 여러번 수행하고 싶을때.
		
		//System.out.println("안녕!"); // 이걸 백 번 하고싶다고 쳐봐.
		
		int i = 0;
		while (i<10) {
			if (i%2 == 0) {
				System.out.println(i);
			}
			i++;
		}
		
		// 매우중요 디버깅표 매우중요 //
		//변화의 추이를 작성하는 표를 디버깅 표라고 한다. 이거 매우 중요하다. 그리는거 습관화해라.
		
		// 숙제 -> 이 코드의 디버깅표를 그려보자.
		
		
		
		
		
		
	}	

}
