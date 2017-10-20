import cv2
from cv2 import *

#namedWindow("webcam") axis-media/media.amp?videocodec=h264&compression=90 | rtsp://admin1:adminpas@172.16.7.28:554/mpeg4/media.amp
video = VideoCapture('rtsp://admin1:adminpas@172.16.7.28:554/mpeg4/media.amp')
#fourcc = cv2.cv.CV_FOURCC('m', 'p', '4', 'v')
#fourcc = cv2.cv.CV_FOURCC('X', '2', '6', '4')
#fourcc = cv2.cv.CV_FOURCC(*'XVID')
fourcc = cv2.VideoWriter_fourcc(*'XVID')
out = cv2.VideoWriter("videostream.avi", fourcc, 20.0,(705,480)) # problema de no guardar video, resuelto al saber las dimensiones reales de captura de la camara.
#out = cv2.VideoWriter('output.avi', -1, 20.0, (640,480))

print video.isOpened() 
print video.get(3) #ancho de captura de la camara
print video.get(4) #largo de captura de la camara
while True:
    next, frame = video.read()
    #frame = cv2.flip(frame,0)
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