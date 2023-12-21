
base_dict = {10:'A',11:'B',12:'C',13:'D',14:'E',15:'F'}
def solution(n, t, m, p):
    answer = ''
    numbers= ''
    length = 0
    start = 0
    # p-1,   p-1 + m,   p-1 + 2 *m 
    while length < m*t:
        
        numbers += get_number(start,n)
        start += 1
        length = len(numbers)
        
        # print(f'numbers : {numbers}')
    
    for idx in range(p-1,t*m, m):
        
        answer += numbers[idx]
    
    return answer

def get_number(number,base):
    
    answer = ''
    
    if number == 0:
        return '0'
    
    while number != 0:
        
        remainder = number % base
        if remainder < 10:
            answer = str(remainder) + answer
        else:
            answer = base_dict[remainder] + answer
            
        number //= base
        
    return answer