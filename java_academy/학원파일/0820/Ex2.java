
class MyException extends Exception{
	MyException(String message){
		super(message);
	}
}
public class Ex2 {

	static void fnc1() {
		int a=10,b=0;
		System.out.println(a/b);
	}
	static void fnc2() throws Exception{
		// �Լ����� ���ܰ� �߻��ϴ���,
		// �ϴܹ���->main()���� ó���ϰڴ�!
		Exception ageEx=new Exception("���̿���");
		throw ageEx;
	}
	static void fnc3() throws MyException{
		throw new MyException("�������翹��");
	}

	public static void main(String[] args) {

		try {
			//fnc1();
			//fnc2();
			fnc3();
		}
		catch(Exception e){
			System.out.println(e.getMessage());
		}

	}

}
