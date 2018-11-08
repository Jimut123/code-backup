
import cv2
import numpy as np

img = cv2.imread('opening.png',0)
kernel = np.ones((5,5),np.uint8)
opening = cv2.morphologyEx(img, cv2.MORPH_OPEN, kernel)

cv2.imshow('image cv2',img)
cv2.imshow('image erosion',opening)
cv2.waitKey(0)
# to save the image
# cv2.imwrite('image1.png',img)

cv2.destroyAllWindows()



