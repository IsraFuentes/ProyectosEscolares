/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;
import DAO.*;
import Vista.*;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Isra
 */
public class ControladorCrudCliente  implements ActionListener, KeyListener{
    
    JFCrudClientes VistaCRUD = new JFCrudClientes();
    ClienteDao ModeloCRUD = new ClienteDao();
    
    public ControladorCrudCliente(JFCrudClientes VistaCrud, ClienteDao ModeloCrud){
        this.ModeloCRUD = ModeloCrud;
        this.VistaCRUD = VistaCrud;
        
        this.VistaCRUD.btnRegistrar.addActionListener(this);
        this.VistaCRUD.btnListar.addActionListener(this);
        this.VistaCRUD.btnEditar.addActionListener(this);
        this.VistaCRUD.btnEliminar.addActionListener(this);
        this.VistaCRUD.btnGuardar.addActionListener(this);
     
        
        this.VistaCRUD.txtBusqueda.addKeyListener(this);
        this.VistaCRUD.txtApellido.addKeyListener(this);
        this.VistaCRUD.txtNombre.addKeyListener(this);
        this.VistaCRUD.txtTelefono.addKeyListener(this);
        this.VistaCRUD.txtDireccion.addKeyListener(this);
        this.VistaCRUD.txtId.setEditable(false);
    }
    
   
    
    public void LLenarTabla(JTable tablaD){
        DefaultTableModel modeloT = new DefaultTableModel();
        tablaD.setModel(modeloT);
        
        modeloT.addColumn("Numero");
        modeloT.addColumn("ID Clientes");
        modeloT.addColumn("Nombres");
        modeloT.addColumn("Apellidos");
        modeloT.addColumn("Telefono");
        modeloT.addColumn("Direccion");
        
        Object[] columna = new Object[6];
        int numRegistros = ModeloCRUD.listarClientes().size();
        
        for (int i = 0; i < numRegistros; i++) {
            columna[0]= i+1;
            columna[1]= ModeloCRUD.listarClientes().get(i).getId();
            columna[2]= ModeloCRUD.listarClientes().get(i).getNombre();
            columna[3]= ModeloCRUD.listarClientes().get(i).getApellidos();
            columna[4]= ModeloCRUD.listarClientes().get(i).getTelefono();
            columna[5]= ModeloCRUD.listarClientes().get(i).getDireccion();
            modeloT.addRow(columna);
            
        }
        
    }
    // eventos programados para cuando se haga click sobre un determinado boton.
    public void actionPerformed(ActionEvent evento){
         
       
        // <----------------eveno boton registrar--------------------------->
        if (evento.getSource() == VistaCRUD.btnRegistrar) {
            String nombre = VistaCRUD.txtNombre.getText();
            String Apellido = VistaCRUD.txtApellido.getText();
            String Tel = VistaCRUD.txtTelefono.getText();
            String Direccion = VistaCRUD.txtDireccion.getText();
            
            String resultadosRegistro = ModeloCRUD.agregarCliente(nombre, Apellido, Tel, Direccion);
            if (resultadosRegistro != null ) {
                JOptionPane.showMessageDialog(null, resultadosRegistro);
            }else{
                JOptionPane.showMessageDialog(null, "Registro Erroneo");
            }
            LimpiarCampos();
        }//fin if evento bton registro
        
        // <---------------------evento boton listar ----------------------------------->
        if (evento.getSource() == VistaCRUD.btnListar) {
            LLenarTabla(VistaCRUD.jTDatos);
        }// fin evento boton listar
        
        //<---------------------evento boton editar----------------------------------->
        if (evento.getSource() == VistaCRUD.btnEditar) {
            int filaEditar = VistaCRUD.jTDatos.getSelectedRow();
            int numeroFilasSeleccionadas = VistaCRUD.jTDatos.getSelectedRowCount();
            
            
            if(filaEditar>=0 && numeroFilasSeleccionadas==1){
                VistaCRUD.txtId.setText(String.valueOf(VistaCRUD.jTDatos.getValueAt(filaEditar, 1)));
                VistaCRUD.txtNombre.setText(String.valueOf(VistaCRUD.jTDatos.getValueAt(filaEditar,2)));
                VistaCRUD.txtApellido.setText(String.valueOf(VistaCRUD.jTDatos.getValueAt(filaEditar, 3)));
                VistaCRUD.txtTelefono.setText(String.valueOf(VistaCRUD.jTDatos.getValueAt(filaEditar, 4)));
                VistaCRUD.txtDireccion.setText(String.valueOf(VistaCRUD.jTDatos.getValueAt(filaEditar, 5)));
              
                VistaCRUD.txtId.setEditable(false);
                VistaCRUD.btnGuardar.setEnabled(true);
                VistaCRUD.btnEditar.setEnabled(false);
                VistaCRUD.btnEliminar.setEnabled(false);
                VistaCRUD.btnListar.setEnabled(false);
                VistaCRUD.btnRegistrar.setEnabled(false);
                VistaCRUD.txtBusqueda.setEnabled(false);
                
               
            }else{
                JOptionPane.showMessageDialog(null, "Seleccione 1 registro a editar");
            }
           
        }// fin evento boton editar
        
        //<-------------------evento boton guardar-------------------------------->
        if (evento.getSource() == VistaCRUD.btnGuardar) {
            String nombre = VistaCRUD.txtNombre.getText();
            String Apellido = VistaCRUD.txtApellido.getText();
            String Tel = VistaCRUD.txtTelefono.getText();
            String Direccion = VistaCRUD.txtDireccion.getText();
            String id = VistaCRUD.txtId.getText();
            
            int respuestaEditar = ModeloCRUD.editarCliente(id, nombre,Apellido,Tel, Direccion);
            if(respuestaEditar>0){
                LimpiarCampos();
                JOptionPane.showMessageDialog(null, "Edicion exitosa.");
                LLenarTabla(VistaCRUD.jTDatos);
            }else{
                JOptionPane.showMessageDialog(null, "No se pudo realizar edicion.");
            }
            VistaCRUD.txtBusqueda.setEnabled(true);
            VistaCRUD.txtBusqueda.setEditable(true);
            VistaCRUD.btnGuardar.setEnabled(false);
            VistaCRUD.btnEditar.setEnabled(true);
            VistaCRUD.btnEliminar.setEnabled(true);
            VistaCRUD.btnRegistrar.setEnabled(true);
            VistaCRUD.btnListar.setEnabled(true);
        }// fin evento boton guardar
        
        //<-------------------------evento boton eliminar------------------------------->
        if (evento.getSource() == VistaCRUD.btnEliminar) {
            int filInicio = VistaCRUD.jTDatos.getSelectedRow();
            int numfilas = VistaCRUD.jTDatos.getSelectedRowCount();
            ArrayList<String> listaId = new ArrayList<>();
            String id;
            if(filInicio>=0){
                for(int i = 0; i<numfilas; i++){
                    id = String.valueOf(VistaCRUD.jTDatos.getValueAt(i+filInicio, 1));
                    listaId.add(i, id);
                }

                for(int j = 0; j<numfilas; j++){
                    int rpta = JOptionPane.showConfirmDialog(null, "Desea eliminar registro con el id: "+listaId.get(j)+"? ");
                    if(rpta==0){
                        ModeloCRUD.borrarCliente(listaId.get(j));
                    }
                }
                LLenarTabla(VistaCRUD.jTDatos);
            }else{
                JOptionPane.showMessageDialog(null, "Elija al menos un registro para eliminar.");
            }
        }//fin evento eliminar
        
        
    }// fin actionperformance
    
    public void LimpiarCampos(){
        VistaCRUD.txtNombre.setText("");
        VistaCRUD.txtApellido.setText("");
        VistaCRUD.txtTelefono.setText("");
        VistaCRUD.txtDireccion.setText("");
        VistaCRUD.txtId.setText("");
    }

    @Override
    public void keyTyped(KeyEvent eventoLLave) {
        //To change body of generated methods, choose Tools | Templates.
        
        if(eventoLLave.getSource() == VistaCRUD.txtApellido || eventoLLave.getSource() == VistaCRUD.txtNombre  ){
            char caracter = eventoLLave.getKeyChar();
            if((caracter<'a' || caracter>'z') && (caracter<'A' || caracter>'Z') && (caracter!=(char)KeyEvent.VK_SPACE)){
                eventoLLave.consume();
            }
        }// condicion para nombres
        
        if (eventoLLave.getSource() == VistaCRUD.txtTelefono) {
            char numeroTelefonico = eventoLLave.getKeyChar();
             if (numeroTelefonico<'0' || numeroTelefonico>'9') {
            eventoLLave.consume();
                    }
             }// fin condicion para telefonos
        
        if (eventoLLave.getSource() == VistaCRUD.txtDireccion) {
            char DirecionValida = eventoLLave.getKeyChar();
            if ((DirecionValida<'a' || DirecionValida>'z') && (DirecionValida<'A' || DirecionValida>'Z')
                && (DirecionValida<'0' || DirecionValida>'9')) {
                
            }
        }// fin condicion para direcciones
        
        
        }// fun keytyped

    

    @Override
    public void keyPressed(KeyEvent e) {
         //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void keyReleased(KeyEvent e) {
         //To change body of generated methods, choose Tools | Templates.
        
        if(e.getSource()== VistaCRUD.txtBusqueda){
            
            String apellidos = VistaCRUD.txtBusqueda.getText();
            
            DefaultTableModel  modeloT = new DefaultTableModel();
            VistaCRUD.jTDatos.setModel(modeloT);

           modeloT.addColumn("Numero");
           modeloT.addColumn("ID Cliente");
           modeloT.addColumn("Nombres");
           modeloT.addColumn("Apellidos");
           modeloT.addColumn("Telefono");
           modeloT.addColumn("Direccion");

            Object[] columna = new Object[6];

            int numRegistros = ModeloCRUD.buscarCliente(apellidos).size();
            System.out.println("personas encontradas" +numRegistros);
            for (int i = 0; i < numRegistros; i++) {
            columna[0]= i+1;
            columna[1]= ModeloCRUD.buscarCliente(apellidos).get(i).getId();
            columna[2]= ModeloCRUD.buscarCliente(apellidos).get(i).getNombre();
            columna[3]= ModeloCRUD.buscarCliente(apellidos).get(i).getApellidos();
            columna[4]= ModeloCRUD.buscarCliente(apellidos).get(i).getTelefono();
            columna[5]= ModeloCRUD.buscarCliente(apellidos).get(i).getDireccion();
            modeloT.addRow(columna);
            }
            
            
        }
        
    }
}
