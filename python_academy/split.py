#정수 2개를 입력하세요
"""
msg="정수 2개를 입력하세요\n예)1,2\n"
data1, data2 = input(msg).split(",")
num1=int(data1)
num2=int(data2)

print(num1+num2)
#a.b: a안에 b


phoneMsg="휴대폰 번호를 입력하세요\n예)010-0000-0000\n"
fNum, mNum, lnum = input(phoneMsg).split("-")
print("끝 번호:" + lnum)

"""

emMsg="이메일 주소를 입력하세요\n예)iwin1203@naver.com\n"
userId,Domain = input(emMsg).split("@")

print("ID: "+userId)
print("주소: "+Domain)

#split 두번하면? 그 밑에 하나 더 지정해주면 된다.
