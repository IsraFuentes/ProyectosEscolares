#!/usr/bin/env python
# -*- coding: utf-8 -*-
from cv2 import *
from Tkinter import *
from tkFileDialog import *
from modulo_grabar import *
import cv2, sys, ldap , time 
import httplib,json,paramiko,base64,os,sys
from Crypto.Cipher import AES

headers = {"charset" : "utf-8", "Content-Type" : "application/json"}
nombre_archivo = "output_video.avi" #con la extension, ejemplo: video.mp4
directorio_archivo = "/home/isra/Vídeos/output_video.avi" #incluyendo el nombre del archivo, ej: /home/user/videos/video.mp4

class Interfaz(Frame):
	"""Gui de la aplicacion de prueba, para grabar clases"""
	def __init__(self,master):
		"""inicializa el Frame"""
		Frame.__init__(self,master)
		self.grid()
		self.crea_widgets()

	def crea_widgets(self):
		""" Aqui van los botones y campos de entradas para la interfaz"""
		self.Instruccion_inicial = Label(self, text = "Introduce un Usuario y Password de Inet.")
		self.Instruccion_inicial.grid(row = 0, column= 0,columnspan = 4, sticky= W)

		self.Usuario_Label = Label(self, text = "Usuario :")
		self.Usuario_Label.grid(row = 1, column= 1, sticky = W)
		self.Password_Label = Label(self, text = "Password :")
		self.Password_Label.grid(row = 2, column = 1, sticky = W)

		self.Usuario_Entry = Entry(self)
		self.Usuario_Entry.grid(row = 1, column = 2, sticky = W)

		self.Password_Entry = Entry(self, show= "*")
		self.Password_Entry.grid(row = 2, column = 2, sticky = W)

		self.Boton_Login = Button(self, text = "Login", command = self.Login)
		self.Boton_Login.grid(row = 4, column = 2, columnspan = 2, sticky = W)

		self.campo_texto = Text(self, width = 30, height= 5, wrap = WORD)
		self.campo_texto.grid(row = 5, column = 2, columnspan = 2, sticky = W)


	def Login(self):
		""" funcion para conectar con el directorio activo y comprobar los datos del usuario"""
		user = self.Usuario_Entry.get()
		psswrd = self.Password_Entry.get()
		conexion = ldap.initialize("ldap://148.209.80.200")
		
		try:
			auth_tokens = ldap.sasl.digest_md5(user,psswrd)
			conexion.protocol_version = ldap.VERSION3
			conexion.set_option(ldap.OPT_REFERRALS,0)
			indenti = conexion.sasl_interactive_bind_s("",auth_tokens)
			base = "ou=Facultad de Matematicas, ou=INET, dc=inet, dc=uady, dc=mx"
			criteria = '(sAMAccountName=%s)' %user
			attributes = ['*']
			result = conexion.search_s(base, ldap.SCOPE_SUBTREE,criteria,attributes)
			results = [entry for dn, entry in result if isinstance(entry,dict)]
			cliente = " ".join(str(x) for x in entry['cn']) # +"\n mail: ".join(str(x) for x in entry['userPrincipalName'])
			mail = " ".join(str(x) for x in entry['userPrincipalName'])
			self.campo_texto.insert(0.0,cliente +"\n" + mail)
			if indenti == 0:
				root.withdraw()
				self.NewVentana()
		except ldap.INVALID_CREDENTIALS as err:
			self.Usuario_Entry.delete(0,END)
			self.Password_Entry.delete(0,END)
			self.campo_texto.insert(0.0,"Datos incorrectos.")
		finally:
			conexion.unbind()
			


	def NewVentana(self):
		ventana = Toplevel(root)
		ventana.title("Ventana de Grabacion.")
		ventana.geometry("300x200")
		Label_Inicial = Label(ventana, text= "bienvenido usuario !")
		Label_Inicial.grid(row = 0, column = 2)

		boton_grabacion = Button(ventana, text  = "grabar con webcam", command = grabar)
		boton_grabacion.grid(row = 1, column = 2, columnspan = 2, sticky = W)

		boton_enviarVideo = Button(ventana, text = "Enviar Video" )
		boton_enviarVideo.grid(row = 2, column = 2, columnspan = 2, sticky = W)

		boton_conectarseCamaraIP= Button(ventana, text = "Camara Ip", command = self.ConectarCamaraIp)
		boton_conectarseCamaraIP.grid(row = 3, column = 2, columnspan = 3, sticky = W)

		boton_cerrar = Button(ventana, text = "volver a Menu principal",command = self.cerrar)
		boton_cerrar.grid(row = 4, column = 2, columnspan = 4, sticky = W)
		ventana.mainloop()

	def cerrar(self):
		print "cerrar"
		root.deiconify()


	def ConectarCamaraIp(self):
		print " grabando "
		video_capture = cv2.VideoCapture('rtsp://admin1:adminpas@172.16.7.28:554/mpeg4/media.amp')
		fourcc = cv2.cv.CV_FOURCC(*'XVID')
		#out = cv2.VideoWriter("output_camaraIp.avi", fourcc, 20.0,(705,480))
		out = cv2.VideoWriter('output_camaraIp.avi',fourcc, 20.0,(705,480))

		while True:
			#captura frame por frame
			ret,frame = video_capture.read()
			# muestra y guarda el video

			cv2.imshow('Video', frame)
			out.write(frame)

			if cv2.waitKey(1) & 0xFF == ord('q'):
				
				break

		# cuando termina, libera las capturas y cierra el panel.
		out.release()
		print "out - release()"
		video_capture.release()
		print "video capture - release"
		cv2.destroyAllWindows()
		print "cerrando ventanas"


root = Tk()
root.title("Venta Principal Login")
root.geometry("300x200")
app = Interfaz(root)
root.mainloop()
