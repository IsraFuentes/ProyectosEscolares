/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Principal;
import DAO.*;
import Vista.*;
import Controlador.*;

/**
 *
 * @author Isra
 */
public class PrincipalRecepcionista {
    
    public static void main(String[] args) {
        JFCrudClientes vista = new JFCrudClientes();
        ClienteDao modelo = new ClienteDao();
        ControladorCrudCliente controlador = new ControladorCrudCliente(vista, modelo);
        
        vista.setVisible(true);
        vista.setLocationRelativeTo(null);
    }
    
}
