def solution(dirs):
    answer = 0
    dirs = list(dirs)
    print(dirs)
    route = set()
    x,y = 0,0
    r_dict = {'L':[-1,0],'R':[1,0],'D':[0,-1],'U':[0,1] }
    
    for i in dirs:
        
        nx = x + r_dict[i][0]
        ny = y + r_dict[i][1]
        
        if nx < -5 or nx > 5 or ny < -5 or ny > 5:
            continue
        
        route.add( (x,y,nx,ny) )
        route.add( (nx,ny,x,y) )
        x = nx
        y = ny
    # print(route)
    return len(route) // 2