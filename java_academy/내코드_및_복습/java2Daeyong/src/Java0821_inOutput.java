import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;


//C:\Users\iwin1\Desktop\��������¿���


public class Java0821_inOutput {

	public static void main(String[] args) {
		
		/*
		
		// TODO Auto-generated method stub
		File f = new File("C:\\Users\\iwin1\\Desktop\\��������¿���\\abcd.txt"); // �̸� �߸�ó�� �׳� ������ ����������.
		
		// ���� ���ϸ� �Է½� ������������� ������, ���ϸ� Ȯ���� �ʼ��̴�.
		try { 
			f.createNewFile(); // �� try, catch? -> �޸� ����.
		} catch (IOException e) {
			System.out.println("���ϰ�ü������ ����ó�����ʼ���!");
			e.printStackTrace();
		}
		finally {
			System.out.println("���ϻ��� try�� ����Ϸ�");
		}
		
		// ��Ʈ�� : ������� �����̴�.
		try {
			FileInputStream fis = new FileInputStream(f);
		// ��η� �ٷ� ���� �����ϴ�.
			int data; // return Ÿ���� int�����ϱ� �װ� ���� data�� int��.
			while((data = fis.read()) != -1) { //read() �Լ��� int�� �����ϸ�, ���� �����ϸ� -1�� �����Ѵٴ� Ư¡�� �ִ�.
				System.out.println((char)data); // �״ϱ� -1�� ���ö����� while�� �����Ѵ�. 
			}
			
		} catch (Exception e) {
			System.out.println("����� ������ �����ϴ��� Ȯ��");
			e.printStackTrace();
			// �̷������� �ֻ��� ������ �ص� �ǰ�.
		}
		finally {
			System.out.println("input ��Ʈ�� try�� ����Ϸ�");
		}
		// ������ ���� ���� ��ü�� �����. 
	//##################################���############################	
		
		try {
			FileOutputStream fos = new FileOutputStream("C:\\Users\\iwin1\\Desktop\\��������¿���\\output.txt");
			
			fos.write(98);
			fos.flush(); // ������ ���̳� ���� ���� �� �ֱ� ������ �ѹ��� �о��ִ� ��. ���Ŀ� stream�� �ѹ� �� �� ������ ������ ���. 
			// �ٵ� ������ �� ���� ������ �׳� ���ִ� ���� ����. 
			fos.close(); // flush�ϰ� �ݴ°� ���̽�� ����ϳ�.
		} catch (Exception e) {
			System.out.println("flush()");
			System.out.println("������ �̹� �����Ѵٸ�, ����Ⱑ ����ȴ�."); // ���ٿ����ų� �� �緮�� ���� ���̴�.
			e.printStackTrace();
		} finally {
			System.out.println("output��Ʈ�� try�� ����Ϸ�");
		}

/////////////////////////////////���� �����ϱ�//////////////////////////////////////////////////////////////////
		
		try {
			FileInputStream fis2 = new FileInputStream("C:\\Users\\iwin1\\Desktop\\��������¿���\\53a16c4fc12f0559bf7689b88ec90b23c7d8b63e.jfif");
			FileOutputStream fos2 = new FileOutputStream("C:\\Users\\iwin1\\Desktop\\��������¿���\\edited.jfif");
			byte[] buff = new byte[1000];
			int len;
			while((len = fis2.read(buff)) != -1 ) {
				// buff�� �о����, �о�� ��ŭ len�� ��ȯ�Ѵ�.
				fos2.write(buff, 0, len); // 0������ �о�� ��ŭ ���ڴٴ� ���̴�.
				// buff�迭�� index[0]������ len��ŭ�� write() ����.
			}
			fos2.close();
			fos2.flush();
			fos2.close();
			// ������ ���������� ctrl C ctrl V�� �̷� ��Ŀ�������� ���� �ִ� ���̴�. 
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		//int data;
		//while((data = fis.read()))
	*/
		
		
		//////////////�ѹ��� �޾ƿ���
		try {
			FileReader fr = new FileReader("C:\\Users\\iwin1\\Desktop\\��������¿���\\input.txt");
			char[] cbuff = new char[100];
			String str = "";
			int len;
			while ( (len = fr.read(cbuff))!= -1) {
				str = new String(cbuff,0,len); // cbuff���� �޾ƿ� ���� 0���� len���� str�� ��´�!
			}
			System.out.println(str);
			fr.close();
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		/////////////�ѹ��� ����
		
		
		try {
			
			FileWriter fw = new FileWriter("C:\\Users\\iwin1\\Desktop\\��������¿���\\output.txt",true); // �� ��° ���ڸ� true�� �ָ�
			fw.write("�ȳ�");
			fw.write("��");
			fw.flush();
			fw.close(); // �� �����ε�. �� �ڵ尡 ��� ��ü������ ����. ���� ������. �Է��� �׳� �ѹ��� ���൵ �Ǵµ�. ���� str�ȸ���.
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		// file inputstream / fileoutputstream / filewriter / filereader (�ڿ� �ΰ��� �αⰡ ���� ������ �׳� �˸� �� ���ϴϱ�);
		// ���ٿ� ���� ������. 
		
		
		
	}
	

}
