import math
def solution(number, limit, power):
    answer = 0
    
    answer = list(map( lambda x: x if x<=limit else power, [ get_sword(i) for i in range(1,number+1) ] ) )
    # print(answer) 
    
    return sum(answer)
        
def get_sword(num):
    result = 0
    
    if num <= 2:
        return num
    
    for i in range(1, int(math.sqrt(num)+1)):
        if num % i ==0:
            if num // i ==  i :
                result += 1
            else:
                result += 2
    return result
        