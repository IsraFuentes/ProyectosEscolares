/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package server;

import java.rmi.AlreadyBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

/**
 * Server
 * 
*/
public class ProvinceServer {

    public static void main(String[] args) {
        try {
            //Create and get reference to rmi registry
            Registry registry = LocateRegistry.createRegistry(1099);
            // Registry registry1 = LocateRegistry.createRegistry(0, rmicsf, rmissf);
            //Instantiate server object
            ProvinceObject server = new ProvinceObject();
            //Register server object
            // antes registra el server con el metodo de rebind()
            registry.rebind("Province", server);
          
            System.out.println("ProvinceServer is created!!!");
        } catch (RemoteException e) {
            System.out.println(e);
        }
    }
}
