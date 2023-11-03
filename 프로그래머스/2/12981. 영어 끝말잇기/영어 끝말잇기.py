def solution(n, words):
    answer = []
    
    word_list = []
    cnt = 0
    
    for idx,word in enumerate(words):
        if idx % n == 0:
            cnt += 1
        
        if idx != 0  and (len(word) == 1 or word in word_list or words[idx-1][-1:] != word[:1]):
            return [idx%n + 1, cnt]
        
        word_list.append(word)

    return [0,0]