import java.util.Scanner;

public class MainAct {
	
	static int fnc(int a,int b) {
		System.out.println("Ȯ");
		int sum=a+b;
		return sum;
	}
	static double fnc(double a,double b) {
		System.out.println("üũ");
		return a+b;
	}
	static int fnc(int a,int b,int c) {
		System.out.println("��");
		return a+b+c;
	}
	
	static void f(int[] data,int num) {
		int sw=0; // ����ġOFF
		for(int i=0;i<data.length;i++) {
			if(data[i]==num) {
				sw=1; // ����ġON
				System.out.println("["+i+"]");
			}
		}
		if(sw==0) {
			System.out.println("[-1]");
		}
	}
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println(fnc(1,2)); // �����ε�
		System.out.println(fnc(1,2,3));
		System.out.println(fnc(1.2,1.3));
		
		/*
		�迭 ��� 5�� �Է�
		[ 2 3 1 5 4 ]
 		 3  vs  6
		f()�Լ����� �ε�����ȣ ���
 		 -> [1]  vs  [-1]
		*/
		int[] data=new int[5];
		for(int i=0;i<5;i++) {
			data[i]=sc.nextInt();
		}
		System.out.print("ã��������: ");
		int num=sc.nextInt();
		f(data,num);
	}
}