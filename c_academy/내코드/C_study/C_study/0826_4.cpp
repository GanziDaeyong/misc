// ���� ��������. 1200 �������
// Ŀ�� 800 �ֽ� 1200 ���� 1000


#include <stdio.h>;
int main() {
	int input;
	int act;

	while (true) {
		printf("���� �־��ּ���: \n");
		scanf("%d", &input);

		if (input <= 0) {
			printf("0�� �̸��� ���� �Ұ�.");
			continue;
		}
		break;
	}
	while (true) {
		printf("\n1.Ŀ��. 2.�ֽ�. 3.���� 4.�� ���ֱ� 5.����\n��ȣ: ");
		scanf("%d", &act);

		int cof = 800;
		int ju = 1200;
		int gr = 1000;

		if (act == 1) {
			if (input >= cof) {
				input -= cof;
				printf("�ֹ�����. �Ž�����: %d", input);
			}
			else {
				printf("�ܾ� ����");
			}

		}
		else if (act == 2) {
			if (input >= ju) {
				input -= ju;
				printf("�ֹ�����. �Ž�����: %d", input);
			}
			else {
				printf("�ܾ� ����");
			}

		}
		else if (act == 3) {
			if (input >= gr) {
				input -= gr;
				printf("�ֹ�����. �Ž�����: %d", input);
			}
			else {
				printf("�ܾ� ����");
			}

		}
		else if (act == 4) {
			printf("�ݾ� ����");
			int add;
			scanf("%d", &add);
			if (add <= 0) {
				printf("0�� ���� ���ԺҰ�.");
				continue;
			}

			input += add;
		}
		else {
			break;
		}
	}

	return 0;

}