import numpy as np
import cv2
cap = cv2.VideoCapture()
cap.open('rtsp://admin1:adminpas@172.16.7.28:554//axis-cgi/com/ptz.cgi')
#VideoCapture("rtsp://"+self.usercamera+":"+self.pwdcamera+"@"+self.ip_addresscamera+":554/axis-media/media.amp")
while(True):
     # Capture frame-by-frame
     ret, frame = cap.read()

     # Our operations on the frame come here
     #frame = cv2.cvtColor(frame, cv2.cv.CV_BGR2RGB)

     # Display the resulting frame
     cv2.imshow('frame',frame)
     if cv2.waitKey(1) & 0xFF == ord('q'):
           break

   # When everything done, release the capture
cap.release()
cv2.destroyAllWindows()