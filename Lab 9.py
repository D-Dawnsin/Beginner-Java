def guess(turn): 
    global t
    global u
    global i
    global o
    
    global a
    global s
    global d
    global f
    global correct
    global y
    global hint
    while y<10 and correct<4:
        if a==t:
            correct+=1
        else:
            if ((a==i) or (a==u) or (a==o)):
                hint=int(hint)-1
            else:
                if s==u:
                    correct+=1
                else:
                    if ((s==t) or (s==i) or (s==o)):
                        hint=int(hint)-1
                    else:
                        if d==i:
                            correct+=1
                        else:
                            if ((d==t) or (d==u) or (d==o)):
                                hint=int(hint)-1
                            else:
                                if f==o:
                                    correct+=1
                                else:
                                    if ((f==t) or (f==u) or (f==i)):
                                        hint=int(hint)-1
    y+=1
    return
import random
number=[]
while len(number)<4:
    x=random.randint(0,9)
    if x not in number:
        number.append(x)
t=number[0]
u=number[1]
i=number[2]
o=number[3]
print(number)
[int(x) for x in number]
turn=[]
turn_1=int(input("Enter your first guessing number: "))
turn_2=int(input("Enter your second guessing number: "))
turn_3=int(input("Enter your third guessing number: "))
turn_4=int(input("Enter your fourth guessing number: "))
turn.append(turn_1)
turn.append(turn_2)
turn.append(turn_3)
turn.append(turn_4)
a=turn[0]
s=turn[1]
d=turn[2]
f=turn[3]
print(a,s,d,f)
y=0
correct=0
hint=0
while y<11 and correct<4:
    guess(turn)

print(hint)
print(correct)
print(y)

if correct==4:
    print("You win!!")
else:
    if y==10:
        print("You have ran out of guesses!")
    
        