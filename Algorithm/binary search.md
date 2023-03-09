
- bisect_left
- \[ Flase, False, False, False, (True, True) , True,...] 에서 True를 만족하는 제일 앞 인덱스 반환

```
def bisect_right(arr,x):
    left  = 0
    right = len(arr)
    
    while left< right:
        
        mid = (left+right)//2
        
        if arr[mid] >= x:
            right= mid
        else:
            left = mid + 1
    return left
```

- bisect_right
- \[ Flase, False, False, False, (False, False) , True,...] 에서 True를 만족하는 제일 앞 인덱스 반환
- 괄호 친 부분이 부등호가 바뀌면서 False로 바뀜

```
def bisect_right(arr,x):
    left  = 0
    right = len(arr)
    
    while left< right:
        
        mid = (left+right)//2
        
        if arr[mid] > x:
            right= mid
        else:
            left = mid + 1
    return left
```
