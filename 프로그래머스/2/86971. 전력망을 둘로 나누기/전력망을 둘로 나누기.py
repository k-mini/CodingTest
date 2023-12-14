from collections import deque
from collections import defaultdict
def solution(n, wires):
    global nodes,node_cnt
    answer = float('inf')
    node_cnt = n
    nodes = [ i for i in range(1,n+1)]
    
    for i,wire in enumerate(wires):
        
        a,b = wire
        new_wires = wires[:i] + wires[i+1:]
        
        result = abs(get_tower_count(a,new_wires) - get_tower_count(b,new_wires))
        # print(f'a :{a}, b:{b}, result:{result}')
        answer = min(answer, result)
    
    return answer

def get_tower_count(node,wires):
    
    q = deque()
    dx,dy = [-1,1,0,0], [0,0,-1,1]
    visited = [False for _ in range(node_cnt+1)]
    
    q.append(node)
    visited[node] = True
    node_info = defaultdict(list)
    for wire in wires:
        node_info[wire[0]].append(wire[1])
        node_info[wire[1]].append(wire[0])
    
    # print(node_info)
    while q:
        
        x_node = q.popleft()
        
        for next_node in node_info[x_node]:
            
            if not visited[next_node]:
                visited[next_node] = True
                q.append(next_node)
    
    return len(list(filter(lambda x: x== True, visited)))