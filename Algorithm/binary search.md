
- bisect_left
- \[ Flase, False, False, False, True, True , True,...] 에서 True를 만족하는 최소 인덱스 반환
```
def bisect_left(arr,x):
    left = 0
    right = len(arr)-1
    
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
    left = 0
    right = len(arr)-1
    
    while left< right:
        
        mid = (left+right)//2
        
        if arr[mid] > x:
            right= mid
        else:
            left = mid + 1
    return left
```

- 위의 두 코드는 불완정함.  
- bisect_left(\[1,2,3,4,5],6)에서 4가 나옴 (5가 나와야 함)  
=> 찾는 값이 범위보다 리스트 내 범위보다 크기 때문에 인덱스처리를 제대로 못해줌

- bisect_right(\[1,3,5,7,9] ,9)에서 4가 나옴 (5가 나와야함)  
=> 끝값이라 인덱스 밖 범위
