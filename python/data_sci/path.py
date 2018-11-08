
i = 0
def find_path(x0,y0,x1,y1):
    #TODO
    if x0 == x1 and y0 == y1:
        print("Found path ... ")
    if x0 < x1 and y0 < y1 and array[x0][y0] == 1:
        find_path(x0,y0+1,x1,y1)
        find_path(x0,y0-1,x1,y1)
        find_path(x0-1,y0,x1,y1)
        find_path(x0+1,y0,x1,y1)
        find_path(x0+1,y0+1,x1,y1)
        find_path(x0-1,y0-1,x1,y1)
        find_path(x0-1,y0+1,x1,y1)
        find_path(x0+1,y0-1,x1,y1)

array = [[0,1,0,1,1,1],
        [1,0,0,0,1,0],
        [1,0,1,0,0,1],
        [1,1,0,0,0,1],
        [1,1,0,1,0,1],
        [1,1,1,1,1,1]]

x0 = input("x0 : ")
y0 = input("y0 : ")
x1 = input("x1 : ")
y1 = input("y1 : ")

stack[]


