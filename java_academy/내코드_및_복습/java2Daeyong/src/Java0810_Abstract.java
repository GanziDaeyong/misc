
abstract class Shape{ // �߻�Ŭ���� - Ŭ�������� Ʋ == �ؾƲ�� Ʋ -> �ؾ �̴µ����� ���� ���� ����.
	int point;
	int line;
	abstract void draw(); // [������]
				
		// [������] -> �ڽ� Ŭ�������� �ݵ�� �߻�޼��带 [������]�ϼ���.
		// �߻�޼��� ���� ���� �Ұ�. �߰�ȣ ���� ���Ѵ�.
		// ��? �ݵ�� �������϶�� �����س��� ���̱� ������ ������ �Ʒ��� �˾Ƽ� ��.
		// ���������� �Ʒ��� ������ ���ϸ� ���� ������ �߻��Ѵ�. ������!
		
}


class Circle extends Shape {
	void draw() {
		System.out.println("�� �׸���");
	}
}
class Rect extends Shape {
	void draw() {
		System.out.println("�׸� �׸���");
	}
}
class Tri extends Shape {
	void draw() {
		System.out.println("���� �׸���");
	}
}






public class Java0810_Abstract {

	public static void main(String[] args) {
		//Shape s = new Shape();
		// �������� ���� : �߻�Ŭ�����δ� ��ü�� ������ �� ���� �����̴�. -> ���� ����.
		// abstract�� Ű����� �������̴�. ���̵������ �Ǵ� ���̴�. [������]
	}

}
