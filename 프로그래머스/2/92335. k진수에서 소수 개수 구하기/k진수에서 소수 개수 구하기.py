import math
cache = {}
def solution(n, k):
    answer = 0
    
    a = convert(n, k)
    # print(a)
    
    # num_list = list(map(int, filter(lambda x: x!= '', a.split('0'))))
    # print(num_list)
    
    # sosu_list = get_sosu_list(max(num_list))
    # print(sosu_list)
    
    # return len(list(filter(lambda x: sosu_list[x], num_list)) )

    num_list = a.split('0')
    
    for num in num_list:
        
        if num != '' and is_sosu(int(num)):
            answer += 1
    
    return answer

def is_sosu(num):
    
    if num <= 1:
        return False
    if num == 2:
        return True
    
    if num in cache:
        return cache[num]
    
    for i in range(2, int(math.sqrt(num)+1)):
        
        if num % i == 0:
            cache[num] = False
            return False
    cache[num] = True
    return True
        
    
def get_sosu_list(num):
    
    if num <= 2:
        return [False,False,True][:num+1]
    
    answer = [True for i in range(num+1)]
    answer[0] = False
    answer[1] = False
    
    for i in range(2, int(math.sqrt(num))+1):
        
        for j in range(2*i,num+1,i):
            answer[j] = False
    
    return answer;

def convert(num, k):
    
    if k == 10:
        return str(num)
    
    result = ''
    
    while num :
        result = str(num % k) + result
        num //= k
    
    return result