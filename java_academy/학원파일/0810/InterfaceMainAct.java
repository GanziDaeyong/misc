
interface Inter{ // [������]�ο�
	int AAA=10; // ���-> "�ݵ��" �ʱ�ȭ�ؾ���
	public static final int BBB=20;
	// public: �θ��θ����
	// static: ��ü�� �����ϰ� ���(==> ����������Լ��� ����)
	// final: �� ���� �Ұ���
	void aaa(); // => �߻�޼���
	public abstract void bbb();
	// public: �θ��θ����
	// abstract: [������] �ο�
}
/*
// ���߻���� �����ϰ��ϴ� �������̽�
class ABC extends �θ�Ŭ������ implements Inter,Inter1 { // �����Ѵ�.

	@Override
	public void aaa() { // �θ��� �������� <= �ڽ��� ��������
		// TODO Auto-generated method stub
		
	}

	@Override
	public void bbb() {
		// TODO Auto-generated method stub
		
	}
	
}
*/
public class InterfaceMainAct {

	public static void main(String[] args) {
		System.out.println("����");
	}

}
