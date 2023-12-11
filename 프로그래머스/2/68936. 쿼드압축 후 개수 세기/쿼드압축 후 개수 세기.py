answer = [0,0]
def solution(arr):
    global answer
    n = len(arr)
    
    compress(n,0,0,arr)
        
    
    return answer


def compress(n, y, x, arr):
    global answer
    number = arr[y][x]
    # print(f'n:{n}, y:{y}, x:{x}')
    for j in range(n):
        for i in range(n):
            if arr[y+j][x+i] != number:
                compress(n//2, y,        x, arr)
                compress(n//2, y + n//2, x, arr)
                compress(n//2, y,        x + n//2, arr)
                compress(n//2, y + n//2, x + n//2, arr)
                return
    
    answer[number] += 1
    