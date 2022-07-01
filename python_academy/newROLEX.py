import datetime

"""
주문 메서드
1.프로페셔널 시계
2.클래식 시계

결제 메서드
포인트 조회 메서드
구매내역 메서드
"""

def proOrder():
    choice = int(input(proMsg))
    result = ""
    if choice == 1:
            #print("--------------------------------------------------------------")
            #print("Oyster, 44mm, Yellow Gold successfully purchased!")
            #print("--------------------------------------------------------------")
        result = "--------------------------------------------------------------\n"
        result += "Oyster, 44mm, Yellow Gold successfully purchased!"
        result += "--------------------------------------------------------------\n"
            #같은 저장공간의 문자열 더할때는 += 붙이고 print(저장공간)
        price = oPrice
            
    elif choice == 2:
            #print("--------------------------------------------------------------")
            #print("Milgauss, 40mm, Green Gold successfully purchased!" )
            #print("--------------------------------------------------------------")
        result = "--------------------------------------------------------------\n"
        result += "Milgauss, 40mm, Green Gold successfully purchased!"
        result += "--------------------------------------------------------------\n"
        price = mPrice
            
    return result

    #사용한 부분에서 처리할 게 남는다 - return한다.
    #while 아니므로 continue 아니다.

def claOrder():
    choice = int(input(claMsg))
    result=""
    if choice == 1:
            #print("------------------------------------------------------------------")
            #print("PearlMaster, 39mm, Diamond successfully purchased!")
            #print("--------------------------------------------------------------")
        result = "--------------------------------------------------------------\n"
        result += "PearlMaster, 39mm, Diamond successfully purchased!"
        result += "--------------------------------------------------------------\n"
        price = pPrice
            
    elif choice == 2:
            #print("--------------------------------------------------------------")
            #print("Everose Gold, 39mm, Gold successfully purchased!")
            #print("--------------------------------------------------------------")
        result = "--------------------------------------------------------------\n"
        result += "Everose Gold, 39mm, Gold successfully purchased!"
        result += "--------------------------------------------------------------\n"
        price = ePrice
            
    return result




def payOrder():
    result=""
    if (money+point) - price < 0 :
            #먼저 빼보고 검산하는게 실무코딩.
        print("payment rejected")
        break
    else:
        if point > 0 :
            if point - price < 0 :
                money -= price - point #이 -= += 다시 생각해 볼 것.
                point = 0
            else:
                point -= price
        else:
            money -= price
            point += int(price*0.02)

        now = datetime.datetime.now()
        wlist += result + "purchase time : " + str(now) + "\n"
        print(result, end="") #\n 두번 되니까 한번 지워준거. 큰 의미 x
        print("money in wallet: " + str(money) + "won\n")






helloMsg = "§ ROLEX §\n"
choiceMsg = "① Professional watch\n② Classic watch\n③ User point \n④ Purchase history\n⑤ Exit\n"
proMsg = "① Oyster, 44mm, Yellow Gold\n② Milgauss, 40mm, Green Gold\n③ exit\n"
claMsg = "① PearlMaster, 39mm, Diamond\n② Everose Gold, 39mm, Gold\n③ exit\n"
wlist = ""

now = datetime.datetime.now()

money = 2_100_000_000
point = 0

result = ""

price = 0
oPrice = 50_000_000
mPrice = 50_000_000
pPrice = 40_000_000
ePrice = 110_000_000 
#이런 경우 언더바는 인터프리터가 해석하지 않는다. for developer.

while True:
    
    choice = int(input(helloMsg+choiceMsg))

#professional watch
    if choice == 1:
        result = proOrder()
        if proOrder()== "":
            continue
        
        #변수의 재사용
        #가독성은 떨어지지만 메모리 효율이 높다.
        #위의 choice가 1이라고 정해졌기 때문에 역할을 다한 것이다.
      
        #elif이므로 위가 참이면 안가고 돌아간다.

#Classic watch
    elif choice == 2:
        result = claOrder()
        if claOrder()=="":
       

#포인트 조회
        
    elif choice == 3:
        print("left points: " + str(point))
        continue
        #continue안해주면 밑으로 내려가서 계속 구매가 된다. 포인트는 쌓이고

#구매 내역
    elif choice == 4:
        print(wlist)
        continue

    else:
        break

    if money - price < 0 :
            #먼저 빼보고 검산하는게 실무코딩.
        print("payment rejected")
        break
    else:
        if point > 0 :
            if point - price < 0 :
                money -= price - point #이 -= += 다시 생각해 볼 것.
                point = 0
            else:
                point -= price
        else:
            money -= price
            point += int(price*0.02)

        now = datetime.datetime.now()
        wlist += result + "purchase time : " + str(now) + "\n"
        print(result, end="") #\n 두번 되니까 한번 지워준거. 큰 의미 x
        print("money in wallet: " + str(money) + "won\n")
       
        
