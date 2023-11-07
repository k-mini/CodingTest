from collections import Counter
def solution(k, tangerine):
    answer = 0
    
    # tangerine = sorted(tangerine, key = lambda x : [tangerine.count(x),x])
    counter = Counter(tangerine)
    
    for i in sorted(counter.values(),reverse=True):
        answer += 1
        k -= i
        if k  <= 0:
            break
        else:
            continue
    
    
    return answer