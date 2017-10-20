/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package client;

import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.util.Scanner;

/**
 * ProvinceClient: client application
 * 
*/
public class ProvinceClient {

    public static void main(String[] args) {
        try {
            //Get reference to rmi registry server
           // Registry registry = LocateRegistry.getRegistry("148.209.67.247");
            // direccion ip del server: 148.209.67.247
            Registry registry = LocateRegistry.getRegistry("localhost");
           // Registry nuevo = LocateRegistry.getRegistry("148.209.67.241", 3434);
            //Lookup server object
            IRemoteProvince cliente1 = (IRemoteProvince) registry.lookup("Province");
            IRemoteProvince cliente2 = (IRemoteProvince) registry.lookup("Province");
            
            //Save province
//            Province bmc = new Province(12, "ISRA", "isra fuentes");
//            Province bat = new Province(2, "BAT", "Battambang");
//            Province kpc = new Province(3, "KPC", "Kampong Cham");
//            Province kch = new Province(4, "KCH", "Kampong Cang"); //wrong name
//            Province ksp = new Province(5, "KSP", "Kampong Speu");
//            //Save province
//            System.out.println("Saving provinces...");
//            //System.out.println(rp.isEmpty( ));
//            int asiento, id;
//            System.out.println(" introduzca num. asiento a reservar: ");
//            Scanner scan = new Scanner(System.in);
//            asiento = scan.nextInt();
//            System.out.println("ahora el id del usuario.");
//            Scanner scan2 = new Scanner(System.in);
//            id = scan2.nextInt();
//            
//            cliente1.reservar(asiento, id);
              cliente1.obtenerListaEstadosSillas();
              
              
            
           // cliente2.reservar(asiento, id);
           // ProvinceRepository.reservar(asiento, id);       
            //cliente.save(bmc);
        /*    rp.save(bat);
            rp.save(kpc);
            rp.save(kch);
            rp.save(ksp);*/
            
            //rp.reservar(10, 20, 007);
            
            
            /*
            //Update province
            System.out.println("Update Kampong Cang to Kampong Chhang");
            Province updatedKCH = new Province(4, "KCH", "Kampong Chhnang");
            int iRet = rp.update(updatedKCH);
            //Display all provinces
            System.out.println("Display all provinces");
            ArrayList<Province> arrProv = rp.findAll();
            for (Province p : arrProv) {
                System.out.println(p.toString());
            }
            //Delete Kampong Cham
            System.out.println("Delete KPC");
            rp.delete(kpc);
            //Display province starts by "Kam"
            System.out.println("Display province starts by \"Kam\"");
            arrProv = rp.findByName("Kam");
            for (Province p : arrProv) {
                System.out.println(p.toString());
            }
            //Delete all provinces
            System.out.println("Delete all provinces");
            rp.deleteAll();
            */
            
            
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
