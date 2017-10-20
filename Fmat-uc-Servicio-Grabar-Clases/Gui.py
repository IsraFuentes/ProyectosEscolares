#simple GUI

from Tkinter import *

#crea una ventana
ventana = Tk()

#modificar la ventana
ventana.title("ventana simple")
ventana.geometry("200x100")

app = Frame(ventana)
app.grid()

boton1 = Button(app, text = "boton1")
boton1.grid()

boton2 = Button(app)
boton2.grid()
boton2.configure(text = "mostrar texto")

boton3 = Button(app)
boton3.grid()

boton3["text"] = "hasta aqui todo bien."

#kick off event loop
ventana.mainloop()