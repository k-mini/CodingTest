from collections import deque
def solution(orders):
    answer = 0
    stack = []
    n = len(orders)
    boxes = deque([ i for i in range(1,n+1)])
    
    for order in orders:
        # print(boxes)
        # print(stack)
        # print()
        
        # 기존 컨테이너 확인
        if boxes and boxes[0] == order:
            boxes.popleft()
            answer += 1
        elif boxes and order > boxes[0]:
            while boxes and boxes[0] != order:
                stack.append(boxes.popleft())
            boxes.popleft()
            answer += 1
        # 보조 컨테이너 확인
        elif stack and stack[-1] == order:
            stack.pop()
            answer += 1
        else:
            break
    
    return answer