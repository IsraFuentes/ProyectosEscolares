import numpy as np
import cv2
# este codigo muestra y graba video.
cap = cv2.VideoCapture('rtsp://admin1:adminpas@172.16.7.28:554/mpeg4/media.amp')
out = cv2.VideoWriter('output.avi', -1, 20.0, (640,480))
# cv2.CascadeClassifier('haarcascade_frontalface_default.xml')

while(cap.isOpened()):
    ret, frame = cap.read()
    if ret==True:
        frame = cv2.flip(frame,180)

        # write the flipped frame
        out.write(frame)

        cv2.imshow('frame',frame)
        if cv2.waitKey(1) & 0xFF == ord('q'):
            break
    else:
        break

# When everything done, release the capture
cap.release()
out.release()
cv2.destroyAllWindows()