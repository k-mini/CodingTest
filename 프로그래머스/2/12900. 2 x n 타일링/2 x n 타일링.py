def solution(n):
    answer = 0
    
    if n <= 2:
        return [0,1,2][n]
    
    dp = [ 0 for _ in range(n+1)]
    dp[1] = 1
    dp[2] = 2
    
    for i in range(3,n+1):
        dp[i] = (dp[i-1] + dp[i-2]) % 1000000007
    
    # print(dp)
    return dp[n] % 1000000007