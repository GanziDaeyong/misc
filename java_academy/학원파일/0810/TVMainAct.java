
abstract class TV {
	boolean power;
	int vol;
	abstract void on_off();
	abstract void volUp();
	abstract void volDown();
}
class SmartTV extends TV {

	SmartTV(){
		this.power=false;
		this.vol=50;
	}
	
	@Override
	void on_off() {
		if(this.power) {
			this.power=false;
			System.out.println("����OFF");
		}
		else {
			this.power=true;
			System.out.println("����ON");
		}
	}

	@Override
	void volUp() {
		if(this.power) {
			this.vol++;
			if(this.vol>100) {
				this.vol=100;
			}
		}
		else {
			System.out.println("����OFF����");
		}
	}

	@Override
	void volDown() {
		if(this.power) {
			this.vol--;
			if(this.vol<0) {
				this.vol=0;
			}
		}
		else {
			System.out.println("����OFF����");
		}
	}

}

public class TVMainAct {

	public static void main(String[] args) {
		SmartTV t=new SmartTV();
		t.volDown();
		t.on_off();
		t.volDown();
	}

}
