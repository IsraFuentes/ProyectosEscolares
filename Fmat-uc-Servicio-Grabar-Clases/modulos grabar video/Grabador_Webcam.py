import cv2
from cv2 import *

#namedWindow("webcam")
video = VideoCapture(0)
fourcc = cv2.cv.CV_FOURCC(*'DIVX')
out = cv2.VideoWriter("output_video.avi", fourcc, 20.0,(640,480))


print video.isOpened() 
while True:
    next, frame = video.read()
    imshow("webcam", frame)
    out.write(frame)
    if cv2.waitKey(1) & 0xFF == ord('q'):
        break

#fourcc = cv2.cv.CV_FOURCC('m', 'p', '4', 'v')
#fourcc = cv2.VideoWriter_fourcc(*'XVID')


print out.isOpened()  # True = write out video successfully. False - fail to write out video.
out.release()
video.release()
cv2.destroyAllWindows()
