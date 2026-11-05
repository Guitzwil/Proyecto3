/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto3_transporte;

/**
 *
 * @author Edgar Mó
 */
public class Pickup extends Vehiculo{
    private String tipoDeTraccion;
    private double capacidadCargaKg;
    
    public Pickup(String tipoDeTraccion, double capacidadCargaKg, String placa, double recargo){
        super(placa, recargo);
        this.tipoDeTraccion = tipoDeTraccion;
        setCapacidadCargaKg(capacidadCargaKg);
    }

    public String getTipoDeTraccion() {
        return tipoDeTraccion;
    }

    public void setTipoDeTraccion(String tipoDeTraccion) {
        this.tipoDeTraccion = tipoDeTraccion;
    }

    public double getCapacidadCargaKg() {
        return capacidadCargaKg;
    }

    public void setCapacidadCargaKg(double capacidadCargaKg) {
        //se valida que sea mayor a cero
        if(capacidadCargaKg < 1)
            throw new IllegalArgumentException("La capacidad no puede ser menor a uno");
        
        this.capacidadCargaKg = capacidadCargaKg;
    }

    @Override
    public boolean validarCapacidadMaxima(double cantidad) {
        return (cantidad <= this.capacidadCargaKg);
    }

    @Override
    public String tipoVehiculo() {
        return ("Pickup");
    }
    
}
