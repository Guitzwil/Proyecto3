/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto3_transporte;

/**
 *
 * @author estudiante
 */
public class Ruta {
    //atributos
    private String origen;
    private String destino;
    private double kilometros;
    private double tarifaBase;
    private boolean estado;
    
    //constructor
    public Ruta(String origen, String destino, double kilometros, double tarifaBase) {
        this.origen = origen;
        this.destino = destino;
        setTarifaBase(tarifaBase);
        setKilometros(kilometros);
        this.estado = true;
    }
 
    //metodos
    
    public String ruta(){
        return (origen + " - " + destino);
    }
    
    public boolean esDestino(String destino){
        return (this.destino.equalsIgnoreCase(destino));
    }
    
    public void setEstado(boolean estado){
        this.estado = estado;
    }
    
    public String getOrigen() {
        return origen;
    }

    public String getDestino() {
        return destino;
    }

    public double getKilometros() {
        return kilometros;
    }

    public void setKilometros(double kilometros){
        //se valida que sea mayor a cero
        if(kilometros < 0)
            throw new IllegalArgumentException("La distancía no puede ser menor a 1");
        
        this.kilometros = kilometros;
    }
    
    public double getTarifaBase() {
        return tarifaBase;
    }
    
    public void setTarifaBase(double tarifaBase){
        //se valida que la tarifa sea valida
        if(tarifaBase  < 0)
            throw new IllegalArgumentException("La tarifa no puede ser negativa o cero");
        
        this.tarifaBase = tarifaBase;
    }

    public boolean isEstado() {
        return estado;
    }
    
}
