def solution(numbers):
    
    answer = [-1 for i in range(len(numbers))]
    stack =[]
    
    for idx, value in enumerate(numbers):
        
        while stack and stack[-1][1] < value:
            prev_idx = stack.pop()[0]
            answer[prev_idx] = value
        stack.append([idx,value])
            
    return answer