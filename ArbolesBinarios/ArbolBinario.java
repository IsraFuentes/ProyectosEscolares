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
public class ArbolBinario {
    NodoArbol raiz;
    
    public ArbolBinario(){
        raiz = null;
    }
    
    public void InsertarNodo(int dato, String nombre){
      NodoArbol nuevoArbol = new NodoArbol(dato, nombre);
      
        if (raiz == null ) {
            raiz = nuevoArbol;
        }else{
            NodoArbol auxiliar = raiz;
            NodoArbol padre;
            while(true){
                padre = auxiliar;
                if(dato < auxiliar.dato){
                    auxiliar = auxiliar.NodoIzq;
                    if (auxiliar == null){
                        padre.NodoIzq = nuevoArbol;
                        return;
                    }
                }else{
                    auxiliar = auxiliar.NodoDer;
                    if(auxiliar == null){
                        padre.NodoDer = nuevoArbol;
                        return;
                    }
                }
            }
        } 
    }
    
    public boolean estaVacio(){
        return raiz==null;
    }
    
    public void inOrden(NodoArbol r){
        if(r!=null){
            inOrden(r.NodoIzq);
            System.out.println("nodo : " + r.dato );
            inOrden(r.NodoDer);
        }
    }
    
    public void PreOrden(NodoArbol r){
        if(r!=null){
            System.out.println("nodo : " + r.dato );
            PreOrden(r.NodoIzq);
            PreOrden(r.NodoDer);
        }
    }
    
    public void PostOrden(NodoArbol r){
        if(r!=null){
            PostOrden(r.NodoIzq);
            PostOrden(r.NodoDer);
            System.out.println("nodo : " + r.dato );
        }
    }
    
    public NodoArbol BuscarNodo(int d){
        NodoArbol auxiliar = raiz;
        while(auxiliar.dato != d){
            if(d < auxiliar.dato){
                auxiliar = auxiliar.NodoIzq;
            }else{
                auxiliar = auxiliar.NodoDer;
            }
            if(auxiliar == null){
                return null;
            }
        }
        return auxiliar;
    }
    
    public boolean EliminarNodo(int d){
        NodoArbol auxiliar = raiz;
        NodoArbol padre = raiz;
        
        return true;
    }
}
