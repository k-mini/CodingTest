from collections import deque
b_dict = {']' : '[' , '}' : '{', ')': '('}

def solution(s):
    answer = 0
    
    for i in range(len(s)):
        q = deque(s)
        q.rotate(i)
        word = "".join(q)
        answer += check(word)
    
    return answer


def check(word):
    
    stack = []
    
    for i in word:
        
        if i == '[' or i == '{' or i =='(':
            stack.append(i)
        else:
            if stack and stack[-1] == b_dict[i] :
                stack.pop()
            else:
                return False
    return 0 if stack else 1