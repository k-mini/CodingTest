
# 테스트 하기

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
