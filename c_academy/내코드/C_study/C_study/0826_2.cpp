#include <stdio.h>

int main() {

	/*
	printf("정수입력");
	int num;
	scanf("%d", &num);
	if (num % 2 == 0) { // 연산자 우선순위 따라 
		printf("짝수\n");
	}

	else {
		printf("홀수\n");
	}

	if (num % 3 == 0) {
		printf("3의 배수");
	}
	*/

	// C도 else if 이다.

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