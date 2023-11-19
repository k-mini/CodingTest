def solution(prices):
    n = len(prices)
    answer = [0 for i in range(n)]
    stack = []
    for idx,price in enumerate(prices):
        # print(stack)
        while stack and stack[-1][1] > price:
            prev_idx = stack.pop()[0]
            answer[prev_idx] = idx - prev_idx
        
        stack.append([idx,price])    
    else:
        while stack:
            prev_idx = stack.pop()[0]
            answer[prev_idx] = n-1 - prev_idx
    
    return answer