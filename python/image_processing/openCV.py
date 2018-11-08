import numpy as np
import cv2

# Load an color image in grayscale
img = cv2.imread('cadillac.jpg',0)

# 0 for grayscale
# 1 for color excluding alpha and transparency
# -1 for alpha channel too


print(img)

# to show the image
cv2.imshow('image',img)
cv2.waitKey(0)

# to save the image
cv2.imwrite('image1.png',img)

cv2.destroyAllWindows()





