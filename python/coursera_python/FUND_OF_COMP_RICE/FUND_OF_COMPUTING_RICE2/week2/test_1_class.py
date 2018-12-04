class Test_Me:
    def __init__(self, attr1, attr2):
        self.attr1 = attr1
        self.attr2 = attr2
    def disp_attr(self):
        print("Attr1 : ", self.attr1, " Attr2 : ",self.attr2)
d = Test_Me("Attr1 of test1","Attr2 of test1")
d.disp_attr()
