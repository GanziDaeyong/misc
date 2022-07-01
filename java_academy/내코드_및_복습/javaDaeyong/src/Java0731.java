import java.util.Scanner;
import java.util.Arrays;

public class Java0731 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);


		// 구구단만들기		
				int i;
				int j;
				for (i = 1; i <= 9; i++) {
					for (j = 2 ; j <= 9 ; j++ ) {
						System.out.print(j + "X" + i + "=" + i*j + "\t");
					}
					System.out.println();
				}

		// 배열 (array)
		//		int s1 = 100;
		//		int s2 = 10;
		//		int s3 = 25;
		//		
		//		char[] s = new char[3];

		// 1. 서로 관련된 데이터묶음
		// 2. 자료형이 같을 필요 x

		//		int[] arr = new int[5];
		//		// 인덱싱 방식
		//		arr[0] = 10;
		//		arr[1] = 20;
		//		arr[2] = 30;
		//		arr[3] = 40;
		//		arr[4] = 50;
		//		for (int i = 0 ; i <= 4 ; i++ ) {
		//			System.out.println(arr[i]);
		//			
		//		}
		//		System.out.println(arr[2]);


		//// 연습문제 - 배열 요소를 직접 입력하면 그대로 배열 프린트.		
		//		int[] arr = new int[] {1,2,3,4,5};
		//		
		//		for (int i = 0 ; i<5 ; i++) {
		//			arr[i] = sc.nextInt();
		//		}
		//		for (int i = 0 ; i<5 ; i++) {
		//			System.out.println(arr[i]+ " ");
		//		}
		//		
		//		System.out.println();
		//		//System.out.println(arr);
		//		System.out.println(Arrays.toString(arr)); // 이러면 arr에 담긴걸 한번에 string으로 바꿔 돌려주는구나

		// for each 문 연습.				

		//	String[] str = new String[3];
		//	for (int i = 0; i < 3 ; i++) {
		//		str[i] = sc.nextLine();
		//	// for each 문. 매우 직관적이고 쓸모 많을듯하다.
		//	for (String s : str) { // for 문 이런식으로도 쓸 수 있다. 
		//		// 배열의 요소에 해당하는 자료형 : 배열명
		//		System.out.println(s);
		//	}

		//	int[] arr = new int[] {1,2,3,4,5};
		////	for (int i = 0 ; i <= 4 ; i++) {
		////		System.out.println(arr[i] + "");
		//	for (int fac: arr) {
		//		System.out.println(fac);
		//	}

		// 연습문제 크기가 5인 int 배열 선언
		//	// 요소 입력(자연수범위)
		//	// 짝수의 개수 출력
		//	
		//	int[] arr = new int[5];
		//		for (int i = 0 ; i < arr.length; i++) {
		//		int input = sc.nextInt();
		//		arr[i] = input;
		//		}
		//		int cnt = 0;
		//		for (int v : arr){
		//			if (v%2 == 0) {
		//				cnt ++;
		//			}
		//		}
		//		System.out.println(cnt);
		//	

		// 최댓값찾기 연습문제
		//	int[] arr = new int [] {6,7,8,9,10,11,12,13,14};
		//	int max = arr[0];
		//	int min = arr[0];
		//	int minIndex = 0;
		//	for (int i = 1 ; i < arr.length ; i++) {
		//		if (max<arr[i]) {
		//			max = arr[i];
		//		}
		//		if (min>arr[i]) {
		//			min = arr[i];
		//			minIndex = i;
		//		}
		//	}	System.out.print(min);
		//		System.out.println("["+ "인덱스 번호는 " +minIndex+"]");
		//	}

		// 연습문제 // 정수를 여러번 입력
		// 0보다 큰 짝수만 배열에 저장
		// 5개를 모두 채우면 입력종료
		// 10이상인 정수의 개수 출력

//		int[] arr = new int [5];
//		int i = 0;
//		while (true){ 
//			int input = sc.nextInt();
//			if (input > 0 && input % 2 == 0) {
//				arr[i] = input;
//				i++;
//				if (i == 5) { break;
//				}	
//			}
//		}
//		int cnt = 0;
//		for (int v : arr) { 
//			if (v >= 10) {
//				cnt ++;
//			}
//		} 
//		System.out.println(cnt);
		
// 연습문제 -> 입력한 5개 정수 -> 소수면 O, 소수 아니면 X
		
//		int [] arr = new int [5];
//		for (int i = 0 ; i < 5; i++) {
//			arr[i] = sc.nextInt();
//		}
//		
//		int s_count = 0;
//		int i_count = 0;
//		for(int a = 0 ; a < 5 ; a ++) {
//			int cnt = 0; // cnt 위치 조심!!
//			for(int b = 1 ; b <= arr[a] ; b ++) {
//				if (arr[a]%b == 0) {
//					cnt ++ ;
//				}
//
//			}
//			if (cnt == 2) {
//				s_count++;
//				System.out.println(arr[a]+"는 소수 입니다");
//			}
//			else {
//				i_count++;
//				System.out.println(arr[a] + "는 소수가 아닙니다");
//			}
//			
//		} System.out.println("총 정수는" + i_count);
	}	



}