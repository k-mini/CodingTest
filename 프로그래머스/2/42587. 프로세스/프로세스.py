from heapq import *
from collections import deque
def solution(priorities, location):
    answer = 0
    q = deque([ [v,idx] for idx, v in enumerate(priorities)])
    heap_list = [ [-v,idx] for idx, v in enumerate(priorities)]
    heapify(heap_list)
    print(q)
    print(heap_list)
    
    while q:
        now_v, now_idx = q.popleft()
        heap_v, heap_idx = heappop(heap_list)
        
        if (now_v == -heap_v):
            answer += 1
            if now_idx == location:
                break
            else:
                continue
        else:
            heappush(heap_list,[heap_v,heap_idx])
            q.append([now_v,now_idx])
    
    return answer