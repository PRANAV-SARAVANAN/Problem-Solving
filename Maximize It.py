from itertools import product
K,M = map(int,input().split())
nums = []
lst=list()
for _ in range(K):
    row = map(int,input().split()[1:])
    nums.append(map(lambda x:x**2, row))
    
print(max(map(lambda x: sum(x)%M, product(*nums))))