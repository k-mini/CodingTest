from functools import reduce
def solution(data, col, row_begin, row_end):
    
    data.sort(key = lambda x:(x[col-1],-x[0]))
    # print(data)
    answer = []
    
    for i in range(row_begin-1, row_end):
        
        answer.append( sum( [ value % (i+1) for value in data[i]] ) )
    
    return reduce(lambda x,y : x^y , answer )