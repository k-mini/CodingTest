def solution(n,a,b):
    answer = 0

    # 1 2 3 4 5 6 7 8
    #  1   2   3   4
    
    while True:
        # print(a,b)
        if a == b:
            break
        
        a = (a + 1) // 2
        b = (b + 1) // 2
        
        answer += 1

    return answer