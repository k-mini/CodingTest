def solution(queue1, queue2):
    answer = 0
    q1_sum = sum(queue1)
    q2_sum = sum(queue2)
    n = len(queue1)
    
    nun_sum = q1_sum + q2_sum
    
    if nun_sum % 2 == 1:
        return -1
    
    goal_num = nun_sum / 2
    
    q = queue1 + queue2 + queue1
    
    s_pointer = 0
    e_pointer = n-1
    max_len = len(q)
    total_cnt = len(queue1) + len(queue2)
    
    while s_pointer <= e_pointer and e_pointer < max_len:
        
        if q1_sum < goal_num:
            e_pointer += 1
            if e_pointer >= max_len:
                return -1
            q1_sum += q[e_pointer]
        elif q1_sum == goal_num:
            break
        else:
            q1_sum -= q[s_pointer]
            s_pointer += 1
        
        answer += 1
        
        if e_pointer - s_pointer > total_cnt:
            return -1
        
        if q1_sum == goal_num:
            break
    # print(s_pointer,e_pointer)
    # print(q)
    return answer if q1_sum == goal_num else -1