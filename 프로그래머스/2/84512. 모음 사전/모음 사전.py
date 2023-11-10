

def solution(word):
    
    a_dict = {'A':0 , 'E':1, 'I':2, 'O':3, 'U':4}
    answer = 0
    for idx,w in enumerate(word):
        tmp = 1
        for j in range(4-idx):
            tmp = (tmp * 5 + 1)
        tmp = tmp * a_dict[word[idx]] + 1
        answer += tmp
        # print(tmp)
    print(f'answer = {answer}')
    return answer