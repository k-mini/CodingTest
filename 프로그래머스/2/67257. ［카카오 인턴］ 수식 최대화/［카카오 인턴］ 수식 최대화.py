from itertools import permutations
from collections import deque
import re
def solution(expression):
    answer = 0
    
    snippets = []
    tmp = ''
    for i in expression:
        if i.isdigit():
            tmp += i
        else:
            snippets.append(int(tmp))
            snippets.append(i)
            tmp = ''
    else:
        snippets.append(int(tmp))
        
    # print(snippets)
    
    for exp in permutations(['+','-','*'], 3):
        # print(exp)
        q1 = deque(snippets)
        q2 = deque()
        # print(q1,q2)
        # print()
        for cur_exp in exp:
            while q1:
                
                i = q1.popleft()
                    
                if cur_exp == i:
                    j = q1.popleft()
                    calculate(q2, i, j)
                else:
                    q2.append(i)
                
            
            # print()
            q1 = q2
            q2 = deque()
                
        exp_sum = q1.popleft()
        answer = max(answer, abs(exp_sum))
        
    return answer

def calculate(q2,exp,num2):
    num1 = q2.pop()
    
    if exp =='-':
        return q2.append(num1 - num2)
    elif exp == '+':
        return q2.append(num1 + num2)
    else:
        return q2.append(num1 * num2)
