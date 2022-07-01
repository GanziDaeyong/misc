#include <stdio.h>;
int main() {

	/*

	int i;
	double d;
	char c;

	printf("정수입력: ");
	scanf("%d", &i);
	printf("실수입력: ");
	scanf("%d", &d);
	printf("문자입력: ");
	scanf("%d",&c);

	return 0;


	int a = 10, b = 20;
	int c = a > b ? a : b;

	*/

	// 정수 3개 입력 / 평균값 내기
	int x, y, z;
	scanf("%d%d%d", &x,&y,&z);
	double avg = (x + y + z) / 3.0;
	printf("%.2lf\n", avg);
	
	int small = x < y ? x : y;
	small = small < z ? small : z;

	printf(small);

	return 0;


}
