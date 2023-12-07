import math
from itertools import permutations
def solution(numbers):
    answer = set()
    numbers = list(numbers)
    
    for cnt in range(1, len(numbers)+1):
        
        for case in permutations(numbers, cnt):
            case_num = int(''.join(case))
        
            if case_num not in answer and is_sosu(case_num): 
                answer.add(case_num)
    
    return len(answer)


def is_sosu(num):
    
    if num == 0 or num ==1:
        return False
    if num == 2:
        return True
    
    for i in range(2,int(math.sqrt(num)) + 1):
        
        if num % i == 0:
            return False
        
    return True