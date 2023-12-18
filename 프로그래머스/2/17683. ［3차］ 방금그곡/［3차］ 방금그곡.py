def solution(m, musicinfos):
    answer = []
    
    m = convert_melody(m)
    # print(f'm:{m}')
    
    
    for idx, musicinfo in enumerate(musicinfos):
        start_time, end_time, title, melody = musicinfo.split(',')
        melody = convert_melody(melody)
        play_time = convert_time(end_time) - convert_time(start_time)
        # print(f'play_time : {play_time}, melody : {melody}')
        
        # 멜로디 만들기
        long_melody = ''
        n = len(melody)
        for i in range(play_time):
            long_melody += melody[i%n]
        
        # print(f'long_melody : {long_melody}')
        
        if m in long_melody:
            answer.append([-play_time,idx, title])
        
    music_list = sorted(answer,key=lambda x: (x[0],x[1]))
    return music_list[0][2] if music_list else "(None)"

def convert_time(time):
    hour, minute = time.split(':')
    
    return int(hour) * 60 + int(minute)

def convert_melody(m):
    return m.replace("C#","c").replace("D#","d").replace("F#","f").replace("G#","g").replace("A#","a") 