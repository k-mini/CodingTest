def solution(data, ext, val_ext, sort_by):
    answer = [[]]
    a_dict = {"code" : 0, "date" : 1, "maximum" : 2, "remain" : 3}
    ext_idx = a_dict[ext]
    sort_idx = a_dict[sort_by]
    
    data = [ i for i in data if i[ext_idx] <= val_ext ]
    # data = filter(lambda x: x[ext_idx] <= val_ext)
    
    data.sort(key = lambda x : x[sort_idx])
    
    return data