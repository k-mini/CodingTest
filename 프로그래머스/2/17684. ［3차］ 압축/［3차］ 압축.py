def solution(msg):
    answer = []
    last_idx = 26
    w_dict = {}
    
    for i in range(1,27):
        w_dict[chr(64+i)] = i
    print(w_dict)
    cursor1 = 0
    cursor2 = 1
    n = len(msg)
    while cursor1 < n and cursor2 <= n:
        
        while cursor2 <= n:
            tmp = msg[cursor1:cursor2]
            
            if tmp not in w_dict:
                # print(f'tmp = {tmp}')
                # 이전에 있던 값 추가
                answer.append(w_dict[ tmp[:-1] ])
                # 등록
                last_idx += 1
                w_dict[tmp] = last_idx
                cursor1 = cursor2 - 1
                break
            cursor2 += 1
            
    answer.append(w_dict[msg[cursor1:cursor2-1]])
    
    return answer