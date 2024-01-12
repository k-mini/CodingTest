def solution(storey):
    answer = 0
    
    
    while storey != 0 :
        
        now = storey % 10
        
        if now > 5:
            answer += 10 - now
            storey //= 10
            storey += 1
        
        elif now < 5:
            answer += now
            storey //= 10
            
        else:
            next_val = (storey // 10) % 10
            if next_val >= 5:
                answer += 10 - now
                storey //= 10
                storey += 1
            else:
                answer += now
                storey //= 10
                

    return answer