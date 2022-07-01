
class Teach{
	String name;
	int time;
	Teach(){
		this("과목없음",0);
	}
	Teach(String name){
		this(name,2);
	}
	Teach(String name,int time){
		this.name=name;
		this.time=time;
	}
}

public class TeachMainAct {

	public static void main(String[] args) {
		Teach t1=new Teach();
		System.out.println(t1.name+": "+t1.time+"시간");
		Teach t2=new Teach("C언어");
		System.out.println(t2.name+": "+t2.time+"시간");
		Teach t3=new Teach("JAVA",3);
		System.out.println(t3.name+": "+t3.time+"시간");
	}

}








