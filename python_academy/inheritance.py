class A:
    data = 10

    def __init__(self,data):
        self.data = data

    def show(self):
        print("A클래스")



class B(A):

    def __init__(self):
        pass

    def showData(self):
        print(self.data)
    
    #Overriding
    def show(self):
        print("B클래스")
        
b = B()
b.showData()
b.show()

#자식부터 훑고 올라간다.

