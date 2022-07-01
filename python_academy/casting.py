print(11//9)
print(11.0//9) #11은 정수 11.0은 실수이기 때문에. -> 인터프리터에서 자동형변환 된다.
print("A"+"BC") #이건 연결 concatenate
print("-----------------------")
#강제 형변환 
print(float(11)//9) #실수로 바꾼다
print(int(8.43)+2.59) #정수로 바꾼다.
print(int(8.43+2.59))#소괄호가 항상 우선순위 연산자이다.
print(int(8.43)+int(2.59))
#문자열 형변환
data1="1"
data2="2"
print(int(data1)+int(data2)) #하수의 방식
num1=int(data1)
num2=int(data2)
result=num1+num2
print(result)
print("%d+%d=%d"%(num1,num2,result))

