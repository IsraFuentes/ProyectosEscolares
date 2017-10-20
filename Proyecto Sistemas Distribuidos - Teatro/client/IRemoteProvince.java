/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package client;
import java.rmi.Remote;
import java.rmi.RemoteException;
import java.sql.ResultSet;
import java.util.ArrayList;

/**
 *
 * @author yo
 */

public interface IRemoteProvince extends Remote {
 public int prereserva(int numAsiento, int user) throws RemoteException;
 public int reservar(int numAsiento, int user) throws RemoteException;
 public int save(Province p) throws RemoteException;
 public int update(int silla, int estado) throws RemoteException;
 public int delete(int username, int silla) throws RemoteException;
 public void deleteAll() throws RemoteException;
 public ResultSet findAll() throws RemoteException;
 public ArrayList findByName(String criteria) throws RemoteException;
 public boolean isEmpty () throws RemoteException;
 public int[] obtenerListaEstadosSillas() throws RemoteException;
}