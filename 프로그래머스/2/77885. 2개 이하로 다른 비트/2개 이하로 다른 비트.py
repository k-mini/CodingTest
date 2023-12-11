def solution(numbers):
    answer = []
    
    for number in numbers:
        
        if number % 2 == 0:
            answer.append(number+1)
            
        else:
            str_num = '0' + convert_bin(number)
            
            idx = str_num.rfind('01')
            
            str_num = str_num[:idx] + '10' + str_num[idx+2:]
            
            answer.append(int(str_num,2))
        
    return answer

def convert_bin(num):
    answer = ''
    while num > 0:
        answer = str(num % 2) + answer
        num //= 2
    
    return answer