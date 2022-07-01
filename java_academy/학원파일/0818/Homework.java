import java.util.ArrayList;
import java.util.Scanner;

class Point{
	int x;
	int y;
	Point(int x,int y){
		this.x=x;
		this.y=y;
	}
	public String toString(){
		return "("+this.x+","+this.y+")";
	}
	boolean equals(Point p) {
		if(this.x==p.x && this.y==p.y) {
			return true;
		}
		return false;
	}
}
public class Homework {

	public static void main(String[] args) {
		
		ArrayList<Point> a=new ArrayList();
		// 1- Point 3�� ����
		// 2- Point��ü 3���� ��ǥ�� ��µɼ��ֵ��� ���ּ���!~~
		a.add(new Point(1,2));
		a.add(new Point(3,4));
		a.add(new Point(5,6));
		System.out.println(a);
		
		// 1.���߰� 2.���� 3.����
		Scanner sc=new Scanner(System.in);
		while(true) {
			System.out.print("�׼��Է�: ");
			int act=sc.nextInt();
			if(act==1) {
				System.out.print("x�Է�: ");
				int x=sc.nextInt();
				System.out.print("y�Է�: ");
				int y=sc.nextInt();
				a.add(new Point(x,y));
			}
			else if(act==2) {
				System.out.println(a);
				System.out.println("�������Է�");
				System.out.print("1�Է�: ");
				int x=sc.nextInt();
				System.out.print("2�Է�: ");
				int y=sc.nextInt();
				if(a.get(x-1).equals(a.get(y-1))) {
					System.out.println("������");
				}
				else {
					System.out.println("�ٸ���");
				}
			}
			else {
				break;
			}
		}
		
	}

}




