import random
print("Welcome to Battleship!!!")
bttl=random.randint(1,40)
cr1=random.randint(1,40)
cr2=random.randint(1,40)
sub1=random.randint(1,40)
sub2=random.randint(1,40)
sub3=random.randint(1,40)
battle=(bttl,bttl+1,bttl+2,bttl+3)
cru1=(cr1,cr1+1,cr1+2)
cru2=(cr2,cr2+1,cr2+2)
if not(battle==cru1 and battle==cru2 and battle==sub1 and battle==sub2 and battle==sub3 and cru1==cru2 and cru1==sub1 and cru1==sub2 and cru1==sub3 and cru2==sub1 and cru2==sub2 and cru2==sub3 and sub1==sub2 and sub1==sub3 and sub2==sub3):
    while battle==cru1 and battle==cru2 and battle==sub1 and battle==sub2 and battle==sub3 and cru1==cru2 and cru1==sub1 and cru1==sub2 and cru1==sub3 and cru2==sub1 and cru2==sub2 and cru2==sub3 and sub1==sub2 and sub1==sub3 and sub2==sub3:
        bttl=random.randint(1,37)
        cr1=random.randint(1,38)
        cr2=random.randint(1,38)
        sub1=random.randint(1,40)
        sub2=random.randint(1,40)
        sub3=random.randint(1,40)
print(battle, cru1, cru2, sub1, sub2, sub3)
miss=0
b=0
c1=0
c2=0
s1=0
s2=0
s3=0
gameboard="xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx"
print(gameboard)
while miss<4 and b<4:
    User=int(input("Enter in a coordinate:"))
    if ((User==bttl)or(User==bttl+1)or(User==bttl+2)or(User==bttl+3)):
        hit=User
        print("Hit")
        b+=1
        miss=0
        if hit:
            r=gameboard[User:User+1]
            gameboard.replace(r,"*")
        print(gameboard)
    else:
        if (User==cr1)or(User==cr1+1)or(User==cr1+2):
            hit=print("Hit")
            miss=0
            c1+=1
            if hit:
                r=gameboard[User:User+1]
                gameboard.replace(r,"*")
            print(gameboard)
            if c1==3:
                    print("You sunk his First Cruiser!!")
        else:
            if (User==cr2)or(User==cr2+1)or(User==cr2+2):
                hit=User
                print("Hit")
                miss=0
                c2+=1
                if hit:
                    r=gameboard[User:User+1]
                    gameboard.replace(r,"*")
                print(gameboard)
                if c2==3:
                    print("You sunk his Second Cruiser!!")
            else:
                if User==sub1:
                    hit=User
                    print("Hit")
                    miss=0
                    s1+=1
                    if hit:
                        r=gameboard[User:User+1]
                        gameboard.replace(r,"*")
                    print(gameboard)
                    if s1==1:
                        print("You sunk his First Submarine!!")
                else:
                    if User==sub2:
                        hit=User
                        print("Hit")
                        miss=0
                        s2+=1
                        if hit:
                           r=gameboard[User:User+1]
                           gameboard.replace(r,"*")
                        print(gameboard)
                        if s2==1:
                            print("You sunk his Second Submarine!!")
                    else:
                        if User==sub3:
                            hit=User
                            print("Hit")
                            miss=0
                            s3+=1
                            if hit:
                               r=gameboard[User:User+1]
                               gameboard.replace(r,"*")
                            print(gameboard)
                            if s3==1:
                                print("You sunk his Third Submarine!!")
                        else:
                            if User!=(bttl or bttl+1 or bttl+2 or bttl+3 or cr1 or cr1+1 or cr1+2 or cr2 or cr2+1 or cr2+2 or sub1 or sub2 or sub3):
                                miss+=1
                                m=User
                                print("Miss")
                                if miss:
                                    r=gameboard[User:User+1]
                                    gameboard.replace(r,"*")
                                print(gameboard)
if miss==4:
    print("GAME OVER!!\nComputer Wins")
else:
    if b==4:
        print("Batleship Sunk!! \nUser WINS!!!!") 
   