
# 📚 N으로 표현

## 📌 [문제링크](https://school.programmers.co.kr/learn/courses/30/lessons/42895#)

### 문제 해설

- 숫자 N과 number가 주어질 때, N과 사칙연산만 사용해서 표현 할 수 있는 방법 중 N 사용횟수의 최솟값은 return 하는 문제이다.
- ex) N이 5이고 number가 12 일때 가능한 방법은 다음과 같다.
- 12 = 5 + 5 + (5/5) + (5/5) => 5 사용횟수 6번
- 12 = 55 / 5 + 5 / 5 => 5 사용횟수 5번
- 12 = (55 + 5) /5 => 5 사용횟수 4번

### 문제 풀이

아이디어가 떠오르지 않아서 구글링을 참조하였다..

- 구글링 풀이

```
def solution(N, number):
    possible_set = [0,[N]] #조합으로 나올수 있는 가능한 숫자들, 여기에 계속 append
    if N == number:
        return 1
    for i in range(2,9): # 2부터 8까지로 횟수를 늘려간다 문자i개로 만들 수 있는 조합
        case_set = [] # 임시로 사용할 케이스셋
        basic_num = int((str(N)*i))# '5','55','555',..
        case_set.append(basic_num)
        for i_half in range(1, i//2+1):
            for x in possible_set[i_half]:
                for y in possible_set[i-i_half]: # x와 y를 더하면 i가 되도록 만든 수다.
                    #print(possible_set)
                    case_set.append(x+y)
                    case_set.append(x-y)
                    case_set.append(y-x)
                    case_set.append(x*y)
                    if y != 0:
                        case_set.append(x/y)
                    if x != 0:
                        case_set.append(y/x)
        if number in case_set:
            return i
        possible_set.append(case_set)
    return -1
```

- 내가 다음날 다시 푼 풀이

```
def solution(N, number):
    
    possible_set = [ 0 ] + [ [ int(str(N)*i) ]  for i in range(1,10) ]
    #print(possible_set)
    if number == N:
        return 1
    for i in range(2,9):
        if number in possible_set[i]:
            return i
        case_set = set()
        for j in range(1,i//2+1):
            for x in possible_set[j]:
                for y in possible_set[i-j]:
                    case_set.add(x+y)
                    case_set.add(x-y)
                    case_set.add(y-x)
                    case_set.add(x*y)
                    if y != 0:
                        case_set.add(x/y)
                    if x != 0:
                        case_set.add(y/x)
        if number in case_set:
            return i
        possible_set[i] += list(case_set)
        #print(i,case_set,possible_set)
    
    return -1
```

테스트케이스 2번이 자꾸 통과되지 않았는데, 이유는 코드작성할때 처음에 possible_set에 N만 사용하는 가장 단순한 표현방법을 미리 넣어두었었다.  
이런 단순한 표현방식도 N 사용횟수별로 올라갈때 검사해야 하는데 코드상에서 하지 않아 문제가 되었다.  
즉, 마지막에 case_set에 있는 숫자만 검사해서 가장 단순한 표현방법(5,55,555,...)와 같은 숫자를 검사하지 못한 것이다.  
```
if number in possible_set[i]:
            return i
```
을 추가하여 case_set에 N 사용횟수 i인 집합을 만들기 전에 possible\[i]에 있는 연속된 i개수로 이루어진 N을 검사한다. 


- 2달 이후 재풀이 (실패)
- 테스트케이스 5,6,7,8이 계속 실패가 되었음
- 이유: 경우를 계산할때, 단순히 N만 더해주는 경우를 생각함. N,NN,NNN,NNNN 이런 수들을 더해주는 경우도 생각해야 한다.
```
from collections import deque
from collections import defaultdict
def solution(N, number):

    p_dict = defaultdict(lambda : float('inf'))
    q = deque()
    for i in range(1,6):
        p_dict[int(str(N)*i) ] = i
        q.append([int(str(N)*i) ,i])
    print(p_dict)
    #if number == 31168 or number == 555: return -1
    while q:
        num,cnt = q.popleft()
        print(num,cnt)
        if num == number:
            return cnt
        if cnt >= 8 :
            continue
        # 더하기
        if p_dict[num+N] > cnt+1:
            p_dict[num+N] = cnt+1
            q.append([num+N,cnt+1])
        # 빼기
        if p_dict[num-N] > cnt+1:
            p_dict[num-N] = cnt+1
            q.append([num-N,cnt+1])
        if p_dict[N-num] > cnt+1:
            p_dict[N-num] = cnt+1
            q.append([N-num,cnt+1])
        # 나누기
        if p_dict[num//N] > cnt+1:
            p_dict[num//N] = cnt+1
            q.append([num//N,cnt+1])
        # 나누기 2
        if num != 0 and p_dict[N//num] > cnt+1:
            p_dict[N//num] = cnt+1
            q.append([N//num,cnt+1])
        # 곱하기
        if p_dict[num*N] > cnt+1:
            p_dict[N*num] = cnt + 1
            q.append([num*N,cnt+1])
    
    return -1
```

- 재풀이 (실패)
- 테스트 케이스 1,5,8 실패
- 더해주면서 cnt가 8이 초과되는 경우를 제외하지 못함
```
from collections import defaultdict
def solution(N, number):

    p_dict = defaultdict(lambda : float('inf'))
    q = deque()
    plus_num = [] 
    for i in range(1,9):
        p_dict[int(str(N)*i) ] = i
        q.append([int(str(N)*i) ,i])
        plus_num.append(int(str(N)*i) )
    #print(p_dict)
    #if number == 31168 or number == 555: return -1
    while q:
        num,cnt = q.popleft()
        #print(num,cnt)
        if num == number:
            return cnt
        if cnt >= 8 :
            continue
        for i,plus in enumerate(plus_num,start=1):
            # 더하기
            if p_dict[num+plus] > cnt+i:
                p_dict[num+plus] = cnt+i
                q.append([num+plus,cnt+i])
            # 빼기
            if p_dict[num-plus] > cnt+i:
                p_dict[num-plus] = cnt+i
                q.append([num-plus,cnt+i])
            if p_dict[N-plus] > cnt+i:
                p_dict[N-plus] = cnt+i
                q.append([N-plus,cnt+i])
            # 나누기
            if p_dict[num//plus] > cnt+i:
                p_dict[num//plus] = cnt+i
                q.append([num//plus,cnt+i])
            # 나누기 2
            if num != 0 and p_dict[plus//num] > cnt+i:
                p_dict[plus//num] = cnt+i
                q.append([plus//num,cnt+i])
            # 곱하기
            if p_dict[num*plus] > cnt+i:
                p_dict[plus*num] = cnt + i
                q.append([num*plus,cnt+i])
    
    return -1
```

- 실패
- 테스트케이스 1,8 실패
- 괄호를 구현해주지 못한다.
- ex) 테스트케이스 4,31,3 => (4+4) * 4 - (4/4)가 나와야 하는데,  
  444 // 4 * 4 +  4 => 31이 나온다.

```
from collections import deque
from collections import defaultdict
def solution(N, number):

    p_dict = defaultdict(lambda : float('inf'))
    q = deque()
    plus_num = [] 
    for i in range(1,9):
        p_dict[int(str(N)*i) ] = i
        q.append([int(str(N)*i) ,i])
        plus_num.append(int(str(N)*i) )
    #print(p_dict)
    #if number == 31168 or number == 555 or number == 12: return -1
    while q:
        num,cnt = q.popleft()
        if num > 1000 or num < 0: continue
        print(f'시작 : {num},{cnt}')
        if num == number and cnt <= 8:
            return cnt
        
        for i,plus in enumerate(plus_num,start=1):
            if cnt + i > 8: break
            # 더하기
            if p_dict[num+plus] > cnt+i:
                p_dict[num+plus] = cnt+i
                q.append([num+plus,cnt+i])
                print(f'추가 더하기: {num+plus},{cnt+i}')
            # 빼기
            if p_dict[num-plus] > cnt+i:
                p_dict[num-plus] = cnt+i
                q.append([num-plus,cnt+i])
                print(f'추가 빼기: {num-plus},{cnt+i}')
            if p_dict[N-plus] > cnt+i:
                p_dict[N-plus] = cnt+i
                q.append([N-plus,cnt+i])
                print(f'추가 뺴기: {N-plus},{cnt+i}')
            # 나누기
            if p_dict[num//plus] > cnt+i:
                p_dict[num//plus] = cnt+i
                q.append([num//plus,cnt+i])
                print(f'추가 나누기: {num//plus},{cnt+i}')
            # 나누기 2
            if num != 0 and p_dict[plus//num] > cnt+i:
                p_dict[plus//num] = cnt+i
                q.append([plus//num,cnt+i])
                print(f'추가 나누기: {plus//num},{cnt+i}')
            # 곱하기
            if p_dict[num*plus] > cnt+i:
                p_dict[plus*num] = cnt + i
                q.append([num*plus,cnt+i])
                print(f'추가 곱하기: {plus*num},{cnt+i}')
        print()
    return -1
```
