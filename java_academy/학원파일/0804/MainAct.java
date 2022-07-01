import java.util.Scanner;

public class MainAct {
	
	static int fnc(int a,int b) {
		System.out.println("확");
		int sum=a+b;
		return sum;
	}
	static double fnc(double a,double b) {
		System.out.println("체크");
		return a+b;
	}
	static int fnc(int a,int b,int c) {
		System.out.println("인");
		return a+b+c;
	}
	
	static void f(int[] data,int num) {
		int sw=0; // 스위치OFF
		for(int i=0;i<data.length;i++) {
			if(data[i]==num) {
				sw=1; // 스위치ON
				System.out.println("["+i+"]");
			}
		}
		if(sw==0) {
			System.out.println("[-1]");
		}
	}
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println(fnc(1,2)); // 오버로딩
		System.out.println(fnc(1,2,3));
		System.out.println(fnc(1.2,1.3));
		
		/*
		배열 요소 5개 입력
		[ 2 3 1 5 4 ]
 		 3  vs  6
		f()함수에서 인덱스번호 출력
 		 -> [1]  vs  [-1]
		*/
		int[] data=new int[5];
		for(int i=0;i<5;i++) {
			data[i]=sc.nextInt();
		}
		System.out.print("찾을데이터: ");
		int num=sc.nextInt();
		f(data,num);
	}
}