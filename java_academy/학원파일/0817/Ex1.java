import java.util.ArrayList;
import java.util.Iterator;

public class Ex1 {

	public static void main(String[] args) {
		
		// �迭: ����,���Թ׻���() �Ҹ�,Ž���װ˻�() ����_�ε��̹��
		
		// �÷��� �����ӿ�ũ == �ڷᱸ��
		// ����Ʈ :  �迭����Ʈ / ���Ḯ��Ʈ
		// �迭����Ʈ: ����,����,Ž�� ���� �޼��带 �̸� �����س��� JAVA�� �迭
		// ���Ḯ��Ʈ: ���Թ׻���() ����,�ε��̹��xxx->Ž���װ˻�() �Ҹ�
		
		int[] a1=new int[3];
		ArrayList a2=new ArrayList(3);
		a1[0]=10;
		a1[1]=20;
		a1[2]=30;
		//a1[3]=40; xxx int[] �����̴�.
		//System.out.println(a1);
		a2.add(100);
		a2.add(0, 200);
		a2.add(300);
		a2.add(400); // �����̴�.
		a2.add("ABC");
		System.out.println(a2);
		///
		for(int v:a1) {
			System.out.print(++v+" ");
		}
		System.out.println();
		for(int i=0;i<a1.length;i++) {
			System.out.print(a1[i]+" ");
		}
		System.out.println();
		///
		for(int i=0;i<a2.size();i++) {
			// ����==ũ��
			System.out.print(a2.get(i)+" ");
		}
		System.out.println();
		// �١����ͷ�����(Iterator)�١�
		// �ݺ���
		Iterator itr=a2.iterator();
		while(itr.hasNext()) {
			System.out.print(itr.next()+" ");
		}
		System.out.println();
		
		// ���׸�(generic)
		// : �ڷᱸ���� �����Ҽ��ִ� �������� Ÿ���� �Ϲ�ȭ
		ArrayList<Integer> a3=new ArrayList();
		a3.add(100);
		//a3.add("ABC");
		// -> ���׸��� ���� �÷��������ӿ�ũ�� �ڷ����� ������Ѵ�!
		System.out.println(a3);
		
	}

}









