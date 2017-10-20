import ldap
 
if __name__ == "__main__":
  	ldap_server="secret"
	username = "clave del user"
	password= "*******"
	# the following is the user_dn format provided by the ldap server
	user_dn = "uid="+username
	criteria = '(sAMAccountName=%s)' %username
	attributes = ['*']
	# adjust this to your base dn for searching
	base_dn = "ou=organizacion, ou=SAdeCV, dc=com, dc=mx"
	connect = ldap.open(ldap_server)
	search_filter = "uid="+username
	try:
		#if authentication successful, get the full user data
		connect.bind_s(username,password)
		result = connect.search_s(base_dn,ldap.SCOPE_SUBTREE,criteria,attributes)
		# return all user data results
		connect.unbind_s()
		print result
	except ldap.LDAPError:
		connect.unbind_s()
		print "authentication error"
