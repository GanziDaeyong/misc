import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Random;
import java.util.Scanner;
import java.io.FileReader;
import java.io.File;
import java.io.BufferedReader;

class myException extends Exception {
	String msg;
	myException (String msg) {
		super(msg);
	}
}

class User {
	String name;
	int maxNum;
	LinkedList<Book> myLib = new LinkedList();
	User(String name, int maxNum) {
		this.name = name;
		this.maxNum = maxNum;
	}
	void bor_book (Book input) {
		myLib.add(input);

	}

	void check () {
		System.out.println("========ȸ�� ����========");
		System.out.println("�̸�: " + this.name);
		System.out.println("���� ���� å ��: " + this.maxNum);

		System.out.println("���� ���� ���� ���: ");
		for (int i = 0 ; i < myLib.size() ; i++) {
			System.out.println("[" + myLib.get(i).bookNum + "|" + myLib.get(i).title + "]");
		}

	}
}

class Book {
	String title;
	int bookNum;
	int inOrOut;
	Book(String title, int howMany) {
		this.title = title;
		Random r = new Random();
		this.bookNum = r.nextInt(1000);
		this.inOrOut += howMany; // 0�̸� out. 
	}
	Book(String title) {
		this(title, 3);
	}

	public String toString() {
		return this.bookNum + "." + this.title + " (" + this.inOrOut + ")";
	}
}


public class Java0820_lastEX {

	public static void main(String[] args) {

		int user = 0;
		ArrayList<Book> lib = new ArrayList();
		User [] userList = new User [3];
		userList[0] = new User("���", 3);
		userList[1] = new User("����", 2);
		userList[2] = new User("����", 2);

		try {

			File file = new File("C:\\���\\��ǻ�Ͱ���\\cs_portfolio\\�������������_ũ�ѷ�\\forLib.txt");

			FileReader filereader = new FileReader(file);

			BufferedReader buf = new BufferedReader(filereader);
			String line = "";

			while((line = buf.readLine())!= null) {
				lib.add(new Book(line));
			}
		}
		catch (Exception e) {
			System.out.println(e.getMessage());
		}


		myException brError = new myException("\n���� ������ å ��: 0");
		myException meError = new myException("\n�ùٸ� �޴� ��ȣ�� �Է����ּ���");
		myException stError = new myException("\nå�� ��� �������Դϴ�.");
		myException nbError = new myException("\n������ ������ �����ϴ�.");
		myException userIndexError = new myException("\n�ùٸ� ����� ��ȣ�� �Է����ּ���.");
		myException bookNumError = new myException("\n�ùٸ� å ��ȣ�� �Է����ּ���.");

		Scanner sc = new Scanner(System.in);




		int sw = 0;

		while (true) {

			try {

				if (sw == 0) {

					System.out.println("====================ȸ������====================");
					for (int i = 0 ; i < userList.length ; i++) {
						System.out.println(i+1 + "." + userList[i].name);
					}

					user = sc.nextInt();
					if (user >= userList.length + 1) 
						throw userIndexError;

					else {
						System.out.println(userList[user-1].name +"���� �������� �����մϴ�.");
						sw = 1;
						continue;
					}
				}

				else if (sw == 1) {

					System.out.println("\n====================���θ޴�====================");
					System.out.println("1.�뿩 2.�ݳ� 3.���� ��� 4.ȸ�� ���� ��ȸ 5.ȸ�� ���� 6.���� ");

					int act = sc.nextInt();

					if (act < 1 || act > 6) {
						throw meError;
					}

					if (act == 1) {
						// �뿩
						System.out.println(userList[user-1].name + "���� ���Ⱑ���� å ��: " + userList[user-1].maxNum );

						if (userList[user-1].maxNum == 0) { 
							throw brError;
						}

						System.out.println();

						System.out.println("\n=====================�������====================\n");
						for (int j = 0 ; j < lib.size() ; j++) {
							System.out.println(lib.get(j).bookNum + "|" + lib.get(j).title + " (" + lib.get(j).inOrOut+ ")");
						}
						System.out.println("\n������ å ��ȣ�� �Է��ϼ���");

						int inputNum = sc.nextInt();

						int sw2 = 0;
						for (int j = 0 ; j < lib.size(); j++) {
							if (inputNum == lib.get(j).bookNum) {

								if (lib.get(j).inOrOut == 0) {
									throw stError;
								}
								System.out.println("\n[" + lib.get(j).title + "] ���� ����");
								userList[user-1].bor_book(lib.get(j)); 
								lib.get(j).inOrOut --;
								userList[user-1].maxNum --;
								sw2 = 1;
							}

						}
						if (sw2 == 0) {

							throw bookNumError;
						}

					}
					else if (act == 2) {
						System.out.println("====================�����ݳ�====================");
						if (userList[user-1].myLib.size() == 0) {
							throw nbError;
						}

						for (Book v : userList[user-1].myLib) {
							System.out.println(v.bookNum + "." + v.title);
						}
						System.out.println("�ݳ��� ���� ��ȣ�� �Է��ϼ���");
						int input = sc.nextInt();
						int sw3 = 0;
						for (int i = 0 ; i < userList[user-1].myLib.size(); i ++) { //String ���Ϸ��� equals���!
							if (input == userList[user-1].myLib.get(i).bookNum) {
								sw3 = 1;
								System.out.println("������ �ݳ��Ǿ����ϴ�.");
								userList[user-1].myLib.remove(i);
								userList[user-1].maxNum ++;
								for (int f = 0 ; f < lib.size(); f++) {
									if (input == lib.get(f).bookNum) {
										lib.get(f).inOrOut ++;
									}
								}
							}
						}
						
						if (sw3 == 0) {
							throw bookNumError;
						}
						
					}

					else if (act == 3) {
						// å�ֱ�
						int howMany = 0;

						System.out.println("====================�������====================");
						System.out.println("å �̸� �Է�: ");
						sc.nextLine();
						String title = sc.nextLine();

						System.out.println(title + "��(��) �� �� �̻��Դϱ�? (�ƴϿ�: 0 / ��: 1) ");
						int how = sc.nextInt();
						if (how > 1 || how < 0) {
							throw meError;
						}
						if (how == 0) {
							lib.add(new Book(title, 1));
						}
						else {
							System.out.println("å ������ �Է����ּ��� : ");
							howMany = sc.nextInt();
							lib.add(new Book(title, howMany));
						}

						System.out.println("���� å ���: ");
						for (Book v : lib) {
							System.out.println(v);
						}
						
					}
					
					else if (act == 4) {
						userList[user-1].check();
					}

					else if (act == 5) {
						sw = 0;
						continue;
					}


					else {
						break;
					}
				}
			}

			catch(myException e) {

				System.out.println(e.getMessage());
			}

		}


	}
}

