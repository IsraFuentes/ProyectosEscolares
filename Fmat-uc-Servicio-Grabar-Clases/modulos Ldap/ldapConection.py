# prueba libreria ldap

import ldap

def function():
	try:
		l = ldap.open("")
		e = "error"
		# you should  set this to ldap.VERSION2 if you're using a v2 directory
		l.protocol_version = ldap.VERSION3	
		# Pass in a valid username and password to get 
		# privileged directory access.
		# If you leave them as empty strings or pass an invalid value
		# you will still bind to the server but with limited privileges.
	
		username = ""
		password  = ""
	
		# Any errors will throw an ldap.LDAPError exception 
		# or related exception so you can ignore the result
		l.simple_bind(username, password)
	except ldap.LDAPError, e:
		print e
		# handle error however you like

function()