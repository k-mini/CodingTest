def solution(routes):
    answer = 0
    
    routes.sort(key = lambda x: x[1])
    print(routes)
    camera = -30001
    
    for start, end in routes:
        # 카메라 이후 진입
        if start > camera:
            answer += 1
            camera = end
        else:
            continue
        
    
    return answer