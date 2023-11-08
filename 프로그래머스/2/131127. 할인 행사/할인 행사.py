from collections import Counter
def solution(want, number, discount):
    answer = 0
    n = len(discount)
    counter = Counter(discount[:10])
    answer += check(counter,want,number)
    
    for i in range(10, n):
        counter[discount[i]] += 1
        counter[discount[i-10]] -= 1
        answer += check(counter,want,number)
    
    return answer

def check(counter,want,number):
    
    for food,cnt in zip(want,number):
        
        if counter[food] == cnt:
            continue
        else:
            return 0
    else:
        return 1
        