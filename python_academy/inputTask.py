#정수 두개를 입력 받고 더한 결과값 출력하기
#입력한 숫자가 실수인지 정수인지 알아내기 - 문자열로 input 받고 실수로 형변환해라. 그 값을 저장공간에 받고 다시 정수로 바꿔줘. 실수-정수.


numa=int(input("첫 숫자를 입력하세요"))
numb=int(input("둘째 숫자를 입력하세요"))
result=str(int(numa)+int(numb))
print("첫 번째 숫자:"+numa)
print("두 번째 숫자:"+numb)
print(str(numa)+str(numb)=result+"입니다")

"""
----------------------------------------------------------------

n1Msg="첫번째 정수:"
n2Msg="두번째 정수:"

num1 = int(input(n1Msg))
num2 = int(input(n2Msg))
result = num1+num2

print("%d+%d=%d"%(num1,num2,result))

msg = "숫자를 입력하세요\n"
data= input(msg)
fData=float(data)
iData=int(fData)
print(fData-iData)

"""
