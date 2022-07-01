
interface remote{
	int soundMin=0;
	int soundMax=10;
	void volUp();
	void volDown();
}
interface remoteP extends remote{
	void powerOn();
	void powerOff();
}
class TV {
	boolean power;
	int vol;
	void show() {
		// 전원상태/볼륨 출력
	}
}
class SmartTV extends TV implements remoteP{
	void recommend() {
		System.out.println("추천영상");
	}

	@Override
	public void volUp() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void volDown() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void powerOn() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void powerOff() {
		// TODO Auto-generated method stub
		
	}
}

public class T {
	public static void main(String[] args) {
		
	}
}










