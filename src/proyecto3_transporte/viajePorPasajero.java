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
    private int pasajeros;
    
    //constructor

    public viajePorPasajero(int pasajeros, Vehiculo vehiculo, Ruta ruta, Piloto piloto, LocalDate fecha, String estadoViaje, LocalTime hora) {
        super(vehiculo, ruta, piloto, fecha, estadoViaje, hora);
        this.pasajeros = pasajeros;
    }
    
    //metodos

    @Override
    public double calcularTotal() {
        return 5;
    }
    
}
