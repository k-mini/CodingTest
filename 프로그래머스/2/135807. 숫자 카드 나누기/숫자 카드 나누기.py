from functools import reduce
from math import gcd
def solution(arrayA, arrayB):
    answer = 1
    
    # print(f'arrayA : {arrayA}')
    # print(f'arrayB : {arrayB}')
    gcd_a = reduce(gcd,arrayA)
    # print(f'arrayA의 최대 공약수 : {gcd_a}')
    gcd_b = reduce(gcd,arrayB)
    # print(f'arrayB의 최대 공약수 : {gcd_b}')
    
    if gcd_a != 1:
        for num in arrayB:
            if num % gcd_a == 0:
                break
        else:
            answer = max(answer, gcd_a)
            
    if gcd_b != 1:
        for num in arrayA:
            if num % gcd_b == 0:
                break
        else:
            answer = max(answer, gcd_b)
    
    return 0 if answer == 1 else answer