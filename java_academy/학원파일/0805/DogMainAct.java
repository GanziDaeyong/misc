
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
		d1.name="���";
		d1.act=new String[5];
		d1.index=0;
		d1.addAct("�ɾ�");
		d1.addAct("��ٷ�");
		System.out.println(d1.name+"�� ����Ʒ�");
		for(int i=0;i<d1.index;i++) {
			System.out.print(" "+d1.act[i]);
		}
		System.out.println();
		
		Dog d2=new Dog();
		d2.name="����";
		System.out.println(d2.name+"�� ����Ʒ�");
		for(int i=0;i<d2.index;i++) {
			System.out.print(" "+d2.act[i]);
		}
		System.out.println();
	}

}