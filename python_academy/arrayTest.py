arData = [1,2,3,4]

#추가
arData.append(5)
print(arData)
# 5를 넣음으로써 새로운 공간으로 이동한 것이니 주소가 달라야한다.

#수정
arData[0] = 10
print(arData)

#삭제
print(id(arData))
del arData[1]
print(id(arData))
print(arData)
#하나를 앞으로 미는 개념이므로 시작주소는 같다.

#주소가 계속 변하는 이유 - 많은 프로그램이 돌아가므로 항상 남는 공간에 배당한다.

#검색
print(arData.index(4))


for i in arData:
        print(i)

#값에 접근할때.
