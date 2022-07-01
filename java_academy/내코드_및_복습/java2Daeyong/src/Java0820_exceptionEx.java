//###############�Լ��� ������ main���� ó���ϱ� / class�� ����Ͽ� ���� ���� �����ϱ�##############

class myException extends Exception {
	myException (String message) {
		super(message); // �̹� �θ�(Exception)�� �ֱ� ������ �������ִ� ��. super��.
	}
}


public class Java0820_exceptionEx {
	
	static void fnc1() {
		int a = 10, b= 0;
		System.out.println(a/b);
	}
	static void fnc2() throws Exception { // �Լ����� ���ܰ� �߻��ϴ���, �ϴ� �����Ұž�. main()���� ó���Ұ�. �̰� throws�̴�.
		Exception ageEx = new Exception("���̿���");
		throw ageEx;
		
	}
	static void fnc3() throws myException {
		throw new myException("�������翹��");
		
	}
	

	public static void main(String[] args) {
		

		
		try {
			//fnc1();
			//fnc2();
			fnc3(); // ��ü�� Ŭ�����Լ� �ƴ϶� �׳� �Լ�.
			
			
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}

	}

}
