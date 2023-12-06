def solution(m, n, board):
    answer = 0
    
    board = [ list(r) for r in board ]
    print(board)
    
    
    while True:
        prev = answer
        # print('실행 전')
        # for r in board:
            # print(r)
        # print()
        
        # 지워질 블록 매칭
        mark = []
        for y in range(m-1):
            for x in range(n-1):
                
                if board[y][x] == board[y+1][x] == board[y][x+1] == board[y+1][x+1]:
                    mark.append([y,x])
        
        # 다시 마킹
        for y,x in mark:
            board[y][x] = 0
            board[y+1][x] = 0
            board[y][x+1] = 0
            board[y+1][x+1] = 0
        
        
        for x in range(n):
            
            while True:
                changed = 0
                
                for y in range(m-1):
                
                    upper_block = board[y][x]
                    down_block = board[y+1][x]
                
                    if upper_block != 0 and down_block == 0:
                        board[y+1][x] = board[y][x]
                        board[y][x] = 0
                        changed += 1
                        
                if changed == 0:
                    break
        
        #이전과 개수가 차이가 없으면 break
        # print('실행 후')
        # for r in board:
            # print(r)
        # print()
        answer = sum([ r.count(0) for r in board])
        
        if prev == answer :
            break
    
    return answer