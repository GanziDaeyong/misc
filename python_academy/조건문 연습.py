


#조건문 연습

A = [1,2,3,4,5,6,7,8,9,10]
even = 0
odd = 0


for i in A:

    if i%2 == 0:
        even += 1

    elif i%2 == 1:
        odd += 1

    result = "짝수는 %d개, 홀수는 %d개 입니다" %(even, odd)


print(result)
    
