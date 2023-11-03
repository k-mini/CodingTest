def solution(n):
    ans = 0
    
    while n != 0:
        # print(f'n: {n} ans : {ans}')
        if n % 2 == 0:
            n //= 2
        else:
            n -= 1
            ans += 1
    

    return ans