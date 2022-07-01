"""

name = open("C:/python_1630_JDY/workspace/name.txt","a")
#name.write("\n트와이스")
name.close()

name = open("C:/python_1630_JDY/workspace/name.txt","r")
arName = name.readlines()

    
ask = input("검색하실 이름을 입력하세요\n")

for i in arName:
    
    if ask in i:
        print(i)        



    #print(i, end="")

ask = input("삭제하실 이름을 입력하세요\n")
result = ""

#삭제할꺼 빼고 읽고 덮어씌운다

for i in arName:
    if ask not in i:
        result += i


name.close()
name.open("C:/python_1630_JDY/workspace/name.txt","w")
name.write(result)

"""
result = ""
for i in arName:
    for j in range(3,len(i)):
        
