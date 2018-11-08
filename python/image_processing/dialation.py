
import cv2
import numpy as np

img = cv2.imread('j.png',0)
kernel = np.ones((5,5),np.uint8)
dilation = cv2.dilate(img,kernel,iterations = 1)

cv2.imshow('image cv2',img)
cv2.imshow('image erosion',dilation)
cv2.waitKey(0)
# to save the image
# cv2.imwrite('image1.png',img)

cv2.destroyAllWindows()



