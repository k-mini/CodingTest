def solution(n):
    answer = []
    
    number = 0
    
    num_list = [ [0] * i for i in range(1,n+1) ]
    # print(num_list)
    
    y,x = -1,0
    direction = 0
    dx,dy =[0,1,-1], [1,0,-1]
    
    for j in range(n):
        
        for k in range(n-j,0,-1):
            x = x + dx[j%3]
            y = y + dy[j%3]
            number+= 1
            # print(f'y:{y}, x:{x}')
            num_list[y][x] = number
        # print()
    
    return [num for row in num_list for num in row]