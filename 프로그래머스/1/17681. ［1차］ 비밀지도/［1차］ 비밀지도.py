def solution(n, arr1, arr2):
    answer = []
    
    # arr1 = [ bin(x)[2:].rjust(n,'0') for x in arr1 ]
    # arr2 = [ bin(x)[2:].rjust(n,'0') for x in arr2 ]
    
    for i in range(n):
        tmp = arr1[i] | arr2[i]
        tmp = bin(tmp)[2:].rjust(n,'0')
        answer.append(str(tmp).replace('1','#').replace('0',' '))
    
    return answer