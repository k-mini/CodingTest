
answer = 0
def solution(k, dungeons):
    n = len(dungeons)
    visited = [False] * n
    dfs(dungeons,visited,k,0)
    
    return answer

def dfs(dungeons, visited, gauge,cnt):
    global answer
    answer = max(answer,cnt)
    # print(f'dungeons : {dungeons}, visited : {visited}, cnt : {cnt}')
    for i,(min_pirodo, c_pirodo) in enumerate(dungeons):
        
        if visited[i] == True:
            continue
        else:
            if (gauge >= min_pirodo):
                visited[i] = True
                gauge = gauge - c_pirodo
                cnt += 1
                dfs(dungeons,visited, gauge,cnt)
                cnt -= 1
                gauge = gauge + c_pirodo
                visited[i] = False