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
		// 1- Point 3개 생성
		// 2- Point객체 3개의 좌표가 출력될수있도록 해주세요!~~
		a.add(new Point2(1,2));
		a.add(new Point2(3,4));
		a.add(new Point2(5,6));
		System.out.println(a);
		
		// 1.점추가 2.점비교 3.종료
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









