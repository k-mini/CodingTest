def solution(s):
    num_list = list(map(int,s.split(" ")))
    print(num_list)
    return str(min(num_list)) + " " + str(max(num_list))