import numpy as np
import cv2

img1 = cv2.imread('city1.jpg')
img2 = cv2.imread('city2.jpg')

# numpy image addition will give modulo operation (img1+img2)%256
img_np = img1 + img2

# cv2 image addition will give simple addition
img_cv = cv2.add(img1,img2)

# to show the image
cv2.imshow('image numpy',img_np)
cv2.waitKey(0)

cv2.imshow('image cv2',img_cv)
cv2.waitKey(0)
# to save the image
# cv2.imwrite('image1.png',img)

cv2.destroyAllWindows()

