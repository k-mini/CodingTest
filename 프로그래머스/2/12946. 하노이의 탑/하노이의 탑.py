def solution(n):
    answer = move(n,1,3,[])
    return answer

# num개의 원판을 옮기는 법
def move(num,start,end,answer):
    
    if num == 1:
        return answer.append([start,end])
         
    move(num-1, start, 6 - (start+end), answer)
    answer.append( [start, end ] )
    move(num-1, 6 - (start + end), end, answer)
        
    return answer
    
    
    
    