from math import *
from functools import *
def solution(arr):
    answer = 0
    
    return reduce(lcm,arr);

def lcm(x,y):
    
    return x*y // gcd(x,y)