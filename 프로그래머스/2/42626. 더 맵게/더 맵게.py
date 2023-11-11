from collections import *
from heapq import *

def solution(scoville, K):
    answer = 0
    heapify(scoville)
    
    while len(scoville) > 1:
        # 가장 안매운 것
        flavor1 = heappop(scoville)
    
        if flavor1 >= K:
            return answer
        else:
            flavor2 = heappop(scoville)
            heappush(scoville, flavor1 + 2 * flavor2)
            answer += 1
        
    return answer if scoville[0] >= K else -1