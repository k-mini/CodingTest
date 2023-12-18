def solution(book_time):
    answer = 0
    rooms = []
    book_time = [ [convert_time(i[0]), convert_time(i[1]) + 10 ] for i in book_time ]
    
    # 종료시간으로 정렬하면 안됨
    # 반례 : [["00:00", "00:30"], ["00:05", "01:00"], ["00:45", "01:45"], ["02:00", "02:15"], ["01:30", "04:00"]] 2
    # 역순으로 해도 최적으로 입실불가
    book_time.sort(key = lambda x: x[0])
    
    # print(book_time)
    
    for start,end in book_time:
        # print(f'start : {start} , end: {end} , answer : {answer}')
        # print(f'rooms : {rooms}')
        for idx in range(len(rooms)-1,-1,-1):
            # 기존 방 사용 가능
            if start >= rooms[idx][1]:
                rooms[idx] = [start,end]
                break
        else:
            rooms.append([start,end])
            answer += 1
        # print(f'rooms 후 : {rooms}')
        # print(f'start : {start} , end: {end} , answer : {answer}')
        # print()
    return answer


def convert_time(time):
    hour,minute = time.split(':')
    return int(hour) * 60 + int(minute)