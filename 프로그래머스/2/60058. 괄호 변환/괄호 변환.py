def solution(p):
    return convert(p)

def convert(w):
    
    answer = ''
    
    if w == '':
        return ''
    
    # 균형잡힌 괄호 문자열로 분리
    n = len(w)
    for i in range(2,n+1,2) :
        u = w[:i]
        v = w[i:]
        l_cnt = u.count('(')
        r_cnt = len(u) - l_cnt
        
        if l_cnt == r_cnt :
            break
    
    # print(f'w : {w}, u : {u}, v: {v}')
    
    if is_right(u):
        return u + convert(v)
    else:
        return '(' + convert(v) + ')' + flip(u[1:-1]) 
    
    
def is_right(w):
    
    answer = 0
    
    for i in w:
        
        if i == '(':
            answer += 1
        else:
            answer += -1
        
        if answer < 0:
            return False
    
    return answer == 0
    
def flip(word):
    answer =''
    
    for w in word:
        if w == '(':
            answer += ')'
        else:
            answer += '('
    return answer
    
    
    
    