A = [1,10,3,74,76,22]
A = sorted(A)
f = open("C:\대용\python_Study\shit.txt","w")
for i in A:
    cont = "%d\n"%i
    f.write(cont) 
f.close()
