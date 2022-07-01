import java.util.Scanner;
abstract class TV{
	boolean power;
	int vol;
	abstract void onoff();
	abstract void vol_up();
	abstract void vol_down();

}






class SmartTV extends TV{
	
	SmartTV () {
		this.power = false;
		this.vol = 50;
	}

	@Override
	void onoff() {
		if (this.power) {
			this.power = false;
			System.out.println("���� ���ϴ�");
		}
		else {
			this.power = true;
			System.out.println("���� �մϴ�");
		}

	}

	@Override
	void vol_up() {
		if (this.power) {
			this.vol += 10;
			if (this.vol >= 100) {
				this.vol = 100;
				System.out.println("�ִ� ����");
			}
			else {
			System.out.println("���� ����" + this.vol);
			}
		}
		else {
			System.out.println("��������");
		}
	}

	@Override
	void vol_down() {
		if (this.power) {

			this.vol -= 10;
			System.out.println("���� ����" + this.vol);
		}
		else {
			System.out.println("��������");
		}
	}


}
public class Java0810_TV {

	public static void main(String[] args) {
		SmartTV t = new SmartTV();
		//t.power = true;
		t.vol_up();
		t.vol_up();
		t.vol_up();
		t.vol_up();

	}

}
