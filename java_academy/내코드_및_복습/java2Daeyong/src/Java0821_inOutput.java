import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;


//C:\Users\iwin1\Desktop\파일입출력연습


public class Java0821_inOutput {

	public static void main(String[] args) {
		
		/*
		
		// TODO Auto-generated method stub
		File f = new File("C:\\Users\\iwin1\\Desktop\\파일입출력연습\\abcd.txt"); // 이름 잘못처면 그냥 묵묵히 만들어버린다.
		
		// 없는 파일명 입력시 생성해줘버리기 때문에, 파일명 확인은 필수이다.
		try { 
			f.createNewFile(); // 왜 try, catch? -> 메모리 이유.
		} catch (IOException e) {
			System.out.println("파일객체생성시 예외처리가필수다!");
			e.printStackTrace();
		}
		finally {
			System.out.println("파일생성 try문 수행완료");
		}
		
		// 스트림 : 입출력의 단위이다.
		try {
			FileInputStream fis = new FileInputStream(f);
		// 경로로 바로 지정 가능하다.
			int data; // return 타입이 int였으니까 그걸 담을 data도 int로.
			while((data = fis.read()) != -1) { //read() 함수는 int를 리턴하며, 끝에 도달하면 -1을 리턴한다는 특징이 있다.
				System.out.println((char)data); // 그니까 -1이 나올때까지 while문 수행한다. 
			}
			
		} catch (Exception e) {
			System.out.println("출력할 파일이 존재하는지 확인");
			e.printStackTrace();
			// 이런식으로 최상위 오류로 해도 되고.
		}
		finally {
			System.out.println("input 스트림 try문 수행완료");
		}
		// 순서는 먼저 파일 객체를 만들고. 
	//##################################출력############################	
		
		try {
			FileOutputStream fos = new FileOutputStream("C:\\Users\\iwin1\\Desktop\\파일입출력연습\\output.txt");
			
			fos.write(98);
			fos.flush(); // 쓰레기 값이나 무언가 남을 수 있기 때문에 한번에 밀어주는 것. 이후에 stream을 한번 더 열 생각이 있으면 써라. 
			// 근데 오류를 안 내기 때문에 그냥 써주는 것이 좋다. 
			fos.close(); // flush하고 닫는건 파이썬과 비슷하네.
		} catch (Exception e) {
			System.out.println("flush()");
			System.out.println("파일이 이미 존재한다면, 덮어쓰기가 진행된다."); // 덧붙여쓰거나 할 재량이 없는 것이다.
			e.printStackTrace();
		} finally {
			System.out.println("output스트림 try문 수행완료");
		}

/////////////////////////////////사진 복사하기//////////////////////////////////////////////////////////////////
		
		try {
			FileInputStream fis2 = new FileInputStream("C:\\Users\\iwin1\\Desktop\\파일입출력연습\\53a16c4fc12f0559bf7689b88ec90b23c7d8b63e.jfif");
			FileOutputStream fos2 = new FileOutputStream("C:\\Users\\iwin1\\Desktop\\파일입출력연습\\edited.jfif");
			byte[] buff = new byte[1000];
			int len;
			while((len = fis2.read(buff)) != -1 ) {
				// buff로 읽어오고, 읽어온 만큼 len에 반환한다.
				fos2.write(buff, 0, len); // 0번부터 읽어온 만큼 쓰겠다는 뜻이다.
				// buff배열의 index[0]번부터 len만큼을 write() 수행.
			}
			fos2.close();
			fos2.flush();
			fos2.close();
			// 실제로 내부적으론 ctrl C ctrl V가 이런 메커니즘으로 돌고 있는 것이다. 
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		//int data;
		//while((data = fis.read()))
	*/
		
		
		//////////////한번에 받아오기
		try {
			FileReader fr = new FileReader("C:\\Users\\iwin1\\Desktop\\파일입출력연습\\input.txt");
			char[] cbuff = new char[100];
			String str = "";
			int len;
			while ( (len = fr.read(cbuff))!= -1) {
				str = new String(cbuff,0,len); // cbuff에서 받아온 것을 0부터 len까지 str에 담는다!
			}
			System.out.println(str);
			fr.close();
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		/////////////한번에 쓰기
		
		
		try {
			
			FileWriter fw = new FileWriter("C:\\Users\\iwin1\\Desktop\\파일입출력연습\\output.txt",true); // 두 번째 인자를 true로 주면
			fw.write("안녕");
			fw.write("☆");
			fw.flush();
			fw.close(); // 늘 오버로딩. 위 코드가 어떤지 전체적으로 봐라. 오류 볼때는. 입력은 그냥 한번에 써줘도 되는듯. 굳이 str안만들어도.
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		// file inputstream / fileoutputstream / filewriter / filereader (뒤에 두개는 인기가 있진 않지만 그냥 알면 더 편하니까);
		// 업다운 게임 만들어보기. 
		
		
		
	}
	

}
