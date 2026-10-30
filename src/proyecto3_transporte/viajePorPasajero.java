/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto3_transporte;

import java.time.LocalDate;
import java.time.LocalTime;

/**
 *
 * @author estudiante
 */
public class viajePorPasajero extends Viaje{
    //atributos
    private int cantidad;
    
    //constructor

    public viajePorPasajero(int cantidad, Vehiculo vehiculo, Ruta ruta, Piloto piloto, LocalDate fecha, String estadoViaje, LocalTime hora) {
        super(vehiculo, ruta, piloto, fecha, estadoViaje, hora);
        this.cantidad = cantidad;
    }
    
    //metodos

    @Override
    public double calcularTotal() {
        return 5;
    }
    
}
