from math import *

def solution(n, k):
    answer = []
    num_list = [ i for i in range(1,n+1) ]
    k -= 1
    
    while num_list:
        cnt = len(num_list)
        
        if cnt == 1:
            answer.append(num_list.pop())
            break
        
        tmp = factorial(cnt-1)
        
        new_idx = k // tmp
        k = k % tmp
        answer.append(num_list.pop(new_idx))
        cnt -= 1
    
    return answer