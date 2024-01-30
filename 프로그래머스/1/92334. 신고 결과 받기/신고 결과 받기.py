from collections import defaultdict
def solution(id_list, reports, k):
    answer = []
    
    # 신고자가 신고한 사람 명단
    reporter_dict = defaultdict(set)
    # 신고받은사람이 자신을 신고한 명단
    reported_dict = defaultdict(set)
    for report in reports:
        
        reporter, reported = report.split()
        
        reporter_dict[reporter].add(reported)
        reported_dict[reported].add(reporter)
    
    # print(reporter_dict)
    # print(reported_dict)
    
    for name in id_list:
        cnt = 0
        # 내가 신고한 명단
        for i in reporter_dict[name]:
            if len(reported_dict[i]) >= k:
                cnt += 1
        answer.append(cnt)
    return answer