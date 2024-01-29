from math import gcd
def solution(w,h):
    answer = 1
    
    gcd_num = gcd(w,h)
    print(gcd_num)
    x = w // gcd_num
    y = h // gcd_num
    
    cnt = x+y - 1
    
    return w*h - gcd_num * cnt