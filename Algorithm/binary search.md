
- bisect_left
- \[ Flase, False, False, False, True, True , True,...] 에서 True를 만족하는 최소 인덱스 반환
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
