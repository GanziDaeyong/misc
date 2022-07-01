class Car:
    brand = ""
    color = ""
    price = 0

    def show(self):
        print(self.brand, self.color, self.price)


momCar = Car() #Car()가 생성자이다. 
dadyCar = Car()
myCar = Car()


#momCar.brand = "Benz"
#momCar.color = "Black"
#momCar.price = 9000

#momCar.show()

dadyCar.show()
