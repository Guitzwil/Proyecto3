/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto3_transporte;

import java.time.LocalDate;
import java.time.LocalTime;

/**
 *
 * @author CHAPTOPS TACTIC
 */
public class ViajeCarga extends Viaje{
    //atributos 
    double cantidad;
    
    //constructor

    public ViajeCarga(double cantidad, Vehiculo vehiculo, Ruta ruta, Piloto piloto, LocalDate fecha, String estadoViaje, LocalTime hora) {
        super(vehiculo, ruta, piloto, fecha, estadoViaje, hora);
        this.cantidad = cantidad;
    }
    
    //metodos

    public double getCantidad() {
        return cantidad;
    }
    
    @Override
    public double calcularTotal(){
        return 6;
    }
}
