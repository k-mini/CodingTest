from collections import deque
def solution(maps):
    answer = 0
    global g_maps,n,m
    n = len(maps)
    m = len(maps[0])
    g_maps = list(map(list, maps))
    
    start_x,start_y= -1,-1
    lever_x,lever_y = -1,-1
    exit_x,exit_y = -1,-1
    
    for a in range(n):
        for b in range(m):
            if maps[a][b] == 'S':
                start_y,start_x = a,b
            elif maps[a][b] == 'L':
                lever_y,lever_x = a,b
            elif maps[a][b] == 'E':
                exit_y,exit_x = a,b
    
    start_to_lever =  cal_dist(start_x, start_y, lever_x, lever_y)
    lever_to_exit = cal_dist(lever_x, lever_y, exit_x, exit_y)
    print(start_to_lever, lever_to_exit)
    if start_to_lever == 0 or lever_to_exit == 0 :
        return -1
    
    return start_to_lever + lever_to_exit

def cal_dist(x,y,dest_x,dest_y):
    answer = 0
    visited = [ [ False for _ in range(m)] for _ in range(n)]
    dx,dy = [-1,1,0,0],[0,0,-1,1]
    q = deque()
    q.append([y,x,0])
    visited[y][x] = True
    # print(y,x,dest_y,dest_x)
    
    while q:
        y,x,cnt = q.popleft()
        # print(f'y : {y} , x : {x} , cnt : {cnt}')
        if y == dest_y and x == dest_x:
            answer += cnt
            break
        
        for i in range(4):
            nx = x + dx[i]
            ny = y + dy[i]
            
            if 0<= nx < m and 0<= ny < n and g_maps[ny][nx] != 'X' and not visited[ny][nx] :
                visited[ny][nx] = True
                q.append([ny,nx,cnt+1])
    # print()
    return answer