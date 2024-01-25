def solution(h1, m1, s1, h2, m2, s2):
#     answer = 0
    
#     # 1초당 초침은 6 도 회전
#     # 1초당 분침은 6/60 = 1/10 도 회전, 1분당 6도 회전
#     # 1초당 시침은 1/120도 회전, 1분당 1/2도 회전, 1시간당 30도 회전
#     start = h1 * 60 * 60 + m1 * 60 + s1
#     end = h2 * 60 * 60 + m2 * 60 + s2
    
#     # 1시간당 5칸
#     now_h_degree = (h1 % 12) * 30 + m1 * 1/2 + s1 * 1/120
#     # 1분당 한칸
#     now_m_degree = m1 * 6 + s1 * 1/10
#     # 1초당 한칸
#     now_s_degree = s1 * 6
#     print(f'시침 : {now_h_degree}, 분침 : {now_m_degree}, 초침 : {now_s_degree}')
    
#     if start == 3600 or start == 12 * 3600:
#         answer += 1
    
#     while start < end:
        
#         now_h_degree = start / 120 % 360
#         now_m_degree = start / 10 % 360
#         now_s_degree = start * 6 % 360
        
#         # 1초 경과
#         after_h_degree = 360 if (start + 1)/120 % 360 == 0 else (start + 1) / 120 % 360
#         after_m_degree = 360 if (start + 1)/10 % 360 == 0 else (start + 1) / 10 % 360
#         after_s_degree = 360 if (start + 1) *6 % 360 == 0 else (start + 1) * 6 % 360
        
#         # 초침-시침 검증 (지나치기 전이었다가 지나친 경우)
#         if (now_s_degree < now_h_degree and after_s_degree >= after_h_degree):
#             # print(f'전 시침 : {now_h_degree}, 분침 : {now_m_degree}, 초침 : {now_s_degree}')
#             # print(f'후 시침 : {after_h_degree}, 분침 : {after_m_degree}, 초침 : {after_s_degree}')
#             answer += 1
#         # 초침 -분침 검증
#         if (now_s_degree < now_m_degree and after_s_degree >= after_m_degree):
#             answer += 1 
        
#         if after_s_degree == after_m_degree and after_m_degree == after_h_degree:
#             answer -= 1
            
        
#         # 초기화
#         # now_h_degree = after_h_degree % 360
#         # now_m_degree = after_m_degree % 360
#         # now_s_degree = after_s_degree % 360
        
#         start += 1
    
#     return answer

    answer = 0

    # 시작시간과 끝시간을 초단위로 변환
    startTime = h1 * 3600 + m1 * 60 + s1
    endTime = h2 * 3600 + m2 * 60 + s2  

    # next기준으로 계산할거니 포함되지 않는 시작시간 00시, 12시 미리 카운팅
    if startTime == 0 * 3600 or startTime == 12 * 3600:
        answer += 1

    while startTime < endTime:
        # 시침 1시간 = 30도 -> 1초에 30/3600도 즉, 1/120도 이동
        # 분침 1분 = 6도 -> 1초에 6/60도 즉, 1/10도 이동
        # 초침 1초 = 6도 -> 1초에 6도 이동 
        hCurAngle = startTime / 120 % 360
        mCurAngle = startTime / 10 % 360
        sCurAngle = startTime * 6 % 360

        # 다음 위치가 360도가 아닌 0도로 계산되어 카운팅에 포함되지 않는 경우 방지
        # 이동했을 때 지나쳤거나 같아졌는지를 비교하는 것이므로 현재위치는 해줄 필요없음
        hNextAngle = 360 if (startTime + 1) / 120 % 360 == 0 else (startTime + 1) / 120 % 360
        mNextAngle = 360 if (startTime + 1) / 10 % 360 == 0 else (startTime + 1) / 10 % 360
        sNextAngle = 360 if (startTime + 1) * 6 % 360 == 0 else (startTime + 1) * 6 % 360

        if sCurAngle < hCurAngle and sNextAngle >= hNextAngle:
            answer += 1
        if sCurAngle < mCurAngle and sNextAngle >= mNextAngle:
            answer += 1
        # 시침/분침과 동시에 겹쳤을 때 중복카운팅 제외 
        if sNextAngle == hNextAngle and hNextAngle == mNextAngle:
            answer -= 1

        startTime += 1
    
    return answer