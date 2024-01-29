def solution(n):
    n_array = ['1','2','4']
    answer = ''
    
    while n > 0:
        n = n - 1
        answer = n_array[n%3] + answer
        n //= 3
    
    return answer