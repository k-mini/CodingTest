import sys
sys.setrecursionlimit(100000)
def solution(n):
    answer = 0
    
    pre, current = 0,1
    for i in range(2,n+1):
        current,pre = pre+current, current
        
    return current % 1234567


def fibo(n):
    return (fibo(n-1) %1234567 + fibo(n-2)%1234567) %1234567 if n >=2 else n