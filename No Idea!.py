n, m=map(int, input().strip().split())
lst=[int(i) for i in input().split()]
s1=set(map(int, input().split()))
s2=set(map(int, input().split()))
hap=0
for i in lst:
    if(i in s1):
        hap+=1
    elif(i in s2):
        hap-=1
print(hap)