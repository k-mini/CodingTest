from collections import deque
def solution(bridge_length, weight, truck_weights):
    answer = 0
    
    time = 0
    truck_weights = deque(truck_weights)
    truck_on_bridge = deque([])
    
    while True:
        time += 1
        
        # 시간 지나면 나감
        while truck_on_bridge and time - truck_on_bridge[0][1] == bridge_length:
            truck_on_bridge.popleft()
        
        if truck_weights and truck_weights[0] + sum(map(lambda x: x[0],truck_on_bridge)) <= weight:
            truck_on_bridge.append([truck_weights.popleft(), time])
        
        if not truck_weights and not truck_on_bridge:
            break
        
    return time