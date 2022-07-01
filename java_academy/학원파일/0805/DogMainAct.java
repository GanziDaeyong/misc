
class Dog{
	String name;
	static String act[];
	static int index;
	void addAct(String str) {
		act[index]=str;
		index++;
	}
}
public class DogMainAct {

	public static void main(String[] args) {
		Dog d1=new Dog();
		d1.name="요요";
		d1.act=new String[5];
		d1.index=0;
		d1.addAct("앉아");
		d1.addAct("기다려");
		System.out.println(d1.name+"가 배운훈련");
		for(int i=0;i<d1.index;i++) {
			System.out.print(" "+d1.act[i]);
		}
		System.out.println();
		
		Dog d2=new Dog();
		d2.name="해피";
		System.out.println(d2.name+"가 배운훈련");
		for(int i=0;i<d2.index;i++) {
			System.out.print(" "+d2.act[i]);
		}
		System.out.println();
	}

}