import java.util.ArrayList;
import java.util.Scanner;

class Point2{
	int x;
	int y;
	Point2(int x,int y){
		this.x=x;
		this.y=y;
	}
	public String toString(){
		return "("+this.x+","+this.y+")";
	}
}
public class Ex2 {

	public static void main(String[] args) {
		
		ArrayList<Point2> a=new ArrayList();
		// 1- Point 3�� ����
		// 2- Point��ü 3���� ��ǥ�� ��µɼ��ֵ��� ���ּ���!~~
		a.add(new Point2(1,2));
		a.add(new Point2(3,4));
		a.add(new Point2(5,6));
		System.out.println(a);
		
		// 1.���߰� 2.���� 3.����
		Scanner sc=new Scanner(System.in);
		while(true) {
			int act=sc.nextInt();
			if(act==1) {
				
			}
			else if(act==2) {
				
			}
			else {
				break;
			}
		}
		
	}

}









