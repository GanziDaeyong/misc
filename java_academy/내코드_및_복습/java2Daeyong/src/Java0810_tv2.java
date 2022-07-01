interface remote {
	int soundMin = 0;
	int soundMax = 10; // 상수로 직접 쓸 수 있기 때문에 가독성이 증가한다.
	void volUp();
	void volDown();
}

interface remoteP extends remote{ // 인터페이스끼리는 상속이 가능하다 // 오잉 인터페이스는 구현이라며..
	void powerOn();
	void powerOff();
}

class tv2 {

	boolean power;
	int vol;

}


class sTv extends tv2 implements remoteP { // 굳이 이미 상속/구현받은거 안써줘도 된다.
	
	sTv() {
		this.power = false;
		this.vol = 0;
	}
	
	void recommend() {
		System.out.println("추천 영상");
	}

	void show() {
		if (this.power) {
			System.out.println("전원 켜져있음.\n" + "볼륨: " + this.vol);
		}
		else {
			System.out.println("전원 꺼져있음.");
		}
	}
	@Override
	public void volUp() {
		this.vol += 10;
		if (this.vol >= soundMax) {
			this.vol = soundMax;
			System.out.println("최대볼륨");
		}
		System.out.println("볼륨: " + this.vol);

	}
	@Override
	public void volDown() {
		this.vol -= 10;
		if (this.vol <= soundMin) {
			this.vol = soundMin;
			System.out.println("최소볼륨");
		}
		System.out.println("볼륨: " +this.vol);
	}
	@Override
	public void powerOn() {
		if (this.power == false) {
			this.power = true;
			System.out.println("전원 on");
		}
		else {
			System.out.println("이미 전원 on");
		}

	}
	@Override
	public void powerOff() {
		if (this.power) {
			this.power = false;
			System.out.println("전원 off");
		}
		else {
			System.out.println("이미 전원 off");
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
/////////////////////왜..?///////////////////////

////////////////////////////////////마무리짓기///////////////////////////////
