import cv2
from cv2 import *

def loadVideo():
	vcVideo = cv2.VideoCapture("/home/isra/Documentos/gitlab/Fmat-uc-Servicio-Grabar-Clases/modulos grabar video/video.avi")
	nFrames = vcVideo.get(cv.CV_CAP_PROP_FRAME_COUNT)
	fps = vcVideo.get(cv.CV_CAP_PROP_FPS)
	waitPerFrameInMillisec = int(1/fps*1000/1)
	print vcVideo.isOpened()

	while (vcVideo.isOpened()):

		try:
			next, frame = vcVideo.read()
			grayFrame = cv2.cvtColor(frame,cv2.COLOR_BGR2GRAY)
			cv2.imshow('Video', grayFrame)
			cv2.waitKey(waitPerFrameInMillisec)

		except Exception as e:
			print ("no video")
			print e
			break

		if cv2.waitKey(1) & 0xFF == ord('q'):
			break

	vcVideo.release()
	cv2.destroyAllWindows()


loadVideo()
