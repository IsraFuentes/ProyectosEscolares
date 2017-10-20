/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;



/**
 *
 * @author Isra
 */
public class Cliente extends Persona{
  
  //
    private String zona;
    private String frecuenciaPedidos;
    private float promedioPedidosXmes;
    
    
    public Cliente(){
       zona="";
       frecuenciaPedidos="";
       promedioPedidosXmes = 0;
       
       
    }

    public String getZona() {
        return zona;
    }

    public void setZona(String zona) {
        this.zona = zona;
    }

    public String getFrecuenciaPedidos() {
        return frecuenciaPedidos;
    }

    public void setFrecuenciaPedidos(String frecuenciaPedidos) {
        this.frecuenciaPedidos = frecuenciaPedidos;
    }

    public float getPromedioPedidosXmes() {
        return promedioPedidosXmes;
    }

    public void setPromedioPedidosXmes(float promedioPedidosXmes) {
        this.promedioPedidosXmes = promedioPedidosXmes;
    }
    
    
}
