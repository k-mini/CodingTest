def solution(numbers, k):
    answer = ''
    
    stack = []
    numbers = list(numbers)
    
    for num in numbers:
                   
        while stack and stack[-1] < num and k !=0:
            stack.pop()
            k -= 1
            
        stack.append(num)
    else:
        if k != 0:
            stack = stack[:-k]
    
    return ''.join(stack)