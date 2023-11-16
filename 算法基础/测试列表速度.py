import time
def gettime(func):
    """
    返回要测试函数的执行时间
    :param func: 要测试的函数
    :return: 耗时
    """
    start_time = time.time()
    func()
    end_time = time.time()
    return end_time - start_time

def test1():
    list1 = [1,2,3,4,5,6,7,8,9,10]
    list2 = [1,2,3,4,5,6,7,8,9,10]
    list = list1 + list2

def test2():
    list = []
    for i in range(20000):
        list.append(i)

def test3():
    li = list(range(20000))

time1 = gettime(test1)
time2 = gettime(test2)
time3 = gettime(test3)
print('执行时间：',time1,time2,time3)