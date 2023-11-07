def solution(elements):
    answer = []
    n = len(elements)
    two_elements = elements + elements
    # 7 9 1 1 4
    for i in range(1,n+1):
        for j in range(0, n):
            # print(f'j: {j}, i:{i}, {two_elements[j:j+i]}')
            answer.append(sum(two_elements[j:j+i]) )
            # print(set(sorted(answer)))
            # print()
    
    
    return len(set(answer))