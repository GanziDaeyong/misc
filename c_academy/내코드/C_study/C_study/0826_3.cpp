#include <stdio.h> 
#include <ctype.h>
int main() {

// ��ȣ�� - ������ �Է¹��� ���̴�. R���� Y���� G���

	char input;
	scanf("%d", &input);

	if (input == 'R') {
		printf("����");
	}
	else if (input == 'Y') {
		printf("����");
	}
	else if (input == 'G'){
		printf("���~");
	}
	else {
		printf("�̻��Ѱ� �Է�");
	}

	return 0;
}