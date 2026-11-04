/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto3_transporte;

/**
 *
 * @author Edgar Mó
 */
public abstract class Vehiculo {
    private String placa;
    private String estado;
    private double kilometraje;
    private double recargo;
    private static final double umbralMantenimiento = 5000;
    
    public Vehiculo(String placa, double recargo){
        this.placa = placa;
        this.estado = "activo";
        this.kilometraje = 0;
        this.recargo = recargo;
    }
    
    public boolean esEstado(String estado){
        //valida que el estado sea el mismo
        return (this.estado.equalsIgnoreCase(estado));
    }
    
    public String getPlaca() {
        return placa;
    }
    
    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        //se valida que el estado sea activo, mantenimiento o inactivo
        if(!estado.equalsIgnoreCase("activo") && !estado.equalsIgnoreCase("mantenimiento") 
                && !estado.equalsIgnoreCase("inactivo")) return;
        
        //si el estdo es el mismo no cambia
        if(this.estado.equalsIgnoreCase(estado)) return;
        
        //cambia el estado
        this.estado = estado;
    }

    public double getKilometraje() {
        return kilometraje;
    }

    public void setKilometraje(double kilometraje) {
        this.kilometraje = kilometraje;
    }

    public double getRecargo() {
        return recargo;
    }

    public void setRecargo(double recargo) {
        this.recargo = recargo;
    }
    
}
