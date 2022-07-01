import datetime

'''
주문 메서드(O)
1.프로페셔널 시계
2.클래식 시계

결제 메서드
포인트 조회 메서드
구매내역 메서드
'''
def proOrder(money, point):

    choice = int(input(proMsg))
    result = ""
    arResult = []
    
    if choice == 1:      
        result = "------------------------------------------\n"
        result += "Oyster, 44mm, Yellow gold 구매 완료\n"
        result += "------------------------------------------\n"

        price = oPrice
            
    elif choice == 2:

        result = "------------------------------------------\n"
        result += "Milgauss, 40mm, Green Gold 구매 완료\n"
        result += "------------------------------------------\n"
            
        price = mPrice
        
    if result != "":
        arResult = pay(money, point, price, result)

    return arResult

def claOrder(money, point):
    
    choice = int(input(claMsg))
    result = ""
    arResult = []
    
    if choice == 1:
        result = "------------------------------------------\n"
        result += "PearlMaster 39mm diamond 구매완료\n"
        result += "------------------------------------------\n"
            
        price = pPrice
    elif choice == 2:
        result = "------------------------------------------\n"
        result += "Everose 39mm Gold 구매완료\n"
        result += "------------------------------------------\n"
            
        price = ePrice
        
    if result != "":
        arResult = pay(money, point, price, result)
        
    return arResult

def pay(money, point, price, result):

    arResult = []
    
    if (money+point) - price < 0 :
        print("안녕히 가세요")
        #flag 필요
        arResult.append(0)
    else:
        if point > 0:
            if point - price < 0:
                money -= price - point
                point = 0
            else:
                point -= price
        else:
            money -= price
            point += int(price * 0.02)

        now = datetime.datetime.now()
        wlist = result + "구매시간 : " + str(now) + "\n"
        print(result, end='')
        print("현재 잔액 : " + str(money) + "원\n")

        arResult.append(money)
        arResult.append(point)
        arResult.append(wlist)

    return arResult

def rolex():
    helloMsg = "§ ROLEX §\n" 
    choiceMsg = "①프로페셔널 시계\n②클래식 시계\n③포인트 조회\n④구매 내역\n⑤나가기\n"
    proMsg = "①Oyster, 44mm, Yellow gold\n②Milgauss, 40mm, Green Gold\n③뒤로 가기\n"
    claMsg = "①PearlMaster 39mm diamond\n②Everose 39mm Gold\n③뒤로 가기\n"
    wlist = ""
    money = 2
    point = 0

    result = []

    price = 0
    oPrice = 50_000_000
    mPrice = 60_000_000
    pPrice = 45_000_000
    ePrice = 110_000_000

    while True:
        
        choice = int(input(helloMsg+choiceMsg))

        #프로페셔널 시계 영역
        if choice == 1:
            result = proOrder(money, point)
            
            if len(result) == 0:
                continue
            
            elif result[0] == 0:
                break


        #클래식 시계 영역
        elif choice == 2:
            result = claOrder(money, point)

            if len(result) == 0:
                continue

            elif result[0] == 0:
                break
     
        #포인트 조회 영역
        elif choice == 3:
            print("잔여 포인트 : " + str(point) + "점")
            continue

        #구매내역 영역
        elif choice == 4:
            print(wlist)
            continue

        #나가기 영역
        elif choice == 5:
            break

        money = result[0]
        point = result[1]
        wlist += result[2]
















