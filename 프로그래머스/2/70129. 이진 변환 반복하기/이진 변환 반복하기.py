def solution(s):
    answer = [0,0]
    
    while s !='1' :
        answer[0] += 1
        prev = s
        s = s.replace('0','')
        answer[1] += len(prev) - len(s)
        
        s = bin(len(s))[2:]
        print(s)
        
        
        
    return answer