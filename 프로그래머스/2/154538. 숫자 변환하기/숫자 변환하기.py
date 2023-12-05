from collections import deque
def solution(x, y, n):
    answer = []
    
    q = deque()
    q.append([y,0])
    visited = [ False for _ in range(y+1)]
    
    while q :
        
        num, cnt = q.popleft()
        # print(q)
        if visited[y]:
            continue
        
        if num == x :
            answer.append(cnt)
            break
        
        if num % 3 == 0 and num//3 >= x:
            visited[num//3] = True
            q.append([num//3,cnt + 1])
            
        if num % 2 == 0 and num//2 >= x:
            visited[num//2] = True
            q.append([num//2,cnt + 1])
            
        if num - n >= x:
            visited[num-n] = True
            q.append([num-n,cnt + 1])
            
    
    
    return min(answer) if answer else -1