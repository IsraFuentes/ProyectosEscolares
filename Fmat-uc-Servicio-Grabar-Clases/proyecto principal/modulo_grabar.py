import cv2
import sys
import numpy as np

#modulo funcional para windosw con opencv version = 3
#cascPath = sys.argv[1]
#faceCascade = cv2.CascadeClassifier(cascPath)

def grabar():
    video_capture = cv2.VideoCapture(0)
    fourcc = cv2.cv.CV_FOURCC(*'MJPG')  #para opencv 2.4
    #fourcc = cv2.VideoWriter_fourcc(*'MJPG')
    out = cv2.VideoWriter('output_webcam.avi',fourcc, 20.0, (640,480))

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
        out.write(frame)
        cv2.imshow('Video', frame)

        if cv2.waitKey(1) & 0xFF == ord('q'):
            break

# cuando termina, libera las capturas y cierra el panel.
    out.release()
    video_capture.release()
    cv2.destroyAllWindows()

