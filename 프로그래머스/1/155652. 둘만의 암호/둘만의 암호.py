def solution(s, skip, index):
    answer = ''
    
    for i in s:
        cnt = 0
        
        while cnt < index:
            ascii_num = ord(i)
            ascii_num += 1
            if ascii_num > 122:
                ascii_num = 97
            i = chr(ascii_num)
            
            if i in skip:
                continue
            cnt += 1
        answer += i
            
    
    return answer