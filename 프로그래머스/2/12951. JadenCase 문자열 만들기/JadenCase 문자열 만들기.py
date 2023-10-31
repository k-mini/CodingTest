def solution(s):
    answer = ''
    str_list = s.split(' ')
    print(str_list)
    str_list = [ word.capitalize() for word in str_list]
    print(str_list)
    return ' '.join(str_list)