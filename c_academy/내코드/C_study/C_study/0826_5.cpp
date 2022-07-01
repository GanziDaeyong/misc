#include <stdio.h>;
int main() {

	int h, m;
	scanf("%d%d", &h, &m);
	h--;
	m -= 20;

	if (m < 0) {
		m += 60;
		h--;
	}

	if (h <= 0) {
		h += 12;
	}

	printf("%d½Ã %dºÐ", h, m);

	return 0;


}