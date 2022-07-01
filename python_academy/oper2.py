n1Msg="첫번째 정수: "
n2Msg="두번째 정수: "


num1=int(input(n1Msg))
num2=int(input(n2Msg))

num1 > num2

#result = "첫번째 정수가 더 큽니다."  if num1 > num2 else "두번째 정수가 더 큽니다" if num2 > num1 else "두 수가 같습니다."
#print(result)

print("첫번째 정수가 더 큽니다.")  if num1 > num2 else print ("두번째 정수가 더 큽니다") if num2 > num1 else print ("두 수가 같습니다.")

#여러개는 길기 때문에 삼항연산자는 이러한 목적으로 사용하지 않는다.

