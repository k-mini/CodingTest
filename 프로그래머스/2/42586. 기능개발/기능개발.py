import math

def solution(progresses, speeds):
    n = len(speeds)
    p_list = [ math.ceil((100-gauge) / speed) for gauge,speed in zip(progresses,speeds) ]
    
    print(p_list)
    answer = [1]
    value = 1
    for i in range(1,len(p_list)):
        # print(p_list[i-1], p_list[i], p_list,answer)
        if p_list[i-1] >= p_list[i]:
            answer[-1] += 1
            p_list[i] = p_list[i-1]
        else:
            answer.append(1)
    
    
    return answer