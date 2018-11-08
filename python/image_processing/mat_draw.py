import numpy as np
import cv2
from matplotlib import pyplot as plt

# Create a black image
img = np.zeros((512,512,3), np.uint8)

# Draw a diagonal blue line with thickness of 5 px
cv2.line(img,(0,0),(511,511),(255,0,0),5)
# image starting ending color and thickness
# The openCV BGR color format blue green red


cv2.rectangle(img,(0,0),(510,128),(0,255,0),3)
# top left corner and bottom right corner of the rectangle


cv2.circle(img,(447,63), 63, (0,0,255), -1)
# center coordinates and radius

cv2.ellipse(img,(256,256),(100,50),0,0,180,255,-1)
# center location, (major axis and minor axis lengths) 


pts = np.array([[10,5],[20,30],[70,20],[50,10]], np.int32)
pts = pts.reshape((-1,1,2))
cv2.polylines(img,[pts],True,(0,255,255))

pts = np.array([[100,5],[200,30],[370,20],[350,10]], np.int32)
pts = pts.reshape((-1,1,2))
cv2.polylines(img,[pts],False,(0,255,255))

font = cv2.FONT_HERSHEY_SIMPLEX
cv2.putText(img,'OpenCV',(10,500), font, 4,(255,255,255),2,cv2.LINE_AA)

# text data, bottom left corner from where it starts, font type, font scale (size of the font) , regular things LINE_AA is recommended

#plt.imshow(img, cmap = 'gray', interpolation = 'bicubic')


while(1):
    cv2.imshow('image',img)
    # for pressing Esc key -- break
    if cv2.waitKey(20) & 0xFF == 27:
        break
cv2.destroyAllWindows()




