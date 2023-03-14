import sys

def test():
    sys.stdin = open('input.txt', 'r')
    input = sys.stdin.readline
    #############################  테스트코드 시작
    n,m = map(int, input().rstrip().split())

    arr= []
    for i in range(0, n):
        arr.append(list(map(int,input().rstrip().split())))

    print(n,m)
    print(arr)
    ##############################  테스트 코드 종료

    sys.stdin.close()
    
    
if __name__ == '__main__':
    print('this is main')

if __name__ == 'testcode':
    print('imported testcode')
    print('테스트시작')
    test()
