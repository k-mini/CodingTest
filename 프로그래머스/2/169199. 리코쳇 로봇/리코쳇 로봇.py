from collections import deque
def solution(board):
    answer = 0
    global n,m
    n = len(board)
    m = len(board[0])
    flag = False
    for y in range(n):
        for x in range(m):
            if board[y][x] == 'R':
                start_y = y
                start_x = x
                flag = True
                break
        if flag :
            break
    
    q = deque()
    q.append([start_y,start_x,0])
    visited = [ [ False for _ in range(m)] for _ in range(n)]
    visited[y][x] = True
    
    while q:
        
        y,x, cnt = q.popleft()
        
        if board[y][x] == 'G':
            return cnt
        
        for k in range(4):
            ny,nx = move(y,x,k,board)
            
            # 방문하지 않았으면 탐색
            if not visited[ny][nx]:
                visited[ny][nx] = True
                q.append([ny,nx,cnt+1])
        
    return -1

def move(y,x,k,board):
    dx = [0,0,-1,1]
    dy = [-1,1,0,0]
    
    # 이동
    while True:
        ny,nx = y + dy[k], x + dx[k]
        
        # 경계선 넘었거나 장애물일 경우 탈출
        if ny < 0 or ny >= n or nx < 0 or nx >= m or board[ny][nx] == 'D':
            break
        else:
            y,x = ny,nx            
    return [y,x]
    
    
    
    
    