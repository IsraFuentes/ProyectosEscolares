/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ArbolesBinarios;

import javax.swing.JOptionPane;

/**
 *
 * @author Isra fuentes
 */
public class Main {
    public static void main(String[] args) {
        int opcion = 0, elemento;
        String nombre;
        ArbolBinario arbol = new ArbolBinario();
        
        do{
            try {
                opcion = Integer.parseInt(JOptionPane.showInputDialog(null,
                        "1.- insertar nodo \n"+ 
                        "2.- recorrer el arbol inOrden \n"+
                        "3.- recorrer arbol en preorden. \n"+
                        "4.- recorrer el arbol en postorden"+
                        "5.- buscar nodo"+
                        "6.- salir"+
                        "Elige una opcion.", "Menu Aplicacion",JOptionPane.QUESTION_MESSAGE));
                
                switch (opcion){
                    case 1:
                        elemento = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingresa el numero del nodo","Insertar Nodo",JOptionPane.QUESTION_MESSAGE));
                        nombre = JOptionPane.showInputDialog(null, "Agrega el nombre del nodo","Agregando nodo"
                        ,JOptionPane.QUESTION_MESSAGE);
                        arbol.InsertarNodo(opcion, nombre);
                        break;
                    case 2:
                        if(!arbol.estaVacio()){
                            arbol.inOrden(arbol.raiz);
                        }else{
                            JOptionPane.showMessageDialog(null, "el arbol esta vacio","salir",JOptionPane.INFORMATION_MESSAGE);
                        }
                        break;
                    case 3:
                        if(!arbol.estaVacio()){
                            arbol.PreOrden(arbol.raiz);
                        }else{
                            JOptionPane.showMessageDialog(null, "el arbol esta vacio","salir",JOptionPane.INFORMATION_MESSAGE);
                        }
                        break;
                    case 4:
                        if(!arbol.estaVacio()){
                            arbol.PreOrden(arbol.raiz);
                        }else{
                            JOptionPane.showMessageDialog(null, "el arbol esta vacio","salir",JOptionPane.INFORMATION_MESSAGE);
                        }
                        break;
                    case 5:
                        if(!arbol.estaVacio()){
                            elemento = Integer.parseInt(JOptionPane.showInputDialog(null,"ingresa el dato del nodo a buscar","busqueda de nodo",JOptionPane.QUESTION_MESSAGE));
                            
                            if(arbol.BuscarNodo(elemento)== null){
                                JOptionPane.showMessageDialog(null, "No encontrado");
                            }else{
                                System.out.println("nodo encontrado");
                            }
                        }else{
                            JOptionPane.showMessageDialog(null, "el arbol esta vacio","salir",JOptionPane.INFORMATION_MESSAGE);
                        }
                        break;
                    case 6:
                        JOptionPane.showMessageDialog(null, "aplicacion finalizada","salir",JOptionPane.INFORMATION_MESSAGE);
                        break;
                    default:
                        JOptionPane.showMessageDialog(null, "opcion incorrecta","Cuidado!", JOptionPane.INFORMATION_MESSAGE);
                        break;
                
                }
                        
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Error " + e.getMessage());
            }
        }while(opcion != 6);
    }
}
