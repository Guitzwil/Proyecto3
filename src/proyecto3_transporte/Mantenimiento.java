/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto3_transporte;

import java.time.LocalDate;

/**
 *
 * @author estudiante
 */
public class Mantenimiento {
    //atributos
    private Vehiculo vehiculo;
    private LocalDate fecha;
    private double costo;
    
    //constructor
    public Mantenimiento(Vehiculo vehiculo, LocalDate fecha, double costo) {
        this.vehiculo = vehiculo;
        this.fecha = fecha;
        this.costo = costo;
    }
    
    //metodos
    public Vehiculo getVehiculo() {
        return vehiculo;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public double getCosto() {
        return costo;
    }
    
}
