import java.util.Scanner;

class Point{
	int x;
	int y;
	Point(int x,int y){
		this.x=x;
		this.y=y;
	}
	boolean equals(Point p) {
		if(this.x==p.x && this.y==p.y) {
			return true;
		}
		return false;
	}
	public String toString(){
		return "("+this.x+","+this.y+")";
	}
}

public class MainAct2 {

	public static void main(String[] args) {
		
		// 1- Point[] 5���� ��ü�� �������ִ� �迭 �����ϱ�
		// 2- �迭�� ��ü ����
		// 3- [0]~[4] : 1��(x,y) 2��(x,y)
		// 4- [0]-[1] , [1]-[2] , ... , [3]-[4]
		Point[] p=new Point[5];
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<5;i++) {
			System.out.print("x��ǥ: ");
			int x=sc.nextInt();
			System.out.print("y��ǥ: ");
			int y=sc.nextInt();
			p[i]=new Point(x,y); // �ν��Ͻ�ȭ==��üȭ
		}
		/*
		int[] arr= {1,2,3,4,5};
		for(int v:arr) {
			System.out.println(v);
		}
		*/
		for(Point v: p) {
			System.out.println(v);
		}
		for(int i=0;i<4;i++) {
			if(p[i].equals(p[i+1])) {
				System.out.println("������");
			}
			else {
				System.out.println("�ٸ���");
			}
		}
		
	}

}







