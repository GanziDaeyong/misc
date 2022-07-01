#개발자에게 알리기 위해 이름을 init으로 설정했고
#내부적으로는 클래스명으로 선언된다.

#메서드라고 부르지 않고 생성자라고 부른다.
#메서드와 기능이 똑같지만 리턴이 없다.




class Car:
    check = False
    brand = ""
    color = ""
    price = 0
    cnt = 0
    
    
    
    def __init__(self,brand,color,price,pw):
        self.brand = brand
        self.color = color
        self.price = price
        self.pw = pw
        
    def show(self):
        print(self.brand, self.color, self.price)

    def engineStart(self,pw):

        if self.pw == pw:
            print("right")

            if self.check:
                print("이미 시동이 켜져 있습니다.")
            else:
                self.cnt+=1
                print("시동 켬")
                self.check = True

                
                
        else:
            if self.cnt == 3:
                print("넌 포위됐다!")
            else:        
                self.cnt+=1
                print("wrong password.")
        print(self.cnt)
        return self.cnt
            
            
        
            
    def engineStop(self):
        if self.check:
            print("시동 끔")
            self.check = False 
        else:
            print("시동이 이미 꺼져 있습니다.")
            
  
    

#클래스를 만들면 자동으로 기본 생성자가 만들어진다.
#하지만, 사용자가 직접 생성자를 만들면
#그 생성자가 바로 기본 생성자가 된다.
            
pwMsg = "plz put your password\n"  
pw = input(pwMsg) 

momCar = Car("Benz","Black",9000,"1234")
momCar.show()

while True:
    
    momCar.engineStart(pw)

#요런걸 flag라고 한다.


#븃단!
    
