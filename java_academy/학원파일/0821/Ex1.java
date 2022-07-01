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
		// ���� ���ϸ� �Է½� ������������⶧����,
		// ���ϸ� Ȯ�� �ʼ�!
		try {
			f.createNewFile();
		} catch (IOException e) {
			System.out.println("���ϰ�ü������ ����ó���� �ʼ���!");
		}
		finally {
			System.out.println("���ϻ��� try�� ����Ϸ�");
		}
		
		// [��Ʈ��] : ����´���
		try {
			FileInputStream fis=new FileInputStream(f);
			// ��η� �ٷ���������
			int data;
			while( (data=fis.read()) !=-1 ) {
				System.out.print((char)data);
			}
			System.out.println();
		} catch (FileNotFoundException e) {
			// �ֻ�������Ŭ���� Exception�� ����Ҽ�������
			System.out.println("����� ������ �����ϴ��� Ȯ��!");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally {
			System.out.println("input��Ʈ�� try�� ����Ϸ�");
		}
		/*
		try {
			FileOutputStream fos=new FileOutputStream("C:\\Users\\ITSC\\Desktop\\KIM\\output.txt");
			fos.write(98);
			fos.flush();
			fos.close();
		} catch (Exception e) {
			System.out.println("flush()");
			System.out.println("������ �̹������Ѵٸ�, ����� �����");
		}
		finally {
			System.out.println("output��Ʈ�� try�� ����Ϸ�");
		}
		*/
		try {
			FileInputStream fis2=new FileInputStream("C:\\Users\\ITSC\\Desktop\\KIM\\tm.jpg");
			FileOutputStream fos2=new FileOutputStream("C:\\Users\\ITSC\\Desktop\\KIM\\tmtm.jpg");
			byte[] buff=new byte[1000];
			int len;
			while(  (len=fis2.read(buff)) != -1  ) {
				// buff�� �о���� �о�¸�ŭ len�� ��ȯ
				fos2.write(buff, 0, len);
				// buff�迭�� index[0]������ len��ŭ�� write()����
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
			FileWriter fw=new FileWriter("C:\\Users\\ITSC\\Desktop\\KIM\\output.txt",true); // �̾��
			fw.write("g"); // �����
			fw.flush();
			fw.close();			
		} catch (Exception e) {
		}
		
	}

}






