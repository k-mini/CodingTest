def solution(clothes):
    answer = 1
    c_dict = {}
    
    for v,k in clothes:
        c_dict[k] = c_dict.get(k,0) + 1
    print(c_dict)
    for x in c_dict.values():
        answer *= (x+1)
    
    return answer-1