import cv2
import numpy as np

img = cv2.imread('cadillac.jpg')

res = cv2.resize(img,None,fx=2, fy=2, interpolation = cv2.INTER_CUBIC)

cv2.imshow('dst',res)
cv2.waitKey(0)
cv2.destroyAllWindows()



'''
#OR

height, width = img.shape[:2]
res = cv2.resize(img,(2*width, 2*height), interpolation = cv2.INTER_CUBIC)
'''
