class Node():
    nex = None
    last = None
    head = None
    def __init__(self , a:int ):
        self.data = a

    def ADD_NODE(self, a:int):
        if self.head == None:
            self.head = Node(a)
            self.last = self.head
            self.nex = None
        else:
            self.


