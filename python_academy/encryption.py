#암호화
#ord(문자) :문자를 정수로
#chr(정수) :정수를 문자로

pw = "alb2c3"
en_pw = ""

for i in pw:
    en_pw += chr(ord(i)*17)

print("기본:"+pw)
print("암호화:"+en_pw)
