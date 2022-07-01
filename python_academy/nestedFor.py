#구구단: 81회 반복.
cnt=0
for i in range(1,10):
    for j in range(1,10): #이미 상위 for 문의 i 사용중이다.
        print("%d*%d=%d" %(i,j,i*j))
    print() #단의 위치 잘 봐라. j하나 끝날때마다 i 넘어가면서 한줄 띈다.
    
