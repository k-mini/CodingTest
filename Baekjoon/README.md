
# 테스트 하기

## 📌 테스트 파일 작성하기 

- testcode.py

```
import sys

def test():
    sys.stdin = open('input.txt', 'r')
    input = sys.stdin.readline
    
    #############################  테스트코드 시작 (여기다 붙여넣기)
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
```

- input.txt

```
4 5
1 2 3 4 5
6 7 8 9 10
11 12 13 14 15
16 17 18 19 20
```

## 📌 표준 입출력 코드

예시코드 1

```
import sys

sys.stdin = open('input.txt')

for i in range(5):
    print(sys.stdin.readline())
    
sys.stdin.close()
```

input.txt 파일

```
hello world
1
2
3
4
```

결과 => 개행함수 \n까지 읽으므로 strip함수를 이용하여 제거시켜야 한다.
```
hello world

1

2

3

4
```

예시코드 2

```
import sys

sys.stdin = open('input.txt')

for i in range(5):
    print(sys.stdin.readline().rstrip())
    
sys.stdin.close()
```

input.txt 파일

```
hello world
1
2
3
4
```

결과 (개행문자 제거)

```
hello world
1
2
3
4
```


## 📌 현재경로 확인 코드

```
import  os
os.getcwd()
```
