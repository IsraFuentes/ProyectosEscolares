/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import client.IRemoteProvince;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.xml.bind.DatatypeConverter;
import server.ProvinceRepository;

/**
 *
 * @author Esteban
 */
public class teatro2 extends javax.swing.JFrame {
    IRemoteProvince remote;
    ArrayList<JButton> Asientos_Selecionados = new ArrayList<>(5);
    int list_asientos[];
    ImageIcon asiento_libre, asiento_ocupado, asiento_reservado, asiento_seleccionado;
    byte value96 = 0;
    byte value23 = 0;
    byte value2 = 0;
    byte value1 = 0;
    byte value11 = 0;
    byte value12 = 0;
    byte value3 = 0;
    byte value4 = 0;
    byte value5 = 0;
    byte value6 = 0;
    byte value7 = 0;
    byte value8 = 0;
    byte value9 = 0;
    byte value10 = 0;
    byte value13 = 0;
    byte value14 = 0;
    byte value15 = 0;
    byte value16 = 0;
    byte value17 = 0;
    byte value18 = 0;
    byte value19 = 0;
    byte value20 = 0;
    byte value21 = 0;
    byte value22 = 0;
    byte value29 = 0;
    byte value24 = 0;
    byte value25 = 0;
    byte value26 = 0;
    byte value27 = 0;
    byte value28 = 0;
    byte value30 = 0;
    byte value31 = 0;
    byte value32 = 0;
    byte value33 = 0;
    byte value34 = 0;
    byte value35 = 0;
    byte value36 = 0;
    byte value37 = 0;
    byte value38 = 0;
    byte value39 = 0;
    byte value40 = 0;
    byte value41 = 0;
    byte value42 = 0;
    byte value43 = 0;
    byte value44 = 0;
    byte value45 = 0;
    byte value46 = 0;
    byte value47 = 0;
    byte value48 = 0;
    byte value49 = 0;
    byte value50 = 0;
    byte value51 = 0;
    byte value52 = 0;
    byte value53 = 0;
    byte value54 = 0;
    byte value55 = 0;
    byte value56 = 0;
    byte value57 = 0;
    byte value58 = 0;
    byte value59 = 0;
    byte value60 = 0;
    byte value61 = 0;
    byte value62 = 0;
    byte value63 = 0;
    byte value64 = 0;
    byte value65 = 0;
    byte value66 = 0;
    byte value67 = 0;
    byte value68 = 0;
    byte value69 = 0;
    byte value70 = 0;
    byte value71 = 0;
    byte value72 = 0;
    byte value73 = 0;
    byte value74 = 0;
    byte value75 = 0;
    byte value76 = 0;
    byte value77 = 0;
    byte value78 = 0;
    byte value79 = 0;
    byte value80 = 0;
    byte value81 = 0;
    byte value82 = 0;
    byte value83 = 0;
    byte value84 = 0;
    byte value85 = 0;
    byte value86 = 0;
    byte value87 = 0;
    byte value88 = 0;
    byte value89 = 0;
    byte value90 = 0;
    byte value91 = 0;
    byte value92 = 0;
    byte value93 = 0;
    byte value94 = 0;
    byte value95 = 0;
    byte value98 = 0;
    byte value97 = 0;
    byte value99 = 0;
    byte value100 = 0;
    int count = 0;
    
    //public JButton btn;
    /**
     * Creates new form teatro
     * @param user
     */
    public teatro2(String user) {
        initComponents();
        user_name.setText(user);
        asiento_libre = new ImageIcon(this.getClass().getResource("chair_green.png"));
        asiento_ocupado = new ImageIcon(this.getClass().getResource("chair_red.png"));
        asiento_reservado = new ImageIcon(this.getClass().getResource("chair_blue.png"));
        asiento_seleccionado = new ImageIcon(this.getClass().getResource("chair_black.png"));
        state_button();
        try {
            //Registry hostprincipal = LocateRegistry.getRegistry("148.209.67.232");
            Registry hostprincipal = LocateRegistry.getRegistry("148.209.67.251");
            remote = (IRemoteProvince) hostprincipal.lookup("Province");
            list_asientos = remote.obtenerListaEstadosSillas(); 
        } catch (Exception e) {
            System.out.println(e);
        }
        pintarSillas();
        
        Thread oreja = new Thread(new Runnable() {
            @Override
            public void run() {
                
                try {
                    while(true){
                    Thread.sleep(3000);
                    System.out.println("actualizando ... ");
                    pintarSillas();
                    }
                } catch (InterruptedException ex) {
                    Logger.getLogger(teatro2.class.getName()).log(Level.SEVERE, null, ex);
                    System.out.println("error");
                }
                
            }
        });
        
         
        oreja.start();
        
        
        
    }
    
    public void initial_value(){
    value96 = 0;
    value23 = 0;
    value2 = 0;
    value1 = 0;
    value11 = 0;
    value12 = 0;
    value3 = 0;
    value4 = 0;
    value5 = 0;
    value6 = 0;
    value7 = 0;
    value8 = 0;
    value9 = 0;
    value10 = 0;
    value13 = 0;
    value14 = 0;
    value15 = 0;
    value16 = 0;
    value17 = 0;
    value18 = 0;
    value19 = 0;
    value20 = 0;
    value21 = 0;
    value22 = 0;
    value29 = 0;
    value24 = 0;
    value25 = 0;
    value26 = 0;
    value27 = 0;
    value28 = 0;
    value30 = 0;
    value31 = 0;
    value32 = 0;
    value33 = 0;
    value34 = 0;
    value35 = 0;
    value36 = 0;
    value37 = 0;
    value38 = 0;
    value39 = 0;
    value40 = 0;
    value41 = 0;
    value42 = 0;
    value43 = 0;
    value44 = 0;
    value45 = 0;
    value46 = 0;
    value47 = 0;
    value48 = 0;
    value49 = 0;
    value50 = 0;
    value51 = 0;
    value52 = 0;
    value53 = 0;
    value54 = 0;
    value55 = 0;
    value56 = 0;
    value57 = 0;
    value58 = 0;
    value59 = 0;
    value60 = 0;
    value61 = 0;
    value62 = 0;
    value63 = 0;
    value64 = 0;
    value65 = 0;
    value66 = 0;
    value67 = 0;
    value68 = 0;
    value69 = 0;
    value70 = 0;
    value71 = 0;
    value72 = 0;
    value73 = 0;
    value74 = 0;
    value75 = 0;
    value76 = 0;
    value77 = 0;
    value78 = 0;
    value79 = 0;
    value80 = 0;
    value81 = 0;
    value82 = 0;
    value83 = 0;
    value84 = 0;
    value85 = 0;
    value86 = 0;
    value87 = 0;
    value88 = 0;
    value89 = 0;
    value90 = 0;
    value91 = 0;
    value92 = 0;
    value93 = 0;
    value94 = 0;
    value95 = 0;
    value98 = 0;
    value97 = 0;
    value99 = 0;
    value100 = 0;
    }
   
    public void state_button(){
        jButton1.setIcon(asiento_libre);
        jButton2.setIcon(asiento_libre);
        jButton3.setIcon(asiento_libre);
        jButton4.setIcon(asiento_libre);
        jButton5.setIcon(asiento_libre);
        jButton6.setIcon(asiento_libre);
        jButton7.setIcon(asiento_libre);
        jButton8.setIcon(asiento_libre);
        jButton9.setIcon(asiento_libre);
        jButton10.setIcon(asiento_libre);
        jButton11.setIcon(asiento_libre);
        jButton12.setIcon(asiento_libre);
        jButton13.setIcon(asiento_libre);
        jButton14.setIcon(asiento_libre);
        jButton15.setIcon(asiento_libre);
        jButton16.setIcon(asiento_libre);
        jButton17.setIcon(asiento_libre);
        jButton18.setIcon(asiento_libre);
        jButton19.setIcon(asiento_libre);
        jButton20.setIcon(asiento_libre);
        jButton21.setIcon(asiento_libre);
        jButton22.setIcon(asiento_libre);
        jButton23.setIcon(asiento_libre);
        jButton24.setIcon(asiento_libre);
        jButton25.setIcon(asiento_libre);
        jButton26.setIcon(asiento_libre);
        jButton27.setIcon(asiento_libre);
        jButton28.setIcon(asiento_libre);
        jButton29.setIcon(asiento_libre);
        jButton30.setIcon(asiento_libre);
        jButton31.setIcon(asiento_libre);
        jButton32.setIcon(asiento_libre);
        jButton33.setIcon(asiento_libre);
        jButton34.setIcon(asiento_libre);
        jButton35.setIcon(asiento_libre);
        jButton36.setIcon(asiento_libre);
        jButton37.setIcon(asiento_libre);
        jButton38.setIcon(asiento_libre);
        jButton39.setIcon(asiento_libre);
        jButton40.setIcon(asiento_libre);
        jButton41.setIcon(asiento_libre);
        jButton42.setIcon(asiento_libre);
        jButton43.setIcon(asiento_libre);
        jButton44.setIcon(asiento_libre);
        jButton45.setIcon(asiento_libre);
        jButton46.setIcon(asiento_libre);
        jButton47.setIcon(asiento_libre);
        jButton48.setIcon(asiento_libre);
        jButton49.setIcon(asiento_libre);
        jButton50.setIcon(asiento_libre);
        jButton51.setIcon(asiento_libre);
        jButton52.setIcon(asiento_libre);
        jButton53.setIcon(asiento_libre);
        jButton54.setIcon(asiento_libre);
        jButton55.setIcon(asiento_libre);
        jButton56.setIcon(asiento_libre);
        jButton57.setIcon(asiento_libre);
        jButton58.setIcon(asiento_libre);
        jButton59.setIcon(asiento_libre);
        jButton60.setIcon(asiento_libre);
        jButton61.setIcon(asiento_libre);
        jButton62.setIcon(asiento_libre);
        jButton63.setIcon(asiento_libre);
        jButton64.setIcon(asiento_libre);
        jButton65.setIcon(asiento_libre);
        jButton66.setIcon(asiento_libre);
        jButton67.setIcon(asiento_libre);
        jButton68.setIcon(asiento_libre);
        jButton69.setIcon(asiento_libre);
        jButton70.setIcon(asiento_libre);
        jButton71.setIcon(asiento_libre);
        jButton72.setIcon(asiento_libre);
        jButton73.setIcon(asiento_libre);
        jButton74.setIcon(asiento_libre);
        jButton75.setIcon(asiento_libre);
        jButton76.setIcon(asiento_libre);
        jButton77.setIcon(asiento_libre);
        jButton78.setIcon(asiento_libre);
        jButton79.setIcon(asiento_libre);
        jButton80.setIcon(asiento_libre);
        jButton81.setIcon(asiento_libre);
        jButton82.setIcon(asiento_libre);
        jButton83.setIcon(asiento_libre);
        jButton84.setIcon(asiento_libre);
        jButton85.setIcon(asiento_libre);
        jButton86.setIcon(asiento_libre);
        jButton87.setIcon(asiento_libre);
        jButton88.setIcon(asiento_libre);
        jButton89.setIcon(asiento_libre);
        jButton90.setIcon(asiento_libre);
        jButton91.setIcon(asiento_libre);
        jButton92.setIcon(asiento_libre);
        jButton93.setIcon(asiento_libre);
        jButton94.setIcon(asiento_libre);
        jButton95.setIcon(asiento_libre);
        jButton96.setIcon(asiento_libre);
        jButton97.setIcon(asiento_libre);
        jButton98.setIcon(asiento_libre);
        jButton99.setIcon(asiento_libre);
        jButton100.setIcon(asiento_libre);
    }
private void actualizar() {
    // aqui falla
    ResultSet re = null;
    ArrayList<JButton> AsientosAzules = new ArrayList<>(5);
    int cont = 0;
    System.out.println("antes de actualizar");
    try {
        try {
            re =  remote.findAll();
        } catch (RemoteException ex) {
            Logger.getLogger(teatro2.class.getName()).log(Level.SEVERE, null, ex);
        }
       //  users
        while (re.next()) {   
             System.out.println("username: " +re.getInt(2));
             System.out.println("silla"+ re.getInt(3));
             AsientosAzules.add((JButton) jPanel2.getComponent(re.getInt(3)));
            if (user_name.getText().equals(re.getInt(2))) {
               
            }else{
                AsientosAzules.get(cont).setIcon(asiento_ocupado);
            }
            cont++;
        }
       
    } catch (SQLException e) {
        System.out.println(e);
    }
    System.out.println("fin actualizar");
    
    
}
private void pintarSillas(){
        ArrayList<JButton> Asientos = new ArrayList<>(100);
        int list[];
        try {
            list =  list_asientos;
            list = remote.obtenerListaEstadosSillas();
            
           // del metodo de arriba pintar() se obtiene una lista con los estados de las butacas.
            for (int i = 0; i < list_asientos.length; i++) {
                //System.out.println("elemento "+i +":"+ list[i]);
                Asientos.add((JButton) jPanel2.getComponent(i));
            // Asientos.add((JButton) jPanel2.getComponent(i));
            // Asientos.get(i).setIcon(asiento_libre)
                    switch (list[i]){
                    
                    case 1:
                        // verdes, disponibles
                        Asientos.get(i).setIcon(asiento_libre);
                        break;
                    case 2:
                        // botones negros, los selecionados por esta sesion
                       Asientos.get(i).setIcon(asiento_seleccionado);
                        break;
                    case 3:
                // azules: reservados por otro usuario
                       for(int j=0; j< Asientos_Selecionados.size(); j++){
                           if (Asientos.get(i).equals(Asientos_Selecionados.get(j))) {
                               System.out.println("pinta negro");
                               Asientos.get(i).setIcon(asiento_seleccionado);
                               break;
                           }else{
                               System.out.println("pintar azul");
                               Asientos.get(i).setIcon(asiento_reservado);
                               Asientos.get(i).setSelected(false);
                           }
                       
                       }
                       
                        //panel_botones.getComponent(i).setEnabled(false);
                        break;
                    case 4:
                        // rojos: reservados por el usuario
                        Asientos.get(i).setIcon(asiento_ocupado);
                        Asientos.get(i).setFocusable(false);
                        Asientos.get(i).setSelected(false);
                    
                    default:
                        break;
                     }// fin switch
                
                                 
            }
           System.out.println("terminado de pintar"); 
        } catch (Exception e) {
            System.out.println("metodo pintar sillas falló"+e.getMessage());
        }
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        jButton11 = new javax.swing.JButton();
        jButton12 = new javax.swing.JButton();
        jButton13 = new javax.swing.JButton();
        jButton14 = new javax.swing.JButton();
        jButton15 = new javax.swing.JButton();
        jButton16 = new javax.swing.JButton();
        jButton17 = new javax.swing.JButton();
        jButton18 = new javax.swing.JButton();
        jButton19 = new javax.swing.JButton();
        jButton20 = new javax.swing.JButton();
        jButton21 = new javax.swing.JButton();
        jButton22 = new javax.swing.JButton();
        jButton23 = new javax.swing.JButton();
        jButton24 = new javax.swing.JButton();
        jButton25 = new javax.swing.JButton();
        jButton26 = new javax.swing.JButton();
        jButton27 = new javax.swing.JButton();
        jButton28 = new javax.swing.JButton();
        jButton29 = new javax.swing.JButton();
        jButton30 = new javax.swing.JButton();
        jButton31 = new javax.swing.JButton();
        jButton32 = new javax.swing.JButton();
        jButton33 = new javax.swing.JButton();
        jButton34 = new javax.swing.JButton();
        jButton35 = new javax.swing.JButton();
        jButton36 = new javax.swing.JButton();
        jButton37 = new javax.swing.JButton();
        jButton38 = new javax.swing.JButton();
        jButton39 = new javax.swing.JButton();
        jButton40 = new javax.swing.JButton();
        jButton41 = new javax.swing.JButton();
        jButton42 = new javax.swing.JButton();
        jButton43 = new javax.swing.JButton();
        jButton44 = new javax.swing.JButton();
        jButton45 = new javax.swing.JButton();
        jButton46 = new javax.swing.JButton();
        jButton47 = new javax.swing.JButton();
        jButton48 = new javax.swing.JButton();
        jButton49 = new javax.swing.JButton();
        jButton50 = new javax.swing.JButton();
        jButton51 = new javax.swing.JButton();
        jButton52 = new javax.swing.JButton();
        jButton53 = new javax.swing.JButton();
        jButton54 = new javax.swing.JButton();
        jButton55 = new javax.swing.JButton();
        jButton56 = new javax.swing.JButton();
        jButton57 = new javax.swing.JButton();
        jButton58 = new javax.swing.JButton();
        jButton59 = new javax.swing.JButton();
        jButton60 = new javax.swing.JButton();
        jButton61 = new javax.swing.JButton();
        jButton62 = new javax.swing.JButton();
        jButton63 = new javax.swing.JButton();
        jButton64 = new javax.swing.JButton();
        jButton65 = new javax.swing.JButton();
        jButton66 = new javax.swing.JButton();
        jButton67 = new javax.swing.JButton();
        jButton68 = new javax.swing.JButton();
        jButton69 = new javax.swing.JButton();
        jButton70 = new javax.swing.JButton();
        jButton71 = new javax.swing.JButton();
        jButton72 = new javax.swing.JButton();
        jButton73 = new javax.swing.JButton();
        jButton74 = new javax.swing.JButton();
        jButton75 = new javax.swing.JButton();
        jButton76 = new javax.swing.JButton();
        jButton77 = new javax.swing.JButton();
        jButton78 = new javax.swing.JButton();
        jButton79 = new javax.swing.JButton();
        jButton80 = new javax.swing.JButton();
        jButton81 = new javax.swing.JButton();
        jButton82 = new javax.swing.JButton();
        jButton83 = new javax.swing.JButton();
        jButton84 = new javax.swing.JButton();
        jButton85 = new javax.swing.JButton();
        jButton86 = new javax.swing.JButton();
        jButton87 = new javax.swing.JButton();
        jButton88 = new javax.swing.JButton();
        jButton89 = new javax.swing.JButton();
        jButton90 = new javax.swing.JButton();
        jButton91 = new javax.swing.JButton();
        jButton92 = new javax.swing.JButton();
        jButton93 = new javax.swing.JButton();
        jButton94 = new javax.swing.JButton();
        jButton95 = new javax.swing.JButton();
        jButton96 = new javax.swing.JButton();
        jButton97 = new javax.swing.JButton();
        jButton98 = new javax.swing.JButton();
        jButton99 = new javax.swing.JButton();
        jButton100 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jButton101 = new javax.swing.JButton();
        jButton102 = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        user_name = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(1200, 750));
        setSize(new java.awt.Dimension(1200, 750));
        getContentPane().setLayout(null);

        jPanel1.setOpaque(false);
        jPanel1.setPreferredSize(new java.awt.Dimension(1050, 700));

        jPanel2.setOpaque(false);
        jPanel2.setLayout(new java.awt.GridBagLayout());

        jButton1.setBackground(new java.awt.Color(51, 51, 51));
        jButton1.setText("A1");
        jButton1.setName("1"); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(6, 44, 0, 0);
        jPanel2.add(jButton1, gridBagConstraints);

        jButton2.setBackground(new java.awt.Color(51, 51, 51));
        jButton2.setText("A2");
        jButton2.setName("2"); // NOI18N
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(6, 6, 0, 0);
        jPanel2.add(jButton2, gridBagConstraints);

        jButton3.setBackground(new java.awt.Color(51, 51, 51));
        jButton3.setText("A3");
        jButton3.setName("3"); // NOI18N
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 6;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(6, 6, 0, 0);
        jPanel2.add(jButton3, gridBagConstraints);

        jButton4.setBackground(new java.awt.Color(51, 51, 51));
        jButton4.setText("A4");
        jButton4.setName("4"); // NOI18N
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 9;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(6, 4, 0, 0);
        jPanel2.add(jButton4, gridBagConstraints);

        jButton5.setBackground(new java.awt.Color(51, 51, 51));
        jButton5.setText("A5");
        jButton5.setName("5"); // NOI18N
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 12;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(6, 4, 0, 0);
        jPanel2.add(jButton5, gridBagConstraints);

        jButton6.setBackground(new java.awt.Color(51, 51, 51));
        jButton6.setText("A6");
        jButton6.setName("6"); // NOI18N
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 15;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(6, 4, 0, 0);
        jPanel2.add(jButton6, gridBagConstraints);

        jButton7.setBackground(new java.awt.Color(51, 51, 51));
        jButton7.setText("A7");
        jButton7.setName("7"); // NOI18N
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 18;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(6, 6, 0, 0);
        jPanel2.add(jButton7, gridBagConstraints);

        jButton8.setBackground(new java.awt.Color(51, 51, 51));
        jButton8.setText("A8");
        jButton8.setName("8"); // NOI18N
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 21;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(6, 6, 0, 0);
        jPanel2.add(jButton8, gridBagConstraints);

        jButton9.setBackground(new java.awt.Color(51, 51, 51));
        jButton9.setText("A9");
        jButton9.setName("9"); // NOI18N
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 24;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(6, 6, 0, 0);
        jPanel2.add(jButton9, gridBagConstraints);

        jButton10.setBackground(new java.awt.Color(51, 51, 51));
        jButton10.setText("A10");
        jButton10.setName("10"); // NOI18N
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 27;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 4;
        gridBagConstraints.gridheight = 3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(7, 6, 0, 0);
        jPanel2.add(jButton10, gridBagConstraints);

        jButton11.setBackground(new java.awt.Color(51, 51, 51));
        jButton11.setText("B1");
        jButton11.setName("11"); // NOI18N
        jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton11ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(5, 44, 0, 0);
        jPanel2.add(jButton11, gridBagConstraints);

        jButton12.setBackground(new java.awt.Color(51, 51, 51));
        jButton12.setText("B2");
        jButton12.setName("12"); // NOI18N
        jButton12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton12ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(5, 6, 0, 0);
        jPanel2.add(jButton12, gridBagConstraints);

        jButton13.setBackground(new java.awt.Color(51, 51, 51));
        jButton13.setText("B3");
        jButton13.setName("13"); // NOI18N
        jButton13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton13ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 6;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(5, 4, 0, 0);
        jPanel2.add(jButton13, gridBagConstraints);

        jButton14.setBackground(new java.awt.Color(51, 51, 51));
        jButton14.setText("B4");
        jButton14.setName("14"); // NOI18N
        jButton14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton14ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 9;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(5, 4, 0, 0);
        jPanel2.add(jButton14, gridBagConstraints);

        jButton15.setBackground(new java.awt.Color(51, 51, 51));
        jButton15.setText("B5");
        jButton15.setName("15"); // NOI18N
        jButton15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton15ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 12;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(5, 4, 0, 0);
        jPanel2.add(jButton15, gridBagConstraints);

        jButton16.setBackground(new java.awt.Color(51, 51, 51));
        jButton16.setText("B6");
        jButton16.setName("16"); // NOI18N
        jButton16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton16ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 15;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(5, 4, 0, 0);
        jPanel2.add(jButton16, gridBagConstraints);

        jButton17.setBackground(new java.awt.Color(51, 51, 51));
        jButton17.setText("B7");
        jButton17.setName("17"); // NOI18N
        jButton17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton17ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 18;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(5, 6, 0, 0);
        jPanel2.add(jButton17, gridBagConstraints);

        jButton18.setBackground(new java.awt.Color(51, 51, 51));
        jButton18.setText("B8");
        jButton18.setName("18"); // NOI18N
        jButton18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton18ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 21;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(5, 6, 0, 0);
        jPanel2.add(jButton18, gridBagConstraints);

        jButton19.setBackground(new java.awt.Color(51, 51, 51));
        jButton19.setText("B9");
        jButton19.setName("19"); // NOI18N
        jButton19.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton19ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 24;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(5, 6, 0, 0);
        jPanel2.add(jButton19, gridBagConstraints);

        jButton20.setBackground(new java.awt.Color(51, 51, 51));
        jButton20.setText("B10");
        jButton20.setName("20"); // NOI18N
        jButton20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton20ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 27;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.gridwidth = 4;
        gridBagConstraints.gridheight = 3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(6, 6, 0, 0);
        jPanel2.add(jButton20, gridBagConstraints);

        jButton21.setBackground(new java.awt.Color(51, 51, 51));
        jButton21.setText("C1");
        jButton21.setName("21"); // NOI18N
        jButton21.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton21ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 7;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(5, 44, 0, 0);
        jPanel2.add(jButton21, gridBagConstraints);

        jButton22.setBackground(new java.awt.Color(51, 51, 51));
        jButton22.setText("C2");
        jButton22.setName("22"); // NOI18N
        jButton22.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton22ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 7;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(5, 6, 0, 0);
        jPanel2.add(jButton22, gridBagConstraints);

        jButton23.setBackground(new java.awt.Color(51, 51, 51));
        jButton23.setText("C3");
        jButton23.setName("23"); // NOI18N
        jButton23.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton23ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 6;
        gridBagConstraints.gridy = 7;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(5, 4, 0, 0);
        jPanel2.add(jButton23, gridBagConstraints);

        jButton24.setBackground(new java.awt.Color(51, 51, 51));
        jButton24.setText("C4");
        jButton24.setName("24"); // NOI18N
        jButton24.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton24ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 9;
        gridBagConstraints.gridy = 7;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(5, 4, 0, 0);
        jPanel2.add(jButton24, gridBagConstraints);

        jButton25.setBackground(new java.awt.Color(51, 51, 51));
        jButton25.setText("C5");
        jButton25.setName("25"); // NOI18N
        jButton25.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton25ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 12;
        gridBagConstraints.gridy = 7;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(5, 4, 0, 0);
        jPanel2.add(jButton25, gridBagConstraints);

        jButton26.setBackground(new java.awt.Color(51, 51, 51));
        jButton26.setText("C6");
        jButton26.setName("26"); // NOI18N
        jButton26.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton26ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 15;
        gridBagConstraints.gridy = 7;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(5, 4, 0, 0);
        jPanel2.add(jButton26, gridBagConstraints);

        jButton27.setBackground(new java.awt.Color(51, 51, 51));
        jButton27.setText("C7");
        jButton27.setName("27"); // NOI18N
        jButton27.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton27ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 18;
        gridBagConstraints.gridy = 7;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(5, 6, 0, 0);
        jPanel2.add(jButton27, gridBagConstraints);

        jButton28.setBackground(new java.awt.Color(51, 51, 51));
        jButton28.setText("C8");
        jButton28.setName("28"); // NOI18N
        jButton28.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton28ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 21;
        gridBagConstraints.gridy = 7;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(5, 6, 0, 0);
        jPanel2.add(jButton28, gridBagConstraints);

        jButton29.setBackground(new java.awt.Color(51, 51, 51));
        jButton29.setText("C9");
        jButton29.setName("29"); // NOI18N
        jButton29.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton29ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 24;
        gridBagConstraints.gridy = 7;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(5, 6, 0, 0);
        jPanel2.add(jButton29, gridBagConstraints);

        jButton30.setBackground(new java.awt.Color(51, 51, 51));
        jButton30.setText("C10");
        jButton30.setName("30"); // NOI18N
        jButton30.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton30ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 27;
        gridBagConstraints.gridy = 7;
        gridBagConstraints.gridwidth = 4;
        gridBagConstraints.gridheight = 3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(6, 6, 0, 0);
        jPanel2.add(jButton30, gridBagConstraints);

        jButton31.setBackground(new java.awt.Color(51, 51, 51));
        jButton31.setText("D1");
        jButton31.setName("31"); // NOI18N
        jButton31.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton31ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 10;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(5, 44, 0, 0);
        jPanel2.add(jButton31, gridBagConstraints);

        jButton32.setBackground(new java.awt.Color(51, 51, 51));
        jButton32.setText("D2");
        jButton32.setName("32"); // NOI18N
        jButton32.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton32ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 10;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(5, 6, 0, 0);
        jPanel2.add(jButton32, gridBagConstraints);

        jButton33.setBackground(new java.awt.Color(51, 51, 51));
        jButton33.setText("D3");
        jButton33.setName("33"); // NOI18N
        jButton33.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton33ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 6;
        gridBagConstraints.gridy = 10;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(5, 4, 0, 0);
        jPanel2.add(jButton33, gridBagConstraints);

        jButton34.setBackground(new java.awt.Color(51, 51, 51));
        jButton34.setText("D4");
        jButton34.setName("34"); // NOI18N
        jButton34.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton34ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 9;
        gridBagConstraints.gridy = 10;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(5, 4, 0, 0);
        jPanel2.add(jButton34, gridBagConstraints);

        jButton35.setBackground(new java.awt.Color(51, 51, 51));
        jButton35.setText("D5");
        jButton35.setName("35"); // NOI18N
        jButton35.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton35ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 12;
        gridBagConstraints.gridy = 10;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(5, 4, 0, 0);
        jPanel2.add(jButton35, gridBagConstraints);

        jButton36.setBackground(new java.awt.Color(51, 51, 51));
        jButton36.setText("D6");
        jButton36.setName("36"); // NOI18N
        jButton36.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton36ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 15;
        gridBagConstraints.gridy = 10;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(5, 4, 0, 0);
        jPanel2.add(jButton36, gridBagConstraints);

        jButton37.setBackground(new java.awt.Color(51, 51, 51));
        jButton37.setText("D7");
        jButton37.setName("37"); // NOI18N
        jButton37.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton37ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 18;
        gridBagConstraints.gridy = 10;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(5, 6, 0, 0);
        jPanel2.add(jButton37, gridBagConstraints);

        jButton38.setBackground(new java.awt.Color(51, 51, 51));
        jButton38.setText("D8");
        jButton38.setName("38"); // NOI18N
        jButton38.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton38ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 21;
        gridBagConstraints.gridy = 10;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(5, 6, 0, 0);
        jPanel2.add(jButton38, gridBagConstraints);

        jButton39.setBackground(new java.awt.Color(51, 51, 51));
        jButton39.setText("D9");
        jButton39.setName("39"); // NOI18N
        jButton39.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton39ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 24;
        gridBagConstraints.gridy = 10;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(5, 6, 0, 0);
        jPanel2.add(jButton39, gridBagConstraints);

        jButton40.setBackground(new java.awt.Color(51, 51, 51));
        jButton40.setText("D10");
        jButton40.setName("40"); // NOI18N
        jButton40.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton40ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 27;
        gridBagConstraints.gridy = 10;
        gridBagConstraints.gridwidth = 4;
        gridBagConstraints.gridheight = 3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(6, 6, 0, 0);
        jPanel2.add(jButton40, gridBagConstraints);

        jButton41.setBackground(new java.awt.Color(51, 51, 51));
        jButton41.setText("E1");
        jButton41.setName("41"); // NOI18N
        jButton41.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton41ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 13;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(5, 44, 0, 0);
        jPanel2.add(jButton41, gridBagConstraints);

        jButton42.setBackground(new java.awt.Color(51, 51, 51));
        jButton42.setText("E2");
        jButton42.setName("42"); // NOI18N
        jButton42.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton42ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 13;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(5, 6, 0, 0);
        jPanel2.add(jButton42, gridBagConstraints);

        jButton43.setBackground(new java.awt.Color(51, 51, 51));
        jButton43.setText("E3");
        jButton43.setName("43"); // NOI18N
        jButton43.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton43ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 6;
        gridBagConstraints.gridy = 13;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(5, 4, 0, 0);
        jPanel2.add(jButton43, gridBagConstraints);

        jButton44.setBackground(new java.awt.Color(51, 51, 51));
        jButton44.setText("E4");
        jButton44.setName("44"); // NOI18N
        jButton44.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton44ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 9;
        gridBagConstraints.gridy = 13;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(5, 4, 0, 0);
        jPanel2.add(jButton44, gridBagConstraints);

        jButton45.setBackground(new java.awt.Color(51, 51, 51));
        jButton45.setText("E5");
        jButton45.setName("45"); // NOI18N
        jButton45.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton45ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 12;
        gridBagConstraints.gridy = 13;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(5, 4, 0, 0);
        jPanel2.add(jButton45, gridBagConstraints);

        jButton46.setBackground(new java.awt.Color(51, 51, 51));
        jButton46.setText("E6");
        jButton46.setName("46"); // NOI18N
        jButton46.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton46ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 15;
        gridBagConstraints.gridy = 13;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(5, 4, 0, 0);
        jPanel2.add(jButton46, gridBagConstraints);

        jButton47.setBackground(new java.awt.Color(51, 51, 51));
        jButton47.setText("E7");
        jButton47.setName("47"); // NOI18N
        jButton47.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton47ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 18;
        gridBagConstraints.gridy = 13;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(5, 6, 0, 0);
        jPanel2.add(jButton47, gridBagConstraints);

        jButton48.setBackground(new java.awt.Color(51, 51, 51));
        jButton48.setText("E8");
        jButton48.setName("48"); // NOI18N
        jButton48.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton48ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 21;
        gridBagConstraints.gridy = 13;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(5, 6, 0, 0);
        jPanel2.add(jButton48, gridBagConstraints);

        jButton49.setBackground(new java.awt.Color(51, 51, 51));
        jButton49.setText("E9");
        jButton49.setName("49"); // NOI18N
        jButton49.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton49ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 24;
        gridBagConstraints.gridy = 13;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(5, 6, 0, 0);
        jPanel2.add(jButton49, gridBagConstraints);

        jButton50.setBackground(new java.awt.Color(51, 51, 51));
        jButton50.setText("E10");
        jButton50.setName("50"); // NOI18N
        jButton50.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton50ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 27;
        gridBagConstraints.gridy = 13;
        gridBagConstraints.gridwidth = 4;
        gridBagConstraints.gridheight = 3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(6, 6, 0, 0);
        jPanel2.add(jButton50, gridBagConstraints);

        jButton51.setBackground(new java.awt.Color(51, 51, 51));
        jButton51.setText("F1");
        jButton51.setName("51"); // NOI18N
        jButton51.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton51ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 16;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(5, 44, 0, 0);
        jPanel2.add(jButton51, gridBagConstraints);

        jButton52.setBackground(new java.awt.Color(51, 51, 51));
        jButton52.setText("F2");
        jButton52.setName("52"); // NOI18N
        jButton52.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton52ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 16;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(5, 6, 0, 0);
        jPanel2.add(jButton52, gridBagConstraints);

        jButton53.setBackground(new java.awt.Color(51, 51, 51));
        jButton53.setText("F3");
        jButton53.setName("53"); // NOI18N
        jButton53.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton53ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 6;
        gridBagConstraints.gridy = 16;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(5, 4, 0, 0);
        jPanel2.add(jButton53, gridBagConstraints);

        jButton54.setBackground(new java.awt.Color(51, 51, 51));
        jButton54.setText("F4");
        jButton54.setName("54"); // NOI18N
        jButton54.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton54ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 9;
        gridBagConstraints.gridy = 16;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(5, 4, 0, 0);
        jPanel2.add(jButton54, gridBagConstraints);

        jButton55.setBackground(new java.awt.Color(51, 51, 51));
        jButton55.setText("F5");
        jButton55.setName("55"); // NOI18N
        jButton55.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton55ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 12;
        gridBagConstraints.gridy = 16;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(5, 4, 0, 0);
        jPanel2.add(jButton55, gridBagConstraints);

        jButton56.setBackground(new java.awt.Color(51, 51, 51));
        jButton56.setText("F6");
        jButton56.setName("56"); // NOI18N
        jButton56.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton56ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 15;
        gridBagConstraints.gridy = 16;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(5, 4, 0, 0);
        jPanel2.add(jButton56, gridBagConstraints);

        jButton57.setBackground(new java.awt.Color(51, 51, 51));
        jButton57.setText("F7");
        jButton57.setName("57"); // NOI18N
        jButton57.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton57ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 18;
        gridBagConstraints.gridy = 16;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(5, 6, 0, 0);
        jPanel2.add(jButton57, gridBagConstraints);

        jButton58.setBackground(new java.awt.Color(51, 51, 51));
        jButton58.setText("F8");
        jButton58.setName("58"); // NOI18N
        jButton58.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton58ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 21;
        gridBagConstraints.gridy = 16;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(5, 6, 0, 0);
        jPanel2.add(jButton58, gridBagConstraints);

        jButton59.setBackground(new java.awt.Color(51, 51, 51));
        jButton59.setText("F9");
        jButton59.setName("59"); // NOI18N
        jButton59.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton59ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 24;
        gridBagConstraints.gridy = 16;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(5, 6, 0, 0);
        jPanel2.add(jButton59, gridBagConstraints);

        jButton60.setBackground(new java.awt.Color(51, 51, 51));
        jButton60.setText("F10");
        jButton60.setName("60"); // NOI18N
        jButton60.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton60ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 27;
        gridBagConstraints.gridy = 16;
        gridBagConstraints.gridwidth = 4;
        gridBagConstraints.gridheight = 3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(6, 6, 0, 0);
        jPanel2.add(jButton60, gridBagConstraints);

        jButton61.setBackground(new java.awt.Color(51, 51, 51));
        jButton61.setText("G1");
        jButton61.setName("61"); // NOI18N
        jButton61.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton61ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 19;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(5, 44, 0, 0);
        jPanel2.add(jButton61, gridBagConstraints);

        jButton62.setBackground(new java.awt.Color(51, 51, 51));
        jButton62.setText("G2");
        jButton62.setToolTipText("");
        jButton62.setName("62"); // NOI18N
        jButton62.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton62ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 19;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(5, 6, 0, 0);
        jPanel2.add(jButton62, gridBagConstraints);

        jButton63.setBackground(new java.awt.Color(51, 51, 51));
        jButton63.setText("G3");
        jButton63.setName("63"); // NOI18N
        jButton63.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton63ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 6;
        gridBagConstraints.gridy = 19;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(5, 4, 0, 0);
        jPanel2.add(jButton63, gridBagConstraints);

        jButton64.setBackground(new java.awt.Color(51, 51, 51));
        jButton64.setText("G4");
        jButton64.setName("64"); // NOI18N
        jButton64.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton64ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 9;
        gridBagConstraints.gridy = 19;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(5, 4, 0, 0);
        jPanel2.add(jButton64, gridBagConstraints);

        jButton65.setBackground(new java.awt.Color(51, 51, 51));
        jButton65.setText("G5");
        jButton65.setName("65"); // NOI18N
        jButton65.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton65ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 12;
        gridBagConstraints.gridy = 19;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(5, 4, 0, 0);
        jPanel2.add(jButton65, gridBagConstraints);

        jButton66.setBackground(new java.awt.Color(51, 51, 51));
        jButton66.setText("G6");
        jButton66.setName("66"); // NOI18N
        jButton66.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton66ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 15;
        gridBagConstraints.gridy = 19;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(5, 4, 0, 0);
        jPanel2.add(jButton66, gridBagConstraints);

        jButton67.setBackground(new java.awt.Color(51, 51, 51));
        jButton67.setText("G7");
        jButton67.setName("67"); // NOI18N
        jButton67.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton67ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 18;
        gridBagConstraints.gridy = 19;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(5, 6, 0, 0);
        jPanel2.add(jButton67, gridBagConstraints);

        jButton68.setBackground(new java.awt.Color(51, 51, 51));
        jButton68.setText("G8");
        jButton68.setName("68"); // NOI18N
        jButton68.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton68ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 21;
        gridBagConstraints.gridy = 19;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(5, 6, 0, 0);
        jPanel2.add(jButton68, gridBagConstraints);

        jButton69.setBackground(new java.awt.Color(51, 51, 51));
        jButton69.setText("G9");
        jButton69.setName("69"); // NOI18N
        jButton69.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton69ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 24;
        gridBagConstraints.gridy = 19;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(5, 6, 0, 0);
        jPanel2.add(jButton69, gridBagConstraints);

        jButton70.setBackground(new java.awt.Color(51, 51, 51));
        jButton70.setText("G10");
        jButton70.setName("70"); // NOI18N
        jButton70.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton70ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 27;
        gridBagConstraints.gridy = 19;
        gridBagConstraints.gridwidth = 4;
        gridBagConstraints.gridheight = 3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(6, 6, 0, 0);
        jPanel2.add(jButton70, gridBagConstraints);

        jButton71.setBackground(new java.awt.Color(51, 51, 51));
        jButton71.setText("H1");
        jButton71.setName("71"); // NOI18N
        jButton71.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton71ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 22;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(5, 44, 0, 0);
        jPanel2.add(jButton71, gridBagConstraints);

        jButton72.setBackground(new java.awt.Color(51, 51, 51));
        jButton72.setText("H2");
        jButton72.setName("72"); // NOI18N
        jButton72.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton72ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 22;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(5, 6, 0, 0);
        jPanel2.add(jButton72, gridBagConstraints);

        jButton73.setBackground(new java.awt.Color(51, 51, 51));
        jButton73.setText("H3");
        jButton73.setName("73"); // NOI18N
        jButton73.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton73ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 6;
        gridBagConstraints.gridy = 22;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(5, 4, 0, 0);
        jPanel2.add(jButton73, gridBagConstraints);

        jButton74.setBackground(new java.awt.Color(51, 51, 51));
        jButton74.setText("H4");
        jButton74.setName("74"); // NOI18N
        jButton74.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton74ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 9;
        gridBagConstraints.gridy = 22;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(5, 4, 0, 0);
        jPanel2.add(jButton74, gridBagConstraints);

        jButton75.setBackground(new java.awt.Color(51, 51, 51));
        jButton75.setText("H5");
        jButton75.setName("75"); // NOI18N
        jButton75.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton75ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 12;
        gridBagConstraints.gridy = 22;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(5, 4, 0, 0);
        jPanel2.add(jButton75, gridBagConstraints);

        jButton76.setBackground(new java.awt.Color(51, 51, 51));
        jButton76.setText("H6");
        jButton76.setName("76"); // NOI18N
        jButton76.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton76ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 15;
        gridBagConstraints.gridy = 22;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(5, 4, 0, 0);
        jPanel2.add(jButton76, gridBagConstraints);

        jButton77.setBackground(new java.awt.Color(51, 51, 51));
        jButton77.setText("H7");
        jButton77.setName("77"); // NOI18N
        jButton77.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton77ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 18;
        gridBagConstraints.gridy = 22;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(5, 6, 0, 0);
        jPanel2.add(jButton77, gridBagConstraints);

        jButton78.setBackground(new java.awt.Color(51, 51, 51));
        jButton78.setText("H8");
        jButton78.setName("78"); // NOI18N
        jButton78.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton78ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 21;
        gridBagConstraints.gridy = 22;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(5, 6, 0, 0);
        jPanel2.add(jButton78, gridBagConstraints);

        jButton79.setBackground(new java.awt.Color(51, 51, 51));
        jButton79.setText("H9");
        jButton79.setName("79"); // NOI18N
        jButton79.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton79ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 24;
        gridBagConstraints.gridy = 22;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(5, 6, 0, 0);
        jPanel2.add(jButton79, gridBagConstraints);

        jButton80.setBackground(new java.awt.Color(51, 51, 51));
        jButton80.setText("H10");
        jButton80.setName("80"); // NOI18N
        jButton80.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton80ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 27;
        gridBagConstraints.gridy = 22;
        gridBagConstraints.gridwidth = 4;
        gridBagConstraints.gridheight = 3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(6, 6, 0, 0);
        jPanel2.add(jButton80, gridBagConstraints);

        jButton81.setBackground(new java.awt.Color(51, 51, 51));
        jButton81.setText("I1");
        jButton81.setName("81"); // NOI18N
        jButton81.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton81ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 25;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.ipadx = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(5, 44, 0, 0);
        jPanel2.add(jButton81, gridBagConstraints);

        jButton82.setBackground(new java.awt.Color(51, 51, 51));
        jButton82.setText("I2");
        jButton82.setMaximumSize(new java.awt.Dimension(45, 23));
        jButton82.setMinimumSize(new java.awt.Dimension(45, 23));
        jButton82.setName("82"); // NOI18N
        jButton82.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton82ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 25;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(5, 6, 0, 0);
        jPanel2.add(jButton82, gridBagConstraints);

        jButton83.setBackground(new java.awt.Color(51, 51, 51));
        jButton83.setText("I3");
        jButton83.setMaximumSize(new java.awt.Dimension(45, 23));
        jButton83.setMinimumSize(new java.awt.Dimension(45, 23));
        jButton83.setName("83"); // NOI18N
        jButton83.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton83ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 6;
        gridBagConstraints.gridy = 25;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(5, 6, 0, 0);
        jPanel2.add(jButton83, gridBagConstraints);

        jButton84.setBackground(new java.awt.Color(51, 51, 51));
        jButton84.setText("I4");
        jButton84.setMaximumSize(new java.awt.Dimension(45, 23));
        jButton84.setMinimumSize(new java.awt.Dimension(45, 23));
        jButton84.setName("84"); // NOI18N
        jButton84.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton84ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 9;
        gridBagConstraints.gridy = 25;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(5, 4, 0, 0);
        jPanel2.add(jButton84, gridBagConstraints);

        jButton85.setBackground(new java.awt.Color(51, 51, 51));
        jButton85.setText("I5");
        jButton85.setMaximumSize(new java.awt.Dimension(45, 23));
        jButton85.setMinimumSize(new java.awt.Dimension(45, 23));
        jButton85.setName("85"); // NOI18N
        jButton85.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton85ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 12;
        gridBagConstraints.gridy = 25;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(5, 6, 0, 0);
        jPanel2.add(jButton85, gridBagConstraints);

        jButton86.setBackground(new java.awt.Color(51, 51, 51));
        jButton86.setText("I6");
        jButton86.setMaximumSize(new java.awt.Dimension(45, 23));
        jButton86.setMinimumSize(new java.awt.Dimension(45, 23));
        jButton86.setName("86"); // NOI18N
        jButton86.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton86ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 15;
        gridBagConstraints.gridy = 25;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(5, 4, 0, 0);
        jPanel2.add(jButton86, gridBagConstraints);

        jButton87.setBackground(new java.awt.Color(51, 51, 51));
        jButton87.setText("I7");
        jButton87.setMaximumSize(new java.awt.Dimension(45, 23));
        jButton87.setMinimumSize(new java.awt.Dimension(45, 23));
        jButton87.setName("87"); // NOI18N
        jButton87.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton87ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 18;
        gridBagConstraints.gridy = 25;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(5, 8, 0, 0);
        jPanel2.add(jButton87, gridBagConstraints);

        jButton88.setBackground(new java.awt.Color(51, 51, 51));
        jButton88.setText("I8");
        jButton88.setMaximumSize(new java.awt.Dimension(45, 23));
        jButton88.setMinimumSize(new java.awt.Dimension(45, 23));
        jButton88.setName("88"); // NOI18N
        jButton88.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton88ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 21;
        gridBagConstraints.gridy = 25;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(5, 6, 0, 0);
        jPanel2.add(jButton88, gridBagConstraints);

        jButton89.setBackground(new java.awt.Color(51, 51, 51));
        jButton89.setText("I9");
        jButton89.setMaximumSize(new java.awt.Dimension(45, 23));
        jButton89.setMinimumSize(new java.awt.Dimension(45, 23));
        jButton89.setName("89"); // NOI18N
        jButton89.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton89ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 24;
        gridBagConstraints.gridy = 25;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(5, 8, 0, 0);
        jPanel2.add(jButton89, gridBagConstraints);

        jButton90.setBackground(new java.awt.Color(51, 51, 51));
        jButton90.setText("I10");
        jButton90.setMaximumSize(new java.awt.Dimension(51, 23));
        jButton90.setMinimumSize(new java.awt.Dimension(51, 23));
        jButton90.setName("90"); // NOI18N
        jButton90.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton90ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 27;
        gridBagConstraints.gridy = 25;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.gridheight = 3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(7, 6, 0, 0);
        jPanel2.add(jButton90, gridBagConstraints);

        jButton91.setBackground(new java.awt.Color(51, 51, 51));
        jButton91.setText("J1");
        jButton91.setMaximumSize(new java.awt.Dimension(45, 23));
        jButton91.setMinimumSize(new java.awt.Dimension(45, 23));
        jButton91.setName("91"); // NOI18N
        jButton91.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton91ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 28;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(5, 44, 0, 0);
        jPanel2.add(jButton91, gridBagConstraints);

        jButton92.setBackground(new java.awt.Color(51, 51, 51));
        jButton92.setText("J2");
        jButton92.setMaximumSize(new java.awt.Dimension(45, 23));
        jButton92.setMinimumSize(new java.awt.Dimension(45, 23));
        jButton92.setName("92"); // NOI18N
        jButton92.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton92ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 28;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(5, 8, 0, 0);
        jPanel2.add(jButton92, gridBagConstraints);

        jButton93.setBackground(new java.awt.Color(51, 51, 51));
        jButton93.setText("J3");
        jButton93.setMaximumSize(new java.awt.Dimension(45, 23));
        jButton93.setMinimumSize(new java.awt.Dimension(45, 23));
        jButton93.setName("93"); // NOI18N
        jButton93.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton93ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 6;
        gridBagConstraints.gridy = 28;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(5, 8, 0, 0);
        jPanel2.add(jButton93, gridBagConstraints);

        jButton94.setBackground(new java.awt.Color(51, 51, 51));
        jButton94.setText("J4");
        jButton94.setMaximumSize(new java.awt.Dimension(45, 23));
        jButton94.setMinimumSize(new java.awt.Dimension(45, 23));
        jButton94.setName("94"); // NOI18N
        jButton94.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton94ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 9;
        gridBagConstraints.gridy = 28;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(5, 6, 0, 0);
        jPanel2.add(jButton94, gridBagConstraints);

        jButton95.setBackground(new java.awt.Color(51, 51, 51));
        jButton95.setText("J5");
        jButton95.setMaximumSize(new java.awt.Dimension(45, 23));
        jButton95.setMinimumSize(new java.awt.Dimension(45, 23));
        jButton95.setName("95"); // NOI18N
        jButton95.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton95ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 12;
        gridBagConstraints.gridy = 28;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(5, 8, 0, 0);
        jPanel2.add(jButton95, gridBagConstraints);

        jButton96.setBackground(new java.awt.Color(51, 51, 51));
        jButton96.setText("J6");
        jButton96.setMaximumSize(new java.awt.Dimension(45, 23));
        jButton96.setMinimumSize(new java.awt.Dimension(45, 23));
        jButton96.setName("96"); // NOI18N
        jButton96.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton96ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 15;
        gridBagConstraints.gridy = 28;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(5, 6, 0, 0);
        jPanel2.add(jButton96, gridBagConstraints);

        jButton97.setBackground(new java.awt.Color(51, 51, 51));
        jButton97.setText("J7");
        jButton97.setMaximumSize(new java.awt.Dimension(45, 23));
        jButton97.setMinimumSize(new java.awt.Dimension(45, 23));
        jButton97.setName("97"); // NOI18N
        jButton97.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton97ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 18;
        gridBagConstraints.gridy = 28;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(5, 6, 0, 0);
        jPanel2.add(jButton97, gridBagConstraints);

        jButton98.setBackground(new java.awt.Color(51, 51, 51));
        jButton98.setText("J8");
        jButton98.setMaximumSize(new java.awt.Dimension(45, 23));
        jButton98.setMinimumSize(new java.awt.Dimension(45, 23));
        jButton98.setName("98"); // NOI18N
        jButton98.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton98ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 21;
        gridBagConstraints.gridy = 28;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(5, 8, 0, 0);
        jPanel2.add(jButton98, gridBagConstraints);

        jButton99.setBackground(new java.awt.Color(51, 51, 51));
        jButton99.setText("J9");
        jButton99.setMaximumSize(new java.awt.Dimension(45, 23));
        jButton99.setMinimumSize(new java.awt.Dimension(45, 23));
        jButton99.setName("99"); // NOI18N
        jButton99.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton99ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 24;
        gridBagConstraints.gridy = 28;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(5, 6, 0, 0);
        jPanel2.add(jButton99, gridBagConstraints);

        jButton100.setBackground(new java.awt.Color(51, 51, 51));
        jButton100.setText("J10");
        jButton100.setMaximumSize(new java.awt.Dimension(51, 23));
        jButton100.setMinimumSize(new java.awt.Dimension(51, 23));
        jButton100.setName("100"); // NOI18N
        jButton100.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton100ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 27;
        gridBagConstraints.gridy = 28;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.gridheight = 3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(7, 4, 0, 0);
        jPanel2.add(jButton100, gridBagConstraints);

        jLabel2.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Fila A");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 31;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(6, 4, 0, 0);
        jPanel2.add(jLabel2, gridBagConstraints);

        jLabel3.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Fila B");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 31;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(5, 4, 0, 0);
        jPanel2.add(jLabel3, gridBagConstraints);

        jLabel4.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Fila C");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 31;
        gridBagConstraints.gridy = 7;
        gridBagConstraints.gridwidth = 4;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 0, 0);
        jPanel2.add(jLabel4, gridBagConstraints);

        jLabel5.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Fila D");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 31;
        gridBagConstraints.gridy = 10;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(5, 4, 0, 0);
        jPanel2.add(jLabel5, gridBagConstraints);

        jLabel6.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Fila E");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 31;
        gridBagConstraints.gridy = 13;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(5, 4, 0, 0);
        jPanel2.add(jLabel6, gridBagConstraints);

        jLabel7.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Fila F");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 31;
        gridBagConstraints.gridy = 16;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(5, 4, 0, 0);
        jPanel2.add(jLabel7, gridBagConstraints);

        jLabel8.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Fila G");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 31;
        gridBagConstraints.gridy = 19;
        gridBagConstraints.gridwidth = 4;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(5, 4, 0, 0);
        jPanel2.add(jLabel8, gridBagConstraints);

        jLabel9.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Fila H");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 31;
        gridBagConstraints.gridy = 22;
        gridBagConstraints.gridwidth = 4;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(5, 4, 0, 0);
        jPanel2.add(jLabel9, gridBagConstraints);

        jLabel10.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Fila I");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 31;
        gridBagConstraints.gridy = 25;
        gridBagConstraints.ipadx = 6;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(6, 2, 0, 0);
        jPanel2.add(jLabel10, gridBagConstraints);

        jLabel11.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Fila J");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 31;
        gridBagConstraints.gridy = 28;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.ipadx = 6;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(6, 0, 0, 0);
        jPanel2.add(jLabel11, gridBagConstraints);

        jLabel12.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("1");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(6, 63, 0, 0);
        jPanel2.add(jLabel12, gridBagConstraints);

        jLabel13.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("2");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(6, 22, 0, 0);
        jPanel2.add(jLabel13, gridBagConstraints);

        jLabel14.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("3");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 6;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(6, 21, 0, 0);
        jPanel2.add(jLabel14, gridBagConstraints);

        jLabel15.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("4");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 9;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(6, 20, 0, 0);
        jPanel2.add(jLabel15, gridBagConstraints);

        jLabel16.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setText("5");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 12;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(6, 21, 0, 0);
        jPanel2.add(jLabel16, gridBagConstraints);

        jLabel17.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setText("6");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 15;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(6, 21, 0, 0);
        jPanel2.add(jLabel17, gridBagConstraints);

        jLabel18.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(255, 255, 255));
        jLabel18.setText("7");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 18;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(6, 23, 0, 0);
        jPanel2.add(jLabel18, gridBagConstraints);

        jLabel19.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(255, 255, 255));
        jLabel19.setText("8");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 21;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(6, 24, 0, 0);
        jPanel2.add(jLabel19, gridBagConstraints);

        jLabel20.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(255, 255, 255));
        jLabel20.setText("9");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 24;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(6, 23, 0, 0);
        jPanel2.add(jLabel20, gridBagConstraints);

        jLabel21.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(255, 255, 255));
        jLabel21.setText("10");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 27;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(6, 21, 0, 0);
        jPanel2.add(jLabel21, gridBagConstraints);

        jPanel3.setOpaque(false);

        jButton101.setBackground(new java.awt.Color(102, 102, 102));
        jButton101.setText("Reservar");
        jButton101.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton101ActionPerformed(evt);
            }
        });

        jButton102.setBackground(new java.awt.Color(102, 102, 102));
        jButton102.setText("Cancelar");
        jButton102.setName("cancelar"); // NOI18N
        jButton102.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton102ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jButton101)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton102))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jButton102))
                    .addComponent(jButton101, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        jPanel4.setBackground(new java.awt.Color(102, 102, 102));

        jLabel22.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vista/green.png"))); // NOI18N

        jLabel23.setText("Disponible");

        jLabel24.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vista/black.png"))); // NOI18N

        jLabel25.setText("Seleccionado");

        jLabel26.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vista/red.png"))); // NOI18N

        jLabel27.setText("Ocupado");

        jLabel28.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vista/blue.png"))); // NOI18N

        jLabel29.setText("Seleccionado por otro");

        jLabel30.setText("Estados de los Asientos");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel22)
                            .addComponent(jLabel24)
                            .addComponent(jLabel26)
                            .addComponent(jLabel28))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel29)
                            .addComponent(jLabel23)
                            .addComponent(jLabel25)
                            .addComponent(jLabel27)))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(jLabel30)))
                .addContainerGap(19, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel30)
                .addGap(7, 7, 7)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel22, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel23, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel24, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel25, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel26, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel27, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel28, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel29, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(26, Short.MAX_VALUE))
        );

        jLabel31.setForeground(new java.awt.Color(255, 255, 255));
        jLabel31.setText("Usuario:");

        user_name.setEditable(false);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(168, 168, 168)
                        .addComponent(jLabel31)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(user_name, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(29, 29, 29)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(47, 47, 47)
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(301, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(122, 122, 122)
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 101, Short.MAX_VALUE)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel31, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(user_name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(50, 50, 50))
        );

        getContentPane().add(jPanel1);
        jPanel1.setBounds(20, 120, 1150, 540);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vista/cortinas.png"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 1260, 853);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton96ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton96ActionPerformed
        // TODO add your handling code here:
        if(value96 == 0){
        value96++;
        count++;
        Asientos_Selecionados.add(jButton96);
        implement_image(jButton96, value96);
        try {
                System.out.println("prereservar");
               // remote.prereserva(Integer.parseInt(jButton1.getName()),Integer.parseInt(user_name.getText()));
               remote.update(Integer.parseInt(jButton96.getName()),3);
            } catch (NumberFormatException | RemoteException e) {
                System.out.println(e);
            }
        }else{
        value96--;
        count--;
        Asientos_Selecionados.remove(jButton96);
        implement_image(jButton96, value96);
        try {
                System.out.println("prereservar");
               // remote.prereserva(Integer.parseInt(jButton1.getName()),Integer.parseInt(user_name.getText()));
               remote.update(Integer.parseInt(jButton96.getName()),1);
            } catch (NumberFormatException | RemoteException e) {
                System.out.println(e);
            }
        }
        
    }//GEN-LAST:event_jButton96ActionPerformed

    private void jButton23ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton23ActionPerformed
        // TODO add your handling code here:
        if(value23 == 0){
        value23++;
        count++;
        Asientos_Selecionados.add(jButton23);
        implement_image(jButton23, value23);
        try {
                System.out.println("prereservar");
               // remote.prereserva(Integer.parseInt(jButton1.getName()),Integer.parseInt(user_name.getText()));
               remote.update(Integer.parseInt(jButton23.getName()),3);
            } catch (NumberFormatException | RemoteException e) {
                System.out.println(e);
            }
        }else{
         value23--;
         count--;
        Asientos_Selecionados.remove(jButton23);
        implement_image(jButton23, value23);
        try {
                System.out.println("prereservar");
               // remote.prereserva(Integer.parseInt(jButton1.getName()),Integer.parseInt(user_name.getText()));
               remote.update(Integer.parseInt(jButton23.getName()),1);
            } catch (NumberFormatException | RemoteException e) {
                System.out.println(e);
            }
        }
    }//GEN-LAST:event_jButton23ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        if(value2 == 0){
        count++;
        value2++;
        Asientos_Selecionados.add(jButton2);
        implement_image(jButton2, value2);
        try {
                System.out.println("prereservar");
               // remote.prereserva(Integer.parseInt(jButton1.getName()),Integer.parseInt(user_name.getText()));
               remote.update(Integer.parseInt(jButton2.getName()),3);
            } catch (NumberFormatException | RemoteException e) {
                System.out.println(e);
            }
        }else{
        count--;
        value2--;
        Asientos_Selecionados.remove(jButton2);
        implement_image(jButton2, value2);
        try {
                System.out.println("prereservar");
               // remote.prereserva(Integer.parseInt(jButton1.getName()),Integer.parseInt(user_name.getText()));
               remote.update(Integer.parseInt(jButton2.getName()),1);
            } catch (NumberFormatException | RemoteException e) {
                System.out.println(e);
            }
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        if(value1 == 0){
        count++;
        value1++;
        Asientos_Selecionados.add(jButton1);
        implement_image(jButton1, value1);
            try {
                System.out.println("prereservar");
               // remote.prereserva(Integer.parseInt(jButton1.getName()),Integer.parseInt(user_name.getText()));
               remote.update(Integer.parseInt(jButton1.getName()),3);
            } catch (NumberFormatException | RemoteException e) {
                System.out.println(e);
            }
        
        }else{   
        count--;
        value1--;
        Asientos_Selecionados.remove(jButton1);
        implement_image(jButton1, value1);
         try {
                //remote.delete(Integer.parseInt(jButton1.getName()),Integer.parseInt(user_name.getText()));
                remote.update(Integer.parseInt(jButton1.getName()), 1);
            } catch (NumberFormatException | RemoteException e) {
                System.out.println(e);
            }
        }
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton12ActionPerformed
        // TODO add your handling code here:
        if(value12 == 0){
        value12++;
        count++;
        Asientos_Selecionados.add(jButton12);
        implement_image(jButton12, value12);
        try {
                System.out.println("prereservar");
               // remote.prereserva(Integer.parseInt(jButton1.getName()),Integer.parseInt(user_name.getText()));
               remote.update(Integer.parseInt(jButton12.getName()),3);
            } catch (NumberFormatException | RemoteException e) {
                System.out.println(e);
            } 
        }else{
         value12--;
         count--;
        Asientos_Selecionados.remove(jButton12);
        implement_image(jButton12, value12);
        try {
                System.out.println("prereservar");
               // remote.prereserva(Integer.parseInt(jButton1.getName()),Integer.parseInt(user_name.getText()));
               remote.update(Integer.parseInt(jButton12.getName()),1);
            } catch (NumberFormatException | RemoteException e) {
                System.out.println(e);
            } 
        }
    }//GEN-LAST:event_jButton12ActionPerformed

    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton11ActionPerformed
        // TODO add your handling code here:
        if(value11 == 0){
        value11++;
        count++;
        Asientos_Selecionados.add(jButton11);
        implement_image(jButton11, value11);
        try {
                System.out.println("prereservar");
               // remote.prereserva(Integer.parseInt(jButton1.getName()),Integer.parseInt(user_name.getText()));
               remote.update(Integer.parseInt(jButton11.getName()),3);
            } catch (NumberFormatException | RemoteException e) {
                System.out.println(e);
            } 
        }else{
        value11--;
        count--;
        Asientos_Selecionados.remove(jButton11);
        implement_image(jButton11, value11);
        try {
                System.out.println("prereservar");
               // remote.prereserva(Integer.parseInt(jButton1.getName()),Integer.parseInt(user_name.getText()));
               remote.update(Integer.parseInt(jButton11.getName()),1);
            } catch (NumberFormatException | RemoteException e) {
                System.out.println(e);
            } 
        }
    }//GEN-LAST:event_jButton11ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        // TODO add your handling code here:
        if(value9 == 0){
        value9++;
        count++;
        Asientos_Selecionados.add(jButton9);
        implement_image(jButton9, value9);
        try {
                System.out.println("prereservar");
               // remote.prereserva(Integer.parseInt(jButton1.getName()),Integer.parseInt(user_name.getText()));
               remote.update(Integer.parseInt(jButton9.getName()),3);
            } catch (NumberFormatException | RemoteException e) {
                System.out.println(e);
            } 
        }else{
        value9--;
        count--;
        Asientos_Selecionados.remove(jButton9);
        implement_image(jButton9, value9);
        try {
                System.out.println("prereservar");
               // remote.prereserva(Integer.parseInt(jButton1.getName()),Integer.parseInt(user_name.getText()));
               remote.update(Integer.parseInt(jButton9.getName()),1);
            } catch (NumberFormatException | RemoteException e) {
                System.out.println(e);
            } 
        }
    }//GEN-LAST:event_jButton9ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        if(value3 == 0){
        count++;
        value3++;
        Asientos_Selecionados.add(jButton3);
        implement_image(jButton3, value3);
        try {
                System.out.println("prereservar");
               // remote.prereserva(Integer.parseInt(jButton1.getName()),Integer.parseInt(user_name.getText()));
               remote.update(Integer.parseInt(jButton3.getName()),3);
            } catch (NumberFormatException | RemoteException e) {
                System.out.println(e);
            }
        }else{
        count--;
        value3--;
        Asientos_Selecionados.remove(jButton3);
        implement_image(jButton3, value3);
        try {
                System.out.println("prereservar");
               // remote.prereserva(Integer.parseInt(jButton1.getName()),Integer.parseInt(user_name.getText()));
               remote.update(Integer.parseInt(jButton1.getName()),1);
            } catch (NumberFormatException | RemoteException e) {
                System.out.println(e);
            }
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        if(value4 == 0){
        count++;
        value4++;
        Asientos_Selecionados.add(jButton4);
        implement_image(jButton4, value4);
        try {
                System.out.println("prereservar");
               // remote.prereserva(Integer.parseInt(jButton1.getName()),Integer.parseInt(user_name.getText()));
               remote.update(Integer.parseInt(jButton4.getName()),3);
            } catch (NumberFormatException | RemoteException e) {
                System.out.println(e);
            }
        }else{
        count--;
        value4--;
        Asientos_Selecionados.remove(jButton4);
        implement_image(jButton4, value4);
        try {
                System.out.println("prereservar");
               // remote.prereserva(Integer.parseInt(jButton1.getName()),Integer.parseInt(user_name.getText()));
               remote.update(Integer.parseInt(jButton4.getName()),1);
            } catch (NumberFormatException | RemoteException e) {
                System.out.println(e);
            }
        }
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        if(value5 == 0){
        count++;
        value5++;
        Asientos_Selecionados.add(jButton5);
        implement_image(jButton5, value5);
        try {
                System.out.println("prereservar");
               // remote.prereserva(Integer.parseInt(jButton1.getName()),Integer.parseInt(user_name.getText()));
               remote.update(Integer.parseInt(jButton5.getName()),3);
            } catch (NumberFormatException | RemoteException e) {
                System.out.println(e);
            }
        }else{
        count--;
        value5--;
        Asientos_Selecionados.remove(jButton5);
        implement_image(jButton5, value5);
        try {
                System.out.println("prereservar");
               // remote.prereserva(Integer.parseInt(jButton1.getName()),Integer.parseInt(user_name.getText()));
               remote.update(Integer.parseInt(jButton5.getName()),1);
            } catch (NumberFormatException | RemoteException e) {
                System.out.println(e);
            }
        }
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
        if(value6 == 0){
        value6++;
        count++;
        Asientos_Selecionados.add(jButton6);
        implement_image(jButton6, value6);
        try {
                System.out.println("prereservar");
               // remote.prereserva(Integer.parseInt(jButton1.getName()),Integer.parseInt(user_name.getText()));
               remote.update(Integer.parseInt(jButton6.getName()),3);
            } catch (NumberFormatException | RemoteException e) {
                System.out.println(e);
            }
        }else{
        value6--;
        count--;
        Asientos_Selecionados.remove(jButton6);
        implement_image(jButton6, value6);
        try {
                System.out.println("prereservar");
               // remote.prereserva(Integer.parseInt(jButton1.getName()),Integer.parseInt(user_name.getText()));
               remote.update(Integer.parseInt(jButton6.getName()),1);
            } catch (NumberFormatException | RemoteException e) {
                System.out.println(e);
            }
        }
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        // TODO add your handling code here:
        if(value7 == 0){
        value7++;
        count++;
        Asientos_Selecionados.add(jButton7);
        implement_image(jButton7, value7);
        try {
                System.out.println("prereservar");
               // remote.prereserva(Integer.parseInt(jButton1.getName()),Integer.parseInt(user_name.getText()));
               remote.update(Integer.parseInt(jButton7.getName()),3);
            } catch (NumberFormatException | RemoteException e) {
                System.out.println(e);
            }
        }else{
        value7--;
        count--;
        Asientos_Selecionados.remove(jButton7);
        implement_image(jButton7, value7);
        try {
                System.out.println("prereservar");
               // remote.prereserva(Integer.parseInt(jButton1.getName()),Integer.parseInt(user_name.getText()));
               remote.update(Integer.parseInt(jButton7.getName()),1);
            } catch (NumberFormatException | RemoteException e) {
                System.out.println(e);
            }
        }
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        // TODO add your handling code here:
        if(value8 == 0){
        value8++;
        count++;
        Asientos_Selecionados.add(jButton8);
        implement_image(jButton8, value8);
        try {
                System.out.println("prereservar");
               // remote.prereserva(Integer.parseInt(jButton1.getName()),Integer.parseInt(user_name.getText()));
               remote.update(Integer.parseInt(jButton8.getName()),3);
            } catch (NumberFormatException | RemoteException e) {
                System.out.println(e);
            }
        }else{
            try {
                System.out.println("prereservar");
               // remote.prereserva(Integer.parseInt(jButton1.getName()),Integer.parseInt(user_name.getText()));
               remote.update(Integer.parseInt(jButton8.getName()),1);
            } catch (NumberFormatException | RemoteException e) {
                System.out.println(e);
            }
        value8--;
        count--;
        Asientos_Selecionados.remove(jButton8);
        implement_image(jButton8, value8);
        }
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
        // TODO add your handling code here:
        if(value10 == 0){
        value10++;
        count++;
        Asientos_Selecionados.add(jButton10);
        implement_image(jButton10, value10);
        try {
                System.out.println("prereservar");
               // remote.prereserva(Integer.parseInt(jButton1.getName()),Integer.parseInt(user_name.getText()));
               remote.update(Integer.parseInt(jButton10.getName()),3);
            } catch (NumberFormatException | RemoteException e) {
                System.out.println(e);
            }
        }else{
        value10--;
        count--;
        Asientos_Selecionados.remove(jButton10);
        implement_image(jButton10, value10);
        try {
                System.out.println("prereservar");
               // remote.prereserva(Integer.parseInt(jButton1.getName()),Integer.parseInt(user_name.getText()));
               remote.update(Integer.parseInt(jButton10.getName()),1);
            } catch (NumberFormatException | RemoteException e) {
                System.out.println(e);
            }
        }
    }//GEN-LAST:event_jButton10ActionPerformed

    private void jButton13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton13ActionPerformed
        // TODO add your handling code here:
        if(value13 == 0){
        value13++;
        count++;
        Asientos_Selecionados.add(jButton13);
        implement_image(jButton13, value13);
        try {
                System.out.println("prereservar");
               // remote.prereserva(Integer.parseInt(jButton1.getName()),Integer.parseInt(user_name.getText()));
               remote.update(Integer.parseInt(jButton13.getName()),3);
            } catch (NumberFormatException | RemoteException e) {
                System.out.println(e);
            }
        }else{
            try {
                System.out.println("prereservar");
               // remote.prereserva(Integer.parseInt(jButton1.getName()),Integer.parseInt(user_name.getText()));
               remote.update(Integer.parseInt(jButton13.getName()),1);
            } catch (NumberFormatException | RemoteException e) {
                System.out.println(e);
            }
        value11--;
        count--;
        Asientos_Selecionados.remove(jButton13);
        implement_image(jButton13, value13);
        }
    }//GEN-LAST:event_jButton13ActionPerformed

    private void jButton14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton14ActionPerformed
        // TODO add your handling code here:
        if(value14 == 0){
        value14++;
        count++;
        Asientos_Selecionados.add(jButton14);
        implement_image(jButton14, value14);
        try {
                System.out.println("prereservar");
               // remote.prereserva(Integer.parseInt(jButton1.getName()),Integer.parseInt(user_name.getText()));
               remote.update(Integer.parseInt(jButton14.getName()),3);
            } catch (NumberFormatException | RemoteException e) {
                System.out.println(e);
            }
        }else{
            try {
                System.out.println("prereservar");
               // remote.prereserva(Integer.parseInt(jButton1.getName()),Integer.parseInt(user_name.getText()));
               remote.update(Integer.parseInt(jButton14.getName()),1);
            } catch (NumberFormatException | RemoteException e) {
                System.out.println(e);
            }
        value14--;
        count--;
        Asientos_Selecionados.remove(jButton14);
        implement_image(jButton14, value14);
        }
    }//GEN-LAST:event_jButton14ActionPerformed

    private void jButton15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton15ActionPerformed
        // TODO add your handling code here:
        if(value15 == 0){
        value15++;
        count++;
        Asientos_Selecionados.add(jButton15);
        implement_image(jButton15, value15);
        try {
                System.out.println("prereservar");
               // remote.prereserva(Integer.parseInt(jButton1.getName()),Integer.parseInt(user_name.getText()));
               remote.update(Integer.parseInt(jButton15.getName()),3);
            } catch (NumberFormatException | RemoteException e) {
                System.out.println(e);
            }
        }else{
            try {
                System.out.println("prereservar");
               // remote.prereserva(Integer.parseInt(jButton1.getName()),Integer.parseInt(user_name.getText()));
               remote.update(Integer.parseInt(jButton15.getName()),1);
            } catch (NumberFormatException | RemoteException e) {
                System.out.println(e);
            }
        value15--;
        count--;
        Asientos_Selecionados.remove(jButton15);
        implement_image(jButton15, value15);
        }
    }//GEN-LAST:event_jButton15ActionPerformed

    private void jButton16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton16ActionPerformed
        // TODO add your handling code here:
        if(value16 == 0){
        value16++;
        count++;
        Asientos_Selecionados.add(jButton16);
        implement_image(jButton16, value16);
        try {
                System.out.println("prereservar");
               // remote.prereserva(Integer.parseInt(jButton1.getName()),Integer.parseInt(user_name.getText()));
               remote.update(Integer.parseInt(jButton16.getName()),3);
            } catch (NumberFormatException | RemoteException e) {
                System.out.println(e);
            }
        }else{
        value16--;
        count--;
        Asientos_Selecionados.remove(jButton16);
        implement_image(jButton16, value16);
        try {
                System.out.println("prereservar");
               // remote.prereserva(Integer.parseInt(jButton1.getName()),Integer.parseInt(user_name.getText()));
               remote.update(Integer.parseInt(jButton16.getName()),1);
            } catch (NumberFormatException | RemoteException e) {
                System.out.println(e);
            }
        }
        
    }//GEN-LAST:event_jButton16ActionPerformed

    private void jButton17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton17ActionPerformed
        // TODO add your handling code here:
        if(value17 == 0){
        value17++;
        count++;
        Asientos_Selecionados.add(jButton17);
        implement_image(jButton17, value17);
        try {
                System.out.println("prereservar");
               // remote.prereserva(Integer.parseInt(jButton1.getName()),Integer.parseInt(user_name.getText()));
               remote.update(Integer.parseInt(jButton17.getName()),3);
            } catch (NumberFormatException | RemoteException e) {
                System.out.println(e);
            }
        }else{
        value17--;
        count--;
        Asientos_Selecionados.remove(jButton17);
        implement_image(jButton17, value17);
        try {
                System.out.println("prereservar");
               // remote.prereserva(Integer.parseInt(jButton1.getName()),Integer.parseInt(user_name.getText()));
               remote.update(Integer.parseInt(jButton17.getName()),1);
            } catch (NumberFormatException | RemoteException e) {
                System.out.println(e);
            }
        }
    }//GEN-LAST:event_jButton17ActionPerformed

    private void jButton18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton18ActionPerformed
        // TODO add your handling code here:
        if(value18 == 0){
        value18++;
        count++;
        Asientos_Selecionados.add(jButton18);
        implement_image(jButton18, value18);
        try {
                System.out.println("prereservar");
               // remote.prereserva(Integer.parseInt(jButton1.getName()),Integer.parseInt(user_name.getText()));
               remote.update(Integer.parseInt(jButton18.getName()),3);
            } catch (NumberFormatException | RemoteException e) {
                System.out.println(e);
            }
        }else{
        value18--;
        count--;
        Asientos_Selecionados.remove(jButton18);
        implement_image(jButton18, value18);
        try {
                System.out.println("prereservar");
               // remote.prereserva(Integer.parseInt(jButton1.getName()),Integer.parseInt(user_name.getText()));
               remote.update(Integer.parseInt(jButton18.getName()),1);
            } catch (NumberFormatException | RemoteException e) {
                System.out.println(e);
            }
        }
    }//GEN-LAST:event_jButton18ActionPerformed

    private void jButton19ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton19ActionPerformed
        // TODO add your handling code here:
        if(value19 == 0){
        value19++;
        count++;
        Asientos_Selecionados.add(jButton19);
        implement_image(jButton19, value19);
        try {
                System.out.println("prereservar");
               // remote.prereserva(Integer.parseInt(jButton1.getName()),Integer.parseInt(user_name.getText()));
               remote.update(Integer.parseInt(jButton19.getName()),3);
            } catch (NumberFormatException | RemoteException e) {
                System.out.println(e);
            } 
        }else{
        value19--;
        count--;
        Asientos_Selecionados.remove(jButton19);
        implement_image(jButton19, value19);
        try {
                System.out.println("prereservar");
               // remote.prereserva(Integer.parseInt(jButton1.getName()),Integer.parseInt(user_name.getText()));
               remote.update(Integer.parseInt(jButton19.getName()),1);
            } catch (NumberFormatException | RemoteException e) {
                System.out.println(e);
            } 
        }
    }//GEN-LAST:event_jButton19ActionPerformed

    private void jButton20ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton20ActionPerformed
        // TODO add your handling code here:
        if(value20 == 0){
        value20++;
        count++;
        Asientos_Selecionados.add(jButton20);
        implement_image(jButton20, value20);
        try {
                System.out.println("prereservar");
               // remote.prereserva(Integer.parseInt(jButton1.getName()),Integer.parseInt(user_name.getText()));
               remote.update(Integer.parseInt(jButton20.getName()),3);
            } catch (NumberFormatException | RemoteException e) {
                System.out.println(e);
            } 
        }else{
        value20--;
        count--;
        Asientos_Selecionados.remove(jButton20);
        implement_image(jButton20, value20);
        try {
                System.out.println("prereservar");
               // remote.prereserva(Integer.parseInt(jButton1.getName()),Integer.parseInt(user_name.getText()));
               remote.update(Integer.parseInt(jButton20.getName()),1);
            } catch (NumberFormatException | RemoteException e) {
                System.out.println(e);
            } 
        }
    }//GEN-LAST:event_jButton20ActionPerformed

    private void jButton21ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton21ActionPerformed
        // TODO add your handling code here:
        if(value21 == 0){
        value21++;
        count++;
        Asientos_Selecionados.add(jButton21);
        implement_image(jButton21, value21);
        try {
                System.out.println("prereservar");
               // remote.prereserva(Integer.parseInt(jButton1.getName()),Integer.parseInt(user_name.getText()));
               remote.update(Integer.parseInt(jButton21.getName()),3);
            } catch (NumberFormatException | RemoteException e) {
                System.out.println(e);
            } 
        }else{
        value21--;
        count--;
        Asientos_Selecionados.remove(jButton21);
        implement_image(jButton21, value21);
        try {
                System.out.println("prereservar");
               // remote.prereserva(Integer.parseInt(jButton1.getName()),Integer.parseInt(user_name.getText()));
               remote.update(Integer.parseInt(jButton21.getName()),1);
            } catch (NumberFormatException | RemoteException e) {
                System.out.println(e);
            } 
        }
    }//GEN-LAST:event_jButton21ActionPerformed

    private void jButton22ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton22ActionPerformed
        // TODO add your handling code here:
        if(value22 == 0){
        value22++;
        count++;
        Asientos_Selecionados.add(jButton22);
        implement_image(jButton22, value22);
        try {
                System.out.println("prereservar");
               // remote.prereserva(Integer.parseInt(jButton1.getName()),Integer.parseInt(user_name.getText()));
               remote.update(Integer.parseInt(jButton22.getName()),3);
            } catch (NumberFormatException | RemoteException e) {
                System.out.println(e);
            } 
        }else{
            try {
                System.out.println("prereservar");
               // remote.prereserva(Integer.parseInt(jButton1.getName()),Integer.parseInt(user_name.getText()));
               remote.update(Integer.parseInt(jButton22.getName()),1);
            } catch (NumberFormatException | RemoteException e) {
                System.out.println(e);
            } 
        value22--;
        count--;
        Asientos_Selecionados.remove(jButton22);
        implement_image(jButton22, value22);
        }
    }//GEN-LAST:event_jButton22ActionPerformed

    private void jButton24ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton24ActionPerformed
        // TODO add your handling code here:
        if(value24 == 0){
        value24++;
        count++;
        Asientos_Selecionados.add(jButton24);
        implement_image(jButton24, value24);
        try {
                System.out.println("prereservar");
               // remote.prereserva(Integer.parseInt(jButton1.getName()),Integer.parseInt(user_name.getText()));
               remote.update(Integer.parseInt(jButton24.getName()),3);
            } catch (NumberFormatException | RemoteException e) {
                System.out.println(e);
            } 
        }else{
        value24--;
        count--;
        Asientos_Selecionados.remove(jButton24);
        implement_image(jButton24, value24);
        try {
                System.out.println("prereservar");
               // remote.prereserva(Integer.parseInt(jButton1.getName()),Integer.parseInt(user_name.getText()));
               remote.update(Integer.parseInt(jButton24.getName()),1);
            } catch (NumberFormatException | RemoteException e) {
                System.out.println(e);
            } 
        }
    }//GEN-LAST:event_jButton24ActionPerformed

    private void jButton25ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton25ActionPerformed
        // TODO add your handling code here:
        if(value25== 0){
        value25++;
        count++;
        Asientos_Selecionados.add(jButton25);
        implement_image(jButton25, value25);
        try {
                System.out.println("prereservar");
               // remote.prereserva(Integer.parseInt(jButton1.getName()),Integer.parseInt(user_name.getText()));
               remote.update(Integer.parseInt(jButton25.getName()),3);
            } catch (NumberFormatException | RemoteException e) {
                System.out.println(e);
            } 
        }else{
        value25--;
        count--;
        Asientos_Selecionados.remove(jButton25);
        implement_image(jButton25, value25);
        try {
                System.out.println("prereservar");
               // remote.prereserva(Integer.parseInt(jButton1.getName()),Integer.parseInt(user_name.getText()));
               remote.update(Integer.parseInt(jButton25.getName()),1);
            } catch (NumberFormatException | RemoteException e) {
                System.out.println(e);
            } 
        }
    }//GEN-LAST:event_jButton25ActionPerformed

    private void jButton26ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton26ActionPerformed
        // TODO add your handling code here:
        if(value26 == 0){
        value26++;
        count++;
        Asientos_Selecionados.add(jButton26);
        implement_image(jButton26, value26);
        try {
                System.out.println("prereservar");
               // remote.prereserva(Integer.parseInt(jButton1.getName()),Integer.parseInt(user_name.getText()));
               remote.update(Integer.parseInt(jButton26.getName()),3);
            } catch (NumberFormatException | RemoteException e) {
                System.out.println(e);
            } 
        }else{
        value26--;
        count--;
        Asientos_Selecionados.remove(jButton26);
        implement_image(jButton26, value26);
        try {
                System.out.println("prereservar");
               // remote.prereserva(Integer.parseInt(jButton1.getName()),Integer.parseInt(user_name.getText()));
               remote.update(Integer.parseInt(jButton26.getName()),1);
            } catch (NumberFormatException | RemoteException e) {
                System.out.println(e);
            } 
        }
    }//GEN-LAST:event_jButton26ActionPerformed

    private void jButton27ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton27ActionPerformed
        // TODO add your handling code here:
        if(value27 == 0){
        value27++;
        count++;
        Asientos_Selecionados.add(jButton27);
        implement_image(jButton27, value27);
        try {
                System.out.println("prereservar");
               // remote.prereserva(Integer.parseInt(jButton1.getName()),Integer.parseInt(user_name.getText()));
               remote.update(Integer.parseInt(jButton27.getName()),3);
            } catch (NumberFormatException | RemoteException e) {
                System.out.println(e);
            } 
        }else{
        value27--;
        count--;
        Asientos_Selecionados.remove(jButton27);
        implement_image(jButton27, value27);
        try {
                System.out.println("prereservar");
               // remote.prereserva(Integer.parseInt(jButton1.getName()),Integer.parseInt(user_name.getText()));
               remote.update(Integer.parseInt(jButton27.getName()),3);
            } catch (NumberFormatException | RemoteException e) {
                System.out.println(e);
            } 
        }
    }//GEN-LAST:event_jButton27ActionPerformed

    private void jButton28ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton28ActionPerformed
        // TODO add your handling code here:
        if(value28 == 0){
        value28++;
        count++;
        Asientos_Selecionados.add(jButton28);
        implement_image(jButton28, value28);
        try {
                System.out.println("prereservar");
               // remote.prereserva(Integer.parseInt(jButton1.getName()),Integer.parseInt(user_name.getText()));
               remote.update(Integer.parseInt(jButton28.getName()),3);
            } catch (NumberFormatException | RemoteException e) {
                System.out.println(e);
            } 
        }else{
        value28--;
        count--;
        Asientos_Selecionados.remove(jButton28);
        implement_image(jButton28, value28);
        try {
                System.out.println("prereservar");
               // remote.prereserva(Integer.parseInt(jButton1.getName()),Integer.parseInt(user_name.getText()));
               remote.update(Integer.parseInt(jButton28.getName()),3);
            } catch (NumberFormatException | RemoteException e) {
                System.out.println(e);
            } 
        }
    }//GEN-LAST:event_jButton28ActionPerformed

    private void jButton29ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton29ActionPerformed
        // TODO add your handling code here:
        if(value29 == 0){
        value29++;
        count++;
        Asientos_Selecionados.add(jButton29);
        implement_image(jButton29, value29);
        try {
                System.out.println("prereservar");
               // remote.prereserva(Integer.parseInt(jButton1.getName()),Integer.parseInt(user_name.getText()));
               remote.update(Integer.parseInt(jButton29.getName()),3);
            } catch (NumberFormatException | RemoteException e) {
                System.out.println(e);
            } 
        }else{
        value29--;
        count--;
        Asientos_Selecionados.remove(jButton29);
        implement_image(jButton29, value29);
        try {
                System.out.println("prereservar");
               // remote.prereserva(Integer.parseInt(jButton1.getName()),Integer.parseInt(user_name.getText()));
               remote.update(Integer.parseInt(jButton29.getName()),1);
            } catch (NumberFormatException | RemoteException e) {
                System.out.println(e);
            } 
        }
    }//GEN-LAST:event_jButton29ActionPerformed

    private void jButton30ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton30ActionPerformed
        // TODO add your handling code here:
        if(value30 == 0){
        value30++;
        count++;
        Asientos_Selecionados.add(jButton9);
        implement_image(jButton30, value30);
        try {
                System.out.println("prereservar");
               // remote.prereserva(Integer.parseInt(jButton1.getName()),Integer.parseInt(user_name.getText()));
               remote.update(Integer.parseInt(jButton30.getName()),3);
            } catch (NumberFormatException | RemoteException e) {
                System.out.println(e);
            } 
        }else{
        value30--;
        count--;
        Asientos_Selecionados.remove(jButton30);
        implement_image(jButton30, value30);
        try {
                System.out.println("prereservar");
               // remote.prereserva(Integer.parseInt(jButton1.getName()),Integer.parseInt(user_name.getText()));
               remote.update(Integer.parseInt(jButton30.getName()),1);
            } catch (NumberFormatException | RemoteException e) {
                System.out.println(e);
            } 
        }
    }//GEN-LAST:event_jButton30ActionPerformed

    private void jButton102ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton102ActionPerformed
        // TODO add your handling code here:
       int resp = javax.swing.JOptionPane.showConfirmDialog(null, "¿Estas seguro?", "¡Alerta!", javax.swing.JOptionPane.YES_NO_OPTION);
       if(resp == 0){
           for (int i = 0; i < Asientos_Selecionados.size(); i++) {
               try {
                   remote.update(Integer.parseInt(Asientos_Selecionados.get(i).getName()), 1);
               } catch (NumberFormatException | RemoteException e) {
                   System.out.println(e);
               }
           }
       Asientos_Selecionados.clear();
       count= 0;
       }
        System.out.println(resp);
    }//GEN-LAST:event_jButton102ActionPerformed

    private void jButton31ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton31ActionPerformed
        // TODO add your handling code here:
        if(value31 == 0){
        value31++;
        count++;
        Asientos_Selecionados.add(jButton31);
        implement_image(jButton31, value31);
        try {
                System.out.println("prereservar");
               // remote.prereserva(Integer.parseInt(jButton1.getName()),Integer.parseInt(user_name.getText()));
               remote.update(Integer.parseInt(jButton31.getName()),3);
            } catch (NumberFormatException | RemoteException e) {
                System.out.println(e);
            } 
        }else{
        value31--;
        count--;
        Asientos_Selecionados.remove(jButton31);
        implement_image(jButton31, value31);
        try {
                System.out.println("prereservar");
               // remote.prereserva(Integer.parseInt(jButton1.getName()),Integer.parseInt(user_name.getText()));
               remote.update(Integer.parseInt(jButton31.getName()),1);
            } catch (NumberFormatException | RemoteException e) {
                System.out.println(e);
            } 
        }
    }//GEN-LAST:event_jButton31ActionPerformed

    private void jButton32ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton32ActionPerformed
        // TODO add your handling code here:
        if(value32 == 0){
        value32++;
        count++;
        Asientos_Selecionados.add(jButton32);
        implement_image(jButton32, value32);
        try {
                System.out.println("prereservar");
               // remote.prereserva(Integer.parseInt(jButton1.getName()),Integer.parseInt(user_name.getText()));
               remote.update(Integer.parseInt(jButton32.getName()),3);
            } catch (NumberFormatException | RemoteException e) {
                System.out.println(e);
            } 
        }else{
        value32--;
        count--;
        Asientos_Selecionados.remove(jButton32);
        implement_image(jButton32, value32);
        try {
                System.out.println("prereservar");
               // remote.prereserva(Integer.parseInt(jButton1.getName()),Integer.parseInt(user_name.getText()));
               remote.update(Integer.parseInt(jButton32.getName()),1);
            } catch (NumberFormatException | RemoteException e) {
                System.out.println(e);
            } 
        }
    }//GEN-LAST:event_jButton32ActionPerformed

    private void jButton33ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton33ActionPerformed
        // TODO add your handling code here:
        if(value33 == 0){
        value33++;
        count++;
        Asientos_Selecionados.add(jButton33);
        implement_image(jButton33, value33);
        try {
                System.out.println("prereservar");
               // remote.prereserva(Integer.parseInt(jButton1.getName()),Integer.parseInt(user_name.getText()));
               remote.update(Integer.parseInt(jButton33.getName()),3);
            } catch (NumberFormatException | RemoteException e) {
                System.out.println(e);
            } 
        }else{
        value33--;
        count--;
        Asientos_Selecionados.remove(jButton33);
        implement_image(jButton33, value33);
        try {
                System.out.println("prereservar");
               // remote.prereserva(Integer.parseInt(jButton1.getName()),Integer.parseInt(user_name.getText()));
               remote.update(Integer.parseInt(jButton33.getName()),1);
            } catch (NumberFormatException | RemoteException e) {
                System.out.println(e);
            } 
        }
    }//GEN-LAST:event_jButton33ActionPerformed

    private void jButton34ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton34ActionPerformed
        // TODO add your handling code here:
        if(value34 == 0){
        value34++;
        count++;
        Asientos_Selecionados.add(jButton34);
        implement_image(jButton34, value34);
        try {
                System.out.println("prereservar");
               // remote.prereserva(Integer.parseInt(jButton1.getName()),Integer.parseInt(user_name.getText()));
               remote.update(Integer.parseInt(jButton34.getName()),3);
            } catch (NumberFormatException | RemoteException e) {
                System.out.println(e);
            } 
        }else{
        value34--;
        count--;
        Asientos_Selecionados.remove(jButton34);
        implement_image(jButton34, value34);
        try {
                System.out.println("prereservar");
               // remote.prereserva(Integer.parseInt(jButton1.getName()),Integer.parseInt(user_name.getText()));
               remote.update(Integer.parseInt(jButton34.getName()),1);
            } catch (NumberFormatException | RemoteException e) {
                System.out.println(e);
            } 
        }
    }//GEN-LAST:event_jButton34ActionPerformed

    private void jButton35ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton35ActionPerformed
        // TODO add your handling code here:
        if(value35 == 0){
        value35++;
        count++;
        Asientos_Selecionados.add(jButton35);
        implement_image(jButton35, value35);
        try {
                System.out.println("prereservar");
               // remote.prereserva(Integer.parseInt(jButton1.getName()),Integer.parseInt(user_name.getText()));
               remote.update(Integer.parseInt(jButton35.getName()),3);
            } catch (NumberFormatException | RemoteException e) {
                System.out.println(e);
            } 
        }else{
        value35--;
        count--;
        Asientos_Selecionados.remove(jButton35);
        implement_image(jButton35, value35);
        try {
                System.out.println("prereservar");
               // remote.prereserva(Integer.parseInt(jButton1.getName()),Integer.parseInt(user_name.getText()));
               remote.update(Integer.parseInt(jButton35.getName()),1);
            } catch (NumberFormatException | RemoteException e) {
                System.out.println(e);
            } 
        }
    }//GEN-LAST:event_jButton35ActionPerformed

    private void jButton36ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton36ActionPerformed
        // TODO add your handling code here:
        if(value36 == 0){
        value36++;
        count++;
        Asientos_Selecionados.add(jButton36);
        implement_image(jButton36, value36);
        try {
                System.out.println("prereservar");
               // remote.prereserva(Integer.parseInt(jButton1.getName()),Integer.parseInt(user_name.getText()));
               remote.update(Integer.parseInt(jButton36.getName()),3);
            } catch (NumberFormatException | RemoteException e) {
                System.out.println(e);
            } 
        }else{
        value36--;
        count--;
        Asientos_Selecionados.remove(jButton36);
        implement_image(jButton36, value36);
        try {
                System.out.println("prereservar");
               // remote.prereserva(Integer.parseInt(jButton1.getName()),Integer.parseInt(user_name.getText()));
               remote.update(Integer.parseInt(jButton36.getName()),1);
            } catch (NumberFormatException | RemoteException e) {
                System.out.println(e);
            } 
        }
    }//GEN-LAST:event_jButton36ActionPerformed

    private void jButton37ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton37ActionPerformed
        // TODO add your handling code here:
        if(value37 == 0){
        value37++;
        count++;
        Asientos_Selecionados.add(jButton37);
        implement_image(jButton37, value37);
        try {
                System.out.println("prereservar");
               // remote.prereserva(Integer.parseInt(jButton1.getName()),Integer.parseInt(user_name.getText()));
               remote.update(Integer.parseInt(jButton37.getName()),3);
            } catch (NumberFormatException | RemoteException e) {
                System.out.println(e);
            } 
        }else{
        value37--;
        count--;
        Asientos_Selecionados.remove(jButton37);
        implement_image(jButton37, value37);
        try {
                System.out.println("prereservar");
               // remote.prereserva(Integer.parseInt(jButton1.getName()),Integer.parseInt(user_name.getText()));
               remote.update(Integer.parseInt(jButton37.getName()),1);
            } catch (NumberFormatException | RemoteException e) {
                System.out.println(e);
            } 
        }
    }//GEN-LAST:event_jButton37ActionPerformed

    private void jButton38ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton38ActionPerformed
        // TODO add your handling code here:
        if(value38 == 0){
        value38++;
        count++;
        Asientos_Selecionados.add(jButton38);
        implement_image(jButton38, value38);
        try {
                System.out.println("prereservar");
               // remote.prereserva(Integer.parseInt(jButton1.getName()),Integer.parseInt(user_name.getText()));
               remote.update(Integer.parseInt(jButton38.getName()),3);
            } catch (NumberFormatException | RemoteException e) {
                System.out.println(e);
            } 
        }else{
        value38--;
        count--;
        Asientos_Selecionados.remove(jButton38);
        implement_image(jButton38, value38);
        try {
                System.out.println("prereservar");
               // remote.prereserva(Integer.parseInt(jButton1.getName()),Integer.parseInt(user_name.getText()));
               remote.update(Integer.parseInt(jButton38.getName()),1);
            } catch (NumberFormatException | RemoteException e) {
                System.out.println(e);
            } 
        }
    }//GEN-LAST:event_jButton38ActionPerformed

    private void jButton39ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton39ActionPerformed
        // TODO add your handling code here:
        if(value39 == 0){
        value39++;
        count++;
        Asientos_Selecionados.add(jButton39);
        implement_image(jButton39, value39);
        try {
                System.out.println("prereservar");
               // remote.prereserva(Integer.parseInt(jButton1.getName()),Integer.parseInt(user_name.getText()));
               remote.update(Integer.parseInt(jButton39.getName()),3);
            } catch (NumberFormatException | RemoteException e) {
                System.out.println(e);
            } 
        }else{
        value39--;
        count--;
        Asientos_Selecionados.remove(jButton39);
        implement_image(jButton39, value39);
        try {
                System.out.println("prereservar");
               // remote.prereserva(Integer.parseInt(jButton1.getName()),Integer.parseInt(user_name.getText()));
               remote.update(Integer.parseInt(jButton39.getName()),1);
            } catch (NumberFormatException | RemoteException e) {
                System.out.println(e);
            } 
        }
    }//GEN-LAST:event_jButton39ActionPerformed

    private void jButton40ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton40ActionPerformed
        // TODO add your handling code here:
        if(value40 == 0){
        value40++;
        count++;
        Asientos_Selecionados.add(jButton40);
        implement_image(jButton40, value40);
        try {
                System.out.println("prereservar");
               // remote.prereserva(Integer.parseInt(jButton1.getName()),Integer.parseInt(user_name.getText()));
               remote.update(Integer.parseInt(jButton40.getName()),3);
            } catch (NumberFormatException | RemoteException e) {
                System.out.println(e);
            } 
        }else{
        value40--;
        count--;
        Asientos_Selecionados.remove(jButton40);
        implement_image(jButton40, value40);
        try {
                System.out.println("prereservar");
               // remote.prereserva(Integer.parseInt(jButton1.getName()),Integer.parseInt(user_name.getText()));
               remote.update(Integer.parseInt(jButton40.getName()),1);
            } catch (NumberFormatException | RemoteException e) {
                System.out.println(e);
            } 
        }
    }//GEN-LAST:event_jButton40ActionPerformed

    private void jButton41ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton41ActionPerformed
        // TODO add your handling code here:
         if(value41 == 0){
        value41++;
        count++;
        Asientos_Selecionados.add(jButton41);
        implement_image(jButton41, value41);
        try {
                System.out.println("prereservar");
               // remote.prereserva(Integer.parseInt(jButton1.getName()),Integer.parseInt(user_name.getText()));
               remote.update(Integer.parseInt(jButton41.getName()),3);
            } catch (NumberFormatException | RemoteException e) {
                System.out.println(e);
            } 
        }else{
        value41--;
        count--;
        Asientos_Selecionados.remove(jButton41);
        implement_image(jButton41, value41);
        try {
                System.out.println("prereservar");
               // remote.prereserva(Integer.parseInt(jButton1.getName()),Integer.parseInt(user_name.getText()));
               remote.update(Integer.parseInt(jButton41.getName()),1);
            } catch (NumberFormatException | RemoteException e) {
                System.out.println(e);
            } 
        }
    }//GEN-LAST:event_jButton41ActionPerformed

    private void jButton42ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton42ActionPerformed
        // TODO add your handling code here:
         if(value42 == 0){
        value42++;
        count++;
        Asientos_Selecionados.add(jButton42);
        implement_image(jButton42, value42);
        try {
                System.out.println("prereservar");
               // remote.prereserva(Integer.parseInt(jButton1.getName()),Integer.parseInt(user_name.getText()));
               remote.update(Integer.parseInt(jButton42.getName()),3);
            } catch (NumberFormatException | RemoteException e) {
                System.out.println(e);
            } 
        }else{
        value42--;
        count--;
        Asientos_Selecionados.remove(jButton42);
        implement_image(jButton42, value42);
        try {
                System.out.println("prereservar");
               // remote.prereserva(Integer.parseInt(jButton1.getName()),Integer.parseInt(user_name.getText()));
               remote.update(Integer.parseInt(jButton42.getName()),1);
            } catch (NumberFormatException | RemoteException e) {
                System.out.println(e);
            } 
        }
    }//GEN-LAST:event_jButton42ActionPerformed

    private void jButton43ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton43ActionPerformed
        // TODO add your handling code here:
         if(value43 == 0){
        value43++;
        count++;
        Asientos_Selecionados.add(jButton43);
        implement_image(jButton43, value43);
        try {
                System.out.println("prereservar");
               // remote.prereserva(Integer.parseInt(jButton1.getName()),Integer.parseInt(user_name.getText()));
               remote.update(Integer.parseInt(jButton43.getName()),3);
            } catch (NumberFormatException | RemoteException e) {
                System.out.println(e);
            } 
        }else{
        value43--;
        count--;
        Asientos_Selecionados.remove(jButton43);
        implement_image(jButton43, value43);
        try {
                System.out.println("prereservar");
               // remote.prereserva(Integer.parseInt(jButton1.getName()),Integer.parseInt(user_name.getText()));
               remote.update(Integer.parseInt(jButton43.getName()),1);
            } catch (NumberFormatException | RemoteException e) {
                System.out.println(e);
            } 
        }
    }//GEN-LAST:event_jButton43ActionPerformed

    private void jButton44ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton44ActionPerformed
        // TODO add your handling code here:
         if(value44 == 0){
        value44++;
        count++;
        Asientos_Selecionados.add(jButton44);
        implement_image(jButton44, value44);
        try {
                System.out.println("prereservar");
               // remote.prereserva(Integer.parseInt(jButton1.getName()),Integer.parseInt(user_name.getText()));
               remote.update(Integer.parseInt(jButton44.getName()),3);
            } catch (NumberFormatException | RemoteException e) {
                System.out.println(e);
            } 
        }else{
        value44--;
        count--;
        Asientos_Selecionados.remove(jButton44);
        implement_image(jButton44, value44);
        try {
                System.out.println("prereservar");
               // remote.prereserva(Integer.parseInt(jButton1.getName()),Integer.parseInt(user_name.getText()));
               remote.update(Integer.parseInt(jButton44.getName()),1);
            } catch (NumberFormatException | RemoteException e) {
                System.out.println(e);
            } 
        }
    }//GEN-LAST:event_jButton44ActionPerformed

    private void jButton45ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton45ActionPerformed
        // TODO add your handling code here:
         if(value45 == 0){
        value45++;
        count++;
        Asientos_Selecionados.add(jButton45);
        implement_image(jButton45, value45);
        try {
                System.out.println("prereservar");
               // remote.prereserva(Integer.parseInt(jButton1.getName()),Integer.parseInt(user_name.getText()));
               remote.update(Integer.parseInt(jButton45.getName()),3);
            } catch (NumberFormatException | RemoteException e) {
                System.out.println(e);
            } 
        }else{
        value45--;
        count--;
        Asientos_Selecionados.remove(jButton45);
        implement_image(jButton45, value45);
        try {
                System.out.println("prereservar");
               // remote.prereserva(Integer.parseInt(jButton1.getName()),Integer.parseInt(user_name.getText()));
               remote.update(Integer.parseInt(jButton45.getName()),1);
            } catch (NumberFormatException | RemoteException e) {
                System.out.println(e);
            } 
        }
    }//GEN-LAST:event_jButton45ActionPerformed

    private void jButton46ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton46ActionPerformed
        // TODO add your handling code here:
         if(value46 == 0){
        value46++;
        count++;
        Asientos_Selecionados.add(jButton46);
        implement_image(jButton46, value46);
        try {
                System.out.println("prereservar");
               // remote.prereserva(Integer.parseInt(jButton1.getName()),Integer.parseInt(user_name.getText()));
               remote.update(Integer.parseInt(jButton46.getName()),3);
            } catch (NumberFormatException | RemoteException e) {
                System.out.println(e);
            } 
        }else{
        value46--;
        count--;
        Asientos_Selecionados.remove(jButton46);
        implement_image(jButton46, value46);
        try {
                System.out.println("prereservar");
               // remote.prereserva(Integer.parseInt(jButton1.getName()),Integer.parseInt(user_name.getText()));
               remote.update(Integer.parseInt(jButton46.getName()),1);
            } catch (NumberFormatException | RemoteException e) {
                System.out.println(e);
            } 
        }
    }//GEN-LAST:event_jButton46ActionPerformed

    private void jButton47ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton47ActionPerformed
        // TODO add your handling code here:
         if(value47 == 0){
        value47++;
        count++;
        Asientos_Selecionados.add(jButton47);
        implement_image(jButton47, value47);
        try {
                System.out.println("prereservar");
               // remote.prereserva(Integer.parseInt(jButton1.getName()),Integer.parseInt(user_name.getText()));
               remote.update(Integer.parseInt(jButton47.getName()),3);
            } catch (NumberFormatException | RemoteException e) {
                System.out.println(e);
            } 
        }else{
        value47--;
        count--;
        Asientos_Selecionados.remove(jButton47);
        implement_image(jButton47, value47);
        try {
                System.out.println("prereservar");
               // remote.prereserva(Integer.parseInt(jButton1.getName()),Integer.parseInt(user_name.getText()));
               remote.update(Integer.parseInt(jButton47.getName()),1);
            } catch (NumberFormatException | RemoteException e) {
                System.out.println(e);
            } 
        }
    }//GEN-LAST:event_jButton47ActionPerformed

    private void jButton48ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton48ActionPerformed
        // TODO add your handling code here:
         if(value48 == 0){
        value48++;
        count++;
        Asientos_Selecionados.add(jButton48);
        implement_image(jButton48, value48);
        try {
                System.out.println("prereservar");
               // remote.prereserva(Integer.parseInt(jButton1.getName()),Integer.parseInt(user_name.getText()));
               remote.update(Integer.parseInt(jButton48.getName()),3);
            } catch (NumberFormatException | RemoteException e) {
                System.out.println(e);
            } 
        }else{
        value48--;
        count--;
        Asientos_Selecionados.remove(jButton48);
        implement_image(jButton48, value48);
        try {
                System.out.println("prereservar");
               // remote.prereserva(Integer.parseInt(jButton1.getName()),Integer.parseInt(user_name.getText()));
               remote.update(Integer.parseInt(jButton48.getName()),1);
            } catch (NumberFormatException | RemoteException e) {
                System.out.println(e);
            } 
        }
    }//GEN-LAST:event_jButton48ActionPerformed

    private void jButton49ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton49ActionPerformed
        // TODO add your handling code here:
         if(value49 == 0){
        value49++;
        count++;
        Asientos_Selecionados.add(jButton49);
        implement_image(jButton49, value49);
        try {
                System.out.println("prereservar");
               // remote.prereserva(Integer.parseInt(jButton1.getName()),Integer.parseInt(user_name.getText()));
               remote.update(Integer.parseInt(jButton49.getName()),3);
            } catch (NumberFormatException | RemoteException e) {
                System.out.println(e);
            } 
        }else{
        value49--;
        count--;
        Asientos_Selecionados.remove(jButton49);
        implement_image(jButton49, value49);
        try {
                System.out.println("prereservar");
               // remote.prereserva(Integer.parseInt(jButton1.getName()),Integer.parseInt(user_name.getText()));
               remote.update(Integer.parseInt(jButton49.getName()),1);
            } catch (NumberFormatException | RemoteException e) {
                System.out.println(e);
            } 
        }
    }//GEN-LAST:event_jButton49ActionPerformed

    private void jButton50ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton50ActionPerformed
        // TODO add your handling code here:
         if(value50 == 0){
        value50++;
        count++;
        Asientos_Selecionados.add(jButton50);
        implement_image(jButton50, value50);
        try {
                System.out.println("prereservar");
               // remote.prereserva(Integer.parseInt(jButton1.getName()),Integer.parseInt(user_name.getText()));
               remote.update(Integer.parseInt(jButton50.getName()),3);
            } catch (NumberFormatException | RemoteException e) {
                System.out.println(e);
            } 
        }else{
        value50--;
        count--;
        Asientos_Selecionados.remove(jButton50);
        implement_image(jButton50, value50);
        try {
                System.out.println("prereservar");
               // remote.prereserva(Integer.parseInt(jButton1.getName()),Integer.parseInt(user_name.getText()));
               remote.update(Integer.parseInt(jButton50.getName()),1);
            } catch (NumberFormatException | RemoteException e) {
                System.out.println(e);
            } 
        }
    }//GEN-LAST:event_jButton50ActionPerformed

    private void jButton51ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton51ActionPerformed
        // TODO add your handling code here:
         if(value51 == 0){
        value51++;
        count++;
        Asientos_Selecionados.add(jButton51);
        implement_image(jButton51, value51);
        try {
                System.out.println("prereservar");
               // remote.prereserva(Integer.parseInt(jButton1.getName()),Integer.parseInt(user_name.getText()));
               remote.update(Integer.parseInt(jButton51.getName()),3);
            } catch (NumberFormatException | RemoteException e) {
                System.out.println(e);
            } 
        }else{
        value51--;
        count--;
        Asientos_Selecionados.remove(jButton51);
        implement_image(jButton51, value51);
        try {
                System.out.println("prereservar");
               // remote.prereserva(Integer.parseInt(jButton1.getName()),Integer.parseInt(user_name.getText()));
               remote.update(Integer.parseInt(jButton51.getName()),1);
            } catch (NumberFormatException | RemoteException e) {
                System.out.println(e);
            } 
        }
    }//GEN-LAST:event_jButton51ActionPerformed

    private void jButton52ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton52ActionPerformed
        // TODO add your handling code here:
         if(value52 == 0){
        value52++;
        count++;
        Asientos_Selecionados.add(jButton52);
        implement_image(jButton52, value52);
        try {
                System.out.println("prereservar");
               // remote.prereserva(Integer.parseInt(jButton1.getName()),Integer.parseInt(user_name.getText()));
               remote.update(Integer.parseInt(jButton52.getName()),3);
            } catch (NumberFormatException | RemoteException e) {
                System.out.println(e);
            } 
        }else{
        value52--;
        count--;
        Asientos_Selecionados.remove(jButton52);
        implement_image(jButton52, value52);
        try {
                System.out.println("prereservar");
               // remote.prereserva(Integer.parseInt(jButton1.getName()),Integer.parseInt(user_name.getText()));
               remote.update(Integer.parseInt(jButton52.getName()),1);
            } catch (NumberFormatException | RemoteException e) {
                System.out.println(e);
            } 
        }
    }//GEN-LAST:event_jButton52ActionPerformed

    private void jButton53ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton53ActionPerformed
        // TODO add your handling code here:
        if(value53 == 0){
        value53++;
        count++;
        Asientos_Selecionados.add(jButton53);
        implement_image(jButton53, value53);
        try {
                System.out.println("prereservar");
               // remote.prereserva(Integer.parseInt(jButton1.getName()),Integer.parseInt(user_name.getText()));
               remote.update(Integer.parseInt(jButton53.getName()),3);
            } catch (NumberFormatException | RemoteException e) {
                System.out.println(e);
            } 
        }else{
        value53--;
        count--;
        Asientos_Selecionados.remove(jButton53);
        implement_image(jButton53, value53);
        try {
                System.out.println("prereservar");
               // remote.prereserva(Integer.parseInt(jButton1.getName()),Integer.parseInt(user_name.getText()));
               remote.update(Integer.parseInt(jButton53.getName()),1);
            } catch (NumberFormatException | RemoteException e) {
                System.out.println(e);
            } 
        }
    }//GEN-LAST:event_jButton53ActionPerformed

    private void jButton54ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton54ActionPerformed
        // TODO add your handling code here:
         if(value54 == 0){
        value54++;
        count++;
        Asientos_Selecionados.add(jButton54);
        implement_image(jButton54, value54);
        try {
                System.out.println("prereservar");
               // remote.prereserva(Integer.parseInt(jButton1.getName()),Integer.parseInt(user_name.getText()));
               remote.update(Integer.parseInt(jButton54.getName()),3);
            } catch (NumberFormatException | RemoteException e) {
                System.out.println(e);
            } 
        }else{
        value54--;
        count--;
        Asientos_Selecionados.remove(jButton54);
        implement_image(jButton54, value54);
        try {
                System.out.println("prereservar");
               // remote.prereserva(Integer.parseInt(jButton1.getName()),Integer.parseInt(user_name.getText()));
               remote.update(Integer.parseInt(jButton54.getName()),1);
            } catch (NumberFormatException | RemoteException e) {
                System.out.println(e);
            } 
        }
    }//GEN-LAST:event_jButton54ActionPerformed

    private void jButton55ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton55ActionPerformed
        // TODO add your handling code here:
         if(value55 == 0){
        value55++;
        count++;
        Asientos_Selecionados.add(jButton55);
        implement_image(jButton55, value55);
        try {
                System.out.println("prereservar");
               // remote.prereserva(Integer.parseInt(jButton1.getName()),Integer.parseInt(user_name.getText()));
               remote.update(Integer.parseInt(jButton55.getName()),3);
            } catch (NumberFormatException | RemoteException e) {
                System.out.println(e);
            } 
        }else{
        value55--;
        count--;
        Asientos_Selecionados.remove(jButton55);
        implement_image(jButton55, value55);
        try {
                System.out.println("prereservar");
               // remote.prereserva(Integer.parseInt(jButton1.getName()),Integer.parseInt(user_name.getText()));
               remote.update(Integer.parseInt(jButton55.getName()),1);
            } catch (NumberFormatException | RemoteException e) {
                System.out.println(e);
            } 
        }
    }//GEN-LAST:event_jButton55ActionPerformed

    private void jButton56ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton56ActionPerformed
        // TODO add your handling code here:
         if(value56 == 0){
        value56++;
        count++;
        Asientos_Selecionados.add(jButton56);
        implement_image(jButton56, value56);
        try {
                System.out.println("prereservar");
               // remote.prereserva(Integer.parseInt(jButton1.getName()),Integer.parseInt(user_name.getText()));
               remote.update(Integer.parseInt(jButton56.getName()),3);
            } catch (NumberFormatException | RemoteException e) {
                System.out.println(e);
            } 
        }else{
        value56--;
        count--;
        Asientos_Selecionados.remove(jButton56);
        implement_image(jButton56, value56);
        try {
                System.out.println("prereservar");
               // remote.prereserva(Integer.parseInt(jButton1.getName()),Integer.parseInt(user_name.getText()));
               remote.update(Integer.parseInt(jButton56.getName()),1);
            } catch (NumberFormatException | RemoteException e) {
                System.out.println(e);
            } 
        }
    }//GEN-LAST:event_jButton56ActionPerformed

    private void jButton57ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton57ActionPerformed
        // TODO add your handling code here:
         if(value57 == 0){
        value57++;
        count++;
        Asientos_Selecionados.add(jButton57);
        implement_image(jButton57, value57);
        try {
                System.out.println("prereservar");
               // remote.prereserva(Integer.parseInt(jButton1.getName()),Integer.parseInt(user_name.getText()));
               remote.update(Integer.parseInt(jButton57.getName()),3);
            } catch (NumberFormatException | RemoteException e) {
                System.out.println(e);
            } 
        }else{
        value57--;
        count--;
        Asientos_Selecionados.remove(jButton57);
        implement_image(jButton57, value57);
        try {
                System.out.println("prereservar");
               // remote.prereserva(Integer.parseInt(jButton1.getName()),Integer.parseInt(user_name.getText()));
               remote.update(Integer.parseInt(jButton57.getName()),1);
            } catch (NumberFormatException | RemoteException e) {
                System.out.println(e);
            } 
        }
    }//GEN-LAST:event_jButton57ActionPerformed

    private void jButton58ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton58ActionPerformed
        // TODO add your handling code here:
         if(value58 == 0){
        value58++;
        count++;
        Asientos_Selecionados.add(jButton58);
        implement_image(jButton58, value58);
        try {
                System.out.println("prereservar");
               // remote.prereserva(Integer.parseInt(jButton1.getName()),Integer.parseInt(user_name.getText()));
               remote.update(Integer.parseInt(jButton58.getName()),3);
            } catch (NumberFormatException | RemoteException e) {
                System.out.println(e);
            } 
        }else{
        value58--;
        count--;
        Asientos_Selecionados.remove(jButton58);
        implement_image(jButton58, value58);
        try {
                System.out.println("prereservar");
               // remote.prereserva(Integer.parseInt(jButton1.getName()),Integer.parseInt(user_name.getText()));
               remote.update(Integer.parseInt(jButton58.getName()),1);
            } catch (NumberFormatException | RemoteException e) {
                System.out.println(e);
            } 
        }
    }//GEN-LAST:event_jButton58ActionPerformed

    private void jButton59ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton59ActionPerformed
        // TODO add your handling code here:
         if(value59 == 0){
        value59++;
        count++;
        Asientos_Selecionados.add(jButton59);
        implement_image(jButton59, value59);
        try {
                System.out.println("prereservar");
               // remote.prereserva(Integer.parseInt(jButton1.getName()),Integer.parseInt(user_name.getText()));
               remote.update(Integer.parseInt(jButton59.getName()),3);
            } catch (NumberFormatException | RemoteException e) {
                System.out.println(e);
            } 
        }else{
        value59--;
        count--;
        Asientos_Selecionados.remove(jButton59);
        implement_image(jButton59, value59);
        try {
                System.out.println("prereservar");
               // remote.prereserva(Integer.parseInt(jButton1.getName()),Integer.parseInt(user_name.getText()));
               remote.update(Integer.parseInt(jButton59.getName()),1);
            } catch (NumberFormatException | RemoteException e) {
                System.out.println(e);
            } 
        }
    }//GEN-LAST:event_jButton59ActionPerformed

    private void jButton60ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton60ActionPerformed
        // TODO add your handling code here:
         if(value60 == 0){
        value60++;
        count++;
        Asientos_Selecionados.add(jButton60);
        implement_image(jButton60, value60);
        try {
                System.out.println("prereservar");
               // remote.prereserva(Integer.parseInt(jButton1.getName()),Integer.parseInt(user_name.getText()));
               remote.update(Integer.parseInt(jButton60.getName()),3);
            } catch (NumberFormatException | RemoteException e) {
                System.out.println(e);
            } 
        }else{
        value60--;
        count--;
        Asientos_Selecionados.remove(jButton60);
        implement_image(jButton60, value60);
        try {
                System.out.println("prereservar");
               // remote.prereserva(Integer.parseInt(jButton1.getName()),Integer.parseInt(user_name.getText()));
               remote.update(Integer.parseInt(jButton60.getName()),1);
            } catch (NumberFormatException | RemoteException e) {
                System.out.println(e);
            } 
        }
    }//GEN-LAST:event_jButton60ActionPerformed

    private void jButton61ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton61ActionPerformed
        // TODO add your handling code here:
         if(value61 == 0){
        value61++;
        count++;
        Asientos_Selecionados.add(jButton61);
        implement_image(jButton61, value61);
        try {
                System.out.println("prereservar");
               // remote.prereserva(Integer.parseInt(jButton1.getName()),Integer.parseInt(user_name.getText()));
               remote.update(Integer.parseInt(jButton61.getName()),3);
            } catch (NumberFormatException | RemoteException e) {
                System.out.println(e);
            } 
        }else{
        value61--;
        count--;
        Asientos_Selecionados.remove(jButton61);
        implement_image(jButton61, value61);
        try {
                System.out.println("prereservar");
               // remote.prereserva(Integer.parseInt(jButton1.getName()),Integer.parseInt(user_name.getText()));
               remote.update(Integer.parseInt(jButton61.getName()),1);
            } catch (NumberFormatException | RemoteException e) {
                System.out.println(e);
            } 
        }
    }//GEN-LAST:event_jButton61ActionPerformed

    private void jButton62ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton62ActionPerformed
        // TODO add your handling code here:
         if(value62 == 0){
        value62++;
        count++;
        Asientos_Selecionados.add(jButton62);
        implement_image(jButton62, value62);
        try {
                System.out.println("prereservar");
               // remote.prereserva(Integer.parseInt(jButton1.getName()),Integer.parseInt(user_name.getText()));
               remote.update(Integer.parseInt(jButton62.getName()),3);
            } catch (NumberFormatException | RemoteException e) {
                System.out.println(e);
            } 
        }else{
        value62--;
        count--;
        Asientos_Selecionados.remove(jButton62);
        implement_image(jButton62, value62);
        try {
                System.out.println("prereservar");
               // remote.prereserva(Integer.parseInt(jButton1.getName()),Integer.parseInt(user_name.getText()));
               remote.update(Integer.parseInt(jButton62.getName()),1);
            } catch (NumberFormatException | RemoteException e) {
                System.out.println(e);
            } 
        }
    }//GEN-LAST:event_jButton62ActionPerformed

    private void jButton63ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton63ActionPerformed
        // TODO add your handling code here:
        if(value63 == 0){
        value63++;
        count++;
        Asientos_Selecionados.add(jButton63);
        implement_image(jButton63, value63);
        try {
                System.out.println("prereservar");
               // remote.prereserva(Integer.parseInt(jButton1.getName()),Integer.parseInt(user_name.getText()));
               remote.update(Integer.parseInt(jButton63.getName()),3);
            } catch (NumberFormatException | RemoteException e) {
                System.out.println(e);
            } 
        }else{
        value63--;
        count--;
        Asientos_Selecionados.remove(jButton63);
        implement_image(jButton63, value63);
        try {
                System.out.println("prereservar");
               // remote.prereserva(Integer.parseInt(jButton1.getName()),Integer.parseInt(user_name.getText()));
               remote.update(Integer.parseInt(jButton63.getName()),1);
            } catch (NumberFormatException | RemoteException e) {
                System.out.println(e);
            } 
        }
    }//GEN-LAST:event_jButton63ActionPerformed

    private void jButton64ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton64ActionPerformed
        // TODO add your handling code here:
         if(value64 == 0){
        value64++;
        count++;
        Asientos_Selecionados.add(jButton64);
        implement_image(jButton64, value64);
        try {
                System.out.println("prereservar");
               // remote.prereserva(Integer.parseInt(jButton1.getName()),Integer.parseInt(user_name.getText()));
               remote.update(Integer.parseInt(jButton64.getName()),3);
            } catch (NumberFormatException | RemoteException e) {
                System.out.println(e);
            } 
        }else{
        value64--;
        count--;
        Asientos_Selecionados.remove(jButton64);
        implement_image(jButton64, value64);
        try {
                System.out.println("prereservar");
               // remote.prereserva(Integer.parseInt(jButton1.getName()),Integer.parseInt(user_name.getText()));
               remote.update(Integer.parseInt(jButton64.getName()),1);
            } catch (NumberFormatException | RemoteException e) {
                System.out.println(e);
            } 
        }
    }//GEN-LAST:event_jButton64ActionPerformed

    private void jButton65ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton65ActionPerformed
        // TODO add your handling code here:
         if(value65 == 0){
        value65++;
        count++;
        Asientos_Selecionados.add(jButton65);
        implement_image(jButton65, value65);
        try {
                System.out.println("prereservar");
               // remote.prereserva(Integer.parseInt(jButton1.getName()),Integer.parseInt(user_name.getText()));
               remote.update(Integer.parseInt(jButton65.getName()),3);
            } catch (NumberFormatException | RemoteException e) {
                System.out.println(e);
            } 
        }else{
        value65--;
        count--;
        Asientos_Selecionados.remove(jButton65);
        implement_image(jButton65, value65);
        try {
                System.out.println("prereservar");
               // remote.prereserva(Integer.parseInt(jButton1.getName()),Integer.parseInt(user_name.getText()));
               remote.update(Integer.parseInt(jButton65.getName()),1);
            } catch (NumberFormatException | RemoteException e) {
                System.out.println(e);
            } 
        }
    }//GEN-LAST:event_jButton65ActionPerformed

    private void jButton66ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton66ActionPerformed
        // TODO add your handling code here:
         if(value66 == 0){
        value66++;
        count++;
        Asientos_Selecionados.add(jButton66);
        implement_image(jButton66, value66);
        try {
                System.out.println("prereservar");
               // remote.prereserva(Integer.parseInt(jButton1.getName()),Integer.parseInt(user_name.getText()));
               remote.update(Integer.parseInt(jButton66.getName()),3);
            } catch (NumberFormatException | RemoteException e) {
                System.out.println(e);
            } 
        }else{
        value66--;
        count--;
        Asientos_Selecionados.remove(jButton66);
        implement_image(jButton66, value66);
        try {
                System.out.println("prereservar");
               // remote.prereserva(Integer.parseInt(jButton1.getName()),Integer.parseInt(user_name.getText()));
               remote.update(Integer.parseInt(jButton66.getName()),1);
            } catch (NumberFormatException | RemoteException e) {
                System.out.println(e);
            } 
        }
    }//GEN-LAST:event_jButton66ActionPerformed

    private void jButton67ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton67ActionPerformed
        // TODO add your handling code here:
         if(value67 == 0){
        value67++;
        count++;
        Asientos_Selecionados.add(jButton67);
        implement_image(jButton67, value67);
        try {
                System.out.println("prereservar");
               // remote.prereserva(Integer.parseInt(jButton1.getName()),Integer.parseInt(user_name.getText()));
               remote.update(Integer.parseInt(jButton67.getName()),3);
            } catch (NumberFormatException | RemoteException e) {
                System.out.println(e);
            } 
        }else{
        value67--;
        count--;
        Asientos_Selecionados.remove(jButton67);
        implement_image(jButton67, value67);
        try {
                System.out.println("prereservar");
               // remote.prereserva(Integer.parseInt(jButton1.getName()),Integer.parseInt(user_name.getText()));
               remote.update(Integer.parseInt(jButton67.getName()),1);
            } catch (NumberFormatException | RemoteException e) {
                System.out.println(e);
            } 
        }
    }//GEN-LAST:event_jButton67ActionPerformed

    private void jButton68ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton68ActionPerformed
        // TODO add your handling code here:
         if(value68 == 0){
        value68++;
        count++;
        Asientos_Selecionados.add(jButton68);
        implement_image(jButton68, value68);
        try {
                System.out.println("prereservar");
               // remote.prereserva(Integer.parseInt(jButton1.getName()),Integer.parseInt(user_name.getText()));
               remote.update(Integer.parseInt(jButton68.getName()),3);
            } catch (NumberFormatException | RemoteException e) {
                System.out.println(e);
            } 
        }else{
        value68--;
        count--;
        Asientos_Selecionados.remove(jButton68);
        implement_image(jButton68, value68);
        try {
                System.out.println("prereservar");
               // remote.prereserva(Integer.parseInt(jButton1.getName()),Integer.parseInt(user_name.getText()));
               remote.update(Integer.parseInt(jButton68.getName()),1);
            } catch (NumberFormatException | RemoteException e) {
                System.out.println(e);
            } 
        }
    }//GEN-LAST:event_jButton68ActionPerformed

    private void jButton69ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton69ActionPerformed
        // TODO add your handling code here:
         if(value69 == 0){
        value69++;
        count++;
        Asientos_Selecionados.add(jButton69);
        implement_image(jButton69, value69);
        try {
                System.out.println("prereservar");
               // remote.prereserva(Integer.parseInt(jButton1.getName()),Integer.parseInt(user_name.getText()));
               remote.update(Integer.parseInt(jButton69.getName()),3);
            } catch (NumberFormatException | RemoteException e) {
                System.out.println(e);
            } 
        }else{
        value69--;
        count--;
        Asientos_Selecionados.remove(jButton69);
        implement_image(jButton69, value69);
        try {
                System.out.println("prereservar");
               // remote.prereserva(Integer.parseInt(jButton1.getName()),Integer.parseInt(user_name.getText()));
               remote.update(Integer.parseInt(jButton69.getName()),1);
            } catch (NumberFormatException | RemoteException e) {
                System.out.println(e);
            } 
        }
    }//GEN-LAST:event_jButton69ActionPerformed

    private void jButton70ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton70ActionPerformed
        // TODO add your handling code here:
         if(value70 == 0){
        value70++;
        count++;
        Asientos_Selecionados.add(jButton70);
        implement_image(jButton70, value70);
        try {
                System.out.println("prereservar");
               // remote.prereserva(Integer.parseInt(jButton1.getName()),Integer.parseInt(user_name.getText()));
               remote.update(Integer.parseInt(jButton70.getName()),3);
            } catch (NumberFormatException | RemoteException e) {
                System.out.println(e);
            } 
        }else{
        value70--;
        count--;
        Asientos_Selecionados.remove(jButton70);
        implement_image(jButton70, value70);
        try {
                System.out.println("prereservar");
               // remote.prereserva(Integer.parseInt(jButton1.getName()),Integer.parseInt(user_name.getText()));
               remote.update(Integer.parseInt(jButton70.getName()),1);
            } catch (NumberFormatException | RemoteException e) {
                System.out.println(e);
            } 
        }
    }//GEN-LAST:event_jButton70ActionPerformed

    private void jButton71ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton71ActionPerformed
        // TODO add your handling code here:
         if(value71 == 0){
        value71++;
        count++;
        Asientos_Selecionados.add(jButton71);
        implement_image(jButton71, value71);
        try {
                System.out.println("prereservar");
               // remote.prereserva(Integer.parseInt(jButton1.getName()),Integer.parseInt(user_name.getText()));
               remote.update(Integer.parseInt(jButton71.getName()),3);
            } catch (NumberFormatException | RemoteException e) {
                System.out.println(e);
            } 
        }else{
        value71--;
        count--;
        Asientos_Selecionados.remove(jButton71);
        implement_image(jButton71, value71);
        try {
                System.out.println("prereservar");
               // remote.prereserva(Integer.parseInt(jButton1.getName()),Integer.parseInt(user_name.getText()));
               remote.update(Integer.parseInt(jButton71.getName()),1);
            } catch (NumberFormatException | RemoteException e) {
                System.out.println(e);
            } 
        }
    }//GEN-LAST:event_jButton71ActionPerformed

    private void jButton72ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton72ActionPerformed
        // TODO add your handling code here:
         if(value72 == 0){
        value72++;
        count++;
        Asientos_Selecionados.add(jButton72);
        implement_image(jButton72, value72);
        try {
                System.out.println("prereservar");
               // remote.prereserva(Integer.parseInt(jButton1.getName()),Integer.parseInt(user_name.getText()));
               remote.update(Integer.parseInt(jButton72.getName()),3);
            } catch (NumberFormatException | RemoteException e) {
                System.out.println(e);
            } 
        }else{
        value72--;
        count--;
        Asientos_Selecionados.remove(jButton72);
        implement_image(jButton72, value72);
        try {
                System.out.println("prereservar");
               // remote.prereserva(Integer.parseInt(jButton1.getName()),Integer.parseInt(user_name.getText()));
               remote.update(Integer.parseInt(jButton72.getName()),1);
            } catch (NumberFormatException | RemoteException e) {
                System.out.println(e);
            } 
        }
    }//GEN-LAST:event_jButton72ActionPerformed

    private void jButton73ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton73ActionPerformed
        // TODO add your handling code here:
         if(value73 == 0){
        value73++;
        count++;
        Asientos_Selecionados.add(jButton73);
        implement_image(jButton73, value73);
        try {
                System.out.println("prereservar");
               // remote.prereserva(Integer.parseInt(jButton1.getName()),Integer.parseInt(user_name.getText()));
               remote.update(Integer.parseInt(jButton73.getName()),3);
            } catch (NumberFormatException | RemoteException e) {
                System.out.println(e);
            } 
        }else{
        value73--;
        count--;
        Asientos_Selecionados.remove(jButton73);
        implement_image(jButton73, value73);
        try {
                System.out.println("prereservar");
               // remote.prereserva(Integer.parseInt(jButton1.getName()),Integer.parseInt(user_name.getText()));
               remote.update(Integer.parseInt(jButton73.getName()),1);
            } catch (NumberFormatException | RemoteException e) {
                System.out.println(e);
            } 
        }
    }//GEN-LAST:event_jButton73ActionPerformed

    private void jButton74ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton74ActionPerformed
        // TODO add your handling code here:
         if(value74 == 0){
        value74++;
        count++;
        Asientos_Selecionados.add(jButton74);
        implement_image(jButton74, value74);
        try {
                System.out.println("prereservar");
               // remote.prereserva(Integer.parseInt(jButton1.getName()),Integer.parseInt(user_name.getText()));
               remote.update(Integer.parseInt(jButton74.getName()),3);
            } catch (NumberFormatException | RemoteException e) {
                System.out.println(e);
            } 
        }else{
        value74--;
        count--;
        Asientos_Selecionados.remove(jButton74);
        implement_image(jButton74, value74);
        try {
                System.out.println("prereservar");
               // remote.prereserva(Integer.parseInt(jButton1.getName()),Integer.parseInt(user_name.getText()));
               remote.update(Integer.parseInt(jButton74.getName()),1);
            } catch (NumberFormatException | RemoteException e) {
                System.out.println(e);
            } 
        }
    }//GEN-LAST:event_jButton74ActionPerformed

    private void jButton75ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton75ActionPerformed
        // TODO add your handling code here:
         if(value75 == 0){
        value75++;
        count++;
        Asientos_Selecionados.add(jButton75);
        implement_image(jButton75, value75);
        try {
                System.out.println("prereservar");
               // remote.prereserva(Integer.parseInt(jButton1.getName()),Integer.parseInt(user_name.getText()));
               remote.update(Integer.parseInt(jButton75.getName()),3);
            } catch (NumberFormatException | RemoteException e) {
                System.out.println(e);
            } 
        }else{
        value75--;
        count--;
        Asientos_Selecionados.remove(jButton75);
        implement_image(jButton75, value75);
        try {
                System.out.println("prereservar");
               // remote.prereserva(Integer.parseInt(jButton1.getName()),Integer.parseInt(user_name.getText()));
               remote.update(Integer.parseInt(jButton75.getName()),1);
            } catch (NumberFormatException | RemoteException e) {
                System.out.println(e);
            } 
        }
    }//GEN-LAST:event_jButton75ActionPerformed

    private void jButton76ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton76ActionPerformed
        // TODO add your handling code here:
         if(value76 == 0){
        value76++;
        count++;
        Asientos_Selecionados.add(jButton76);
        implement_image(jButton76, value76);
        try {
                System.out.println("prereservar");
               // remote.prereserva(Integer.parseInt(jButton1.getName()),Integer.parseInt(user_name.getText()));
               remote.update(Integer.parseInt(jButton76.getName()),3);
            } catch (NumberFormatException | RemoteException e) {
                System.out.println(e);
            } 
        }else{
        value76--;
        count--;
        Asientos_Selecionados.remove(jButton76);
        implement_image(jButton76, value76);
        try {
                System.out.println("prereservar");
               // remote.prereserva(Integer.parseInt(jButton1.getName()),Integer.parseInt(user_name.getText()));
               remote.update(Integer.parseInt(jButton76.getName()),1);
            } catch (NumberFormatException | RemoteException e) {
                System.out.println(e);
            } 
        }
    }//GEN-LAST:event_jButton76ActionPerformed

    private void jButton77ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton77ActionPerformed
        // TODO add your handling code here:
          if(value77 == 0){
        value77++;
        count++;
        Asientos_Selecionados.add(jButton77);
        implement_image(jButton77, value77);
        try {
                System.out.println("prereservar");
               // remote.prereserva(Integer.parseInt(jButton1.getName()),Integer.parseInt(user_name.getText()));
               remote.update(Integer.parseInt(jButton77.getName()),3);
            } catch (NumberFormatException | RemoteException e) {
                System.out.println(e);
            } 
        }else{
        value77--;
        count--;
        Asientos_Selecionados.remove(jButton77);
        implement_image(jButton77, value77);
        try {
                System.out.println("prereservar");
               // remote.prereserva(Integer.parseInt(jButton1.getName()),Integer.parseInt(user_name.getText()));
               remote.update(Integer.parseInt(jButton77.getName()),1);
            } catch (NumberFormatException | RemoteException e) {
                System.out.println(e);
            } 
        }
    }//GEN-LAST:event_jButton77ActionPerformed

    private void jButton78ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton78ActionPerformed
        // TODO add your handling code here:
         if(value78 == 0){
        value78++;
        count++;
        Asientos_Selecionados.add(jButton78);
        implement_image(jButton78, value78);
        try {
                System.out.println("prereservar");
               // remote.prereserva(Integer.parseInt(jButton1.getName()),Integer.parseInt(user_name.getText()));
               remote.update(Integer.parseInt(jButton78.getName()),3);
            } catch (NumberFormatException | RemoteException e) {
                System.out.println(e);
            } 
        }else{
        value78--;
        count--;
        Asientos_Selecionados.remove(jButton78);
        implement_image(jButton78, value78);
        try {
                System.out.println("prereservar");
               // remote.prereserva(Integer.parseInt(jButton1.getName()),Integer.parseInt(user_name.getText()));
               remote.update(Integer.parseInt(jButton78.getName()),1);
            } catch (NumberFormatException | RemoteException e) {
                System.out.println(e);
            } 
        }
    }//GEN-LAST:event_jButton78ActionPerformed

    private void jButton79ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton79ActionPerformed
        // TODO add your handling code here:
          if(value79 == 0){
        value79++;
        count++;
        Asientos_Selecionados.add(jButton79);
        implement_image(jButton79, value79);
        try {
                System.out.println("prereservar");
               // remote.prereserva(Integer.parseInt(jButton1.getName()),Integer.parseInt(user_name.getText()));
               remote.update(Integer.parseInt(jButton79.getName()),3);
            } catch (NumberFormatException | RemoteException e) {
                System.out.println(e);
            } 
        }else{
        value79--;
        count--;
        Asientos_Selecionados.remove(jButton79);
        implement_image(jButton79, value79);
        try {
                System.out.println("prereservar");
               // remote.prereserva(Integer.parseInt(jButton1.getName()),Integer.parseInt(user_name.getText()));
               remote.update(Integer.parseInt(jButton79.getName()),1);
            } catch (NumberFormatException | RemoteException e) {
                System.out.println(e);
            } 
        }
    }//GEN-LAST:event_jButton79ActionPerformed

    private void jButton80ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton80ActionPerformed
        // TODO add your handling code here:
          if(value80 == 0){
        value80++;
        count++;
        Asientos_Selecionados.add(jButton80);
        implement_image(jButton80, value80);
        try {
                System.out.println("prereservar");
               // remote.prereserva(Integer.parseInt(jButton1.getName()),Integer.parseInt(user_name.getText()));
               remote.update(Integer.parseInt(jButton80.getName()),3);
            } catch (NumberFormatException | RemoteException e) {
                System.out.println(e);
            } 
        }else{
        value80--;
        count--;
        Asientos_Selecionados.remove(jButton80);
        implement_image(jButton80, value80);
        try {
                System.out.println("prereservar");
               // remote.prereserva(Integer.parseInt(jButton1.getName()),Integer.parseInt(user_name.getText()));
               remote.update(Integer.parseInt(jButton80.getName()),1);
            } catch (NumberFormatException | RemoteException e) {
                System.out.println(e);
            } 
        }
    }//GEN-LAST:event_jButton80ActionPerformed

    private void jButton81ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton81ActionPerformed
        // TODO add your handling code here:
          if(value81 == 0){
        value81++;
        count++;
        Asientos_Selecionados.add(jButton81);
        implement_image(jButton81, value81);
        try {
                System.out.println("prereservar");
               // remote.prereserva(Integer.parseInt(jButton1.getName()),Integer.parseInt(user_name.getText()));
               remote.update(Integer.parseInt(jButton81.getName()),3);
            } catch (NumberFormatException | RemoteException e) {
                System.out.println(e);
            } 
        }else{
        value81--;
        count--;
        Asientos_Selecionados.remove(jButton81);
        implement_image(jButton81, value81);
        try {
                System.out.println("prereservar");
               // remote.prereserva(Integer.parseInt(jButton1.getName()),Integer.parseInt(user_name.getText()));
               remote.update(Integer.parseInt(jButton81.getName()),1);
            } catch (NumberFormatException | RemoteException e) {
                System.out.println(e);
            } 
        }
    }//GEN-LAST:event_jButton81ActionPerformed

    private void jButton82ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton82ActionPerformed
        // TODO add your handling code here:
          if(value82 == 0){
        value82++;
        count++;
        Asientos_Selecionados.add(jButton82);
        implement_image(jButton82, value82);
        try {
                System.out.println("prereservar");
               // remote.prereserva(Integer.parseInt(jButton1.getName()),Integer.parseInt(user_name.getText()));
               remote.update(Integer.parseInt(jButton82.getName()),3);
            } catch (NumberFormatException | RemoteException e) {
                System.out.println(e);
            } 
        }else{
        value82--;
        count--;
        Asientos_Selecionados.remove(jButton82);
        implement_image(jButton82, value82);
        try {
                System.out.println("prereservar");
               // remote.prereserva(Integer.parseInt(jButton1.getName()),Integer.parseInt(user_name.getText()));
               remote.update(Integer.parseInt(jButton82.getName()),1);
            } catch (NumberFormatException | RemoteException e) {
                System.out.println(e);
            } 
        }
    }//GEN-LAST:event_jButton82ActionPerformed

    private void jButton83ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton83ActionPerformed
        // TODO add your handling code here:
          if(value83 == 0){
        value83++;
        count++;
        Asientos_Selecionados.add(jButton83);
        implement_image(jButton83, value83);
        try {
                System.out.println("prereservar");
               // remote.prereserva(Integer.parseInt(jButton1.getName()),Integer.parseInt(user_name.getText()));
               remote.update(Integer.parseInt(jButton83.getName()),3);
            } catch (NumberFormatException | RemoteException e) {
                System.out.println(e);
            } 
        }else{
        value83--;
        count--;
        Asientos_Selecionados.remove(jButton83);
        implement_image(jButton83, value83);
        try {
                System.out.println("prereservar");
               // remote.prereserva(Integer.parseInt(jButton1.getName()),Integer.parseInt(user_name.getText()));
               remote.update(Integer.parseInt(jButton83.getName()),1);
            } catch (NumberFormatException | RemoteException e) {
                System.out.println(e);
            } 
        }
    }//GEN-LAST:event_jButton83ActionPerformed

    private void jButton84ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton84ActionPerformed
        // TODO add your handling code here:
          if(value84 == 0){
        value84++;
        count++;
        Asientos_Selecionados.add(jButton84);
        implement_image(jButton84, value84);
        try {
                System.out.println("prereservar");
               // remote.prereserva(Integer.parseInt(jButton1.getName()),Integer.parseInt(user_name.getText()));
               remote.update(Integer.parseInt(jButton84.getName()),3);
            } catch (NumberFormatException | RemoteException e) {
                System.out.println(e);
            } 
        }else{
        value84--;
        count--;
        Asientos_Selecionados.remove(jButton84);
        implement_image(jButton84, value84);
        try {
                System.out.println("prereservar");
               // remote.prereserva(Integer.parseInt(jButton1.getName()),Integer.parseInt(user_name.getText()));
               remote.update(Integer.parseInt(jButton84.getName()),1);
            } catch (NumberFormatException | RemoteException e) {
                System.out.println(e);
            } 
        }
    }//GEN-LAST:event_jButton84ActionPerformed

    private void jButton85ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton85ActionPerformed
        // TODO add your handling code here:
          if(value85 == 0){
        value85++;
        count++;
        Asientos_Selecionados.add(jButton85);
        implement_image(jButton85, value85);
        try {
                System.out.println("prereservar");
               // remote.prereserva(Integer.parseInt(jButton1.getName()),Integer.parseInt(user_name.getText()));
               remote.update(Integer.parseInt(jButton85.getName()),3);
            } catch (NumberFormatException | RemoteException e) {
                System.out.println(e);
            } 
        }else{
        value85--;
        count--;
        Asientos_Selecionados.remove(jButton85);
        implement_image(jButton85, value85);
        try {
                System.out.println("prereservar");
               // remote.prereserva(Integer.parseInt(jButton1.getName()),Integer.parseInt(user_name.getText()));
               remote.update(Integer.parseInt(jButton85.getName()),1);
            } catch (NumberFormatException | RemoteException e) {
                System.out.println(e);
            } 
        }
    }//GEN-LAST:event_jButton85ActionPerformed

    private void jButton86ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton86ActionPerformed
        // TODO add your handling code here:
          if(value86 == 0){
        value86++;
        count++;
        Asientos_Selecionados.add(jButton86);
        implement_image(jButton86, value86);
        try {
                System.out.println("prereservar");
               // remote.prereserva(Integer.parseInt(jButton1.getName()),Integer.parseInt(user_name.getText()));
               remote.update(Integer.parseInt(jButton86.getName()),3);
            } catch (NumberFormatException | RemoteException e) {
                System.out.println(e);
            } 
        }else{
        value86--;
        count--;
        Asientos_Selecionados.remove(jButton86);
        implement_image(jButton86, value86);
        try {
                System.out.println("prereservar");
               // remote.prereserva(Integer.parseInt(jButton1.getName()),Integer.parseInt(user_name.getText()));
               remote.update(Integer.parseInt(jButton86.getName()),1);
            } catch (NumberFormatException | RemoteException e) {
                System.out.println(e);
            } 
        }
    }//GEN-LAST:event_jButton86ActionPerformed

    private void jButton87ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton87ActionPerformed
        // TODO add your handling code here:
         if(value87 == 0){
        value87++;
        count++;
        Asientos_Selecionados.add(jButton87);
        implement_image(jButton87, value87);
        try {
                System.out.println("prereservar");
               // remote.prereserva(Integer.parseInt(jButton1.getName()),Integer.parseInt(user_name.getText()));
               remote.update(Integer.parseInt(jButton87.getName()),3);
            } catch (NumberFormatException | RemoteException e) {
                System.out.println(e);
            } 
        }else{
        value87--;
        count--;
        Asientos_Selecionados.remove(jButton87);
        implement_image(jButton87, value87);
        try {
                System.out.println("prereservar");
               // remote.prereserva(Integer.parseInt(jButton1.getName()),Integer.parseInt(user_name.getText()));
               remote.update(Integer.parseInt(jButton87.getName()),1);
            } catch (NumberFormatException | RemoteException e) {
                System.out.println(e);
            } 
        }
    }//GEN-LAST:event_jButton87ActionPerformed

    private void jButton88ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton88ActionPerformed
        // TODO add your handling code here:
          if(value88 == 0){
        value88++;
        count++;
        Asientos_Selecionados.add(jButton88);
        implement_image(jButton88, value88);
        try {
                System.out.println("prereservar");
               // remote.prereserva(Integer.parseInt(jButton1.getName()),Integer.parseInt(user_name.getText()));
               remote.update(Integer.parseInt(jButton88.getName()),3);
            } catch (NumberFormatException | RemoteException e) {
                System.out.println(e);
            } 
        }else{
        value88--;
        count--;
        Asientos_Selecionados.remove(jButton88);
        implement_image(jButton88, value88);
        try {
                System.out.println("prereservar");
               // remote.prereserva(Integer.parseInt(jButton1.getName()),Integer.parseInt(user_name.getText()));
               remote.update(Integer.parseInt(jButton88.getName()),1);
            } catch (NumberFormatException | RemoteException e) {
                System.out.println(e);
            } 
        }
    }//GEN-LAST:event_jButton88ActionPerformed

    private void jButton89ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton89ActionPerformed
        // TODO add your handling code here:
          if(value89 == 0){
        value89++;
        count++;
        Asientos_Selecionados.add(jButton89);
        implement_image(jButton89, value89);
        try {
                System.out.println("prereservar");
               // remote.prereserva(Integer.parseInt(jButton1.getName()),Integer.parseInt(user_name.getText()));
               remote.update(Integer.parseInt(jButton89.getName()),3);
            } catch (NumberFormatException | RemoteException e) {
                System.out.println(e);
            } 
        }else{
        value89--;
        count--;
        Asientos_Selecionados.remove(jButton89);
        implement_image(jButton89, value89);
        try {
                System.out.println("prereservar");
               // remote.prereserva(Integer.parseInt(jButton1.getName()),Integer.parseInt(user_name.getText()));
               remote.update(Integer.parseInt(jButton89.getName()),1);
            } catch (NumberFormatException | RemoteException e) {
                System.out.println(e);
            } 
        }
    }//GEN-LAST:event_jButton89ActionPerformed

    private void jButton90ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton90ActionPerformed
        // TODO add your handling code here:
         if(value90 == 0){
        value90++;
        count++;
        Asientos_Selecionados.add(jButton90);
        implement_image(jButton90, value90);
        try {
                System.out.println("prereservar");
               // remote.prereserva(Integer.parseInt(jButton1.getName()),Integer.parseInt(user_name.getText()));
               remote.update(Integer.parseInt(jButton90.getName()),3);
            } catch (NumberFormatException | RemoteException e) {
                System.out.println(e);
            } 
        }else{
        value90--;
        count--;
        Asientos_Selecionados.remove(jButton90);
        implement_image(jButton90, value90);
        try {
                System.out.println("prereservar");
               // remote.prereserva(Integer.parseInt(jButton1.getName()),Integer.parseInt(user_name.getText()));
               remote.update(Integer.parseInt(jButton90.getName()),1);
            } catch (NumberFormatException | RemoteException e) {
                System.out.println(e);
            } 
        }
    }//GEN-LAST:event_jButton90ActionPerformed

    private void jButton91ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton91ActionPerformed
        // TODO add your handling code here:
         if(value91 == 0){
        value91++;
        count++;
        Asientos_Selecionados.add(jButton91);
        implement_image(jButton91, value91);
        try {
                System.out.println("prereservar");
               // remote.prereserva(Integer.parseInt(jButton1.getName()),Integer.parseInt(user_name.getText()));
               remote.update(Integer.parseInt(jButton91.getName()),3);
            } catch (NumberFormatException | RemoteException e) {
                System.out.println(e);
            } 
        }else{
        value91--;
        count--;
        Asientos_Selecionados.remove(jButton91);
        implement_image(jButton91, value91);
        try {
                System.out.println("prereservar");
               // remote.prereserva(Integer.parseInt(jButton1.getName()),Integer.parseInt(user_name.getText()));
               remote.update(Integer.parseInt(jButton91.getName()),1);
            } catch (NumberFormatException | RemoteException e) {
                System.out.println(e);
            } 
        }
    }//GEN-LAST:event_jButton91ActionPerformed

    private void jButton92ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton92ActionPerformed
        // TODO add your handling code here:
         if(value92 == 0){
        value92++;
        count++;
        Asientos_Selecionados.add(jButton92);
        implement_image(jButton92, value92);
        try {
                System.out.println("prereservar");
               // remote.prereserva(Integer.parseInt(jButton1.getName()),Integer.parseInt(user_name.getText()));
               remote.update(Integer.parseInt(jButton92.getName()),3);
            } catch (NumberFormatException | RemoteException e) {
                System.out.println(e);
            } 
        }else{
        value92--;
        count--;
        Asientos_Selecionados.remove(jButton92);
        implement_image(jButton92, value92);
        try {
                System.out.println("prereservar");
               // remote.prereserva(Integer.parseInt(jButton1.getName()),Integer.parseInt(user_name.getText()));
               remote.update(Integer.parseInt(jButton92.getName()),1);
            } catch (NumberFormatException | RemoteException e) {
                System.out.println(e);
            } 
        }
    }//GEN-LAST:event_jButton92ActionPerformed

    private void jButton93ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton93ActionPerformed
        // TODO add your handling code here:
         if(value93 == 0){
        value93++;
        count++;
        Asientos_Selecionados.add(jButton93);
        implement_image(jButton93, value93);
        try {
                System.out.println("prereservar");
               // remote.prereserva(Integer.parseInt(jButton1.getName()),Integer.parseInt(user_name.getText()));
               remote.update(Integer.parseInt(jButton93.getName()),3);
            } catch (NumberFormatException | RemoteException e) {
                System.out.println(e);
            } 
        }else{
        value93--;
        count--;
        Asientos_Selecionados.remove(jButton93);
        implement_image(jButton93, value93);
        try {
                System.out.println("prereservar");
               // remote.prereserva(Integer.parseInt(jButton1.getName()),Integer.parseInt(user_name.getText()));
               remote.update(Integer.parseInt(jButton93.getName()),1);
            } catch (NumberFormatException | RemoteException e) {
                System.out.println(e);
            } 
        }
    }//GEN-LAST:event_jButton93ActionPerformed

    private void jButton94ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton94ActionPerformed
        // TODO add your handling code here:
         if(value94 == 0){
        value94++;
        count++;
        Asientos_Selecionados.add(jButton94);
        implement_image(jButton94, value94);
        try {
                System.out.println("prereservar");
               // remote.prereserva(Integer.parseInt(jButton1.getName()),Integer.parseInt(user_name.getText()));
               remote.update(Integer.parseInt(jButton94.getName()),3);
            } catch (NumberFormatException | RemoteException e) {
                System.out.println(e);
            } 
        }else{
        value94--;
        count--;
        Asientos_Selecionados.remove(jButton94);
        implement_image(jButton94, value94);
        try {
                System.out.println("prereservar");
               // remote.prereserva(Integer.parseInt(jButton1.getName()),Integer.parseInt(user_name.getText()));
               remote.update(Integer.parseInt(jButton94.getName()),1);
            } catch (NumberFormatException | RemoteException e) {
                System.out.println(e);
            } 
        }
    }//GEN-LAST:event_jButton94ActionPerformed

    private void jButton95ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton95ActionPerformed
        // TODO add your handling code here:
         if(value95 == 0){
        value95++;
        count++;
        Asientos_Selecionados.add(jButton95);
        implement_image(jButton95, value95);
        try {
                System.out.println("prereservar");
               // remote.prereserva(Integer.parseInt(jButton1.getName()),Integer.parseInt(user_name.getText()));
               remote.update(Integer.parseInt(jButton95.getName()),3);
            } catch (NumberFormatException | RemoteException e) {
                System.out.println(e);
            } 
        }else{
        value95--;
        count--;
        Asientos_Selecionados.remove(jButton95);
        implement_image(jButton95, value95);
        try {
                System.out.println("prereservar");
               // remote.prereserva(Integer.parseInt(jButton1.getName()),Integer.parseInt(user_name.getText()));
               remote.update(Integer.parseInt(jButton95.getName()),1);
            } catch (NumberFormatException | RemoteException e) {
                System.out.println(e);
            } 
        }
    }//GEN-LAST:event_jButton95ActionPerformed

    private void jButton97ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton97ActionPerformed
        // TODO add your handling code here:
         if(value97 == 0){
        value97++;
        count++;
        Asientos_Selecionados.add(jButton97);
        implement_image(jButton97, value97);
        try {
                System.out.println("prereservar");
               // remote.prereserva(Integer.parseInt(jButton1.getName()),Integer.parseInt(user_name.getText()));
               remote.update(Integer.parseInt(jButton97.getName()),3);
            } catch (NumberFormatException | RemoteException e) {
                System.out.println(e);
            } 
        }else{
        value97--;
        count--;
        Asientos_Selecionados.remove(jButton97);
        implement_image(jButton97, value97);
        try {
                System.out.println("prereservar");
               // remote.prereserva(Integer.parseInt(jButton1.getName()),Integer.parseInt(user_name.getText()));
               remote.update(Integer.parseInt(jButton97.getName()),1);
            } catch (NumberFormatException | RemoteException e) {
                System.out.println(e);
            } 
        }
    }//GEN-LAST:event_jButton97ActionPerformed

    private void jButton98ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton98ActionPerformed
        // TODO add your handling code here:
         if(value98 == 0){
        value98++;
        count++;
        Asientos_Selecionados.add(jButton98);
        implement_image(jButton98, value98);
        try {
                System.out.println("prereservar");
               // remote.prereserva(Integer.parseInt(jButton1.getName()),Integer.parseInt(user_name.getText()));
               remote.update(Integer.parseInt(jButton98.getName()),3);
            } catch (NumberFormatException | RemoteException e) {
                System.out.println(e);
            } 
        }else{
        value98--;
        count--;
        Asientos_Selecionados.remove(jButton98);
        implement_image(jButton98, value98);
        try {
                System.out.println("prereservar");
               // remote.prereserva(Integer.parseInt(jButton1.getName()),Integer.parseInt(user_name.getText()));
               remote.update(Integer.parseInt(jButton98.getName()),1);
            } catch (NumberFormatException | RemoteException e) {
                System.out.println(e);
            } 
        }
    }//GEN-LAST:event_jButton98ActionPerformed

    private void jButton99ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton99ActionPerformed
        // TODO add your handling code here:
         if(value99 == 0){
        value99++;
        count++;
        Asientos_Selecionados.add(jButton99);
        implement_image(jButton99, value99);
        try {
                System.out.println("prereservar");
               // remote.prereserva(Integer.parseInt(jButton1.getName()),Integer.parseInt(user_name.getText()));
               remote.update(Integer.parseInt(jButton99.getName()),3);
            } catch (NumberFormatException | RemoteException e) {
                System.out.println(e);
            } 
        }else{
        value99--;
        count--;
        Asientos_Selecionados.remove(jButton99);
        implement_image(jButton99, value99);
        try {
                System.out.println("prereservar");
               // remote.prereserva(Integer.parseInt(jButton1.getName()),Integer.parseInt(user_name.getText()));
               remote.update(Integer.parseInt(jButton99.getName()),1);
            } catch (NumberFormatException | RemoteException e) {
                System.out.println(e);
            } 
        }
    }//GEN-LAST:event_jButton99ActionPerformed

    private void jButton100ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton100ActionPerformed
        // TODO add your handling code here:
         if(value100 == 0){
        value100++;
        count++;
        Asientos_Selecionados.add(jButton100);
        implement_image(jButton100, value100);
        try {
                System.out.println("prereservar");
               // remote.prereserva(Integer.parseInt(jButton1.getName()),Integer.parseInt(user_name.getText()));
               remote.update(Integer.parseInt(jButton100.getName()),3);
            } catch (NumberFormatException | RemoteException e) {
                System.out.println(e);
            } 
        }else{
        value100--;
        count--;
        Asientos_Selecionados.remove(jButton100);
        implement_image(jButton100, value100);
        try {
                System.out.println("prereservar");
               // remote.prereserva(Integer.parseInt(jButton1.getName()),Integer.parseInt(user_name.getText()));
               remote.update(Integer.parseInt(jButton100.getName()),1);
            } catch (NumberFormatException | RemoteException e) {
                System.out.println(e);
            } 
        }
    }//GEN-LAST:event_jButton100ActionPerformed

    private void jButton101ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton101ActionPerformed
        // TODO add your handling code here:
        int re= 0;
        if (Asientos_Selecionados.size() < 6) {
            try {
            // TODO add your handling code here:
//            Registry host = LocateRegistry.getRegistry("localhost");
//            IRemoteProvince clientonuevo = (IRemoteProvince) host.lookup("Province");
            
            for (int i = 0; i < Asientos_Selecionados.size(); i++) {
                System.out.println("asiento selecionado "+ i +":"+ Asientos_Selecionados.get(i).getName());
             re = remote.reservar(Integer.parseInt(Asientos_Selecionados.get(i).getName()) ,Integer.parseInt(user_name.getText())  );
             
            }
            
            if (re > 0){
                 JOptionPane.showMessageDialog(this, "reservado con exito.");
             }else
                 JOptionPane.showMessageDialog(this, "no se pudo registrar");
            
           // limpia los asientos selecionados luego de haber registrado
           Asientos_Selecionados.clear();
           pintarSillas();
            
        } catch (RemoteException ex) {
            System.out.println(ex);
        }
        }else{
            JOptionPane.showMessageDialog(this, "no puedes reservar mas de 5");
        }
        
       
           
    }//GEN-LAST:event_jButton101ActionPerformed

    
    
    
    public void implement_image(JButton btn, int value){
        //value++;
        //value%=2;
        System.out.println(count);
       if(count <= 5){
        switch(value){
            case 0:
                btn.setIcon(asiento_libre);
                break;
            case 1:
                btn.setIcon(asiento_seleccionado);
                break;
            case 2:
                btn.setIcon(asiento_ocupado);
                break;
            case 3:
                btn.setIcon(asiento_reservado);
            default:
                break;       
        }
        
        }else{
           javax.swing.JOptionPane.showMessageDialog(this, "Usted ya eleigio el maximo numero de sillas");
           value--;
           count--;
           
       }
        //System.out.println(getText());
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(teatro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(teatro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(teatro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(teatro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                String user = null;
                new teatro2(user).setVisible(true);
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton100;
    private javax.swing.JButton jButton101;
    private javax.swing.JButton jButton102;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton13;
    private javax.swing.JButton jButton14;
    private javax.swing.JButton jButton15;
    private javax.swing.JButton jButton16;
    private javax.swing.JButton jButton17;
    private javax.swing.JButton jButton18;
    private javax.swing.JButton jButton19;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton20;
    private javax.swing.JButton jButton21;
    private javax.swing.JButton jButton22;
    private javax.swing.JButton jButton23;
    private javax.swing.JButton jButton24;
    private javax.swing.JButton jButton25;
    private javax.swing.JButton jButton26;
    private javax.swing.JButton jButton27;
    private javax.swing.JButton jButton28;
    private javax.swing.JButton jButton29;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton30;
    private javax.swing.JButton jButton31;
    private javax.swing.JButton jButton32;
    private javax.swing.JButton jButton33;
    private javax.swing.JButton jButton34;
    private javax.swing.JButton jButton35;
    private javax.swing.JButton jButton36;
    private javax.swing.JButton jButton37;
    private javax.swing.JButton jButton38;
    private javax.swing.JButton jButton39;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton40;
    private javax.swing.JButton jButton41;
    private javax.swing.JButton jButton42;
    private javax.swing.JButton jButton43;
    private javax.swing.JButton jButton44;
    private javax.swing.JButton jButton45;
    private javax.swing.JButton jButton46;
    private javax.swing.JButton jButton47;
    private javax.swing.JButton jButton48;
    private javax.swing.JButton jButton49;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton50;
    private javax.swing.JButton jButton51;
    private javax.swing.JButton jButton52;
    private javax.swing.JButton jButton53;
    private javax.swing.JButton jButton54;
    private javax.swing.JButton jButton55;
    private javax.swing.JButton jButton56;
    private javax.swing.JButton jButton57;
    private javax.swing.JButton jButton58;
    private javax.swing.JButton jButton59;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton60;
    private javax.swing.JButton jButton61;
    private javax.swing.JButton jButton62;
    private javax.swing.JButton jButton63;
    private javax.swing.JButton jButton64;
    private javax.swing.JButton jButton65;
    private javax.swing.JButton jButton66;
    private javax.swing.JButton jButton67;
    private javax.swing.JButton jButton68;
    private javax.swing.JButton jButton69;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton70;
    private javax.swing.JButton jButton71;
    private javax.swing.JButton jButton72;
    private javax.swing.JButton jButton73;
    private javax.swing.JButton jButton74;
    private javax.swing.JButton jButton75;
    private javax.swing.JButton jButton76;
    private javax.swing.JButton jButton77;
    private javax.swing.JButton jButton78;
    private javax.swing.JButton jButton79;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton80;
    private javax.swing.JButton jButton81;
    private javax.swing.JButton jButton82;
    private javax.swing.JButton jButton83;
    private javax.swing.JButton jButton84;
    private javax.swing.JButton jButton85;
    private javax.swing.JButton jButton86;
    private javax.swing.JButton jButton87;
    private javax.swing.JButton jButton88;
    private javax.swing.JButton jButton89;
    private javax.swing.JButton jButton9;
    private javax.swing.JButton jButton90;
    private javax.swing.JButton jButton91;
    private javax.swing.JButton jButton92;
    private javax.swing.JButton jButton93;
    private javax.swing.JButton jButton94;
    private javax.swing.JButton jButton95;
    private javax.swing.JButton jButton96;
    private javax.swing.JButton jButton97;
    private javax.swing.JButton jButton98;
    private javax.swing.JButton jButton99;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JTextField user_name;
    // End of variables declaration//GEN-END:variables
}