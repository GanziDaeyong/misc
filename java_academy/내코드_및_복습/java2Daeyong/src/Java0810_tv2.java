interface remote {
	int soundMin = 0;
	int soundMax = 10; // ����� ���� �� �� �ֱ� ������ �������� �����Ѵ�.
	void volUp();
	void volDown();
}

interface remoteP extends remote{ // �������̽������� ����� �����ϴ� // ���� �������̽��� �����̶��..
	void powerOn();
	void powerOff();
}

class tv2 {

	boolean power;
	int vol;

}


class sTv extends tv2 implements remoteP { // ���� �̹� ���/���������� �Ƚ��൵ �ȴ�.
	
	sTv() {
		this.power = false;
		this.vol = 0;
	}
	
	void recommend() {
		System.out.println("��õ ����");
	}

	void show() {
		if (this.power) {
			System.out.println("���� ��������.\n" + "����: " + this.vol);
		}
		else {
			System.out.println("���� ��������.");
		}
	}
	@Override
	public void volUp() {
		this.vol += 10;
		if (this.vol >= soundMax) {
			this.vol = soundMax;
			System.out.println("�ִ뺼��");
		}
		System.out.println("����: " + this.vol);

	}
	@Override
	public void volDown() {
		this.vol -= 10;
		if (this.vol <= soundMin) {
			this.vol = soundMin;
			System.out.println("�ּҺ���");
		}
		System.out.println("����: " +this.vol);
	}
	@Override
	public void powerOn() {
		if (this.power == false) {
			this.power = true;
			System.out.println("���� on");
		}
		else {
			System.out.println("�̹� ���� on");
		}

	}
	@Override
	public void powerOff() {
		if (this.power) {
			this.power = false;
			System.out.println("���� off");
		}
		else {
			System.out.println("�̹� ���� off");
		}

	}

}




public class Java0810_tv2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		sTv t = new sTv();
		t.show();
		t.powerOn();
		t.show();

	}

}
/////////////////////��..?///////////////////////

////////////////////////////////////����������///////////////////////////////
