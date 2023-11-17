def solution(skill, skill_trees):
    answer = 0
    
    for skill_tree in skill_trees:
        idx = 0
        
        for s in skill_tree:
            if s in skill:
                if s == skill[idx]:
                    idx +=1
                    continue
                else:
                    break
            else:
                continue
        else:
            answer += 1
    return answer