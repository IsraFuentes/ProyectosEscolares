/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 *
 * @author Isra
 */
public class Chofer extends Persona{
    
  private String licencia;
  private String placasVehiculo;
  private String RFC;
  private String claveAcceso;
  
    public Chofer(){
        licencia= "";
        placasVehiculo="";
        RFC= "";
        claveAcceso= "";
    }

    public String getLicencia() {
        return licencia;
    }

    public void setLicencia(String licencia) {
        this.licencia = licencia;
    }

    public String getPlacasVehiculo() {
        return placasVehiculo;
    }

    public void setPlacasVehiculo(String placasVehiculo) {
        this.placasVehiculo = placasVehiculo;
    }

    public String getRFC() {
        return RFC;
    }

    public void setRFC(String RFC) {
        this.RFC = RFC;
    }

    public String getClaveAcceso() {
        return claveAcceso;
    }

    public void setClaveAcceso(String claveAcceso) {
        this.claveAcceso = claveAcceso;
    }

   
}
