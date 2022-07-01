class A:
    data = 10

    def show(self):
        print(id(self))
        print(self.data)

    def add(self):
        self.data += 1
        print(self.data)

a = A() #객체화

a.add

