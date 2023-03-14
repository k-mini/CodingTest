import sys

def test():
    sys.stdin = open('input.txt', 'r')
    
    #############################  테스트코드 시작
    temp = list(map(int, input().split(' ')))
    N = temp[0]
    M = temp[1]

    BLOCK = []
    for i in range(0, N):
        BLOCK.append(input().split())

    print(N,M)
    print(BLOCK)
    ##############################  테스트 코드 종료
    sys.stdin.close()
    
    
if __name__ == '__main__':
    print('this is main')

if __name__ == 'testcode':
    print('imported testcode')
    test()