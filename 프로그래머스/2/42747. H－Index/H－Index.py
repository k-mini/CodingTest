def solution(citations):
    answer = 0
    
    citations.sort(key = lambda x : -x)
    n = len(citations)
    print(citations)
    
    for idx, val in enumerate(citations):
        cnt = idx + 1
        
        if val >= cnt:
            answer = cnt
        else:
            break
    return answer