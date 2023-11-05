from collections import *
def solution(people, limit):
    answer = 0
    people.sort()

    people = deque(people)
    
    while people:
        answer += 1
        # 2개 이상일때
        if len(people) >= 2:
            # 2개 태울 수 있는 경우
            if people[-1] + people[0] <= limit:
                people.popleft()
                people.pop()
            # 2명이 무거우면
            else:
                people.pop()
        else:
            people.pop()
            
            
    return answer