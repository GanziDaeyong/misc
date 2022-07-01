import java.util.Arrays;
import java.util.Scanner;
public class Java0803 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);

//지난시간 recap. 배열 -> forEach(향상된 for) 문을 배웠다.

//연습문제
//		int [] data = new int [3];
//		while (true) {
//			int input = sc.nextInt();
//			
//			int i = 0;
//
//			int cnt = 0; // cnt 위치 조심!!
//			for(int a = 1 ; a <= input ; a ++) {
//				if (input%a == 0) {
//					cnt ++ ;
//				}
//
//			}
//			if (cnt == 2) {
//				data[i] = input; // 한번에 data[i++] = input; 도 가능하다.
//				i ++ ; // 이부분 중요.
//				
//				if (i == 3) {
//					break;
//				}
//			}
//
//
//		}
//		System.out.println(Arrays.toString(data));
/////////////////////////////////////////디버깅하기

// 연습문제 2 10개 요소를 arr[]에 저장, 가장 큰 값과 위치를 출력. + 거기에 인덱스까지 뽑기
//		
//		int[] arr = new int [10];
//		for (int i = 0 ; i < arr.length ; i++) {
//			int input = sc.nextInt();
//			arr[i] = input;
//			
//		}
//		System.out.println(Arrays.toString(arr));
//		
//		int min = arr[0];
//		int max = arr[0];
//		int min_index = 0;
//		int max_index = 0;
//		
//		for (int i = 0 ; i < 10 ; i++) {
//			if (min > arr[i]) {
//				min = arr[i];
//				min_index = i;
//			}
//			if (max < arr[i]) {
//				max = arr[i];
//				max_index = i;
//			}
//		}
//		System.out.println(min_index + " " + min);
//		System.out.println(max_index + " " + max);
//////////////////////////////////////////////////////////////////////////////////////
		
		
// 배열 오름차순 정력 -> 버블정렬 (== 거품정렬)
		// 메커니즘 -> 51342 가 주어진다고 가정하면,
		// 1회차 -> 13425 바로 옆과의 비교를 통해 교환된다.
		// 2회차 -> 13245
		// 3회차 -> 12345 -> 비교를 데이터 갯수만큼 하게 된다. 
		// 버블 정렬은 뒤에서부터 큰 데이터가 채워지게 되는 알고리즘이다.
		// 선생님 설명
		// 1. 비교 -> (데이터개수 -1) 번
		// 2. 1번 액션 자체를 (데이터 개수) 번 반복한다.
		// 3. 제일 큰 데이터가 뒤에서부터 정렬된다.

//		int [] arr = new int [5];
//		for (int i = 0; i<5; i++) {
//			arr[i] = sc.nextInt();
//		}
//		for (int a = 0; a<5 ; a++) {
//			for (int i = 0; i<5-1 ; i++) {
//				// 중요. 교환 알고리즘 (tmp 이용한 임시저장)
//				if (arr[i]> arr[i+1]) {
//					int tmp = arr[i];
//					arr[i] = arr[i+1];
//					arr[i+1] = tmp;
//				}
//			}
//			
//		}
//		for (int v : arr) {
//			System.out.println(v + " ");
//
//		}
//		System.out.println();

		
// 연습문제3 - 버블정렬 (to blog)
		System.out.println("배열 요소 수를 입력하세요");
		int n = sc.nextInt();
		int[] arr = new int[n];
		
		System.out.println("배열 요소를" + n + "개 입력하세요");
		for (int i=0; i<n; i++) {
			arr[i] = sc.nextInt();
		}
		for (int i=0; i<n; i++) {
			for (int j=0; j<n-1;j++) {
				if (arr[j]>arr[j+1]) {
					int tmp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = tmp;
				}
			}
			System.out.println("변환 "+ (i+1) + "회차");
			System.out.println(Arrays.toString(arr));
		}
		System.out.println("오름차순으로 정리되었습니다.");
		System.out.println(Arrays.toString(arr));
		System.out.println("가장 큰 수는 " + arr[n-1] + "입니다");
		System.out.println("가장 작은 수는 " + arr[0] + "입니다");
////////////////////////////////////////////////////////////////////////////////////
		
// 함수 == 메서드
		// 함수는 public class 와 main 사이에 선언한다.
		// 사용자 정의 함수. -> 다음 클래스에서 확인할 것.
	}


}
