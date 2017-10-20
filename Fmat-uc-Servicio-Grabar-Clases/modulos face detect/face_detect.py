# modulo funcional para ubuntu.
from cv2 import *
import cv2
import sys
import numpy as np

#cascPath = sys.argv[1]
#faceCascade = cv2.CascadeClassifier(cascPath)

video_capture = cv2.VideoCapture(0)
fourcc = cv2.cv.CV_FOURCC(*'DIVX')
out = cv2.VideoWriter('output.avi',fourcc, 20.0, (640,480))
#out = cv2.VideoWriter('output.avi', -1, 20.0, (640,480)) esta opcion reemplazada funciona en windows.
while True:
    # captura frame por frame
    ret, frame = video_capture.read()

    gray = cv2.cvtColor(frame, cv2.COLOR_BGR2GRAY)
    faceCascade = cv2.CascadeClassifier('haarcascade_frontalface_alt2.xml') # cascade del detector de rostros
    faces = faceCascade.detectMultiScale(
        gray,
        scaleFactor=1.1,
        minNeighbors=5,
        minSize=(30, 30),
        flags = 0
        #flags=cv2.cv.CV_HAAR_SCALE_IMAGE 
    )

    # Dibuja un rectangulo alrededor de las caras
    for (x, y, w, h) in faces:
        cv2.rectangle(frame, (x, y), (x+w, y+h), (0, 255, 0), 2)

    # muestra y guarda el video 
    
    cv2.imshow('Video', frame)
    out.write(frame)

    if cv2.waitKey(1) & 0xFF == ord('q'):
       
        break

# cuando termina, libera las capturas y cierra el panel.
out.release()
video_capture.release()
cv2.destroyAllWindows()