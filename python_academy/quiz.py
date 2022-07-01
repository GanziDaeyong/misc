#Q. 다음 중 프로그래밍 언어가 아닌 것은?
#1. java 2. python 3. Clanguage 4. 망둥어

qMsg="Q. which one is not the programming language?\n"
choiceMsg="1.Java\n2.python\n3.C\n4.망둥어\n"

choice = int(input(qMsg+choiceMsg))

#print("Wrong, dude") if choice < 4 else print("u got it, dude") if choice == 4 else print("u got it, dude")
#값을 따로 지정해야지 수정하지..

answer = 4

#print("U got it dude") if choice == answer1 else print("Wrong") if choice >=1 and choice <= 4 else print("?")


if choice == answer:
        print("Right")
elif choice>=1 and choice <=4:
        print("Wrong")
else:
        print("?")

#조건식이 뭔지 확실히 알아라.
        
