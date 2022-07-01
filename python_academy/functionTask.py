#홀수는 짝수로 짝수는 홀수로 바꿔주는 메서드
#1부터 내가 입력한 정수까지 누적 합을 구해주는 매서드
#정수를 한글로 바꿔주는 메서드
#예) 1024
# 일공이사

def add(x,y):
        print("덧셈 메서드 입니당")
        return x+y

result = add(1,3)
print(result)

#집가서 해봥..

#1부터 정수까지 누적 합을 구해주는 메서드

def getSumFrom1(end):
    result=0
    if end > 1:
        for i in range(1,end+1):
            result+=i
        #return 할 필요 없다.
    else:
        result= "1보다 큰 수를 입력하세요"

    print(result)
    
getSumFrom1(-41)

#정수를 한글로 바꿔주는 메서드

def changeToHangle(data):
    hangle="공일이삼사오육칠팔구"
    num = int(data)
    result = ""
    for i in range(len(data)):
        result += hangle[num % 10]
        num = num // 10

    for i in range(len(data) -1, -1, -1):
        print(result[i], end="")

hMsg = "한글로 변경할 정수를 입력하세요\n"
data = input(hMsg)
changeToHangle(data)

#이거 꼭 다시 해볼 것.

