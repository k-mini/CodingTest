from collections import *
def solution(board, moves):
    answer = 0
    stack =  []
    length = len(board)
    for k in board :
        print(k)
    print()
    
    for move in moves:
        
        i = move - 1
        
        for j in range(0, length):
            # print(f'{i},{j}, board[{j}][{i}] : {board[j][i]}')
            # print(f'시작 전 stack : {stack}')
            if board[j][i] != 0:
                value = board[j][i]
                if stack and stack[-1] == value :
                    stack.pop()
                    answer += 2
                else: 
                    stack.append(value)
                board[j][i] = 0
                break
        else:
            continue        
        
        # for k in board :
            # print(k)
        
        # print(f'moving 후 stack : {stack}')
        # if stack and stack[-1] == value :
            # stack.pop()
            # answer += 2
        # print(stack)
        # print()
        
    
    return answer