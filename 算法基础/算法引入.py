"""
如果a+b+c=1000且a^2+b^2=c^2，求出所有a，b，c的组合
"""
import time
# 算法一：枚举法
start_time = time.time()
for a in range(1001):
    for b in range(1001):
        # for c in range(1001):
        c = 1000 - a - b
            # if a + b + c == 1000 and a*a + b*b == c*c:
        if a*a + b*b == c*c:
                print('组合:',a,b,c)
end_time = time.time()
print('运行时间:',end_time-start_time)