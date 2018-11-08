
import numpy as np
import cv2


img = cv2.imread('city2.jpg',0)
rows,cols = img.shape

M = cv2.getRotationMatrix2D((cols/2,rows/2),90,1)
dst = cv2.warpAffine(img,M,(cols,rows))



cv2.imshow('image cv2',dst)
cv2.waitKey(0)
# to save the image
# cv2.imwrite('image1.png',img)

cv2.destroyAllWindows()
