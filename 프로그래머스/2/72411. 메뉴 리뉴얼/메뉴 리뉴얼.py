from itertools import combinations
from collections import Counter
def solution(orders, course):
    answer = []
    
    o_counter = Counter()
    
    for order in orders:
        order = list(order)
        for cnt in course:
            for part in combinations(order, cnt):
                wanted_course = ''.join(sorted(part))
                o_counter[wanted_course] += 1
    
    print(f'o_counter : {o_counter}')
    
    # for order in o_counter:
        # if o_counter[order] <= 1:
            # del o_counter[order]
    
    for cnt in course:
        max_cnt = 0
        tmp = []
        for key,value in o_counter.items():
            
            if value <=1 or len(key) != cnt:
                continue
                
            if value > max_cnt :
                tmp = [key]
                max_cnt = value
            elif value == max_cnt:
                tmp.append(key)
            else:
                continue
        answer += tmp
        
    # print(f'orders : {orders}')
    # print(f'answer : {answer}')
    return sorted(answer)