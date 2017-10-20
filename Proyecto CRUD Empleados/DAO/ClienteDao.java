/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;
import Modelo.*;
import java.awt.HeadlessException;
import java.sql.*;
import java.util.ArrayList;

/**
 *
 * @author Isra
 */
public class ClienteDao {
    Conexion nuevaConexion;
    
    public ClienteDao(){
        nuevaConexion = new Conexion();
    }
    
    public String agregarCliente(String nombre, String apellidos, String telefono, String direccion){
        String respuestaRegistro = null;
        try {
            Connection accesoBD = nuevaConexion.getConexion();
            String comandoInsertarUsuario = "INSERT INTO clientes"+
            "(Nombre_usuario,Apellido_usuario, Tel_usuario, Direccion_usuario)"+
            "VALUES(?,?,?,?) ";
            
            PreparedStatement sentencia = accesoBD.prepareStatement(comandoInsertarUsuario);
            sentencia.setString(1, nombre);
            sentencia.setString(2,apellidos);
            sentencia.setString(3,telefono);
            sentencia.setString(4,direccion);
            int banderaBinaria = sentencia.executeUpdate();
            
            if (banderaBinaria > 0) {
                respuestaRegistro = "registrado con exito";
            }
            
            
        } catch (SQLException | HeadlessException e) {
            
        }
        nuevaConexion.cerrarConexion();
        return respuestaRegistro;
    }// fin proceso insertarusuario
    
    public ArrayList<Cliente> listarClientes(){
        ArrayList ListaClientes = new ArrayList();
        Cliente persona;
        String comandoListar = "select * from clientes";
        try {
            Connection accesoBD = nuevaConexion.getConexion();
            PreparedStatement sentencia = accesoBD.prepareStatement(comandoListar);
            ResultSet resultados = sentencia.executeQuery();
            while (resultados.next()) {
                persona = new Cliente();
                persona.setId(resultados.getString(1));
                persona.setNombre(resultados.getString(2));
                persona.setApellidos(resultados.getString(3));
                persona.setTelefono(resultados.getString(4));
                persona.setDireccion(resultados.getString(5));
                ListaClientes.add(persona);
            }
            
        } catch (Exception e) {
        }
        nuevaConexion.cerrarConexion();
        return ListaClientes;
    } //fin listar personas
    
     public int borrarCliente(String id){
        int respuestaComando= 0;
        String comandoBorrar = "delete from clientes where Id_usuario = ?";
        try {
            Connection accesoBD = nuevaConexion.getConexion();
            PreparedStatement sentencia = accesoBD.prepareStatement(comandoBorrar);
            //CallableStatement cs = accesoDB.prepareCall("{call sp_deletePersona(?)}");
            sentencia.setString(1, id);
            respuestaComando = sentencia.executeUpdate();
        } catch (Exception e) {
        }
        nuevaConexion.cerrarConexion();
        return respuestaComando;
    }//fin borrar persona
    
     public int editarCliente(String id, String nombres, String apellidos, String telefono, String direccion){
        int filasAfectadas=0;
        String comandoEditar = "UPDATE clientes set"+" Nombre_usuario = ?,"+" Apellido_usuario = ?,"+
            " Tel_usuario = ?,"+" Direccion_usuario = ?"+" WHERE Id_usuario = ?";
        try {
            Connection accesoDB = nuevaConexion.getConexion();
            //CallableStatement cs = accesoDB.prepareCall("{call sp_editPersona(?,?,?,?,?)}");
            PreparedStatement sentencia = accesoDB.prepareStatement(comandoEditar);
            sentencia.setString(1, nombres);
            sentencia.setString(2, apellidos);
            sentencia.setString(3,telefono);
            sentencia.setString(4,direccion);
            sentencia.setString(5, id);
            
            
            filasAfectadas = sentencia.executeUpdate();
        } catch (Exception e) {
        }
        nuevaConexion.cerrarConexion();
        return filasAfectadas;  
    }// fin editar 
     
     
    public ArrayList<Cliente> buscarCliente(String apellido){
        ArrayList listaClientes = new ArrayList();
        Cliente persona;
        
        String comandoBusqueda = "select * from clientes where Apellido_usuario like concat('%',?,'%') "; 
        try {
            Connection accesoBD = nuevaConexion.getConexion();
           // CallableStatement cs = acceDB.prepareCall("{call sp_buscaPxApellidos(?)}");
            PreparedStatement sentencia = accesoBD.prepareStatement(comandoBusqueda);
            sentencia.setString(1, apellido);
            ResultSet resultadoBusqueda = sentencia.executeQuery();
            
            while(resultadoBusqueda.next()){
                persona = new Cliente();
                persona.setId(resultadoBusqueda.getString(1));
                persona.setNombre(resultadoBusqueda.getString(2));
                persona.setApellidos(resultadoBusqueda.getString(3));
                persona.setTelefono(resultadoBusqueda.getString(4));
                persona.setDireccion(resultadoBusqueda.getString(5));
                listaClientes.add(persona);
            }
        } catch (Exception e) {
        }
        nuevaConexion.cerrarConexion();
        return listaClientes;
    }
     
}
