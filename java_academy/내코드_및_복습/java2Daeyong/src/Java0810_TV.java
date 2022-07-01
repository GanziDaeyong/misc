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
			System.out.println("Àü¿ø ²ü´Ï´Ù");
		}
		else {
			this.power = true;
			System.out.println("Àü¿ø ÄÕ´Ï´Ù");
		}

	}

	@Override
	void vol_up() {
		if (this.power) {
			this.vol += 10;
			if (this.vol >= 100) {
				this.vol = 100;
				System.out.println("ÃÖ´ë º¼·ı");
			}
			else {
			System.out.println("ÇöÀç º¼·ı" + this.vol);
			}
		}
		else {
			System.out.println("Àü¿ø²¨Áü");
		}
	}

	@Override
	void vol_down() {
		if (this.power) {

			this.vol -= 10;
			System.out.println("ÇöÀç º¼·ı" + this.vol);
		}
		else {
			System.out.println("Àü¿ø²¨Áü");
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
