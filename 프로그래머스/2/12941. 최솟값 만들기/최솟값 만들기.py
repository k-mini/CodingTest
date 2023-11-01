def solution(A,B):
    answer = 0
    A = sorted(A)
    B = sorted(B)
    answer = sum([ i*j for i,j in zip(A,B) ])
    B_reverse = sorted(B , key = lambda x: -x)
    answer = min(answer, sum([i*j for i,j in zip(A,B_reverse)]))
    
    return answer