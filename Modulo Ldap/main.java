/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ldap;
import javax.naming.AuthenticationException;
import javax.naming.NamingException;
import javax.naming.directory.Attribute;

/**
 *
 * @author Isra fuentes
 */
public class main {
    public static void main(String[] args) throws NamingException , AuthenticationException{
        System.out.println("Iniciando Autenticacion");
         
        String server="ldap://ip del servidor"; // servidor de LDAP
        String usuario="usuario"; // Usuario de Autenticacion
        String dn="usuario@dominio.mx"; // Ruta del Arbol LDAP 
        String tipoAth="simple";//tipo de autentuicacion simple o por SSL
        String clave="******";
 
        ConexionLdap conexionLdap =new ConexionLdap(server,dn,tipoAth,usuario,clave);
 
        if(conexionLdap.isAutenticado()){
            System.out.println("Usuario "+conexionLdap.getUsuario()+" Autenticado Correctamente");
            
            /* obtenemos una Propiedad de la autenticacion
             *
             * Algunas Propiedades Disponibles
             * mailLocalAddress,displayName,givenName,objectClass,userPassword,sambaLogonTime,mail
             * uid,uidNumber,cn,loginShell,gidNumber,gecos,sambaSID,homeDirectory
             */
            Attribute atr=conexionLdap.cargarPropiedadConexion("givenName");
            System.out.println("1. Atributo "+atr.getID());
            System.out.println("1. Valor "+atr.get().toString());
        }
        else{
            System.out.println("Usuario "+conexionLdap.getUsuario()+" No se Puedo Autenticar");
        }
    }
}
