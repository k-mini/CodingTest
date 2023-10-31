import re
def solution(dartResult):
    answer = [0,0,0]
    
    for idx, result in enumerate(re.findall('(\d+)(S|D|T)(\*|\#)?',dartResult)):
        score = int(result[0])
        bonus = result[1]
        option = result[2]
        # print(score,bonus,option)
        score = score if bonus == 'S' else score ** 2 if bonus =='D' else score ** 3
        
        if option == '*':
            score = score * 2
            if idx > 0:
                answer[idx-1] = answer[idx-1] * 2
        elif option == '#':
            score = score * (-1)
        else:
            pass
        
        answer[idx] = score
    
    print(answer)
    
    return sum(answer)