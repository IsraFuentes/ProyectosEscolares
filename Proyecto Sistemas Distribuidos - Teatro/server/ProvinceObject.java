/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package server;

import client.IRemoteProvince;
import client.Province;
import java.rmi.server.*;
import java.rmi.*;
import java.sql.ResultSet;
import java.util.ArrayList;

/**
 * Server object
 * 
*/
public class ProvinceObject extends UnicastRemoteObject implements
        IRemoteProvince {
   

    /**
     *
     */
    private static final long serialVersionUID = 11L;

    public ProvinceObject() throws RemoteException {
        super();

    }
    
    public int save(Province p) {
        try {
            System.out.println("Invoke save from " + getClientHost());
        } catch (ServerNotActiveException snae) {
            snae.printStackTrace();
        }
        return ProvinceRepository.save(p);
    }

    public int update(int silla, int estado) {
        try {
            System.out.println("Invoke update from " + getClientHost());
        } catch (ServerNotActiveException snae) {
            snae.printStackTrace();
        }
        return ProvinceRepository.update(silla, estado);
    }

    public int delete(int username, int silla) {
        try {
            System.out.println("Invoke delete from " + getClientHost());
        } catch (ServerNotActiveException snae) {
            snae.printStackTrace();
        }
        return ProvinceRepository.delete(username, silla);
    }

    public void deleteAll() {
        try {
            System.out.println("Invoke deleteAll from " + getClientHost());
        } catch (ServerNotActiveException snae) {
            snae.printStackTrace();
        }
        ProvinceRepository.deleteAll();
    }

    public ResultSet findAll(){
        try {
            System.out.println("Invoke findAll from " + getClientHost());
        } catch (ServerNotActiveException snae) {
            snae.printStackTrace();
        }
        return ProvinceRepository.findAll();
    }

    public ArrayList findByName(String criteria) {
        try {
            System.out.println("Invoke findByName from " + getClientHost());
        } catch (ServerNotActiveException snae) {
            snae.printStackTrace();
        }
        return ProvinceRepository.findByName(criteria);
    }
    
    public boolean isEmpty( ) {
        try{
               System.out.println("Invoke isEmpty from " + getClientHost());
        }catch (ServerNotActiveException snae) {
            snae.printStackTrace();
        }
        return ProvinceRepository.isEmpty();
    }

    
   
    public synchronized int reservar(int numAsiento, int user) throws RemoteException {
        try{
           System.out.println("Invoke reservar from " + getClientHost());
        
        }catch (ServerNotActiveException snae) {
            snae.printStackTrace();
        }
        return ProvinceRepository.reservar(numAsiento, user);
    }

    public int[] obtenerListaEstadosSillas() throws RemoteException {
        int[] result = null;
       try{
               System.out.println("Invoke obteniendo lista de sillas from " + getClientHost());
       result =  ProvinceRepository.obtenerListaEstadosSillas();
       }catch (ServerNotActiveException snae) {
           System.out.println("error");
            snae.printStackTrace();
        }
        return result;
        
    }
    

    @Override
    public int prereserva(int numAsiento, int user) throws RemoteException {
       int re = 0;
        try {
            System.out.println("Invoke obteniendo lista de sillas from " + getClientHost());
            re = ProvinceRepository.prereserva(numAsiento, user);
        } catch (Exception e) {
            System.out.println(e);
        }
        
        return re;
    }

   

    

    
}
