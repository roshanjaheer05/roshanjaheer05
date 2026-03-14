def move_zeros(num):
    index=0
    for i in range(len[num]):
        if num[i]!=0:
            num[index]=num[i]
            index+=1
            while index<len(num):
                num[index]=0
                index+=1
num=[0,1,0,3,18]
move_zeros(num)
print(num)