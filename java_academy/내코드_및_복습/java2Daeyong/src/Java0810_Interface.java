////////////////////////////////�������̽�//////////////////////////////////

interface Inter {
	int AAA = 10; // ����� "�ݵ��" �ʱ�ȭ�ؾ��Ѵ�.(����̱⶧���� bold�ϴ�. )
	public static final int BBB = 20; //�̷��� �����Ǿ��ִٰ� ���� �ȴ�.
	// public : �θ��θ� ����Ѵ�.
	// static : ��ü�� �����ϰ� ����Ѵ�.(==> ����� ���� �Լ��� �����ϴ�.)
	// final : �� ���� �Ұ����ϴ�.
	
	void aaa(); // �߻�޼���
	public abstract void bbb();
	// public : �θ��θ� ����ض�.
	// abstract : [������]�� �ο��Ѵ�.
	
}

class abc implements Inter {
	
	// �������̽� ����� implements�� �Ѵ�. ����Ѵٰ� ���ϰ� "�����Ѵ�"�� �Ѵ�.
	// ����� �ϳ���, implement�� ������ �����ϴ�. => ���߻���̶� �Ѵ�.
	// class abc extends �θ�Ŭ���� implements Inter1, Inter2  // �̷�������
	


	@Override
	public void aaa() { // �θ��� ������������ �ڽ��� ���������� ũ�ų� ���ƾ� �Ѵ�.
		//���⼱ �θ� public, ���� ū�Ŵϱ� �ڽĵ� public �̾����.
		
	}

	@Override
	public void bbb() {
		// TODO Auto-generated method stub
		
	}
}

public class Java0810_Interface {

	public static void main(String[] args) {
		int aaa;

	}

}
