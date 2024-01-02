from collections import defaultdict
from heapq import *
def solution(N, roads, K):
    answer = 0

    graph = defaultdict(list)
    for road in roads:
        a,b,c = road
        graph[a].append([c,b])
        graph[b].append([c,a])
        
    dist = [ float('inf') for i in range(N+1)]
    dist[1] = 0
    
    heap = []
    heappush(heap,[0,1]) # [0(총거리),1(시작마을)] 
    # print(heap)
    
    while heap:
        
        now_distance, now_node = heappop(heap)
        
        if dist[now_node] < now_distance :
            continue
        
        for new_distance, new_node in graph[now_node]:
            total_distance = now_distance + new_distance
            if total_distance < dist[new_node]:
                dist[new_node] = total_distance
                heappush(heap,[total_distance,new_node])
                
    # print(dist)
    
    return len([ i for i in dist if i <= K])
    