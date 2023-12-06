from collections import deque
def solution(maps):
    answer = []
    maps = [ list(r) for r in maps ]
    m,n = len(maps) , len(maps[0])
    visited = [ [False for _ in range(n)] for _ in range(m) ]
    dx,dy = [-1,1,0,0], [0,0,-1,1]
    
    for y in range(m):
        for x in range(n):
            
            if maps[y][x] != "X" and not visited[y][x]:
                
                q = deque()
                q.append([y,x])
                tmp = int(maps[y][x])
                visited[y][x] = True
                
                while q:
                    now_y,now_x = q.popleft()
                    # print(now_y,now_x)
                    
                    for i in range(4):
                        nx = now_x + dx[i]
                        ny = now_y + dy[i]
                        
                        if 0<=ny<m and 0<=nx<n and maps[ny][nx] != 'X' and not visited[ny][nx]:
                            tmp += int(maps[ny][nx])
                            visited[ny][nx] = True
                            q.append([ny,nx])
                            
                # print()
                answer.append(tmp)     
    
    
    return sorted(answer) if answer else [-1]