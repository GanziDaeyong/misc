#include <stdio.h>

int main() {

	/*
	printf("�����Է�");
	int num;
	scanf("%d", &num);
	if (num % 2 == 0) { // ������ �켱���� ���� 
		printf("¦��\n");
	}

	else {
		printf("Ȧ��\n");
	}

	if (num % 3 == 0) {
		printf("3�� ���");
	}
	*/

	// C�� else if �̴�.

	int x, y, z;
	scanf("%d%d%d", &x, &y, &z);
	int biggest;
	if (x > y) {
		if (x > z) {
			biggest = x;
		}
		else {
			biggest = z;
		}
	}
	else {
		if (y > z) {
			biggest = y;
		}
		else {
			biggest = z;
		}
	}
	printf("%d", biggest);



	return 0;
}