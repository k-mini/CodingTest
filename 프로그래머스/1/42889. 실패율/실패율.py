from collections import Counter
def solution(N, stages):
    
    answer = []
    
    stages.sort()
    # print(stages)
    
    counter = Counter(stages)
    
    for stage_number in range(1,N+1):
        # print(counter)
        tmp = [0,stage_number] # [실패율, 스테이지 번호]    
        
        if not counter:
            answer.append(tmp)
            continue
            
        failure =  counter[stage_number] / sum(counter.values())
        tmp[0] = failure
        # print(tmp)
        
        answer.append(tmp)
        del counter[stage_number]
        
    answer.sort(key = lambda x : (-x[0],x[1]) )
    
    return list(map(lambda x: x[1], answer  ) )