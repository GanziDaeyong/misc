#include <stdio.h> 
#include <ctype.h>
int main() {

// 신호등 - 색깔을 입력받을 것이다. R정지 Y주의 G출발

	char input;
	scanf("%d", &input);

	if (input == 'R') {
		printf("정지");
	}
	else if (input == 'Y') {
		printf("주의");
	}
	else if (input == 'G'){
		printf("출발~");
	}
	else {
		printf("이상한거 입력");
	}

	return 0;
}