// 돈을 넣으세요. 1200 즉시종료
// 커피 800 주스 1200 녹차 1000


#include <stdio.h>;
int main() {
	int input;
	int act;

	while (true) {
		printf("돈을 넣어주세요: \n");
		scanf("%d", &input);

		if (input <= 0) {
			printf("0원 미만은 투입 불가.");
			continue;
		}
		break;
	}
	while (true) {
		printf("\n1.커피. 2.주스. 3.녹차 4.돈 더넣기 5.종료\n번호: ");
		scanf("%d", &act);

		int cof = 800;
		int ju = 1200;
		int gr = 1000;

		if (act == 1) {
			if (input >= cof) {
				input -= cof;
				printf("주문성공. 거스름돈: %d", input);
			}
			else {
				printf("잔액 부족");
			}

		}
		else if (act == 2) {
			if (input >= ju) {
				input -= ju;
				printf("주문성공. 거스름돈: %d", input);
			}
			else {
				printf("잔액 부족");
			}

		}
		else if (act == 3) {
			if (input >= gr) {
				input -= gr;
				printf("주문성공. 거스름돈: %d", input);
			}
			else {
				printf("잔액 부족");
			}

		}
		else if (act == 4) {
			printf("금액 투입");
			int add;
			scanf("%d", &add);
			if (add <= 0) {
				printf("0원 이하 투입불가.");
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