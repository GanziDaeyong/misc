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
		
		// 1- Point[] 5개의 객체를 담을수있는 배열 생성하기
		// 2- 배열에 객체 저장
		// 3- [0]~[4] : 1번(x,y) 2번(x,y)
		// 4- [0]-[1] , [1]-[2] , ... , [3]-[4]
		Point[] p=new Point[5];
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<5;i++) {
			System.out.print("x좌표: ");
			int x=sc.nextInt();
			System.out.print("y좌표: ");
			int y=sc.nextInt();
			p[i]=new Point(x,y); // 인스턴스화==객체화
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
				System.out.println("같은점");
			}
			else {
				System.out.println("다른점");
			}
		}
		
	}

}







