point = 0
length =0
answer = 0
def solution(numbers, target):
    global point,length,answer
    
    point = target
    length = len(numbers)
    
    dfs(numbers,0,0)
    
    return answer

# num : 현재까지 값 offset: 현재 인덱스
def dfs(numbers,num,offset):
    global answer
    if offset == length:
        answer += 1 if num == point else 0
        return
    else:
        
        dfs(numbers, num+numbers[offset], offset+1)
        dfs(numbers, num-numbers[offset], offset+1)
        
    
    
    
    
    
    
    
    
    