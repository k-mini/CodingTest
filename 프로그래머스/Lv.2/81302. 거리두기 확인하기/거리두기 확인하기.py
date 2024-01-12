from collections import deque
def solution(places):
    answer = []
    return [ bfs(place) for place in places]


def bfs(place):
    
    dx = [0,0,-1,1]
    dy = [-1,1,0,0]
    place = [ list(r) for r in place ]
    len_y = len(place)
    len_x = len(place[0])
    # for r in place:
        # print(r)
    # print()
    for y in range(len_y):
        for x in range(len_x):
            
            if place[y][x] == 'P':
                q = deque()
                q.append([y,x,0])
                visited = [ [ False for _ in range(len_x) ] for _ in range(len_y) ]
                visited[y][x] = True
                # print(f'y : {y} , x : {x}')
                while q:
                    
                    y,x,dist = q.popleft()
                    
                    if dist == 2:
                        continue
                    
                    for k in range(4):
                        nx = x + dx[k]
                        ny = y + dy[k]
                        # print(f'nx : {nx} , ny: {ny}')
                        if ny < 0 or ny >= len_y or nx < 0 or nx >= len_x or visited[ny][nx]:
                            # print(f'스킵')
                            continue
                        
                        if place[ny][nx] == 'P':
                            # print(f'P 발견')
                            return 0
                        
                        if place[ny][nx] == 'O':
                            visited[ny][nx] = True
                            q.append([ny,nx,dist+1])
    
    return 1
    