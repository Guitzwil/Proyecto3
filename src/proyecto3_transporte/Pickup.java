/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto3_transporte;

/**
 *
 * @author Edgar Mó
 */
public class Pickup extends Vehiculo {
    private String motor;
    private String tipoDeTraccion;
    private double capacidadCargaKg;
    
    public Pickup(String motor, String tipoDeTraccion, double capacidadCargaKg, String placa, String estado, double kilometraje, double recargo){
        super(placa, estado, kilometraje, recargo);
        this.motor = motor;
        this.tipoDeTraccion = tipoDeTraccion;
        this.capacidadCargaKg = capacidadCargaKg;
    }

    public String getMotor() {
        return motor;
    }

    public void setMotor(String motor) {
        this.motor = motor;
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
        this.capacidadCargaKg = capacidadCargaKg;
    }
    
    
}
