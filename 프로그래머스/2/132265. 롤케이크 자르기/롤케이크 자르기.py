from collections import Counter
def solution(topping):
    answer = 0
    left_side = Counter()
    right_side = Counter(topping)
    n = len(topping)
    
    for i in range(n):
        flavor = topping[i]
        left_side[flavor] += 1 
        right_side[flavor] -= 1
        if right_side[flavor] == 0:
            del right_side[flavor]
    
        if len(left_side.keys()) == len(right_side.values()):
            # print(f'left_side :{left_side}, right_side :{right_side}')
            answer += 1
    
    return answer