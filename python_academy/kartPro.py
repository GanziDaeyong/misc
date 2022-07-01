import time
import random

class Person:

    def __init__ (self,name,age,gender,income):
        self.name = name
        self.age = age
        self.gender= gender
        self.income = income

    def show(self):
        print(self.name, str(self.age)+"y.o", self.gender, "income:"+str(self.income))


class KartPro:

    win = 100000


    def __init__ (self,name,age,gender,income,winHistory,position,Tviewer):

        Person.__init__(self,name,age,gender,income)
        self.winHistory = winHistory
        self.position = position
        self.Tviewer = Tviewer

    def kartLeague(self,index,):

        vresult = 100*random.randrange(1,10)
        
        self.income += self.win
        self.Tviewer += vresult
        
        if index == 1:
            result = "\nKartRider %dst League won!\n"%(index)
        elif index == 2:
            result = "\nKartRider %dnd League won!\n"%(index)
        elif index == 3:
            result = "\nKartRider %drd League won!\n"%(index)
        else:
            result = "\nKartRider %dth League won!\n"%(index)

        
        print(result)
        print(str(vresult) + " more subscribes!")
        print("you got " + str(self.Tviewer) + " subscribers in total\n")
        print("you made " + str(self.income) + " won")
        print("Youtube took 10000 won for fee!")
        self.income = self.income - 10000
        print("you actually got " + str(self.income) + "won")
      
                
Daeyong = KartPro("daeyong",22,"男",0,14,"runner",0)


for i in range (1,15):
    Daeyong.kartLeague(i)
    time.sleep(5)


    
#randrange 고민해보기
