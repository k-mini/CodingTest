import math
from collections import * 
def solution(fees, records):
    answer = []
    global basic_time,basic_fee,unit_time,unit_fee
    basic_time = fees[0]
    basic_fee = fees[1]
    unit_time = fees[2]
    unit_fee = fees[3]
    car_dict = defaultdict(lambda : Car(car_number,status))
    
    for record in records:
        time, car_number, status = record.split()
        
        car_dict[car_number].update_status(time,status)
    
    return [ car.pay() for num,car in sorted(car_dict.items(), key = lambda x: x[0]) ]


class Car :
    
    def __init__(self,car_number,status):
        self.car_number = car_number
        self.status = status
        self.cost_time = 0
    
    def update_status(self, time, status):
        
        if status == 'IN':
            self.status = 'IN'
            self.time = time
        else:
            self.status = 'OUT'
            self.cost_time += self.convert_time(time) - self.convert_time(self.time)
        
    def convert_time(self, time):
        hour, minutes = time.split(':')
        return int(hour) * 60 + int(minutes)
    
    def pay(self):
        if self.status == 'IN':
            self.update_status('23:59','OUT')
        
        if self.cost_time <= basic_time:
            return basic_fee
        else:
            return basic_fee + math.ceil((self.cost_time - basic_time)/unit_time) * unit_fee 
        
        