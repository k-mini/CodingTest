
# ๐ N-Queen

## ๐ [๋ฌธ์ ๋งํฌ](https://school.programmers.co.kr/learn/courses/30/lessons/12952)

### ๋ฌธ์  ํด์ค

- ๊ฐ๋ก, ์ธ๋ก ๊ธธ์ด๊ฐ n์ธ ์ ์ฌ๊ฐํ์ผ๋ก ๋ ์ฒด์คํ์ด ์๋ค.
- ์ฒด์คํ ์์ n๊ฐ์ ํธ์ด ์๋ก๋ฅผ ๊ณต๊ฒฉํ  ์ ์๋๋ก ๋ฐฐ์นํ๋ ค๊ณ  ํ๋ค.
- ํธ์ ๊ฐ์ ํ,์ด,๋๊ฐ์  ๋ฐฉํฅ์ผ๋ก ๊ณต๊ฒฉํ  ์ ์๋ค.
- ์ฒด์คํ์ ๊ธธ์ด n์ด ์ฃผ์ด์ง๊ณ , n๊ฐ์ ํธ์ด ์กฐ๊ฑด์ ๋ง์กฑํ๋๋ก ๋ฐฐ์น๋  ์ ์๋ ๋ฐฉ๋ฒ์ ์๋ฅผ return ํ๋ผ.

### ๋ฌธ์  ํ์ด

<img src="./images/n_queen.png" width="300" height="300" >

- dfs๋ฅผ ์ด์ฉํ ํ์ด 1 

- ์ฝ๋๊ฐ ์ง์ ๋ถํ๋ค.

```
def dfs(now,n,board):
    answer = 0
    if now == n:
        #print(board)
        return 1
    
    # ๋์ ์๋ฆฌ ์ฐพ๊ธฐ
    for y in range(n):
        if now != 0:
            for prev in range(now): # 0 ~ now-1
                if board[prev] != y and abs( (board[prev] - y) / (prev - now) ) != 1:
                    continue
                else:
                    break
            else:
                board[now] = y
                answer += dfs(now+1,n,board[:] )
        else:
            board[now] = y
            answer += dfs(now+1,n,board[:])
    return answer
    
    
def solution(n):
    return dfs( 0, n, [0 for _ in range(n)] )
```

- dfs๋ฅผ ์ด์ฉํ ํ์ด 2

```
def dfs(queen, row, n):
    count = 0
    if n == row:
        return 1
    for col in range(n):
        queen[row] = col
        for i in range(row):
            if queen[i] == queen[row]:
                break
            if abs(queen[i]-queen[row]) == row - i:
                break
        else:
            count += dfs(queen, row + 1, n)
    return count
def solution(n):
    return dfs([0]*n, 0, n)
```
