def solution(brown, yellow):
    answer = []
    
    # 둘레
    # width + height = brown + 4
    
    # 넓이
    area = (yellow + brown) 
    
    for height in range(2, brown+yellow):
        if area % height == 0 :
            width = area // height
            if (width-2) * (height - 2) == yellow :
                return [width,height]
    
    return answer