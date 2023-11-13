def solution(land):
    answer = land[0]
    n = len(land)
    # print(answer)
    # print()
    for i in range(1,n):
        tmp = answer[:]
        # print(tmp)
        for j in range(4):
            # print(f'j : {j} ,: {[ answer[k] for k in range(4) if k != j]}')
            answer[j] = land[i][j] + max([ tmp[k] for k in range(4) if k != j])
        # print(answer)
        # print()
    
    return max(answer)