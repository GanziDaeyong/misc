
import java.util.ArrayList;
import java.util.Scanner;

class Movie{
	String name;
	int hour;
	Movie(String name,int hour){
		this.name=name;
		this.hour=hour;
		System.out.println("["+this.name+"] ���ſϷ�");
	}
	public String toString() {
		return this.name+" : "+this.hour+"��";
	}
}
public class MovieEx {
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		ArrayList<Movie> CGV=new ArrayList<Movie>();
		CGV.add(new Movie("�ٸ��ǿ������ϼҼ�",14));
		CGV.add(new Movie("�ٸ��ǿ������ϼҼ�",14));
		
		ArrayList<Movie> Mega=new ArrayList<Movie>();
		ArrayList<Movie> Lotte=new ArrayList<Movie>();
		System.out.println(CGV);
		int act;
		while(true) {
			System.out.println("\n=====��ȭ���Žý���=====");
			System.out.println("1-���� 2-�߱� 3-����");
			System.out.print("��ȣ�Է�: ");
			act=sc.nextInt();
			if(act==1) {
				System.out.println("\n������ ��ȭ�� ����");
				System.out.println("1-CGV 2-�ް��ڽ� 3-�Ե��ó׸�");
				System.out.print("��ȣ�Է�: ");
				act=sc.nextInt();
				System.out.print("�����Է�: ");
				sc.nextLine(); // ����
				String name=sc.nextLine();
				System.out.print("�ð��Է�: ");
				int hour=sc.nextInt();
				if(act==1) {
					CGV.add(new Movie(name,hour));
					System.out.println("���Ź�ȣ: "+(1000+CGV.size()));
				}
				else if(act==2) {
					Mega.add(new Movie(name,hour));
					System.out.println("���Ź�ȣ: "+(2000+Mega.size()));
				}
				else {
					Lotte.add(new Movie(name,hour));
					System.out.println("���Ź�ȣ: "+(3000+Lotte.size()));
				}
				System.out.println();
			}
			else if(act==2) {
				System.out.println("\n===Ticket Box===");
				System.out.print("CGV: ");
				System.out.println(CGV);
				System.out.print("�ް��ڽ�: ");
				System.out.println(Mega);
				System.out.print("�Ե��ó׸�: ");
				System.out.println(Lotte);
				System.out.print("\n���Ź�ȣ�Է�: ");
				int num=sc.nextInt();
				if(1000<num&&num<=1000+CGV.size()) {
					System.out.print(CGV.get(num-1000));
					System.out.println(" �߱ǿϷ�");
				}
				else if(2000<num&&num<=2000+Mega.size()) {
					
				}
				else if(3000<num&&num<=3000+Lotte.size()){
				
				}
				else {
					System.out.println("���� ���Ź�ȣ�Դϴ�.");
				}
			}
			else {
				System.out.println();
				System.out.println("CGV�� �������������� "+CGV.size()+"��");
				System.out.println("\n���α׷�����");
				break;
			}
		}
		
	}

}




