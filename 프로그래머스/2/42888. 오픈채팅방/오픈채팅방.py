def solution(records):
    answer = []
    
    user_dict = {}
    answer = []
    for record in records:
        command,user_id = record.split()[:2]
        
        if command == 'Enter' :
            user_dict[user_id] = record.split()[2]
            answer.append(['Enter', user_id])
        elif command == 'Leave':
            answer.append(['Leave', user_id])
        else :
            user_dict[user_id] = record.split()[2]
    
    
    result = []
    
    for command, user_id in answer:
        
        if command == 'Enter':
            result.append(user_dict[user_id] + "님이 들어왔습니다.")
        else:
            result.append(user_dict[user_id] + "님이 나갔습니다.")
    
    
    return result