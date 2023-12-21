import re
def solution(files):
    answer = []
    f_list = []
    
    for idx,file in enumerate(files):
        word = re.search('(\D+)([0-9]+)(.*)', file)
        head = word.group(1)
        number = word.group(2)
        tail = word.group(3)
        # print(f'head : {head}, number : {number}, tail : {tail}')
        f_list.append([head.lower(), int(number), idx, file])
        
    
    f_list = sorted(f_list, key = lambda x: (x[0],x[1],x[2]) )
    # print(f_list)
    
    return list(map(lambda x: x[3] , f_list))