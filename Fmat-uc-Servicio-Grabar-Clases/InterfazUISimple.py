#demostracion de como usar una clase con tkinter

from Tkinter import * 

class Applicacion(Frame):
	"""Gui de la aplicacion practica, autor: isra"""
	def __init__(self,master):
		""" inicializar el frame"""
		Frame.__init__(self,master)
		self.grid()
		self.botones_clicks = 0 # contador de clicks para botones.
		self.create_widgets()

	def create_widgets(self):
		"""crear 3 botones"""
		#crea primer boton 
#		self.boton1 = Button(self, text= "primer boton")
#		self.boton1.grid()

		#crea segundo boton 
#		self.boton2 = Button(self, text= "segundo boton")
#		self.boton2.grid()
#		self.boton2.configure(text= "esto mostrara texto")

		#crea tercer boton 
#		self.boton3 = Button(self, text= "tercer boton")
#		self.boton3.grid()
#		self.boton3["text"] = "Esto tambien mostrara texto"

		""" crea botones para probar la funcion del contador de clicks"""
		self.button = Button(self)
		self.button["text"] = "total clicks : 0"
		self.button["command"] = self.update_count
		self.button.grid()

	def update_count(self):
		""" incrementa el contador de clicks y muestra el nuevo total"""
		self.botones_clicks += 1
		self.button["text"]= "Total Clicks :" + str(self.botones_clicks)


		
root = Tk()
root.title("botones locos")
root.geometry("200x85")

app = Applicacion(root)
root.mainloop()

		
		