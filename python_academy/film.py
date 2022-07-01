#술 마시러 갈래?
#1. 이미 예약했어.
#2. 술만 마셔요?
#3. 제사가 있어서 다음에 먹어요~
#4. 사는 거지~?

qMsg = "술 마시러 갈래요?\n"
choiceMsg = "1.이미 예약했어.\n2.술만 마셔요?\n3.제사가 있어서 다음에 먹어요~\n4.사는 거지~?\n"
choice = int(input(qMsg + choiceMsg))

#pass기타연산자
if choice == 1:
    print("어? 나도.")
elif choice == 2:
    print("밥도 먹든지")
elif choice == 3:
    print("청주 1차 나랑 2차")
elif choice == 4:
    print("이번엔 내가 살게")
else:
    print("응 뭐라고?")


