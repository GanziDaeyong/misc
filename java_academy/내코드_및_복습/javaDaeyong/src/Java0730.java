import java.util.Scanner;

public class Java0730 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

//	연습문제1
		//절댓값 출력해주세요

		//		Scanner sc = new Scanner(System.in);
		//		int num1 = sc.nextInt();
		//		if (num1<0) {
		//			num1 *= -1;
		//		}
		//		System.out.println(num1);


		//		int i = 0;
		//		int num = sc.nextInt();
		//		while (i<num) {
		//			if (i%2 == 0) {
		//				System.out.println(i);
		//			}
		//			i++;
		//		
		//		}
		// 1부터 시작하고싶다면? 첨에 i에 1을 넣거나, i++을 if문 앞에 넣으면 된다.


//	연습문제2
		//		int i = 0;
		//		int num = sc.nextInt();
		//		int rst;
		//		while (i <= num) {
		//			rst = num/2;
		//			if (num%2 == 1) {
		//				rst +=1;
		//			}
		//			i++;
		//			
		//		System.out.println(rst);
		//		/// 여기 다시!!! 그냥 cnt ++ 하면 편하지.
		//		}	


		//	무한루프			
		//		int num=1;
		//		while( true ) { //무한루프 -> break로.
		// 무한루프는 반드시 [중단시점],[종료조건]이 있어야 한다. break로.
		//			System.out.println("안녕");
		//			num = sc.nextInt();
		//			if (num != 1) {
		//				break; // 가장 가까운 while 문의 바깥으로 빠져나가 주세요!
		//			}
		//		}


		// break 와 continue
		//		int i = 0;
		//		while (i<10) {
		//			i++;
		//			if (i%2 == 0) {
		//				continue; // <-> break 
		//				// break는 아래를 쳐다보지 않고 코드 밖으로 나가버리는데,
		//				// continue는 아래를 쳐다보지 않고 다시 while로 올라간다. 그 차이.
		//			}
		//			System.out.println(i);
		//		}


//	연습문제3 - 정수입력. 양수입력하면 양수임력. 음수입력하면 아무것도 안나옴. 0넣으면 종료 (break)
		// 반복문 수행 중단하고싶지만, 반복을 중단하고 싶진 않아! continue;
		//		while (true) {
		//			int input = sc.nextInt();
		//			if (input>0) {
		//				System.out.println("양수입력함");
		//			}
		//			else if (input <0) {
		//				continue;
		//			}
		//			else {
		//				System.out.println("0넣으면 꺼짐");
		//				break;
		//			}
		//		}


//	연습문제 4
		//		int input = sc.nextInt();
		//		int i = 0;
		//		int cnt = 0;
		//		while (i <= input) {
		//			if (i%2 == 1) {
		//				cnt ++;
		//				i ++;
		//			}
		//			else {
		//				i ++;
		//			}
		//		}
		//		System.out.println(cnt);


//	do-while문 // 1,2,3 -> -1,0,4 => 재입력
		// while문 -> 선조건 후처리 -> 최소수행횟수 0번
		// do-while문 -> 선처리 후조건 -> 최소수행횟수 1번
		//		int x;
		//		do {
		//			x = sc.nextInt();
		//		} while(x<1 || x>3); // 조건에 해당하면 다시 do로 올라가. 계속 do로 올려보내는 것.
		//		// 조건에 해당하지 않으면 이제 내려와. 아래로!
		//		if (x == 1) {
		//			System.out.println("가위");
		//		}
		//		else if (x==2) {
		//			System.out.println("바위");
		//		}
		//		else {
		//			System.out.println("보");
		//		}

		////////////////////////////////////////////////////////////////

		// 5 입력하면 자판기 프로그램 자체가 종료된다. while break
		// 1~5 중에 입력을 안했다면 -> 재입력 do while

		// 모든 변수는 블록구간 단위. 블록구간 상위에 선언하면 전체에 적용가능하지만,
		// 블록구간 내에서 선언하면 블록 내에서 죽는다.

//		String m1="이프로";
//		String m2="미닛메이드";
//		String m3="TOP";
//		String m4="우유";
//		String m5="종료";
//		int p1=900;
//		int p2=1200;
//		int p3=1000;
//		int p4=800;
//		int b;
//		// 초기화 센스 길러라.
//		int money = 0;
//		while (true) {
//			System.out.println("1.이프로 2.미닛메이드 3.TOP 4.우유 5.종료");
//			do {
//				b=sc.nextInt();
//			}while (b<1 || 5<b);
//			String menu=m1;
//			int price=p1;
//			switch(b) {
//			case 2:
//				menu=m2;
//				price=p2;
//				break;
//			case 3:
//				menu=m3;
//				price=p3;
//				break;
//			case 4:
//				menu=m4;
//				price=p4;
//				break;
//			}
//
//			if (b == 5) {
//				break;
//			}
//
//			System.out.print("동전을 넣어주세요! : ");
//			// 0 이하의 입력 -> 재입력
//			
//			int new_money;
//			do {
//				new_money = sc.nextInt();
//			} while (new_money <= 0);
//			money += new_money;
//
//			if(money>=price) {
//				System.out.println(menu+"가 나옵니다!");
//				money-=price;
//			}
//			else {
//				System.out.println("돈이 부족합니다!");
//			}
//			// 바로반환 x. 프로그램 종료 시 반환
//		} System.out.println(money + "을 반환합니다");
//
//// while(true) -> 중단시점 구현 _ break / do-while


// for 문
//		// while recap
//		int i = 0;
//		while (i<3) {
//			System.out.println("안녕하세용");
//			i++;
//		}
//		
//	//  for (초기식    ; 조건식   ; 증감식)
//		for (int a=0; a < 3 ; a++) {
//			System.out.println("안녕하세얌");
//	// 메커니즘 : 초기식 -> 조건식 -> for문 내용 -> 증감식 -> 초기식 -> 조건식 -> for문 내용 -> 증감식 -> ...
//		}
		
// 연습문제 1부터 10까지 모두 출력 + 그 합츨 출력하기
//		int sum = 0;
//		//int n; // int를 for 문 내에 쓰면 블록 밖으로 못나온다.
//		for ( int n = 1; n <= 10 ; n++ ) { 
//		System.out.println(n);
//		sum += n;
//		}
//		System.out.println(sum);
		
//연습문제 - 정수 2개 입력. 작은 수에서 큰 수 순서대로 출력해주세요
//		int a = sc.nextInt();
//		int b = sc.nextInt();
//		if (a>b) {
//			// [교환] 알고리즘
//			int tmp = a;
//			a = b;
//			b = tmp;
//		}
//		for ( int i = a; i <= b; i++) {
//			System.out.println(i);

			// continue 문은 for문에서  증감식으로 이동한다. while에서는 그냥 처음으로 갔다. 사실 같은 메커니즘이긴 하다.
			// break 도 마찬가지로 그냥 나가버린다.
//		}

// 연습문제. 정수를 10번 입력. 총합 출력하기. 만약 ㅈ0이하의 정수가 입력된다면 즉시 종료
		
		// while : 여러번, 영원히, 조건을 만족하는 동안. 이런식의 반복문에 쓰인다.
		// for 
		
//		int a;
//		int i;
//		int sum = 0;
//		for( i = 0; i < 10; i++) {
//			a = sc.nextInt();
//			if (a<0) {
//				break;
//			}
//			sum += a;
//		}	System.out.println(sum);
//		
		
// 연습문제. - 약수 구하기 - 정수 1개 입력 ex. 8 = 1248
		int a;
		int i = 1;
		a = sc.nextInt();
		while(i<=a) {
			if (a%i == 0) {
			System.out.println(i);
			}
		i++; // for 로도 해보기
		}
		
		// 숙제| 약수 소수 완전수 피보나치
	}

}
