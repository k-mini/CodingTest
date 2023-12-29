from math import *
from collections import Counter
def solution(weights):
    answer = 0
    
    w_counter = Counter(weights)
    print(w_counter)
    w_list = list(w_counter.keys())
    n = len(w_list)
    for idx,weight in enumerate(w_list):
        
        # for idx2 in range(idx+1, n):
            # weight2 = w_list[idx2]
            
            # torque = lcm(weight,weight2)
            # print(f'weight : {weight}, weight2 : {weight2} torque : {torque}')
            
            # if (torque // weight) in [2,3,4] and (torque // weight2) in [2,3,4]:
                # answer += 1
                # print('success')
        
        if w_counter[weight] >= 2:
            answer += w_counter[weight] * (w_counter[weight] - 1) // 2
            # print(f'weight : {weight}, weight2 : {weight} 경우의 수  : {w_counter[weight] * (w_counter[weight] - 1) // 2}')
            
        if w_counter[weight * (3/2)]:
            answer += w_counter[weight] * w_counter[weight * (3/2)]
            # print(f'weight : {weight}, weight2 : {weight * (3/2)} 경우의 수  : {w_counter[weight] * w_counter[weight * (3/2)]}')
        
        if w_counter[weight * (2/4)]:
            answer += w_counter[weight] * w_counter[weight * (2/4)]
            # print(f'weight : {weight}, weight2 : {weight * (2/4)} 경우의 수  : {w_counter[weight] * w_counter[weight * (2/4)]}')
        
        if w_counter[weight * (3/4)]:
            answer += w_counter[weight] * w_counter[weight * (3/4)]
    
    return answer

def lcm(a,b):
    return a*b//gcd(a,b)