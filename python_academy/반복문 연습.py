#구구단

for i in range(1,10):
    for j in range(1,10):
        result = "%d by %d = %d"%(i,j,i*j)

        print(result)



#구구단 표
for i in range(1,10):

    print("\n")
    
    for j in range(1,10):

        result =(i*j)

        print(str(result) + " ",end="")
