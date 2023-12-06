from collections import deque
def solution(board, h, w):
    answer = 0
    n = len(board)
    color = board[h][w]
    dx = [-1,1,0,0]
    dy = [0,0,-1,1]
    
    q = deque()
    q.append([h,w])
    
    visited = [ [False for _ in range(n)] for _ in range(n) ]
    visited[h][w] = True
    
    y,x = q.popleft()
        
        
    for i in range(4):
            
        nx = x + dx[i]
        ny = y + dy[i]
            
        if 0<= ny < n and 0<= nx < n and not visited[ny][nx] and color == board[ny][nx]:
            visited[ny][nx] = True
            answer += 1
            q.append([ny,nx])
    
    
    return answer