from cv2 import *
import cv2
import sys
from Tkinter import *
import numpy as np


def graba_webcam():
		print " grabando "
		video_capture = VideoCapture(0)
		fourcc = cv2.cv.CV_FOURCC(*'DIVX')
		out = cv2.VideoWriter('output.avi',fourcc, 20.0,(640,480))

		while True:
			#captura frame por frame
			next,frame = video_capture.read()

			gray = cv2.cvtColor(frame, cv2.COLOR_BGR2GRAY)
			faceCascade = cv2.CascadeClassifier('haarcascade_frontalface_alt2.xml')
			faces = faceCascade.detectMultiScale(
				gray,
				scaleFactor = 1.1,
				minNeighbors= 5,
				minSize= (30,30),
				flags = 0
			)

			#dibuja un rectangulo alrededor de las caras.
			
			for (x,y,w,h) in faces:
				cv2.rectangle(frame, (x,y), (x+w,y+h), (0,255,0),2)  
			

			# muestra y guarda el video

			cv2.imshow('Video', frame)
			out.write(frame)

			if cv2.waitKey(1) & 0xFF == ord('q'):
				out.release()
				video_capture.release()
				cv2.destroyAllWindows()
				break

		# cuando termina, libera las capturas y cierra el panel. 
		"""
		out.release()
		print "out - release()"
		video_capture.release()
		print "video capture - release"
		cv2.destroyAllWindows()
		print "cerrando ventanas"
		#sys.exit()"""

graba_webcam()
