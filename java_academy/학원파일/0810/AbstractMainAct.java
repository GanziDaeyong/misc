
abstract class Shape{ // �߻�Ŭ���� : Ŭ�������� Ʋ == �ؾƲ�� Ʋ
	int point;
	int line;
	abstract void draw(); // {} ������ �����س���������!
	// [������] => �ڽ�Ŭ�������� "�ݵ��" �߻�޼��带 [������]�ϼ���!
}

class Circle extends Shape {
	void draw() {
		System.out.println("�� �׸���");
	}
}
class Rect extends Shape {

	@Override
	void draw() {
		System.out.println("�׸� �׸���");
	}
	
}
class Tri extends Shape {

	@Override
	void draw() {
		System.out.println("���� �׸���");
	}
	
}

public class AbstractMainAct {

	public static void main(String[] args) {
		//Shape s = new Shape(); xxx
		// : �߻�Ŭ�����δ� ��ü�� �����Ҽ������ϴ�!
	}

}






