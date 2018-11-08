import cv2
import numpy as np
from matplotlib import pyplot as plt

'''
(625, 1268, 3) -- dimensions of the cadillac image
2377500		-- total no. of pixels present in this image

'''


img = cv2.imread('cadillac.jpg')
px = img[100,100]
print (px)

# acessing only blue pixel

blue = img[100,100,0]
print (blue)

# modifying the pixel values
img[100,100] = [255,255,255]

# it is discouraged to acess each and every pixel and modify them
# numpy is a fast library and the computations may be slow

print(img[100,100])

# B G R 
# 0 1 2

# acessing red values
print(img.item(10,10,2))

# x and y cordinates and the (0,1,2) B,G,R
print(img.itemset((10,10,2),100))
print(img.item(10,10,2))

# returns the shape of the image
print(img.shape)

# returns the total no. of pixels
print(img.size)

# image datatype
print(img.dtype)

part_img = img[100:500, 100:500]
img[200:600, 200:600] = part_img

# is a costly operation
b,g,r = cv2.split(img)

img = cv2.merge((b,g,r))
b = img[:,:,0]

# for making red pixels to 0
img[:,:,2] = 0

# numpy indexing is cheaper option





cv2.namedWindow('image', cv2.WINDOW_NORMAL)
cv2.imshow('image',img)
cv2.waitKey(0)
cv2.destroyAllWindows()










