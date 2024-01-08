from collections import deque
def solution(bandage, health, attacks):
    max_health = health
    time = 0
    healing_time = 0
    attacks = deque(attacks)
    cnt = 0
    # print(attacks)
    # 체력이 0이 되거나 공격이 더 이상 없으면 종료
    while attacks :
        
        # print(f'time : {time}, health(cnt) : {health}({cnt}) , attacks : {attacks}')
        
        # 공격타임이면 맞는다
        if attacks[0][0] == time:
            health -= attacks.popleft()[1]
            cnt = 0
        # 아니면 회복
        else:
            cnt += 1
            # 최대 회복인지 검사
            if health == max_health:
                time += 1
                continue
            # 회복 횟수 증가
            if cnt == bandage[0]:
                health += bandage[2]
                cnt = 0
            health += bandage[1]
            
            # 최대 회복 안넘게 조절
            health = min(health, max_health)
            
        if health <= 0:
            break
            
        time += 1
    
    
    return health if health > 0 else -1