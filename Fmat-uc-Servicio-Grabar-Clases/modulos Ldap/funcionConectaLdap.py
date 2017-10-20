import ldap
# modulo funcional. 
def cliente_conectado():
        #self,user,pass
        username = "A123556777"
        passwd = "secret"
        l = ldap.initialize("ldap://secret")
        auth_tokens = ldap.sasl.digest_md5(username, passwd)
        l.protocol_version = ldap.VERSION3
        l.set_option(ldap.OPT_REFERRALS, 0)
        identi = l.sasl_interactive_bind_s("", auth_tokens)
        base = #ejemplo "ou = organizacion , ou= otro dominio, dc= dominio comun, dc = los dominios van separados" por ejemplo :"ou=Facultad de Matematicas, ou=INET, dc=inet, dc=uady, dc=mx"
        criteria = '(sAMAccountName=%s)' %username
        attributes = ['*']
        result = l.search_s(base, ldap.SCOPE_SUBTREE,criteria,attributes)
        results = [entry for dn, entry in result if isinstance(entry, dict)]
        #cliente = " ".join(str(x) for x in entry['cn'])
        #self.LCliente.setText(_fromUtf8(cliente))
        print results

cliente_conectado()