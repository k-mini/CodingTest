def solution(s):
    answer = []
    
    s = s[1:-1]
    s = s.split('},{')
    s_list = []
    for i in s:
        i =i.strip('{')
        i = i.strip('}')
        i = list(map(int,i.split(',')))
        s_list.append(i)
    s_list.sort(key=lambda x: len(x))
    
    # print(s_list)
    before = set()
    for x in s_list:
        x =set(x)
        answer.append(list(x - before)[0])
        before = x
    
    return answer