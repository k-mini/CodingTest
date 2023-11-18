from collections import *
def solution(participant, completion):
    answer = ''
    
    p_counter = Counter(participant)
    
    for p in completion:
        
        if p in p_counter:
            p_counter[p] -= 1
            if p_counter[p] == 0:
                del p_counter[p]
    
    print(p_counter)
    
    return [ key for key in p_counter][0]