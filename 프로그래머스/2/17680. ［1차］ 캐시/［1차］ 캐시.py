from collections import *
def solution(cacheSize, cities):
    answer = 0
    cities = list(map(lambda x: x.lower(), cities))
    q = deque(maxlen = cacheSize)
    
    for city in cities:
        
        if city not in q :
            answer += 5
        else :
            q.remove(city)
            answer += 1
        q.append(city)
    
    
    return answer