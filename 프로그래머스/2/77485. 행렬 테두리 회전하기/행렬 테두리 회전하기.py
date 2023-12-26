def solution(rows, columns, queries):
    num = 0
    answer = []
    num_list = []
    for row in range(rows):
        tmp = []
        for column in range(columns):
            num += 1
            tmp.append(num)
            
        num_list.append(tmp)
    
    print(num_list)
    
    for query in queries:
        
        query = list(map(lambda t:t-1,query))
        
        y1,x1,y2,x2 = query
        # (y1,x1) (y1,x2)
        # (y2,x1) (y2,x2)
        min_val = 99999
        tmp = num_list[y1][x2]
        min_val = min(min_val,tmp)
        
        for nx in range(x2,x1,-1):
            num_list[y1][nx] = num_list[y1][nx-1]
            min_val = min(min_val,num_list[y1][nx])
        
        for ny in range(y1, y2):
            num_list[ny][x1] = num_list[ny+1][x1]
            min_val = min(min_val,num_list[ny][x1])
        
        for nx in range(x1, x2):
            num_list[y2][nx] = num_list[y2][nx+1]
            min_val = min(min_val,num_list[y2][nx])
            
        for ny in range(y2,y1+1,-1):
            num_list[ny][x2] = num_list[ny-1][x2]
            min_val = min(min_val,num_list[ny][x2])
        
        num_list[y1+1][x2] = tmp
        answer.append(min_val)
        # print_arr(num_list)
    
    
    return answer;

def print_arr(arr):
    
    for row in arr:
        print(row)
    print()







