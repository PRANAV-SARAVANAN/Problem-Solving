n=int(input())
lst=[int(i) for i in input().split()]
set1=set(lst)
x=(sum(set1)*n)-sum(lst)
x=x//(n-1)
print(x)