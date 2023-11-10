from collections import deque

def solution(maps):
    answer = 0
    dx = [0,0,1,-1]
    dy = [1,-1,0,0]
    n = len(maps)
    m = len(maps[0])
    visited = [ [False for _ in range(m)] for _ in range(n) ]
    visited[0][0] = True
    q = deque()
    q.append([0,0,1])
    
    while q:
        
        x,y,dist = q.popleft()
        # print(f'x:{x}, y:{y}, dist:{dist}')
        if x == n -1 and y == m-1:
            return dist
        
        for k in range(4):
            nx = x + dx[k]
            ny = y + dy[k]
            # print(f'nx : {nx} ny : {ny}')
            if nx >= 0 and nx < n and ny >= 0 and ny < m and maps[nx][ny] != 0 and not visited[nx][ny]:
                visited[nx][ny] = True
                q.append([nx,ny,dist+1])
            
    
    return -1