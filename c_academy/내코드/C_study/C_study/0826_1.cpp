#include <stdio.h>;
int main() {

	/*

	int i;
	double d;
	char c;

	printf("�����Է�: ");
	scanf("%d", &i);
	printf("�Ǽ��Է�: ");
	scanf("%d", &d);
	printf("�����Է�: ");
	scanf("%d",&c);

	return 0;


	int a = 10, b = 20;
	int c = a > b ? a : b;

	*/

	// ���� 3�� �Է� / ��հ� ����
	int x, y, z;
	scanf("%d%d%d", &x,&y,&z);
	double avg = (x + y + z) / 3.0;
	printf("%.2lf\n", avg);
	
	int small = x < y ? x : y;
	small = small < z ? small : z;

	printf(small);

	return 0;


}
