"""
7 21

---------.|.---------
------.|..|..|.------
---.|..|..|..|..|.---
-------WELCOME-------
---.|..|..|..|..|.---
------.|..|..|.------
---------.|.---------

"""

b, l=input().split()
s="WELCOME"
s1=".|."
s2=""
k=1

for i in range(int(b)//2):
    s2=""
    for j in range(k):
        s2+=s1
    print(s2.center(int(l),'-'))
    k+=2

print(s.center(int(l),'-'))

k-=2
for i in range(int(b)//2):
    s2=""
    for j in range(k):
        s2+=s1
    print(s2.center(int(l),'-'))
    k-=2


    
        
    