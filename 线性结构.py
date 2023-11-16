from _collections_abc import Iterable
from _collections_abc import Iterator
class Array():
    def __init__(self,size):
        self.size = size # 个数
        self.item = [None] * size # 生成size个元素的列表
        self.count = 0 # 记录添加几个元素

    def __setitem__(self, key, value):
        self.item[key] = value # 给列表添加元素
        self.count += 1 # 添加一个元素就记录一次

    def __getitem__(self, key):
        return self.item[key] # 通过索引返回值

    def __len__(self):
        return self.count

    # def __iter__(self):
    #     for value in self.item:
    #         yield value

a = Array(4) # 实例化类
print(isinstance(a,Iterable))
print('-'*30)
a[0] = '肖枫'
a[1] = 2

for value in a:
    print(value)
print('-'*30)
print(len(a))
