def solution(arr1, arr2):
    answer = []
    
    for row in arr1:
        r_row = []
        for col in zip(*arr2):
            # print(row,col)
            r_row.append(sum([a*b for a,b in zip(row,col)]))
            # print(r_row)
        answer.append(r_row)
    return answer