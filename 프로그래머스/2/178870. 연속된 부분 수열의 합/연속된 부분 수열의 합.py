def solution(sequence, k):
    max_sum = sequence[0]
    n = len(sequence)
    start_idx = 0
    end_idx = 0
    answer = []
    
    while start_idx <= end_idx and start_idx < n and end_idx < n:
        
        # print(f'start_idx : {start_idx}, end_idx : {end_idx} answer : {answer}')
        
        if max_sum == k:
            answer.append([start_idx, end_idx])
            max_sum -= sequence[start_idx]
            start_idx += 1
        
        else:
            if max_sum > k:
                max_sum -= sequence[start_idx]
                start_idx += 1
            else:
                end_idx += 1
                if end_idx >= n:
                    break
                max_sum += sequence[end_idx]
    
    answer.sort(key = lambda x: (x[1] - x[0], x[0]) )
    return answer[0]