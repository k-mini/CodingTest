
# 📚 2 x n 타일링

## 📌 [문제링크](https://school.programmers.co.kr/learn/courses/30/lessons/12902)

### 문제 해설

- 가로 길이가 2이고 세로의 길이가 1인 직사각형 모양의 타일이 있다.
- 이 직사각형 타일을 이용하여 세로의 길이가 3이고 가로의 길이가 n인 바닥을 가득 채우려고한다.
- 타일은 가로로도 배치할 수 있고 세로로도 배치가 가능하다.
- 이 직사각형을 채우는 방법의 수를 return하라. 

### 문제 풀이


<img src="Level%202/images/3xn%20tile.png" width="500" height="300" >

- dp\[i\] = dp\[i-2\] * 3 + ( 특이한 모양 갯수를 끝에서 부터 놓은 경우의 수) + 새롭게 생긴 특이한 모양 2개  
ex) dp\[8\] = dp\[6\] * 3 + (dp\[4\] * 2 + dp\[2\] * 2 )                    + 2

- dp를 이용하여 풀이한다.

```
def solution(n): # 다시풀기
    if n <= 4 : return [0,0,3,0,11][n]
    # 홀수 넓이는 타일로 채울 수 없다. 3*(홀수) = 홀수  
    mod = 1000000007
    dp = [0 for i in range(n+1)]
    dp[2] = 3
    dp[4] = 11
    
    for i in range(6,n+1,2):
        dp[i] = dp[i-2] *3 + 2
        for j in range(i-4,-1,-2):
            dp[i] += dp[j] * 2
        dp[i] = dp[i] % mod
    print(dp)
    return dp[n]
```
