import cv2
from cv2 import *

#namedWindow("webcam") axis-media/media.amp?videocodec=h264&compression=90
video = VideoCapture('rtsp://admin1:adminpas@172.16.7.28:554/mpeg4/media.amp')
fourcc = cv2.cv.CV_FOURCC('X', '2', '6', '4')
out = cv2.VideoWriter("output_video.avi", fourcc, 20.0,(640,480))


print video.isOpened() 
while True:
    next, frame = video.read()
    #frame = cv2.flip(frame,180)
    imshow("webcam", frame)
    print frame
    out.write(frame)
    if cv2.waitKey(1) & 0xFF == ord('q'):
        break

#fourcc = cv2.cv.CV_FOURCC('m', 'p', '4', 'v')
#fourcc = cv2.VideoWriter_fourcc(*'XVID')


print out.isOpened()  # True = write out video successfully. False - fail to write out video.
out.release()
video.release()
cv2.destroyAllWindows()



#dir = output_video.strip(".avi")
"""command = "avconv -i output_video.avi -c:v libx264 -c:a copy salida.mp4"
call(command.split())"""