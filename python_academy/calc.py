#1+1 
#2
title = "계산기\n"
arOper = ["+","-","*","/"]
math = input(title)
result = 0
oper = ""
index = 0
for i in arOper:
    #1+1
    for j in math:
        if i == j:
            oper = i
            index = math.index(i)

num1 = int(math[0:index])
num2 = int(math[index+1:])

if oper == "+":
    result = num1+num2

elif oper == "-":
    result = num1-num2

elif oper == "*":
    result = num1*num2

elif oper == "/":
    if num2 != 0:
        result = "{:.2f}".format(num1/num2)
        #result = float(result) 이부분 다시 해보기. format이해하자.
        result = num1/num2
    else:
        result = "0으로 나눌 수 없습니다"

print(result) 
#print(oper, index)
