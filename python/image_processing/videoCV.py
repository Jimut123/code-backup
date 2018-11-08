import numpy as np
import cv2

cap = cv2.VideoCapture(0)
'''
if(cap.isOpened()):
	pass
else:
	cap.open()
'''


# ret = cap.set(3,100) -- to set the frame's height
# ret = cap.set(4,1080) -- to set the frame's width
while(True):
    # Capture frame-by-frame
    ret, frame = cap.read()

    # Our operations on the frame come here
    gray = cv2.cvtColor(frame, cv2.COLOR_BGR2GRAY)

    # Display the resulting frame
    cv2.imshow('frame',gray)
    if cv2.waitKey(1) & 0xFF == ord('q'):
        break

# When everything done, release the capture
# a number from 0 to 18
# propId = 3

print(cap.get(3),"x",cap.get(4))
cap.release()
cv2.destroyAllWindows()


