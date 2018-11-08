import numpy as np
import cv2
img = np.zeros((512,512,3), np.uint8)

cv2.circle(img,(256,256),25,(0,0,255),1)
cv2.circle(img,(206,256),25,(0,255,255),-1)
cv2.circle(img,(306,256),25,(255,0,0),-1)
cv2.circle(img,(256,206),25,(255,0,255),-1)
cv2.circle(img,(256,306),25,(255,255,255),-1)

cv2.rectangle(img,(183,183),(333,333),(0,255,0),3)
cv2.rectangle(img,(173,173),(343,343),(255,0,0),3)
cv2.rectangle(img,(163,163),(353,353),(0,0,255),3)



font = cv2.FONT_HERSHEY_SIMPLEX
cv2.putText(img,'HAHA BITCHES!!',(10,500), font, 2,(255,255,255),2,cv2.LINE_AA)


while(1):
    cv2.imshow('image',img)
    # for pressing Esc key -- break
    if cv2.waitKey(20) & 0xFF == 27:
        break
cv2.destroyAllWindows()



