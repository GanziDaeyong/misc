#1~100까지 중 4까지 출력
"""
for i in range(1,101):
    print(i)
    if i == 4:
        break

#순서 유의해라!

#100~1까지 중 break 사용 70까지

for i in range(100,0,-1):
        print(i)
        if i == 70:
            break

#1~100까지 중 짝수만 출력
for i in range(1,101):
    if i%2==1:
        continue
    print(i)

"""

#1~100까지 중 5의 배수만 출력
for i in range(1,101):
    if i%5 != 0:
        continue
    print(i)

#1~100까지 중 3과 5의 공배수 출력

for i in range(1,101):
    # if not(i%3==0 and i%5==0): -> 3과 5도 출력. 참 거짓 잘 살펴봐라.

    if i%5 !=0 or i%3 !=0:
        continue
    print(i)

#같지 않다이기 때문에 and가 아니라 대우인 or이다.
