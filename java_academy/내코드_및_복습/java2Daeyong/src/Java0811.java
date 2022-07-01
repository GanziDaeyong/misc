import java.util.Scanner;

///////////////////////////////////객체배열////////////////////////////////////////
// 어렵게 생각하지 마. 그냥 객체가 배열로 들어간것 뿐이다. 


class bbook{
	String title; // 참고. 당연한거지만 공유하지 않기 때문에. 객체별로 다르기 때문에 static을 붙이면 안되는거지.
	String auth;
	int price;
	
	bbook(String title, String auth, int price) {
		this.title = title;
		this.auth = auth;
		this.price = price;
		System.out.println(" 책 구비완료");
	}
	bbook(String title, int price) {
		this(title,"작자미상",price);
	}
	
	
	//void show() {
	//	System.out.println(this.title + "/"+ this.auth+ "/" + this.price);
	//}
	
	public String toString() { // public 안하면 ? 부모인 Object 클래스에서 public으로 구현되있기 때문에 자식도 public이어야 하는 것이지.
		return this.title + "/"+ this.auth+ "/" + this.price;
	}
	
	
	
}


public class Java0811 {

	public static void main(String[] args) {
		
		//int[] arr = new int[3]; 처럼 똑같이 만들면 돼.
		bbook[] bbook_arr = new bbook[5]; // 그런데 지금은 그냥 객체가 들어갈 배열을 만든거지, 객체를 구워낸 것은 아니야!!
		Scanner sc = new Scanner(System.in);
		int index = 0;
		while(true) {
			System.out.println("1.생성 2.출력");
			int act = sc.nextInt();
			
			if(act == 1) {
				if (index == 5) {
					System.out.println("배열가득참");
					continue;
				}
				
				sc.nextLine();
				System.out.println("책 제목입력: ");
				String title = sc.nextLine();
				System.out.println("가격");
				int price = sc.nextInt();
				System.out.println("작가유무");
				int a = sc.nextInt();
				if (a == 1) {
					sc.nextLine();
					System.out.println("작가입력: ");
					String author = sc.nextLine();
					bbook_arr[index++] = new bbook(title, author, price); // 얘는 생성자. 인스턴스화 과정이다.
					// -> 후위연산자는 느리니까 이렇게 써도 0 1 2 3 잘 나간다.
				}
				else {
					bbook_arr[index++] = new bbook(title,price);
					
				}
			// 생성
			}
			else if (act == 2) {
				for (int i = 0; i<index;i++) {
					System.out.println(bbook_arr[i]); // 그냥 bbook_arr[i]로 안되는 이유는 얘 스스로가 객체이기 때문이다.
					// 자바에서 제공하는 최상위 클래스 Object. Object위엔 뭐 없다. 
					// -> bbook_arr[i]는 저절로 Object라는 클래스가 가진 toString()매서드를 불러온다.
					// 따라서 bbook_arr[i]의 문자열 자체가 출력되는 것이다.
					// 오 그러면 toString()을 내 클래스에서 오버라이딩 해버리면 되는거잖아! 위로 올라가서 check
			
					
				}
				// 출력
			}
			else {
				System.out.println("프로그램 종료");
				break;
			}
			
		}
	}

}
