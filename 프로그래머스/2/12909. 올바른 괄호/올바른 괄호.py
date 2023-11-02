def solution(s):
    answer = True
    
    stack = []
    
    for i in s:
        
        if i == '(' :
            stack.append(i)
        else:
            if stack and stack[-1] == '(':
                stack.pop()
            
            else:
                return False;
    
    return False if stack else True