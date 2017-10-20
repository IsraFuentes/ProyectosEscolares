/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ArbolesBinarios;

/**
 *
 * @author Isra fuentes
 */
public class NodoArbol {
    int dato;
    String nombreNodo;
    NodoArbol NodoIzq, NodoDer;

    public NodoArbol(int d, String n) {
        this.dato = d;
        this.nombreNodo = n;
        this.NodoDer = null;
        this.NodoIzq = null;
        
    }
    
    public String toString(){
        return nombreNodo + " su datos : " + dato;
        
    }
    
}
