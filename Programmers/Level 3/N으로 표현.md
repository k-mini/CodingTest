
# π NμΌλ‘ νν

## π [λ¬Έμ λ§ν¬](https://school.programmers.co.kr/learn/courses/30/lessons/42895#)

### λ¬Έμ  ν΄μ€

- μ«μ Nκ³Ό numberκ° μ£Όμ΄μ§ λ, Nκ³Ό μ¬μΉμ°μ°λ§ μ¬μ©ν΄μ νν ν  μ μλ λ°©λ² μ€ N μ¬μ©νμμ μ΅μκ°μ return νλ λ¬Έμ μ΄λ€.
- ex) Nμ΄ 5μ΄κ³  numberκ° 12 μΌλ κ°λ₯ν λ°©λ²μ λ€μκ³Ό κ°λ€.
- 12 = 5 + 5 + (5/5) + (5/5) => 5 μ¬μ©νμ 6λ²
- 12 = 55 / 5 + 5 / 5 => 5 μ¬μ©νμ 5λ²
- 12 = (55 + 5) /5 => 5 μ¬μ©νμ 4λ²

### λ¬Έμ  νμ΄

μμ΄λμ΄κ° λ μ€λ₯΄μ§ μμμ κ΅¬κΈλ§μ μ°Έμ‘°νμλ€..

- κ΅¬κΈλ§ νμ΄

```
def solution(N, number):
    possible_set = [0,[N]] #μ‘°ν©μΌλ‘ λμ¬μ μλ κ°λ₯ν μ«μλ€, μ¬κΈ°μ κ³μ append
    if N == number:
        return 1
    for i in range(2,9): # 2λΆν° 8κΉμ§λ‘ νμλ₯Ό λλ €κ°λ€ λ¬Έμiκ°λ‘ λ§λ€ μ μλ μ‘°ν©
        case_set = [] # μμλ‘ μ¬μ©ν  μΌμ΄μ€μ
        basic_num = int((str(N)*i))# '5','55','555',..
        case_set.append(basic_num)
        for i_half in range(1, i//2+1):
            for x in possible_set[i_half]:
                for y in possible_set[i-i_half]: # xμ yλ₯Ό λνλ©΄ iκ° λλλ‘ λ§λ  μλ€.
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

- λ΄κ° λ€μλ  λ€μ νΌ νμ΄

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

νμ€νΈμΌμ΄μ€ 2λ²μ΄ μκΎΈ ν΅κ³Όλμ§ μμλλ°, μ΄μ λ μ½λμμ±ν λ μ²μμ possible_setμ Nλ§ μ¬μ©νλ κ°μ₯ λ¨μν ννλ°©λ²μ λ―Έλ¦¬ λ£μ΄λμμλ€.  
μ΄λ° λ¨μν ννλ°©μλ N μ¬μ©νμλ³λ‘ μ¬λΌκ°λ κ²μ¬ν΄μΌ νλλ° μ½λμμμ νμ§ μμ λ¬Έμ κ° λμλ€.  
μ¦, λ§μ§λ§μ case_setμ μλ μ«μλ§ κ²μ¬ν΄μ κ°μ₯ λ¨μν ννλ°©λ²(5,55,555,...)μ κ°μ μ«μλ₯Ό κ²μ¬νμ§ λͺ»ν κ²μ΄λ€.  
```
if number in possible_set[i]:
            return i
```
μ μΆκ°νμ¬ case_setμ N μ¬μ©νμ iμΈ μ§ν©μ λ§λ€κΈ° μ μ possible\[i]μ μλ μ°μλ iκ°μλ‘ μ΄λ£¨μ΄μ§ Nμ κ²μ¬νλ€. 


- 2λ¬ μ΄ν μ¬νμ΄ (μ€ν¨)
- νμ€νΈμΌμ΄μ€ 5,6,7,8μ΄ κ³μ μ€ν¨κ° λμμ
- μ΄μ : κ²½μ°λ₯Ό κ³μ°ν λ, λ¨μν Nλ§ λν΄μ£Όλ κ²½μ°λ₯Ό μκ°ν¨. N,NN,NNN,NNNN μ΄λ° μλ€μ λν΄μ£Όλ κ²½μ°λ μκ°ν΄μΌ νλ€.
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
        # λνκΈ°
        if p_dict[num+N] > cnt+1:
            p_dict[num+N] = cnt+1
            q.append([num+N,cnt+1])
        # λΉΌκΈ°
        if p_dict[num-N] > cnt+1:
            p_dict[num-N] = cnt+1
            q.append([num-N,cnt+1])
        if p_dict[N-num] > cnt+1:
            p_dict[N-num] = cnt+1
            q.append([N-num,cnt+1])
        # λλκΈ°
        if p_dict[num//N] > cnt+1:
            p_dict[num//N] = cnt+1
            q.append([num//N,cnt+1])
        # λλκΈ° 2
        if num != 0 and p_dict[N//num] > cnt+1:
            p_dict[N//num] = cnt+1
            q.append([N//num,cnt+1])
        # κ³±νκΈ°
        if p_dict[num*N] > cnt+1:
            p_dict[N*num] = cnt + 1
            q.append([num*N,cnt+1])
    
    return -1
```

- μ¬νμ΄ (μ€ν¨)
- νμ€νΈ μΌμ΄μ€ 1,5,8 μ€ν¨
- λν΄μ£Όλ©΄μ cntκ° 8μ΄ μ΄κ³Όλλ κ²½μ°λ₯Ό μ μΈνμ§ λͺ»ν¨
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
            # λνκΈ°
            if p_dict[num+plus] > cnt+i:
                p_dict[num+plus] = cnt+i
                q.append([num+plus,cnt+i])
            # λΉΌκΈ°
            if p_dict[num-plus] > cnt+i:
                p_dict[num-plus] = cnt+i
                q.append([num-plus,cnt+i])
            if p_dict[N-plus] > cnt+i:
                p_dict[N-plus] = cnt+i
                q.append([N-plus,cnt+i])
            # λλκΈ°
            if p_dict[num//plus] > cnt+i:
                p_dict[num//plus] = cnt+i
                q.append([num//plus,cnt+i])
            # λλκΈ° 2
            if num != 0 and p_dict[plus//num] > cnt+i:
                p_dict[plus//num] = cnt+i
                q.append([plus//num,cnt+i])
            # κ³±νκΈ°
            if p_dict[num*plus] > cnt+i:
                p_dict[plus*num] = cnt + i
                q.append([num*plus,cnt+i])
    
    return -1
```

- μ€ν¨
- νμ€νΈμΌμ΄μ€ 1,8 μ€ν¨
- κ΄νΈλ₯Ό κ΅¬νν΄μ£Όμ§ λͺ»νλ€.
- ex) νμ€νΈμΌμ΄μ€ 4,31,3 => (4+4) * 4 - (4/4)κ° λμμΌ νλλ°,  
  444 // 4 * 4 +  4 => 31μ΄ λμ¨λ€.

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
        print(f'μμ : {num},{cnt}')
        if num == number and cnt <= 8:
            return cnt
        
        for i,plus in enumerate(plus_num,start=1):
            if cnt + i > 8: break
            # λνκΈ°
            if p_dict[num+plus] > cnt+i:
                p_dict[num+plus] = cnt+i
                q.append([num+plus,cnt+i])
                print(f'μΆκ° λνκΈ°: {num+plus},{cnt+i}')
            # λΉΌκΈ°
            if p_dict[num-plus] > cnt+i:
                p_dict[num-plus] = cnt+i
                q.append([num-plus,cnt+i])
                print(f'μΆκ° λΉΌκΈ°: {num-plus},{cnt+i}')
            if p_dict[N-plus] > cnt+i:
                p_dict[N-plus] = cnt+i
                q.append([N-plus,cnt+i])
                print(f'μΆκ° λΊ΄κΈ°: {N-plus},{cnt+i}')
            # λλκΈ°
            if p_dict[num//plus] > cnt+i:
                p_dict[num//plus] = cnt+i
                q.append([num//plus,cnt+i])
                print(f'μΆκ° λλκΈ°: {num//plus},{cnt+i}')
            # λλκΈ° 2
            if num != 0 and p_dict[plus//num] > cnt+i:
                p_dict[plus//num] = cnt+i
                q.append([plus//num,cnt+i])
                print(f'μΆκ° λλκΈ°: {plus//num},{cnt+i}')
            # κ³±νκΈ°
            if p_dict[num*plus] > cnt+i:
                p_dict[plus*num] = cnt + i
                q.append([num*plus,cnt+i])
                print(f'μΆκ° κ³±νκΈ°: {plus*num},{cnt+i}')
        print()
    return -1
```
