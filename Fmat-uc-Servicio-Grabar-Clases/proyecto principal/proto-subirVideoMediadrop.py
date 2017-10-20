from tkFileDialog import *
from Tkinter import *
from modulo_grabar import *
import httplib,json,paramiko,base64,os,sys
from Crypto.Cipher import AES

headers = {"charset" : "utf-8", "Content-Type" : "application/json"}
nombre_archivo = "" #con la extension, ejemplo: video.mp4
directorio_archivo = "" #incluyendo el nombre del archivo, ej: /home/user/videos/video.mp4

def buscarArchivo():
	ubicacionArchivo = askopenfilename()
	#nombreArchivo = askopenfilename()
	print ubicacionArchivo
	textUbicacionArchivo.insert(0.0,ubicacionArchivo)

def subirVideo():
	nombre_archivo = text_NombreArchivo.get()
	print nombre_archivo
	directorio_archivo =  textUbicacionArchivo.get("1.0",END)
	print directorio_archivo
	send_video()
	send_data()

def connect_webservice():
        conn = httplib.HTTPConnection("148.209.67.236")
        data = {"username":"value1","password":"value2"}
        datajson = json.dumps(data, ensure_ascii = 'False')
        conn.request("POST", "/uc_mediadrop/session.php", datajson, headers) 
        response = conn.getresponse()
        info = json.loads(response.read())
        AES.key_size = 128
        iv = info['1']
        key = info['0']
        crypt_object=AES.new(key=key,mode=AES.MODE_CBC,IV=iv)
        decoded=base64.b64decode(info['password'])
        decrypted_pwd=crypt_object.decrypt(decoded)
        info['password'] = decrypted_pwd
        conn.close()
        print info
        return info 

def send_video():
        host = "148.209.67.236"
        port = 22
        
        session = connect_webservice()
        transport = paramiko.Transport((host, port))
        password = session["password"]
        username = session["username"]
        transport.connect(username = username, password = password)
        sftp = paramiko.SFTPClient.from_transport(transport)
        sftp.chdir('/home/ucsoporte')# directorio del servidor a donde se subiran los archivos.
        localpath = nombre_archivo #nombre del archivo a subir
        filepath = directorio_archivo #directorio del archivo a subir, ej: /users/public/videos/video.mp4
        sftp.put(filepath, localpath) #sftp.put(directorio del archivo, nombre del archivo)
        vdata = verify_data() #funcion para verificar si la informacion de subio al servidor correctamente.
        if vdata == True:
            print "Send Successfully"
        else:
            print "Error to send data"
        sftp.close()

def verify_data():
        conn = httplib.HTTPConnection("148.209.67.236")
        data = []
        size_video = os.path.getsize(directorio_archivo) #'c:/Users/Public/Videos/poke.mp4'
        data = data + [directorio_archivo] #'c:/Users/Public/Videos/poke.mp4'
        data = data + [int(size_video)]
        datajson = json.dumps(data, ensure_ascii = 'False')
        conn.request("POST", "/uc_mediadrop/receive_data.php", datajson, headers)
        response = conn.getresponse()
        result = json.loads(response.read())
        conn.close()
        return result[0]

#NOTA: Dar permiso a la carpeta Mediadrop-git/data/media y carpeta default inicial /home/ucsoporte
def send_data():

	reload(sys)
	ext = os.path.splitext(str(nombre_archivo))
	sys.setdefaultencoding("utf-8")
	data_titulo = text_titulo.get() #"video prueba cc5" #str(_fromUtf8(self.LineTitulo.text()))
	data_tags = text_tags.get() #"Redes" #str(self.LineTags.text())
	data_comentary = text_comentario.get() #"video de prueba" #str(self.TextEditComentario.toPlainText())
	file_size = os.path.getsize(directorio_archivo)#'c:/Users/Public/Videos/poke.mp4'
	slug_file = nombre_archivo.replace(".", "")
	conn = httplib.HTTPConnection("148.209.67.236")
	data = {}
	data["titulo"] = data_titulo
	data["tags"] = data_tags
	data["comentario"] = data_comentary
	data["author"] = text_autor.get() #"admin"#ldap_name
	data["mail"] = "correo@algo.com" #ldap_mail
	data["filename"] = nombre_archivo
	data["file_size"] = str(int(file_size))
	data["slug"] = slug_file
	data["image"] = "" #localpath_image
	if ext == ".mp3":
		data["tipo"] = "audio"
	else:
		data["tipo"] = "video"
	print data
	datajson = json.dumps(data, ensure_ascii = 'False')
	conn.request("POST", "/uc_mediadrop/video.php", datajson ,headers)
	conn.close()
	#response = conn.getresponse()
    #result = json.loads(response.read())
    #print result


ventanaMain = Tk()
ventanaMain.title("prototipo send to mediadrop")
ventanaMain.geometry("300x200")

labelTitulo = Label(ventanaMain, text= "Titulo:")
labelTitulo.grid(row = 1,column = 1)
text_titulo = Entry()
text_titulo.grid(row = 1, column = 2)

labelAutor = Label(ventanaMain, text = "Autor:")
labelAutor.grid(row=2,column = 1)
text_autor = Entry()
text_autor.grid(row= 2,column = 2)

labelComentario = Label(ventanaMain, text= "comentarios:")
labelComentario.grid(row=3,column=1)
text_comentario = Entry()
text_comentario.grid(row = 3,column= 2)

labelTags = Label(ventanaMain, text = "Tags:")
labelTags.grid(row=4,column=1)
text_tags = Entry()
text_tags.grid(row= 4, column = 2)

LabelNombreArchivo = Label(ventanaMain, text = "Nombre Archivo:")
LabelNombreArchivo.grid(row = 5,column = 1)
text_NombreArchivo = Entry()
text_NombreArchivo.grid(row = 5, column = 2)

LabelUbicacionArchivo = Label(ventanaMain, text= "Ubicacion :")
LabelUbicacionArchivo.grid(row =6,column =1)
textUbicacionArchivo = Text(width = 15, height= 1,wrap = WORD)
textUbicacionArchivo.grid(row=6,column = 2)

botonBuscarArchivo = Button(ventanaMain, text= "Buscar Archivo", command= buscarArchivo)
botonBuscarArchivo.grid(row = 7, column = 2)

botonGrabarVideo = Button(ventanaMain, text = "Grabar Video", command = grabar)
botonGrabarVideo.grid(row = 8, column = 2)

botonEnviarVideo = Button(ventanaMain, text = "subir video",command = subirVideo)
botonEnviarVideo.grid(row = 9, column = 2)

ventanaMain.mainloop()


