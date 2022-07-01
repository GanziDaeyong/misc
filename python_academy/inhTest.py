import time

class Person:

    def __init__(self,name,age,gender,money):
        self.name = name
        self.age = age
        self.gender =gender
        self.money = money
        
    def show(self):
        print(self.name, self.age, self.gender)


class Doctor(Person):

    income = 3000000

    def __init__(self,name,age,gender,depart,office,money=0):
        #매개변수 전달치 않으면 초기화되얌
        #초기화할 얘들은 꼭 맨 마지막에 넣으세얌
        Person.__init__(self,name,age,gender,money)
        self.depart = depart
        self.office = office

    def treat(self):
        self.money += self.income
        print("진료 중")
        print("통장 잔고: " + str(self.money) + "원")
    
#상속을 하는 이유: 아래서 self.name, self.age 등등은 어캐써.

john = Doctor("John",24,"남자","내과","차")

for i in range(100):
    john.treat()
    time.sleep(0.2)

#time.sleep
