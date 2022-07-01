class Human:

    def eat(self):
        print("영양분을 섭취한다.")

    def walk():
        print("두 발로 걷는다.")

    #self는 구분할 필요가 없어서 안쓴다.
    
class Monkey(Human):

    def walk(self):
        Human.eat(self)
        print("두 발 혹은 네 발로 걷는다.")

kingkong= Monkey()
kingkong.walk()
