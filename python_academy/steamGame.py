

helloMsg = "\nWelcome to Steam\n"
choiceMsg = "\n1. Role Playing Game\n2. First Person Shooting Game\n3. Real Time Strategy Game\n4. Check your wallet\n5. Exit\n"
rpgMsg = "1. Monster Hunter World\n2. Witcher 3\n3. Nier: Automata\n4. Dark Souls 3\n"
fpsMsg = "1. PUBG\n2. CS online\n3. Black Squad\n4. Doom 3\n"
rtsMsg = "1. Starcraft 2\n2. Frostpunk\n3. Civilization 6\n4. Mount and Blade 2\n"
cashMsg = "1. Add funds to your Wallet\n2. exit\n"
afMsg = "\nwrite below the amount of funds you want to add\n"
money = 300_000
price = 0
userRate = 18


while True:

    choice = int(input(helloMsg+choiceMsg))
#rpg
    if choice == 1:
        print("\nMoving on to RPG category...\n")
        choice = int(input(rpgMsg))
            

        if choice == 1:
            result = "\nPurchasing Monster Hunter World!\n"
            price = 67_000
            rate = 19
        elif choice == 2:
            result = "\nPurchasing Witcher 3!\n"
            price = 63_000
            rate = 15
        elif choice == 3:
            result = "\nPurchasing Nier: Automata!\n"
            price = 43_000
            rate = 16
        elif choice == 4:
            result = "\nPurchasing Dark Souls 3!\n"
            price = 21_000
            rate = 19
        else:
            print("\nchoose a valid number\n")
            continue            

#Fps   
    elif choice == 2:
        print("\nMoving on to FPS category...\n")
        choice = int(input(fpsMsg))

        if choice == 1:
            result = "\nPurchasing PUBG!\n"
            price = 32_000
            rate = 19

        elif choice == 2:
            result = "\nPurchasing CS:GO online!\n"
            price = 17_000
            rate = 15

        elif choice == 3:
            result = "\nPurchasing Black Squad!\n"
            price = 5_000
            rate = 17

        elif choice == 4:
            result = "\nPurchasing Doom 3!\n"
            price = 15_000
            rate = 18
            
        else:
            print("choose a valid number")
            continue
        
#Rts
    elif choice == 3:
        print("\nMoving on to RTS category...\n")
        choice = int(input(rtsMsg))

        if choice == 1:
            result = "\nPurchasing Starcraft 2!\n"
            price = 32_000
            rate = 18
        
        elif choice == 2:
            result = "\nPurchasing Frostpunk!\n"
            price = 28_000
            rate = 15

        elif choice == 3:
            result = "\nPurchasing Civilization 6!\n"
            price = 68_000
            rate = 12

        elif choice == 4:
            result = "\nPurchasing Mount and Blade 2!\n"
            rate = 15

        else:
            print("choose a valid number")
            continue


    elif choice == 4:
        print("\nWallet: "+str(money)+" won left\n")
        choice = int(input(cashMsg))
        
        if choice == 1:
                choice = int(input(afMsg))
                print("\n"+str(choice)+" won added to your wallet\n")
                print("\n"+str(money+choice)+" won left\n")
                money += choice
                continue

        else:
            continue
                

         
    else:
        break


    if userRate - rate > 0:
        print("")    
            
        money -= price
        if money - price < 0:
            print("Not enough money")
            continue
        else:
            print(result)
            print("money left in wallet: " + str(money) + "$")    
            continue
    else:
        print("\nThis game is not allowed in your age\n")
        continue
