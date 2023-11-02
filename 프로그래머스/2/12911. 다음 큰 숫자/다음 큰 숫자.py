def solution(n):
    answer = 0
    n_count = bin(n)[2:].count('1')
    
    num = n+1
    while True:
        if (bin(num)[2:].count('1') == n_count) :
            answer = num
            break
        num += 1
    
    
    return answer