
# 📚 2 x n 타일링

## 📌 [문제링크](https://school.programmers.co.kr/learn/courses/30/lessons/12900)

### 문제 해설

- 가로 길이가 2이고 세로 길이가 1인 직사각형모양의 타일이 있다.
- 이 타일은 가로로 배치 할 수도 있고 세로로 배치 할 수도 있다.
- 이 타일을 이용하여 세로 길이가 2이고 가로 길이가 n인 바닥을 채우려고 한다.
- 직사각형 가로 길이 n이 매개변수로 주어질 때, 이 직사각형을 채우는 방법의 수를 return 하라.

### 문제 풀이

- 직사각형을 채울 때 블록을 세워서 가로 방향으로 진행하는 것과 블록을 눕혀서 정사각형모양으로 추가하는 2가지 경우가 있다.
- dp를 이용하여 풀이한다.

- 1차 풀이

```
def solution(n):
    
    # 타일을 추가 하는 방법: 세워서 한칸 추가 or 눕혀서 2*2 정사각형 만들기
    # 대칭 고려 x : 기존 dp에서 이미 대칭포함 경우의수가 있기 때문 , 오른쪽으로 확장한다고 생각
    #dp=[0,1,2,3,5] + [0 for _ in range(n-4)]
    dp = [ i for i in range(n+1)]
    dp[1] = 1
    dp[2] = 2
    dp[3] = 3
    dp[4] = 5
    for i in range(5,n+1):
        dp[i] = (dp[i-2] + dp[i-1]) % 1000000007
    
    return dp[n]
```

- 2차 풀이

```
def solution(n):
    
    if n < 4: return [0,1,2,3,5][n]

    dp = [ 0 for _ in range(n+1)]
    
    dp[1] = 1
    dp[2] = 2
    dp[3] = dp[1] + dp[2]
    dp[4] = 5
    
    for i in range(5,n+1):
        dp[i] = (dp[i-2] + dp[i-1]) % 1000000007
    
    return dp[n] % 1000000007
```

- 그 외 풀이

```
def solution(n):
    dp = [0,1,2]
    
    for i in range(3,n+1):
        dp.append( (dp[i-2]+dp[i-1]) % 1000000007)
    return dp[n]

def solution(n):
    if n==1:
        return 1
    elif n ==2:
        return 2
    else:
        return solution(n-2) % 1000000007 +solution(n-1) % 1000000007
```
