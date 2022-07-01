import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

// C:\Users\ITSC\Desktop\KIM

public class Ex1 {

	public static void main(String[] args) {
		
		File f=new File("C:\\Users\\ITSC\\Desktop\\KIM\\abc.txt");
		// 없는 파일명 입력시 생성해줘버리기때문에,
		// 파일명 확인 필수!
		try {
			f.createNewFile();
		} catch (IOException e) {
			System.out.println("파일객체생성시 예외처리가 필수다!");
		}
		finally {
			System.out.println("파일생성 try문 수행완료");
		}
		
		// [스트림] : 입출력단위
		try {
			FileInputStream fis=new FileInputStream(f);
			// 경로로 바로지정가능
			int data;
			while( (data=fis.read()) !=-1 ) {
				System.out.print((char)data);
			}
			System.out.println();
		} catch (FileNotFoundException e) {
			// 최상위예외클래스 Exception을 사용할수도있음
			System.out.println("출력할 파일이 존재하는지 확인!");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally {
			System.out.println("input스트림 try문 수행완료");
		}
		/*
		try {
			FileOutputStream fos=new FileOutputStream("C:\\Users\\ITSC\\Desktop\\KIM\\output.txt");
			fos.write(98);
			fos.flush();
			fos.close();
		} catch (Exception e) {
			System.out.println("flush()");
			System.out.println("파일이 이미존재한다면, 덮어쓰기 진행됨");
		}
		finally {
			System.out.println("output스트림 try문 수행완료");
		}
		*/
		try {
			FileInputStream fis2=new FileInputStream("C:\\Users\\ITSC\\Desktop\\KIM\\tm.jpg");
			FileOutputStream fos2=new FileOutputStream("C:\\Users\\ITSC\\Desktop\\KIM\\tmtm.jpg");
			byte[] buff=new byte[1000];
			int len;
			while(  (len=fis2.read(buff)) != -1  ) {
				// buff로 읽어오고 읽어온만큼 len에 반환
				fos2.write(buff, 0, len);
				// buff배열의 index[0]번부터 len만큼을 write()수행
			}
			fis2.close();
			fos2.flush();
			fos2.close();
		} catch (Exception e) {
		}
		
		try {
			FileReader fr=new FileReader("C:\\Users\\ITSC\\Desktop\\KIM\\input.txt");
			char[] cbuff=new char[100];
			int len;
			String str="";
			while(  (len=fr.read(cbuff)) !=-1  ) {
				str=new String(cbuff,0,len);
			}
			System.out.println(str);
			fr.close();
			
		} catch (Exception e) {
			
		}		
		
		try {
			FileWriter fw=new FileWriter("C:\\Users\\ITSC\\Desktop\\KIM\\output.txt",true); // 이어쓰기
			fw.write("g"); // 덮어쓰기
			fw.flush();
			fw.close();			
		} catch (Exception e) {
		}
		
	}

}






